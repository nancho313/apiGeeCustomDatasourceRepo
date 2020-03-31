package com.colsubsidio.jr.custom.datasource.impl;

import com.colsubsidio.jr.report.resolver.commons.dto.IApiGeeDTO;
import com.colsubsidio.jr.report.resolver.commons.response.IApiGeeResponse;
import com.colsubsidio.jr.report.resolver.commons.strategy.IApiGeeReportStrategy;
import com.colsubsidio.jr.report.resolver.enums.ReportStrategyEnum;
import com.colsubsidio.jr.report.resolver.factory.ApiGeeReportFactory;
import com.colsubsidio.jr.custom.datasource.integration.ApiGeeIntegrator;
import com.jaspersoft.jasperserver.api.engine.jasperreports.util.CustomDomainMetaDataImpl;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomDomainMetaData;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomDomainMetaDataProvider;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomReportDataSource;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

import java.util.Iterator;
import java.util.Map;

/**
 * @author Ingeneo S.A.S
 * Implementacion del ApiGee custom datasource para jasperserver
 */

public class ApiGeeDataSourceMetadata implements JRDataSource, CustomDomainMetaDataProvider {

    /**
     * Componente que integra jasper server con ApiGee
     */
    private ApiGeeIntegrator apiGeeIntegrator;

    /**
     * Iterador de los posibles registros que retorne el servicio de ApiGee
     */
    private Iterator<IApiGeeResponse> iterator;

    /**
     * Registro actual que contiene toda la informacion a mostrar en el reporte
     */
    private IApiGeeResponse<IApiGeeDTO> reportDTO;

    /**
     * Contador que nos ayuda identificar si hay nuevos registros
     */
    private int fieldCount;

    /**
     * Implementacion de la estrategia para procesar la respuesta del servicio
     */
    private IApiGeeReportStrategy<IApiGeeDTO> strategy;

    /**
     * Inicializa el componente que integra jasperserver con ApiGee
     * @param username, es el client para obtener el bearer token
     * @param password, es el client secret para obtener el bearer token
     * @param tokenService, es el servicio para obtener el bearer token por medio de las credenciales
     * @param apigeeService, es el servicio de donde se obtiene la informacion para crear los reportes
     * @param reportStrategyEnum, es la implementacion de la respuesta obtenido por el servicio de apiGee
     * @param queryParams, son los filtros indicados por el usuario
     */

    public void initSource(String username, String password, String tokenService, String apigeeService,
                           ReportStrategyEnum reportStrategyEnum, Map<String, String> queryParams){

        apiGeeIntegrator = new ApiGeeIntegrator(username, password, tokenService, apigeeService, queryParams);

        // Obtengo un objeto de tipo IApiGeeReportStrategy a partir de la estrategia suministrada en jasperserver
        strategy = ApiGeeReportFactory.INSTANCE.getReportStrategy(reportStrategyEnum);
    }

    /**
     * Llama al servicio de apigee para obtener su informacion y obtener un iterator a partir de la respuesta
     */
    public void initIterator(){

        // Se obtiene la respuesta del servicio de ApiGee por medio de la estrategia
        iterator = apiGeeIntegrator.getReport(strategy).iterator();
    }

    /**
     * Obtiene la metadata del reporte necesaria para procesar la informacion. En este caso seria los nombres de los
     * campos y los tipos de datos de cada uno.
     * @param customReportDataSource
     * @return los metadatos requeridos
     * @throws Exception, en caso de presentarse un error inesperado
     */
    @Override
    public CustomDomainMetaData getCustomDomainMetaData(CustomReportDataSource customReportDataSource) throws Exception {
        CustomDomainMetaDataImpl customDomainMetaData = new CustomDomainMetaDataImpl();
        // Por medio del strategy resolvemos los nombres y los tipos de los campos
        customDomainMetaData.setFieldNames(strategy.getDomainMetadata().getFieldNameList());
        customDomainMetaData.setFieldTypes(strategy.getDomainMetadata().getTypeList());
        return customDomainMetaData;
    }

    /**
     * Funcionalidad que le notifica a nuestro datasource que es necesario iterar el registro ya que todos los campos
     * han sido procesados. Eso lo podemos deducir preguntandole a nuestro iterator si existe otra respuesta.
     * @return TRUE si el iterador tiene mas registros, de lo contrario FALSE
     * @throws JRException, en caso de presentarse un error inesperado
     */
    @Override
    public boolean next() throws JRException {

        // Cuando jasperserver llama a este metodo, nos indica que debemos obtener un nuevo registro del iterador
        // Por lo tanto el fieldCount lo reiniciamos a 0 para indicar que apenas va a empezar a procesar los campos
        fieldCount = 0;
        return iterator.hasNext();
    }

    @Override
    public Object getFieldValue(JRField field) throws JRException {

        return getApiGeeResponse().getFieldValue(field.getName());
    }

    /**
     * Obtiene una respuesta con la informacion a mostrar en el reporte, en este caso puede ser el registro actual
     * o el siguiente registro del iterator
     * @return informacion del reporte
     */
    private IApiGeeResponse<IApiGeeDTO> getApiGeeResponse(){

        fieldCount++;
        // Si el contador es 1, quiere decir que apenas va a procesar el primer campo del registro, lo que nos indica
        // que debemos obtener el siguiente registro del iterador
        if(fieldCount == 1 ){

            reportDTO = iterator.next();
        }
        return reportDTO;
    }
}
