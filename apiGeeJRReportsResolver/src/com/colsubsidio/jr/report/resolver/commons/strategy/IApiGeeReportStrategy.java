package com.colsubsidio.jr.report.resolver.commons.strategy;

import com.colsubsidio.jr.report.resolver.commons.domain.IApiGeeDomainMetadata;
import com.colsubsidio.jr.report.resolver.commons.dto.IApiGeeDTO;
import com.colsubsidio.jr.report.resolver.commons.response.IApiGeeResponse;

import java.util.List;

public interface IApiGeeReportStrategy<T extends IApiGeeDTO> {

    IApiGeeDomainMetadata getDomainMetadata();

    Class<T> getApiGeeResponseClass();

    List<IApiGeeResponse> buildResponse(T t);
}
