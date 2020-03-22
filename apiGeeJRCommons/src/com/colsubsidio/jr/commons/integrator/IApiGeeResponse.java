package com.colsubsidio.jr.commons.integrator;

import com.colsubsidio.jr.commons.dto.IApiGeeDTO;

public interface IApiGeeResponse<T extends IApiGeeDTO> {

    Object getFieldValue(String key);
}
