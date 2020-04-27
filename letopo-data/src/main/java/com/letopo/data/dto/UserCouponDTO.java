package com.letopo.data.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class UserCouponDTO extends SuperDTO {

    private String title;

    private String categoryTitle;

    private Long categoryId;

    private Integer min;

    /**
     * 优惠券价格
     */
    private Integer discount;

    private Long userId;

    private Long couponId;

    private Long orderId;

    private Date gmtUsed;

    private Date gmtStart;

    private Date gmtEnd;

}
