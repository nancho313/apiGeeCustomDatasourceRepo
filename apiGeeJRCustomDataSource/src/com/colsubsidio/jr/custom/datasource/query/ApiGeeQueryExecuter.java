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

/**
 * @author Ingeneo S.A.S
 * Implementacion del JRQueryExecuter que nos permite consultar informacion del servicio ApiGee por medio de los
 * filtros suministrados por el usuario en jasper server
 */
public class ApiGeeQueryExecuter implements JRQueryExecuter {

    /**
     * Identificador de query params
     */
    private static final String QUERY_PARAM_IDENTIFIER = "QUERYPARAM_";

    /**
     * Son los parametros generales del reporte
     */
    private Map<String, ? extends JRValueParameter> jrParameters;

    /**
     * Inicializa una nueva instancia de ApiGeeQueryExecuter por medio de los parametros generales
     * @param jrParameters, son los parametros generales del reporte
     */
    public ApiGeeQueryExecuter(Map<String, ? extends JRValueParameter> jrParameters) {

        this.jrParameters = jrParameters;
    }

    /**
     * Retorna una instancia del custom datasource utilizando los parametros iniciales y los generales
     * @return la nueva instancia del custom datasource
     * @throws JRException, en caso de presentarse un error inesperado
     */
    @Override
    public JRDataSource createDatasource() throws JRException {

        Map reportParametersMap = (Map) jrParameters.get("REPORT_PARAMETERS_MAP").getValue();

        // Estos son los parametros iniciales del datasource
        Map<String, String> apiGeeProperties = (Map<String, String>) reportParametersMap.get("APIGEE_PROPERTIES");
        ApiGeeDataSourceMetadata dataSource = new ApiGeeDataSourceMetadata();
        String username = apiGeeProperties.get("username");
        String password = apiGeeProperties.get("password");
        String tokenService = apiGeeProperties.get("tokenService");
        String apigeeService = apiGeeProperties.get("apigeeService");
        String report = apiGeeProperties.get("report");
        // Obtengo los query params
        Map<String, String> queryParamsMap = getQueryParams(reportParametersMap);
        ReportStrategyEnum reportStrategyEnum = ReportStrategyEnum.valueOf(report);
        // Inicializo el datasource
        dataSource.initSource(username, password, tokenService, apigeeService, reportStrategyEnum, queryParamsMap);
        // Obtengo de una vez la informacion del servicio de ApiGee
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

    /**
     * Metodo que obtiene identifica los campos de tipo Query Param desde las propiedades generales del reporte
     * @param properties, son las propiedades generales del reporte
     * @return Map con los query params identificados
     */
    private Map<String, String> getQueryParams(Map<String, ?> properties) {

        Map<String, String> queryParams = new HashMap<>();
        for (String key : properties.keySet()) {

            // Si el nombre de la propiedad empieza por QUERYPARAM_
            if (key.startsWith(QUERY_PARAM_IDENTIFIER)) {

                String newKey = key.replace(QUERY_PARAM_IDENTIFIER, "").toLowerCase();
                if (!newKey.isEmpty()) {

                    String value = properties.get(key) != null ? properties.get(key).toString() : null;
                    queryParams.put(newKey, value);
                }
            }
        }

        // Tambien se encuentra el campo para ingresar varios query params utilizando el formato JSON
        String jsonQueryParams = properties.get("JSON_QUERY_PARAMS") != null ?
                properties.get("JSON_QUERY_PARAMS").toString() : null;

        // El campo general fue ingresado en los filtros ?
        if (jsonQueryParams != null && !jsonQueryParams.isEmpty()) {

            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(jsonQueryParams, JsonObject.class);
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                if (entry.getValue() != null && entry.getValue().isJsonPrimitive()) {
                    String key = entry.getKey().toLowerCase();
                    String value = entry.getValue().getAsString();
                    // Por cada propiedad identificada como query param agrego o sobreescribo los valores actuales
                    queryParams.put(key, value);
                }
            }
        }

        return queryParams;
    }
}
