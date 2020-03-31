package com.colsubsidio.jr.custom.datasource.integration;

/**
 * @author Ingeneo S.A.S
 * Es la estructura solicitada por el servicio de autorizacion de ApiGee para obtener el bearer token
 */
public class OAuth2TokenRequest {

    /**
     * Es el clienteId configurado en ApiGee
     */
    private String clienteId;

    /**
     * Es el clienteSecreto asociado al clienteId configurado en ApiGee
     */
    private String clienteSecreto;

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getClienteSecreto() {
        return clienteSecreto;
    }

    public void setClienteSecreto(String clienteSecreto) {
        this.clienteSecreto = clienteSecreto;
    }
}
