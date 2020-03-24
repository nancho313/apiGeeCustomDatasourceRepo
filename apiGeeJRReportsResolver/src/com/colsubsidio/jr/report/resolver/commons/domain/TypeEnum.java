package com.colsubsidio.jr.report.resolver.commons.domain;

public enum TypeEnum {

    BIG_DECIMAL("java.math.BigDecimal"),
    DOUBLE("java.lang.Double"),
    INTEGER("java.lang.Integer"),
    LONG("java.lang.Long"),
    STRING("java.lang.String"),
    ;

    private String value;

    TypeEnum(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
