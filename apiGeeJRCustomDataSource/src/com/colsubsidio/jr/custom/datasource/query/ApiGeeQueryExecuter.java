package com.colsubsidio.jr.custom.datasource.query;

import com.colsubsidio.jr.custom.datasource.impl.ApiGeeDataSourceMetadata;
import com.colsubsidio.jr.report.resolver.enums.ReportStrategyEnum;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRValueParameter;
import net.sf.jasperreports.engine.query.JRQueryExecuter;

import java.util.HashMap;
import java.util.Map;

public class ApiGeeQueryExecuter implements JRQueryExecuter {

    private static final String QUERY_PARAM_IDENTIFIER = "QUERYPARAM_";

    private Map<String, ? extends JRValueParameter> jrParameters;

    public ApiGeeQueryExecuter(Map<String, ? extends JRValueParameter> jrParameters){

        this.jrParameters = jrParameters;
    }

    @Override
    public JRDataSource createDatasource() throws JRException {
        Map reportParametersMap = (Map)jrParameters.get("REPORT_PARAMETERS_MAP").getValue();
        Map<String, String> apiGeeProperties = (Map<String, String>)reportParametersMap.get("APIGEE_PROPERTIES");
        ApiGeeDataSourceMetadata dataSource = new ApiGeeDataSourceMetadata();
        String username = apiGeeProperties.get("username");
        String password = apiGeeProperties.get("password");
        String tokenService = apiGeeProperties.get("tokenService");
        String apigeeService = apiGeeProperties.get("apigeeService");
        String report = apiGeeProperties.get("report");
        Map<String, String> queryParamsMap = getQueryParams(reportParametersMap);
        System.out.println("Query Params -> "+queryParamsMap);
        ReportStrategyEnum reportStrategyEnum = ReportStrategyEnum.valueOf(report);
        dataSource.initSource(username, password, tokenService, apigeeService, reportStrategyEnum, queryParamsMap);
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

    private Map<String, String> getQueryParams(Map<String, ?> properties){

        Map<String, String> queryParams = new HashMap<>();
        for (String key : properties.keySet()) {

            if(key.startsWith(QUERY_PARAM_IDENTIFIER)){

                String newKey = key.replace(QUERY_PARAM_IDENTIFIER, "").toLowerCase();
                if(!newKey.isEmpty()){

                    String value = properties.get(key) != null ? properties.get(key).toString() : null;
                    queryParams.put(newKey, value);
                }
            }
        }

        String jsonQueryParams = properties.get("JSON_QUERY_PARAMS") != null ?
                properties.get("JSON_QUERY_PARAMS").toString() : null;

        if(jsonQueryParams != null && !jsonQueryParams.isEmpty()){

            System.out.println("Json Query Params -> "+jsonQueryParams);

            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(jsonQueryParams, JsonObject.class);
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                System.out.println("Entry ->"+entry);
                if(entry.getValue() != null && entry.getValue().isJsonPrimitive()){

                    String key = entry.getKey().toLowerCase();
                    String value = entry.getValue().getAsString();
                    System.out.println("KEY -> "+key+" - Value -> "+value);
                    queryParams.put(key, value);
                }
            }
        }

        return queryParams;
    }
}
