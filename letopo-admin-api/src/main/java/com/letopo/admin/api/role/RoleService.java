package com.letopo.admin.api.role;


import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.annotation.param.NotNull;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.domain.RoleDO;
import com.letopo.data.dto.RoleSetPermissionDTO;
import com.letopo.data.model.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by rize on 2019/4/11.
 */
@HttpOpenApi(group = "admin.role", description = "角色服务")
public interface RoleService {

    @HttpMethod(description = "列表", permission = "admin:role:list", permissionParentName = "系统管理", permissionName = "角色管理")
    public Page<RoleDO> list(
            @HttpParam(name = "name", type = HttpParamType.COMMON, description = "搜索名称") String name,
            @HttpParam(name = "page", type = HttpParamType.COMMON, description = "页码", valueDef = "1") Integer page,
            @HttpParam(name = "limit", type = HttpParamType.COMMON, description = "页码长度", valueDef = "20") Integer limit,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId) throws ServiceException;


    @HttpMethod(description = "添加", permission = "admin:role:create", permissionParentName = "系统管理", permissionName = "角色管理")
    public RoleDO create(
            @NotNull @HttpParam(name = "role", type = HttpParamType.COMMON, description = "角色对象") RoleDO roleDO,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId) throws ServiceException;


    @HttpMethod(description = "删除", permission = "admin:role:delete", permissionParentName = "系统管理", permissionName = "角色管理")
    public String delete(
            @NotNull @HttpParam(name = "roleId", type = HttpParamType.COMMON, description = "角色Id") Long roleId,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId) throws ServiceException;


    @HttpMethod(description = "更新", permission = "admin:role:update", permissionParentName = "系统管理", permissionName = "角色管理")
    public RoleDO update(
            @NotNull @HttpParam(name = "role", type = HttpParamType.COMMON, description = "角色对象") RoleDO roleDO,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId) throws ServiceException;


    @HttpMethod(description = "角色授权", permission = "admin:role:permissionList",  permissionParentName = "系统管理", permissionName = "角色管理")
    public String permissionSet(
            @NotNull @HttpParam(name = "roleSetPermissionDTO", type = HttpParamType.COMMON, description = "设置DTO") RoleSetPermissionDTO roleSetPermissionDTO,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId) throws ServiceException;


    @HttpMethod(description = "权限列表", permission = "admin:permission:list", permissionParentName = "系统管理", permissionName = "角色管理")
    public Map<String,Object> permissionList(
            @NotNull @HttpParam(name = "roleId", type = HttpParamType.COMMON, description = "角色ID") Long roleId,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId) throws ServiceException;


    @HttpMethod(description = "角色枚举")
    public List<Map<String,Object>> options(
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员ID") Long adminId) throws ServiceException;

}
