package com.colsubsidio.jr.report.resolver.strategies.extractoCreditoConsumo;

import com.colsubsidio.jr.report.resolver.commons.domain.IApiGeeDomainMetadata;
import com.colsubsidio.jr.report.resolver.commons.response.IApiGeeResponse;
import com.colsubsidio.jr.report.resolver.commons.strategy.IApiGeeReportStrategy;
import com.colsubsidio.jr.report.resolver.strategies.extractoCreditoHipotecario.ExtractoCreditoHipotecarioDomainMetadata;

import java.util.ArrayList;
import java.util.List;

public class ExtractoCreditoConsumoStrategy implements IApiGeeReportStrategy<ExtractoCreditoConsumoDTO> {

    private final ExtractoCreditoHipotecarioDomainMetadata domainMetadata = new ExtractoCreditoHipotecarioDomainMetadata();

    @Override
    public IApiGeeDomainMetadata getDomainMetadata() {
        return domainMetadata;
    }

    @Override
    public Class<ExtractoCreditoConsumoDTO> getApiGeeResponseClass() {
        return ExtractoCreditoConsumoDTO.class;
    }

    @Override
    public List<IApiGeeResponse> buildResponse(ExtractoCreditoConsumoDTO extractoCreditoConsumoDTO) {
        List<IApiGeeResponse> responseList = new ArrayList<>();
        for (ExtractoCreditoConsumoDTO.Extracto extracto : extractoCreditoConsumoDTO.getExtracto()) {
            responseList.add(new ExtractoCreditoConsumoResponse(extracto));
        }
        return responseList;
    }
}
