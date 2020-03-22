package com.colsubsidio.jr.commons.strategy;

import com.colsubsidio.jr.commons.domain.IApiGeeDomainMetadata;
import com.colsubsidio.jr.commons.integrator.IApiGeeResponse;

import java.io.Serializable;

public interface IApiGeeReportStrategy<T extends Serializable> {

    IApiGeeDomainMetadata getDomainMetadata();

    Class<T> getApiGeeResponseClass();

    IApiGeeResponse buildResponse(T t);
}
