package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:17
 */
@Data
@TableName("unimall_user_coupon")
public class UserCouponDO extends SuperDO {

    @TableField("user_id")
    private Long userId;

    @TableField("coupon_id")
    private Long couponId;

    @TableField("order_id")
    private Long orderId;

    @TableField("gmt_used")
    private Date gmtUsed;

    @TableField("gmt_start")
    private Date gmtStart;

    @TableField("gmt_end")
    private Date gmtEnd;

}
