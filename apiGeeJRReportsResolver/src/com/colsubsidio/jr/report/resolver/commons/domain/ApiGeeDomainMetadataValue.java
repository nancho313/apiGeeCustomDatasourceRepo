package com.colsubsidio.jr.report.resolver.commons.domain;

import java.io.Serializable;

public class ApiGeeDomainMetadataValue implements Serializable {

    private String fieldName;
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
