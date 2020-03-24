package com.colsubsidio.jr.report.resolver.factory;

import com.colsubsidio.jr.report.resolver.commons.strategy.IApiGeeReportStrategy;
import com.colsubsidio.jr.report.resolver.enums.ReportStrategyEnum;
import com.colsubsidio.jr.report.resolver.strategies.extractoCreditoConsumo.ExtractoCreditoConsumoStrategy;
import com.colsubsidio.jr.report.resolver.strategies.extractoCreditoHipotecario.ExtractoCreditoHipotecarioStrategy;
import com.colsubsidio.jr.report.resolver.strategies.testReport.TestReportStrategy;

public enum ApiGeeReportFactory {

    INSTANCE;

    public IApiGeeReportStrategy getReportStrategy(ReportStrategyEnum reportStrategyEnum) {

        IApiGeeReportStrategy reportStrategy = null;

        if (ReportStrategyEnum.TEST_REPORT.equals(reportStrategyEnum)) {

            reportStrategy = new TestReportStrategy();
        } else if (ReportStrategyEnum.EXTRACTO_CREDITO_HIPOTECARIO.equals(reportStrategyEnum)) {

            reportStrategy = new ExtractoCreditoHipotecarioStrategy();
        } else if (ReportStrategyEnum.EXTRACTO_CREDITO_CONSUMO.equals(reportStrategyEnum)) {

            reportStrategy = new ExtractoCreditoConsumoStrategy();
        }

        return reportStrategy;
    }
}
