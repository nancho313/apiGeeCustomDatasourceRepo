package com.colsubsidio.jr.custom.datasource.query;

import net.sf.jasperreports.engine.JRDataset;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRValueParameter;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.query.JRQueryExecuter;
import net.sf.jasperreports.engine.query.QueryExecuterFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class ApiGeeQueryExecuterFactory implements QueryExecuterFactory {

    private Map<String, String> propertyMap;

    @Override
    public Object[] getBuiltinParameters() {
        return new Object[0];
    }

    @Override
    public JRQueryExecuter createQueryExecuter(JRDataset jrDataset, Map<String, ? extends JRValueParameter> map) throws JRException {

        return initExecuter(map);
    }

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

    private JRQueryExecuter initExecuter(Map<String, ? extends JRValueParameter> map) {
        ApiGeeQueryExecuter apiGeeQueryExecuter = new ApiGeeQueryExecuter(map);
        return apiGeeQueryExecuter;
    }
}
