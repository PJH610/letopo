package com.letopo.admin.api.appraise;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.annotation.param.NotNull;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.appraise.AppraiseResponseDTO;
import com.letopo.data.model.Page;

/**
 * @author jh
 * @version 1.0
 * @date 2020-05-04 11:50
 */
@HttpOpenApi(group = "admin.appraise", description = "评论")
public interface AdminAppraise {

    @HttpMethod(description = "删除", permission = "operation:appraise:delete", permissionParentName = "运营管理", permissionName = "评论管理")
    public boolean deleteAppraise(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId,
            @NotNull @HttpParam(name = "id", type = HttpParamType.COMMON, description = "评论id") Long id) throws ServiceException;


    @HttpMethod(description = "查询", permission = "operation:appraise:query", permissionParentName = "运营管理", permissionName = "评论管理")
    public Page<AppraiseResponseDTO> getAppraiseList(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId,
            @HttpParam(name = "id", type = HttpParamType.COMMON, description = "评论id") Long id,
            @HttpParam(name = "userName", type = HttpParamType.COMMON, description = "用户姓名") String userName,
            @HttpParam(name = "spuName", type = HttpParamType.COMMON, description = "商品名字") String spuName,
            @HttpParam(name = "orderId", type = HttpParamType.COMMON, description = "订单ID") Long orderId,
            @HttpParam(name = "score", type = HttpParamType.COMMON, description = "评论id") Integer score,
            @HttpParam(name = "content", type = HttpParamType.COMMON, description = "评论id") String content,
            @HttpParam(name = "pageNo", type = HttpParamType.COMMON, description = "页码") Integer pageNo,
            @HttpParam(name = "limit", type = HttpParamType.COMMON, description = "页码长度") Integer limit) throws ServiceException;

}
