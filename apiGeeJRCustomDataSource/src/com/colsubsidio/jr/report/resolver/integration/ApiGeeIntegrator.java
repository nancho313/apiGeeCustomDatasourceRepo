package com.colsubsidio.jr.report.resolver.integration;

import com.colsubsidio.jr.report.resolver.commons.dto.ReportDTO;
import com.google.gson.Gson;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

public class ApiGeeIntegrator {

    private String username;
    private String password;
    private String tokenService;
    private String apigeeService;

    public ApiGeeIntegrator(String username, String password, String tokenService, String apigeeService) {
        this.username = username;
        this.password = password;
        this.tokenService = tokenService;
        this.apigeeService = apigeeService;

        System.out.println("Username ->"+username);
        System.out.println("Password ->"+password);
        System.out.println("Token Service ->"+tokenService);
        System.out.println("Apigee Service ->"+apigeeService);
    }

    public List<ReportDTO> getReport() {

        Client client = ClientBuilder.newClient();
        Response response = client.target(this.apigeeService).request(MediaType.APPLICATION_JSON).get();
        Gson gson = new Gson();
        String responseJson =  response.readEntity(String.class);
        return Arrays.asList(gson.fromJson(responseJson, ReportDTO[].class));
    }
}
