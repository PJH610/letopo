package com.letopo.admin.api.user;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.annotation.param.NotNull;
import com.letopo.core.annotation.param.Range;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.domain.UserDO;
import com.letopo.data.model.Page;

/**
 * @author jh
 * @version 1.0
 * @date 2020-05-05 14:07
 */

@HttpOpenApi(group = "admin.user", description = "用户管理")
public interface AdminUserService {

    @HttpMethod(description = "创建", permission = "system:user:create", permissionParentName = "系统管理", permissionName = "用户管理")
    public Boolean addUser(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId,
            @NotNull @HttpParam(name = "user", type = HttpParamType.COMMON, description = "用户信息") UserDO user) throws ServiceException;

    @HttpMethod(description = "删除", permission = "system:user:delete", permissionParentName = "系统管理", permissionName = "用户管理")
    public Boolean deleteUser(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId,
            @NotNull @HttpParam(name = "id", type = HttpParamType.COMMON, description = "用户Id") Long id,
            @NotNull @HttpParam(name = "nickname", type = HttpParamType.COMMON, description = "用户Id") String nickname) throws ServiceException;

    @HttpMethod(description = "修改", permission = "system:user:update", permissionParentName = "系统管理", permissionName = "用户管理")
    public Boolean updateUser(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId,
            @NotNull @HttpParam(name = "user", type = HttpParamType.COMMON, description = "用户信息") UserDO user) throws ServiceException;

    @HttpMethod(description = "激活冻结", permission = "system:user:update", permissionParentName = "系统管理", permissionName = "用户管理")
    public Boolean updateStatus(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId,
            @NotNull @HttpParam(name = "userId", type = HttpParamType.COMMON, description = "用户信息") Long userId,
            @NotNull @HttpParam(name = "status", type = HttpParamType.COMMON, description = "用户信息") Integer status) throws ServiceException;


    @HttpMethod(description = "查询", permission = "system:user:query", permissionParentName = "系统管理", permissionName = "用户管理")
    public Page<UserDO> getUser(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId,
            @HttpParam(name = "id", type = HttpParamType.COMMON, description = "用户ID") Long id,
            @HttpParam(name = "nickname", type = HttpParamType.COMMON, description = "用户昵称") String nickname,
            @HttpParam(name = "level", type = HttpParamType.COMMON, description = "用户等级") Integer level,
            @HttpParam(name = "gender", type = HttpParamType.COMMON, description = "用户性别") Integer gender,
            @HttpParam(name = "status", type = HttpParamType.COMMON, description = "用户状态") Integer status,
            @Range(min = 1) @HttpParam(name = "pageNo", type = HttpParamType.COMMON, description = "当前页码") Integer pageNo,
            @Range(min = 1) @HttpParam(name = "limit", type = HttpParamType.COMMON, description = "页码长度") Integer limit) throws ServiceException;
}
