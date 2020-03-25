package com.colsubsidio.jr.custom.datasource.integration;

public class OAuth2TokenRequest {

    private String clienteId;
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
