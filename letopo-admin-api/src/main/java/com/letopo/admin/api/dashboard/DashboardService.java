package com.letopo.admin.api.dashboard;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.annotation.param.NotNull;
import com.letopo.core.exception.ServiceException;

/**
 * Created by rize on 2019/7/15.
 */
@HttpOpenApi(group = "admin.dashboard" , description = "首页数据服务")
public interface DashboardService {

    @HttpMethod(description = "聚合数据")
    public Object integral(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员Id") Long adminId) throws ServiceException;

}
