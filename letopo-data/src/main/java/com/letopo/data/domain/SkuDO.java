package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:15
 */
@Data
@TableName("unimall_sku")
public class SkuDO extends SuperDO {

    @TableField("spu_id")
    private Long spuId;

    @TableField("bar_code")
    private String barCode;

    /**
     * SKU显示文字
     */
    private String title;

    private String img;

    @TableField("original_price")
    private Integer originalPrice;

    private Integer price;

    @TableField("vip_price")
    private Integer vipPrice;

    private Integer stock;

    @TableField("freeze_stock")
    private Integer freezeStock;

}
