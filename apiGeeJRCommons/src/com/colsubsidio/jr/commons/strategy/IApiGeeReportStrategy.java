package com.colsubsidio.jr.commons.strategy;

import com.colsubsidio.jr.commons.domain.IApiGeeDomainMetadata;
import com.colsubsidio.jr.commons.dto.IApiGeeDTO;
import com.colsubsidio.jr.commons.integrator.IApiGeeResponse;

import java.io.Serializable;
import java.util.List;

public interface IApiGeeReportStrategy<T extends IApiGeeDTO> {

    IApiGeeDomainMetadata getDomainMetadata();

    Class<T> getApiGeeResponseClass();

    List<IApiGeeResponse> buildResponse(T t);
}
