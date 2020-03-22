package com.colsubsidio.jr.report.resolver.strategies.testReport;

import com.colsubsidio.jr.report.resolver.commons.domain.IApiGeeDomainMetadata;

import java.util.ArrayList;
import java.util.List;

public class TestReportDomainMetadata implements IApiGeeDomainMetadata {

    @Override
    public List<String> getFieldNameList() {

        List<String> fieldNameList = new ArrayList<>();
        fieldNameList.add("name");
        fieldNameList.add("address");
        fieldNameList.add("id");
        return fieldNameList;
    }

    @Override
    public List<String> getTypeList() {

        List<String> typeList = new ArrayList<>();
        typeList.add("java.lang.String");
        typeList.add("java.lang.String");
        typeList.add("java.lang.Integer");
        return typeList;
    }
}
