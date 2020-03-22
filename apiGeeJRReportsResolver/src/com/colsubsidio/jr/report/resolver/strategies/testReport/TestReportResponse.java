package com.colsubsidio.jr.report.resolver.strategies.testReport;

import com.colsubsidio.jr.commons.integrator.IApiGeeResponse;

public class TestReportResponse implements IApiGeeResponse<TestReportDTO> {

    private static final String NAME = "name";
    private static final String ADDRESS = "address";
    private static final String ID = "id";

    private TestReportDTO reportDTO;

    public TestReportResponse(TestReportDTO reportDTO) {
        this.reportDTO = reportDTO;
    }

    @Override
    public Object getFieldValue(String key) {

        Object value = null;
        if (key.equals(NAME)) {
            value = this.reportDTO.getName();
        } else if (key.equals(ADDRESS)) {
            value = this.reportDTO.getAddress();
        } else if (key.equals(ID)) {
            value = this.reportDTO.getId();
        }
        return value;
    }
}
