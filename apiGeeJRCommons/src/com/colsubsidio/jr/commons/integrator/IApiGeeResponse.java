package com.colsubsidio.jr.commons.integrator;

import java.io.Serializable;

public interface IApiGeeResponse<T extends Serializable> {

    Object getFieldValue(String key);
}
