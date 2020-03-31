package com.colsubsidio.jr.custom.datasource.impl;

import com.jaspersoft.jasperserver.api.metadata.common.service.RepositoryService;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomDomainMetaData;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomDomainMetaDataProvider;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomReportDataSource;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.service.ReportDataSourceService;
import net.sf.jasperreports.engine.JRDataSource;

import java.util.Map;

/**
 * @author Ingeneo S.A.S
 * Este componente se utiliza al momento de abrir un JasperReport que tenga asociado un origen de datos
 * de tipo ApiGee
 */
public class ApiGeeDataSourceService implements ReportDataSourceService, CustomDomainMetaDataProvider {

    /**
     * Instancia del custom datasource
     */
    JRDataSource ds;

    /**
     * Son las propiedades del datasource que se ingresan al momento de crearlo en jasperserver, se inyectan
     * por medio de Spring
     */
    private Map<String, String> propertyMap;

    private RepositoryService repository;

    public ApiGeeDataSourceService() {

        this.ds = new ApiGeeDataSourceMetadata();
    }

    public ApiGeeDataSourceService(JRDataSource ds) {

        this.ds = ds;
    }

    /**
     * Obtiene la metadata del datasource
     * @param customReportDataSource
     * @return los metadatos configurados del reporte
     * @throws Exception, en caso de presentarse un error inesperado
     */
    @Override
    public CustomDomainMetaData getCustomDomainMetaData(CustomReportDataSource customReportDataSource) throws Exception {

        if (ds instanceof ApiGeeDataSourceMetadata) {

            return ((ApiGeeDataSourceMetadata) ds).getCustomDomainMetaData(customReportDataSource);
        } else
        {
            return null;
        }
    }

    /**
     * Este metodo nos ayuda a almacenar las propiedades iniciales del datasource al map de las propiedades generales
     * @param parameterValues
     */
    @Override
    public void setReportParameterValues(Map parameterValues) {
        parameterValues.put("APIGEE_PROPERTIES", propertyMap);
    }

    @Override
    public void closeConnection() {

    }

    public RepositoryService getRepository() {
        return repository;
    }

    public void setRepository(RepositoryService repository) {
        this.repository = repository;
    }

    public Map<String, String> getPropertyMap() {
        return propertyMap;
    }

    public void setPropertyMap(Map<String, String> propertyMap) {
        this.propertyMap = propertyMap;
    }
}
