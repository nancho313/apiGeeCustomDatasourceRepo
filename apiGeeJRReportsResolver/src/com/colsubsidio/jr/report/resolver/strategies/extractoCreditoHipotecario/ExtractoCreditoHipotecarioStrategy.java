package com.colsubsidio.jr.report.resolver.strategies.extractoCreditoHipotecario;

import com.colsubsidio.jr.report.resolver.commons.domain.IApiGeeDomainMetadata;
import com.colsubsidio.jr.report.resolver.commons.response.IApiGeeResponse;
import com.colsubsidio.jr.report.resolver.commons.strategy.IApiGeeReportStrategy;

import java.util.ArrayList;
import java.util.List;

public class ExtractoCreditoHipotecarioStrategy implements IApiGeeReportStrategy<ExtractoCreditoHipotecarioDTO> {

    private final ExtractoCreditoHipotecarioDomainMetadata domainMetadata = new ExtractoCreditoHipotecarioDomainMetadata();

    @Override
    public IApiGeeDomainMetadata getDomainMetadata() {
        return domainMetadata;
    }

    @Override
    public Class<ExtractoCreditoHipotecarioDTO> getApiGeeResponseClass() {
        return ExtractoCreditoHipotecarioDTO.class;
    }

    @Override
    public List<IApiGeeResponse> buildResponse(ExtractoCreditoHipotecarioDTO extractoCreditoHipotecarioDTO) {
        List<IApiGeeResponse> responseList = new ArrayList<>();
        for (ExtractoCreditoHipotecarioDTO.Extracto extracto : extractoCreditoHipotecarioDTO.getExtracto()) {
            responseList.add(new ExtractoCreditoHipotecarioResponse(extracto));
        }
        return responseList;
    }
}
