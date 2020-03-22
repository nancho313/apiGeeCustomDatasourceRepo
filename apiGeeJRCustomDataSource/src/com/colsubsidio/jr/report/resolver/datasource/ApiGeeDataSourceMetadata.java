package com.colsubsidio.jr.report.resolver.datasource;

import com.colsubsidio.jr.report.resolver.commons.dto.ReportDTO;
import com.colsubsidio.jr.report.resolver.integration.ApiGeeIntegrator;
import com.jaspersoft.jasperserver.api.engine.jasperreports.util.CustomDomainMetaDataImpl;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomDomainMetaData;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomDomainMetaDataProvider;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomReportDataSource;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApiGeeDataSourceMetadata implements JRDataSource, CustomDomainMetaDataProvider {

    private static final String NAME = "name";
    private static final String ADDRESS = "address";
    private static final String ID = "id";

    private ApiGeeIntegrator apiGeeIntegrator;
    private Iterator<ReportDTO> iterator;
    private ReportDTO reportDTO;
    private int fieldCount;

    public void initSource(String username, String password, String tokenService, String apigeeService){

        apiGeeIntegrator = new ApiGeeIntegrator(username, password, tokenService, apigeeService);
    }

    public void initIterator(){

        iterator = apiGeeIntegrator.getReport().iterator();
    }

    @Override
    public CustomDomainMetaData getCustomDomainMetaData(CustomReportDataSource customReportDataSource) throws Exception {
        CustomDomainMetaDataImpl customDomainMetaData = new CustomDomainMetaDataImpl();
        List<String> fieldNameList = new ArrayList<>();
        fieldNameList.add("name");
        fieldNameList.add("address");
        fieldNameList.add("id");
        customDomainMetaData.setFieldNames(fieldNameList);
        List<String> typeList = new ArrayList<>();
        typeList.add("java.lang.String");
        typeList.add("java.lang.String");
        typeList.add("java.lang.Integer");
        customDomainMetaData.setFieldTypes(typeList);
        return customDomainMetaData;
    }

    @Override
    public boolean next() throws JRException {

        fieldCount = 0;
        return iterator.hasNext();
    }

    @Override
    public Object getFieldValue(JRField field) throws JRException {

        Object result = null;
        ReportDTO reportDTO = getReport();

        if (field.getName().equals(NAME)) {

            result = reportDTO.getName();
        } else if (field.getName().equals(ADDRESS)) {

            result = reportDTO.getAddress();
        } else if (field.getName().equals(ID)) {

            result = reportDTO.getId();
        }
        return result;
    }

    private ReportDTO getReport(){

        fieldCount++;
        if(fieldCount == 1 ){

            reportDTO = iterator.next();
        }
        return reportDTO;
    }
}
