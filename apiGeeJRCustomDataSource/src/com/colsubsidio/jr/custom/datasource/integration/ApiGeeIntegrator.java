package com.colsubsidio.jr.custom.datasource.integration;


import com.colsubsidio.jr.report.resolver.commons.dto.IApiGeeDTO;
import com.colsubsidio.jr.report.resolver.commons.response.IApiGeeResponse;
import com.colsubsidio.jr.report.resolver.commons.strategy.IApiGeeReportStrategy;
import com.google.gson.Gson;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;

/**
 * @author Ingeneo S.A.S
 * Componente que resuelve la integracion entre jasper server y ApiGee
 */
public class ApiGeeIntegrator {

    /**
     * Es el usuario para obtener el bearer token de ApiGee
     */
    private String username;

    /**
     * Es el password para obtener el bearer token de ApiGee
     */
    private String password;

    /**
     * Es la URL de ApiGee para obtener el bearer token
     */
    private String tokenService;

    /**
     * Es la URL del servicio de ApiGee de donde se solicita la informacion del reporte
     */
    private String apigeeService;

    /**
     * Son los filtros suministrados desde jasper server que se convertiran en query param en la url del servicio ApiGee
     */
    private Map<String, String> queryParams;

    /**
     * Inicializa una nueva instancia de ApiGeeIntegrator con los parametros iniciales
     * @param username
     * @param password
     * @param tokenService
     * @param apigeeService
     * @param queryParams
     */
    public ApiGeeIntegrator(String username, String password, String tokenService, String apigeeService,
                            Map<String, String> queryParams) {
        this.username = username;
        this.password = password;
        this.tokenService = tokenService;
        this.apigeeService = apigeeService;
        this.queryParams = queryParams;
    }

    /**
     * Consume el servicio de ApiGee y retorna la respuesta
     * @param reportStrategy, es la estrategia de la implementacion del reporte para procesar la respuesta
     * @return La lista de registros retornados por ApiGee
     */
    public List<IApiGeeResponse> getReport(IApiGeeReportStrategy<IApiGeeDTO> reportStrategy) {

        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(this.apigeeService);

        // Inicializo los query params
        for (String key : queryParams.keySet()) {
            webTarget = webTarget.queryParam(key, queryParams.get(key));
        }

        // Obtengo la respuesta del servicio enviando el bearer token
        Response response = webTarget.request(MediaType.APPLICATION_JSON).
                header("Authorization", getBearerAuthentication(getOAuth2Token())).get();
        Gson gson = new Gson();
        String responseJson = response.readEntity(String.class);
        IApiGeeDTO apiGeeDTO = gson.fromJson(responseJson, reportStrategy.getApiGeeResponseClass());
        return reportStrategy.buildResponse(apiGeeDTO);
    }

    /**
     * Consume el servicio de ApiGee para obtener el bearer token
     * @return la informacion del bearer token de ApiGee
     */
    private OAuth2TokenResponse getOAuth2Token(){

        OAuth2TokenRequest tokenRequest = new OAuth2TokenRequest();
        tokenRequest.setClienteId(this.username);
        tokenRequest.setClienteSecreto(this.password);
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(this.tokenService);
        Response response = webTarget.request(MediaType.APPLICATION_JSON).post(Entity.text(new Gson().toJson(tokenRequest)));
        Gson gson = new Gson();
        String responseJson = response.readEntity(String.class);
        OAuth2TokenResponse tokenResponse = gson.fromJson(responseJson, OAuth2TokenResponse.class);
        return tokenResponse;
    }

    /**
     * A partir de la respuesta del token de ApiGee, se retorna el contenido del header necesario
     * @param tokenResponse, es la respuesta del servicio de obtencion del bearer token
     * @return valor del header Authorization con su bearer token
     */
    private String getBearerAuthentication(OAuth2TokenResponse tokenResponse){

        return "Bearer "+tokenResponse.getAccess_token();
    }
}
