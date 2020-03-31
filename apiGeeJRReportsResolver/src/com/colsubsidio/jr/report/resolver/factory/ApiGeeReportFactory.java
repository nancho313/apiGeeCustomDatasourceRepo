package com.colsubsidio.jr.report.resolver.factory;

import com.colsubsidio.jr.report.resolver.commons.strategy.IApiGeeReportStrategy;
import com.colsubsidio.jr.report.resolver.enums.ReportStrategyEnum;
import com.colsubsidio.jr.report.resolver.strategies.extractoCreditoConsumo.ExtractoCreditoConsumoStrategy;
import com.colsubsidio.jr.report.resolver.strategies.extractoCreditoHipotecario.ExtractoCreditoHipotecarioStrategy;

/**
 * @author Ingeneo S.A.S
 * Componente singleton - factory que ayuda a retornar las estrategias de acuerdo al tipo de reporte solicitado
 */
public enum ApiGeeReportFactory {

    INSTANCE;

    /**
     * Retorna la implementacion del reporte a procesar en el JasperServer por medio del ApiGee custom datasource
     * @param reportStrategyEnum, es la estrategia a utilizar para procesar el reporte
     * @return implementacion de la estrategia
     */
    public IApiGeeReportStrategy getReportStrategy(ReportStrategyEnum reportStrategyEnum) {

        IApiGeeReportStrategy reportStrategy = null;

       if (ReportStrategyEnum.EXTRACTO_CREDITO_HIPOTECARIO.equals(reportStrategyEnum)) {

            reportStrategy = new ExtractoCreditoHipotecarioStrategy();
        } else if (ReportStrategyEnum.EXTRACTO_CREDITO_CONSUMO.equals(reportStrategyEnum)) {

            reportStrategy = new ExtractoCreditoConsumoStrategy();
        }

        return reportStrategy;
    }
}
