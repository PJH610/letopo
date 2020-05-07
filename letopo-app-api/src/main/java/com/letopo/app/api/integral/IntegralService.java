package com.letopo.app.api.integral;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.IntegralIndexDataDTO;

/**
 * 将多个接口聚合到一起，减少HTTP访问次数
 * @author jh
 * @version 1.0
 * @date 2020-04-30 11:08
 */

@HttpOpenApi(group = "integral", description = "聚合接口")
public interface IntegralService {

    @HttpMethod(description = "获取首页聚合数据")
    public IntegralIndexDataDTO getIndexData() throws ServiceException;

}
