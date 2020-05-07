package com.letopo.admin.api.config;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.annotation.param.NotNull;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.ConfigDTO;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: kbq
 * Date: 2019-07-20
 * Time: 上午10:18
 */

@HttpOpenApi(group = "admin.merchant", description = "商铺信息配置")
public interface AdminMerchantConfigService {

    @HttpMethod(description = "创建", permission = "promote:merchant:create", permissionParentName = "推广管理", permissionName = "商铺信息管理")
    public boolean addMerchant(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId,
            @NotNull @HttpParam(name = "title", type = HttpParamType.COMMON, description = "商铺标题") String title,
            @HttpParam(name = "logoUrl", type = HttpParamType.COMMON, description = "商铺logo") String logoUrl,
            @HttpParam(name = "description", type = HttpParamType.COMMON, description = "商铺描述") String description,
            @HttpParam(name = "address", type = HttpParamType.COMMON, description = "商铺地址") String address,
            @NotNull @HttpParam(name = "showType", type = HttpParamType.COMMON, description = "展示方式") Integer showType
    ) throws ServiceException;

    @HttpMethod(description = "修改", permission = "promote:merchant:update", permissionParentName = "推广管理", permissionName = "商铺信息管理")
    public boolean updateMerchant(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId,
            @NotNull @HttpParam(name = "title", type = HttpParamType.COMMON, description = "商铺标题") String title,
            @HttpParam(name = "logoUrl", type = HttpParamType.COMMON, description = "商铺logo") String logoUrl,
            @HttpParam(name = "description", type = HttpParamType.COMMON, description = "商铺描述") String description,
            @HttpParam(name = "address", type = HttpParamType.COMMON, description = "商铺地址") String address,
            @NotNull @HttpParam(name = "showType", type = HttpParamType.COMMON, description = "展示方式") Integer showType
    ) throws ServiceException;

    @HttpMethod(description = "查询", permission = "promote:merchant:query", permissionParentName = "推广管理", permissionName = "商铺信息管理")
    public ConfigDTO getMerchant(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId) throws ServiceException;


}
