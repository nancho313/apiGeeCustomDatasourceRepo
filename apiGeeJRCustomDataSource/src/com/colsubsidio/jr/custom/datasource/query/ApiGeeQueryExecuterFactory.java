package com.colsubsidio.jr.custom.datasource.query;

import net.sf.jasperreports.engine.JRDataset;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRValueParameter;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.query.JRQueryExecuter;
import net.sf.jasperreports.engine.query.QueryExecuterFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @author Ingeneo S.A.S
 * Implementacion de QueryExecuterFactory, este componente se llama al momento de abrir un JasperReport o cuando se
 * aplican nuevos filtros en el JasperReport
 */
public class ApiGeeQueryExecuterFactory implements QueryExecuterFactory {

    /**
     * Son las propiedades iniciales del custom datasource
     */
    private Map<String, String> propertyMap;

    @Override
    public Object[] getBuiltinParameters() {
        return new Object[0];
    }

    /**
     * Metodo llamado al momento de ejecutarse el JasperReport o aplicar los filtros en el JasperReport
     * @param jrDataset
     * @param map, son los parametros generales del reporte
     * @return
     * @throws JRException, en caso de presentarse un error inesperado
     */
    @Override
    public JRQueryExecuter createQueryExecuter(JRDataset jrDataset, Map<String, ? extends JRValueParameter> map) throws JRException {

        return initExecuter(map);
    }

    /**
     * Metodo llamado al momento de ejecutarse el JasperReport o aplicar los filtros en el JasperReport
     * @param jasperReportsContext
     * @param jrDataset
     * @param map, son los parametros generales del reporte
     * @return
     * @throws JRException, en caso de presentarse un error inesperado
     */
    @Override
    public JRQueryExecuter createQueryExecuter(JasperReportsContext jasperReportsContext, JRDataset jrDataset,
                                               Map<String, ? extends JRValueParameter> map) throws JRException {

        return initExecuter(map);
    }

    @Override
    public boolean supportsQueryParameterType(String s) {
        return false;
    }

    public Map<String, String> getPropertyMap() {
        return propertyMap;
    }

    @Autowired
    public void setPropertyMap(Map<String, String> propertyMap) {
        this.propertyMap = propertyMap;
    }

    /**
     * Inicializa un nuevo ApiGeeQueryExecuter utilizando los parametros generales del reporte
     * @param map, son los parametros generales del reporte
     * @return una nueva instancia del ApiGeeQueryExecuter
     */
    private JRQueryExecuter initExecuter(Map<String, ? extends JRValueParameter> map) {
        ApiGeeQueryExecuter apiGeeQueryExecuter = new ApiGeeQueryExecuter(map);
        return apiGeeQueryExecuter;
    }
}
