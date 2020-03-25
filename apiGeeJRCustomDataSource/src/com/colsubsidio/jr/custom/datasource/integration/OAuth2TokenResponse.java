package com.colsubsidio.jr.custom.datasource.integration;

import java.util.List;

public class OAuth2TokenResponse {

    private String issued_at;
    private String scope;
    private String application_name;
    private String refresh_token_issued_at;
    private String status;
    private String refresh_token_status;
    private String api_product_list;
    private String expires_in;
    private String organization_id;
    private String token_type;
    private String refresh_token;
    private String client_id;
    private String access_token;
    private String organization_name;
    private String refresh_token_expires_in;
    private String refresh_count;

    public String getIssued_at() {
        return issued_at;
    }

    public void setIssued_at(String issued_at) {
        this.issued_at = issued_at;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getApplication_name() {
        return application_name;
    }

    public void setApplication_name(String application_name) {
        this.application_name = application_name;
    }

    public String getRefresh_token_issued_at() {
        return refresh_token_issued_at;
    }

    public void setRefresh_token_issued_at(String refresh_token_issued_at) {
        this.refresh_token_issued_at = refresh_token_issued_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRefresh_token_status() {
        return refresh_token_status;
    }

    public void setRefresh_token_status(String refresh_token_status) {
        this.refresh_token_status = refresh_token_status;
    }

    public String getApi_product_list() {
        return api_product_list;
    }

    public void setApi_product_list(String api_product_list) {
        this.api_product_list = api_product_list;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(String organization_id) {
        this.organization_id = organization_id;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getOrganization_name() {
        return organization_name;
    }

    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name;
    }

    public String getRefresh_token_expires_in() {
        return refresh_token_expires_in;
    }

    public void setRefresh_token_expires_in(String refresh_token_expires_in) {
        this.refresh_token_expires_in = refresh_token_expires_in;
    }

    public String getRefresh_count() {
        return refresh_count;
    }

    public void setRefresh_count(String refresh_count) {
        this.refresh_count = refresh_count;
    }
}
