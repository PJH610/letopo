package com.letopo.app.api.collect;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.annotation.param.NotNull;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.CollectDTO;
import com.letopo.data.model.Page;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-30 13:12
 */
@HttpOpenApi(group = "collect", description = "收藏表单")
public interface CollectService {

    @HttpMethod(description = "增加收藏记录")
    public Boolean addCollect(
            @NotNull @HttpParam(name = "userId", type = HttpParamType.USER_ID, description = "用户Id") Long userId,
            @NotNull @HttpParam(name = "spuId", type = HttpParamType.COMMON, description = "商品ID") Long spuId) throws ServiceException;

    @HttpMethod(description = "删除收藏记录")
    public Boolean deleteCollect(
            @NotNull @HttpParam(name = "userId", type = HttpParamType.USER_ID, description = "用户Id") Long userId,
            @NotNull @HttpParam(name = "spuId", type = HttpParamType.COMMON, description = "商品ID") Long spuId) throws ServiceException;

    @HttpMethod(description = "查询某一用户收藏记录")
    public Page<CollectDTO> getCollectAll(
            @NotNull @HttpParam(name = "userId", type = HttpParamType.USER_ID, description = "用户Id") Long userId,
            @HttpParam(name = "pageNo", valueDef = "1", type = HttpParamType.COMMON, description = "分页查询偏移量") Integer pageNo,
            @HttpParam(name = "pageSize", valueDef = "10", type = HttpParamType.COMMON, description = "分页查询长度") Integer pageSize) throws ServiceException;


    @HttpMethod(description = "查询某一条收藏记录")
    public CollectDTO getCollectById(
            @NotNull @HttpParam(name = "userId", type = HttpParamType.USER_ID, description = "用户Id") Long userId,
            @NotNull @HttpParam(name = "collectId", type = HttpParamType.COMMON, description = "收藏记录id") Long collectId,
            @HttpParam(name = "spuId", type = HttpParamType.COMMON, description = "商品ID") Long spuId) throws ServiceException;

    @HttpMethod(description = "判断用户是否收藏")
    public Boolean getCollectBySpuId(
            @NotNull @HttpParam(name = "spuId", type = HttpParamType.COMMON, description = "商品Id") Long spuId,
            @NotNull @HttpParam(name = "userId", type = HttpParamType.USER_ID, description = "用户Id") Long userId) throws ServiceException;

}
