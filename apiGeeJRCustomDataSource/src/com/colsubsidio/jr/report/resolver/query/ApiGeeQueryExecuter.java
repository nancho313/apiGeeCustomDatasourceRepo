package com.colsubsidio.jr.report.resolver.query;

import com.colsubsidio.jr.report.resolver.datasource.ApiGeeDataSourceMetadata;
import com.colsubsidio.jr.report.resolver.enums.ReportStrategyEnum;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRValueParameter;
import net.sf.jasperreports.engine.query.JRQueryExecuter;

import java.util.Map;

public class ApiGeeQueryExecuter implements JRQueryExecuter {

    private Map<String, ? extends JRValueParameter> jrParameters;

    public ApiGeeQueryExecuter(Map<String, ? extends JRValueParameter> jrParameters){
        this.jrParameters = jrParameters;

        // Aca debo inicializar los query param
    }

    @Override
    public JRDataSource createDatasource() throws JRException {
        Map<String, String> apiGeePropertes = (Map<String, String>) jrParameters.get("APIGEE_PROPERTIES");
        ApiGeeDataSourceMetadata dataSource = new ApiGeeDataSourceMetadata();
        String username = apiGeePropertes.get("username");
        String password = apiGeePropertes.get("password");
        String tokenService = apiGeePropertes.get("tokenService");
        String apigeeService = apiGeePropertes.get("apigeeService");
        String report = apiGeePropertes.get("report");
        ReportStrategyEnum reportStrategyEnum = ReportStrategyEnum.valueOf(report);
        dataSource.initSource(username, password, tokenService, apigeeService, reportStrategyEnum);
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
