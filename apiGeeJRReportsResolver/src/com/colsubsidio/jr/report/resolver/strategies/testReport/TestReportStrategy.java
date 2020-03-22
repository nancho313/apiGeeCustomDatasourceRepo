package com.colsubsidio.jr.report.resolver.strategies.testReport;

import com.colsubsidio.jr.commons.domain.IApiGeeDomainMetadata;
import com.colsubsidio.jr.commons.integrator.IApiGeeResponse;
import com.colsubsidio.jr.commons.strategy.IApiGeeReportStrategy;

import java.util.ArrayList;
import java.util.List;

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
    public List<IApiGeeResponse> buildResponse(TestReportDTO testReportDTO) {

        List<IApiGeeResponse> response = new ArrayList<>();
        for (TestReportDTO.ReportDTO reportDTO : testReportDTO.data) {

            TestReportResponse testReportResponse = new TestReportResponse(reportDTO);
            response.add(testReportResponse);
        }
        return response;
    }
}
