package com.letopo.admin.api.recommend;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.annotation.param.NotNull;
import com.letopo.core.annotation.param.Range;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.RecommendDTO;
import com.letopo.data.model.Page;

/**
 * @author jh
 * @version 1.0
 * @date 2020-05-05 10:17
 */

@HttpOpenApi(group = "admin.recommend", description = "推荐商品")
public interface AdminRecommendService {

    @HttpMethod(description = "创建", permission = "promote:recommend:create", permissionParentName = "推广管理", permissionName = "推荐管理")
    public Boolean addRecommend(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId,
            @NotNull @HttpParam(name = "spuId", type = HttpParamType.COMMON, description = "商品Id") Long spuId,
            @NotNull @HttpParam(name = "recommendType", type = HttpParamType.COMMON, description = "推荐类型") Integer recommendType) throws ServiceException;

    @HttpMethod(description = "删除", permission = "promote:recommend:delete", permissionParentName = "推广管理", permissionName = "推荐管理")
    public Boolean deleteRecommend(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId,
            @NotNull @HttpParam(name = "id", type = HttpParamType.COMMON, description = "推荐id") Long id,
            @NotNull @HttpParam(name = "recommendType", type = HttpParamType.COMMON, description = "推荐类型") Integer recommendType) throws ServiceException;

    @HttpMethod(description = "查询", permission = "promote:recommend:query", permissionParentName = "推广管理", permissionName = "推荐管理")
    public Page<RecommendDTO> queryRecommendByType(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId,
            @HttpParam(name = "recommendType", type = HttpParamType.COMMON, description = "推荐类型") Integer recommendType,
            @Range(min = 1) @HttpParam(name = "pageNo", type = HttpParamType.COMMON, description = "页码", valueDef = "1") Integer pageNo,
            @Range(min = 1) @HttpParam(name = "limit", type = HttpParamType.COMMON, description = "页面长度", valueDef = "10") Integer pageSize) throws ServiceException;

    @HttpMethod(description = "查询", permission = "promote:recommend:query", permissionParentName = "推广管理", permissionName = "推荐管理")
    public Page<RecommendDTO> queryAllRecommend(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId,
            @Range(min = 1) @HttpParam(name = "pageNo", type = HttpParamType.COMMON, description = "页码", valueDef = "1") Integer pageNo,
            @Range(min = 1) @HttpParam(name = "limit", type = HttpParamType.COMMON, description = "页面长度", valueDef = "10") Integer pageSize) throws ServiceException;

}
