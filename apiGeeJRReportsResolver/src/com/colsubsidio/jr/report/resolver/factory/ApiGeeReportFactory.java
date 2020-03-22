package com.colsubsidio.jr.report.resolver.factory;

import com.colsubsidio.jr.commons.strategy.IApiGeeReportStrategy;
import com.colsubsidio.jr.report.resolver.enums.ReportStrategyEnum;
import com.colsubsidio.jr.report.resolver.strategies.testReport.TestReportStrategy;

public enum ApiGeeReportFactory {

    INSTANCE;

    public IApiGeeReportStrategy getReportStrategy(ReportStrategyEnum reportStrategyEnum){

        IApiGeeReportStrategy reportStrategy = null;

        if(ReportStrategyEnum.TEST_REPORT.equals(reportStrategyEnum)){

            reportStrategy = new TestReportStrategy();
        }

        return reportStrategy;
    }
}
