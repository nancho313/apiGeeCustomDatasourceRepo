package com.colsubsidio.jr.report.resolver.commons.response;

import com.colsubsidio.jr.report.resolver.commons.dto.IApiGeeDTO;

public interface IApiGeeResponse<T extends IApiGeeDTO> {

    Object getFieldValue(String key);
}
