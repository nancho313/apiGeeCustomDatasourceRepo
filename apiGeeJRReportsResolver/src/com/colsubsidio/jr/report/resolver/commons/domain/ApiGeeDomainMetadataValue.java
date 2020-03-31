package com.colsubsidio.jr.report.resolver.commons.domain;

import java.io.Serializable;

/**
 * @author Ingeneo S.A.S
 * POJO que encapsula la informacion de los campos de los Jasper Reports
 */
public class ApiGeeDomainMetadataValue implements Serializable {

    /**
     * Es el nombre del campo
     */
    private String fieldName;

    /**
     * Es el tipo de dato del campo
     */
    private TypeEnum type;

    public ApiGeeDomainMetadataValue(String fieldName, TypeEnum type) {
        this.fieldName = fieldName;
        this.type = type;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }
}
