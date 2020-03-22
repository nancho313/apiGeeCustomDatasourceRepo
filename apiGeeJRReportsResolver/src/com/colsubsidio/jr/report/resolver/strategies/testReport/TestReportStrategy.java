package com.colsubsidio.jr.report.resolver.strategies.testReport;

import com.colsubsidio.jr.commons.domain.IApiGeeDomainMetadata;
import com.colsubsidio.jr.commons.integrator.IApiGeeResponse;
import com.colsubsidio.jr.commons.strategy.IApiGeeReportStrategy;

public class TestReportStrategy implements IApiGeeReportStrategy<TestReportDTO> {

    private final IApiGeeDomainMetadata domainMetadata = new TestReportDomainMetadata();

    @Override
    public IApiGeeDomainMetadata getDomainMetadata() {
        return domainMetadata;
    }

    @Override
    public Class<TestReportDTO> getApiGeeResponseClass() {
        return TestReportDTO.class;
    }

    @Override
    public IApiGeeResponse buildResponse(TestReportDTO reportDTO) {
        return new TestReportResponse(reportDTO);
    }
}
