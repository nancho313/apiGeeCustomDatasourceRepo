package com.colsubsidio.jr.report.resolver.query;

import com.colsubsidio.jr.report.resolver.datasource.ApiGeeDataSourceMetadata;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRValueParameter;
import net.sf.jasperreports.engine.query.JRQueryExecuter;

import java.util.Map;

public class ApiGeeQueryExecuter implements JRQueryExecuter {

    private ApiGeeDataSourceMetadata dataSource;
    private Map<String, ? extends JRValueParameter> jrParameters;

    public ApiGeeQueryExecuter( ApiGeeDataSourceMetadata dataSource, Map<String, ? extends JRValueParameter> jrParameters){

        this.dataSource = dataSource;
        this.jrParameters = jrParameters;
        System.out.println("JRParametros ----------------");
        if(jrParameters != null){

            for (String key : jrParameters.keySet()) {

                System.out.println("KEY -> "+key+"   -   VALUE -> "+jrParameters.get(key).getValue());
            }
        }

        // Aca debo inicializar los query param
    }

    @Override
    public JRDataSource createDatasource() throws JRException {

        dataSource.initIterator();
        return dataSource;
    }

    @Override
    public void close() {

    }

    @Override
    public boolean cancelQuery() throws JRException {
        return false;
    }
}
