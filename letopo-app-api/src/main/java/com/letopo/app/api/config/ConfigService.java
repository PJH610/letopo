package com.letopo.app.api.config;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.ConfigDTO;

/**
 * Created by rize on 2019/7/21.
 */
@HttpOpenApi(group = "config", description = "商户配置服务")
public interface ConfigService {

    @HttpMethod(description = "获取商户配置")
    public ConfigDTO getMerchantConfig() throws ServiceException;

}
