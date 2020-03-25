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

public class ApiGeeIntegrator {

    private String username;
    private String password;
    private String tokenService;
    private String apigeeService;
    private Map<String, String> queryParams;

    public ApiGeeIntegrator(String username, String password, String tokenService, String apigeeService,
                            Map<String, String> queryParams) {
        this.username = username;
        this.password = password;
        this.tokenService = tokenService;
        this.apigeeService = apigeeService;
        this.queryParams = queryParams;
    }

    public List<IApiGeeResponse> getReport(IApiGeeReportStrategy<IApiGeeDTO> reportStrategy) {

        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(this.apigeeService);
        for (String key : queryParams.keySet()) {
            webTarget = webTarget.queryParam(key, queryParams.get(key));
        }
        Response response = webTarget.request(MediaType.APPLICATION_JSON).
                header("Authorization", getBearerAuthentication(getOAuth2Token())).get();
        Gson gson = new Gson();
        String responseJson = response.readEntity(String.class);
        IApiGeeDTO apiGeeDTO = gson.fromJson(responseJson, reportStrategy.getApiGeeResponseClass());
        return reportStrategy.buildResponse(apiGeeDTO);
    }

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

    private String getBearerAuthentication(OAuth2TokenResponse tokenResponse){

        return "Bearer "+tokenResponse.getAccess_token();
    }
}
