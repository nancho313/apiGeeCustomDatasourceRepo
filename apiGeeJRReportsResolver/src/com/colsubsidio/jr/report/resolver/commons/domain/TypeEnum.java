package com.colsubsidio.jr.report.resolver.commons.domain;

/**
 * @author Ingeneo S.A.S
 * Enumeracion que identifica tipos de datos soportados por Jasper Reports
 */
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
