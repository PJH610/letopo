package com.letopo.app.api.coupon;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.annotation.param.NotNull;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.CouponDTO;
import com.letopo.data.dto.UserCouponDTO;

import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-30 13:18
 */
@HttpOpenApi(group = "coupon", description = "优惠券服务")
public interface CouponService {

    @HttpMethod(description = "领取优惠券")
    public String obtainCoupon(
            @NotNull @HttpParam(name = "couponId", type = HttpParamType.COMMON, description = "优惠券Id") Long couponId,
            @NotNull @HttpParam(name = "userId", type = HttpParamType.USER_ID, description = "用户Id") Long userId) throws ServiceException;

    @HttpMethod(description = "获取用户可领取优惠券")
    public List<CouponDTO> getObtainableCoupon(
            @NotNull @HttpParam(name = "userId", type = HttpParamType.USER_ID, description = "用户Id") Long userId) throws ServiceException;

    @HttpMethod(description = "获取用户优惠券")
    public List<UserCouponDTO> getUserCoupons(
            @NotNull @HttpParam(name = "userId", type = HttpParamType.USER_ID, description = "用户Id") Long userId) throws ServiceException;

}
