package com.colsubsidio.jr.report.resolver.commons.domain;

public enum TypeEnum {

    INTEGER("java.lang.Integer"),
    STRING("java.lang.String"),
    DOUBLE("java.lang.Double"),
    ;

    private String value;

    TypeEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
