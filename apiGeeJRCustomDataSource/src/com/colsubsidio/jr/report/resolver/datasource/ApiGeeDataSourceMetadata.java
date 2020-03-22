package com.colsubsidio.jr.report.resolver.datasource;

import com.colsubsidio.jr.commons.dto.IApiGeeDTO;
import com.colsubsidio.jr.commons.integrator.IApiGeeResponse;
import com.colsubsidio.jr.commons.strategy.IApiGeeReportStrategy;
import com.colsubsidio.jr.report.resolver.enums.ReportStrategyEnum;
import com.colsubsidio.jr.report.resolver.factory.ApiGeeReportFactory;
import com.colsubsidio.jr.report.resolver.integration.ApiGeeIntegrator;
import com.jaspersoft.jasperserver.api.engine.jasperreports.util.CustomDomainMetaDataImpl;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomDomainMetaData;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomDomainMetaDataProvider;
import com.jaspersoft.jasperserver.api.metadata.jasperreports.domain.CustomReportDataSource;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

import java.util.Iterator;

public class ApiGeeDataSourceMetadata implements JRDataSource, CustomDomainMetaDataProvider {

    private ApiGeeIntegrator apiGeeIntegrator;
    private Iterator<IApiGeeResponse> iterator;
    private IApiGeeResponse<IApiGeeDTO> reportDTO;
    private int fieldCount;
    private IApiGeeReportStrategy<IApiGeeDTO> strategy;

    public void initSource(String username, String password, String tokenService, String apigeeService, ReportStrategyEnum reportStrategyEnum){

        apiGeeIntegrator = new ApiGeeIntegrator(username, password, tokenService, apigeeService);
        strategy = ApiGeeReportFactory.INSTANCE.getReportStrategy(reportStrategyEnum);
    }

    public void initIterator(){

        iterator = apiGeeIntegrator.getReport(strategy).iterator();
    }

    @Override
    public CustomDomainMetaData getCustomDomainMetaData(CustomReportDataSource customReportDataSource) throws Exception {
        CustomDomainMetaDataImpl customDomainMetaData = new CustomDomainMetaDataImpl();
        customDomainMetaData.setFieldNames(strategy.getDomainMetadata().getFieldNameList());
        customDomainMetaData.setFieldTypes(strategy.getDomainMetadata().getTypeList());
        return customDomainMetaData;
    }

    @Override
    public boolean next() throws JRException {

        fieldCount = 0;
        return iterator.hasNext();
    }

    @Override
    public Object getFieldValue(JRField field) throws JRException {

        return getApiGeeResponse().getFieldValue(field.getName());
    }

    private IApiGeeResponse<IApiGeeDTO> getApiGeeResponse(){

        fieldCount++;
        if(fieldCount == 1 ){

            reportDTO = iterator.next();
        }
        return reportDTO;
    }
}
