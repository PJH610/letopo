package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:08
 */
@Data
@TableName("unimall_cart")
public class CartDO extends SuperDO {

    @TableField("sku_id")
    private Long skuId;

    @TableField("user_id")
    private Long userId;

    private Integer num;

}
