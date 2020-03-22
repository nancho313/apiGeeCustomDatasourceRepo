package com.colsubsidio.jr.custom.datasource.impl;

import com.jaspersoft.jasperserver.api.metadata.common.service.RepositoryService;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomDomainMetaData;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomDomainMetaDataProvider;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomReportDataSource;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.service.ReportDataSourceService;
import net.sf.jasperreports.engine.JRDataSource;

import java.util.Map;

public class ApiGeeDataSourceService implements ReportDataSourceService, CustomDomainMetaDataProvider {

    JRDataSource ds;
    private RepositoryService repository;
    private Map<String, String> propertyMap;

    public ApiGeeDataSourceService() {

        this.ds = new ApiGeeDataSourceMetadata();
    }

    public ApiGeeDataSourceService(JRDataSource ds) {

        this.ds = ds;
    }

    @Override
    public CustomDomainMetaData getCustomDomainMetaData(CustomReportDataSource customReportDataSource) throws Exception {

        if (ds instanceof ApiGeeDataSourceMetadata) {

            return ((ApiGeeDataSourceMetadata) ds).getCustomDomainMetaData(customReportDataSource);
        } else
        {
            return null;
        }
    }

    @Override
    public void setReportParameterValues(Map parameterValues) {
        parameterValues.put("APIGEE_PROPERTIES", propertyMap);
    }

    @Override
    public void closeConnection() {

    }

    public RepositoryService getRepository() {
        return repository;
    }

    public void setRepository(RepositoryService repository) {
        this.repository = repository;
    }

    public Map<String, String> getPropertyMap() {
        return propertyMap;
    }

    public void setPropertyMap(Map<String, String> propertyMap) {
        this.propertyMap = propertyMap;
    }
}
