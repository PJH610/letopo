package com.letopo.admin.api.order;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.annotation.param.NotNull;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.domain.OrderDO;
import com.letopo.data.dto.order.OrderDTO;
import com.letopo.data.dto.order.OrderStatisticsDTO;
import com.letopo.data.model.Page;

import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-05-05 10:17
 */
@HttpOpenApi(group = "admin.order", description = "管理员订单服务")
public interface AdminOrderService {

    @HttpMethod(description = "列表", permission = "operation:order:list", permissionParentName = "运营管理", permissionName = "订单管理")
    public Page<OrderDO> list(
            @HttpParam(name = "page", type = HttpParamType.COMMON, description = "订单页码", valueDef = "1") Integer page,
            @HttpParam(name = "limit", type = HttpParamType.COMMON, description = "页码长度", valueDef = "20") Integer limit,
            @HttpParam(name = "status", type = HttpParamType.COMMON, description = "订单状态") Integer status,
            @HttpParam(name = "orderNo", type = HttpParamType.COMMON, description = "订单号") String orderNo,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员Id") Long adminId) throws ServiceException;

    @HttpMethod(description = "退款", permission = "operation:order:refund", permissionParentName = "运营管理", permissionName = "订单管理")
    public String refund(
            @NotNull @HttpParam(name = "orderNo", type = HttpParamType.COMMON, description = "订单号") String orderNo,
            @NotNull @HttpParam(name = "type", type = HttpParamType.COMMON, description = "0.拒绝退款 1.同意退款") Integer type,
            @HttpParam(name = "sum", type = HttpParamType.COMMON, description = "退款金额") Integer sum,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员Id") Long adminId) throws ServiceException;

    @HttpMethod(description = "发货", permission = "operation:order:ship", permissionParentName = "运营管理", permissionName = "订单管理")
    public String ship(
            @NotNull @HttpParam(name = "orderNo", type = HttpParamType.COMMON, description = "订单号") String orderNo,
            @NotNull @HttpParam(name = "shipCode", type = HttpParamType.COMMON, description = "承运商Code") String shipCode,
            @HttpParam(name = "shipNo", type = HttpParamType.COMMON, description = "运单号") String shipNo,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员Id") Long adminId) throws ServiceException;

    @HttpMethod(description = "详情", permission = "operation:order:detail", permissionParentName = "运营管理", permissionName = "订单管理")
    public OrderDTO detail(
            @NotNull @HttpParam(name = "orderId", type = HttpParamType.COMMON, description = "订单Id") Long orderNo,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员Id") Long adminId) throws ServiceException;

    @HttpMethod(description = "根据传入时间和订单状态查询订单信息")
    public List<OrderDTO> queryToExcel(
            @HttpParam(name = "gmtStart", type = HttpParamType.COMMON, description = "查询开始时间") Long gmtStart,
            @HttpParam(name = "gmtEnd", type = HttpParamType.COMMON, description = "查询结束时间") Long gmtEnd,
            @HttpParam(name = "status", type = HttpParamType.COMMON, description = "订单状态", valueDef = "20") Integer status,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员Id") Long adminId) throws ServiceException;

    @HttpMethod(description = "编辑管理员备注", permission = "operation:order:editadminmono", permissionParentName = "运营管理", permissionName = "订单管理")
    public String editAdminMono(
            @NotNull @HttpParam(name = "orderId", type = HttpParamType.COMMON, description = "订单Id") Long orderId,
            @NotNull @HttpParam(name = "level", type = HttpParamType.COMMON, description = "备注等级") Integer level,
            @HttpParam(name = "mono", type = HttpParamType.COMMON, description = "备注") String mono,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "adminId") Long adminId) throws ServiceException;

    @HttpMethod(description = "订单统计", permission = "operation:order:statistics", permissionParentName = "运营管理", permissionName = "订单管理")
    public List<OrderStatisticsDTO> statistics(
            @HttpParam(name = "gmtStart", type = HttpParamType.COMMON, description = "查询开始时间") Long gmtStart,
            @HttpParam(name = "gmtEnd", type = HttpParamType.COMMON, description = "查询结束时间") Long gmtEnd,
            @NotNull @HttpParam(name = "adminId", type = HttpParamType.ADMIN_ID, description = "管理员Id") Long adminId) throws ServiceException;


}
