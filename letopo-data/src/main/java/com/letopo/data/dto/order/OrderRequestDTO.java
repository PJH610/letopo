package com.letopo.data.dto.order;

import com.letopo.data.dto.UserCouponDTO;
import lombok.Data;

import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
@Data
public class OrderRequestDTO {

    private List<OrderRequestSkuDTO> skuList;

    /**
     * 商品支付总价
     */
    private Integer totalPrice;

    private Integer totalOriginalPrice;

    private UserCouponDTO coupon;

    private Long addressId;

    private Long groupShopId;

    private String mono;

    /**
     * 购物车 ？ 直接点击购买商品
     */
    private String takeWay;

    private Integer freightPrice;

}
