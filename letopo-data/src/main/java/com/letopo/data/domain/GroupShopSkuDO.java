package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:12
 */
@Data
@TableName("unimall_group_shop_sku")
public class GroupShopSkuDO extends SuperDO{

    @TableField("sku_id")
    private Long skuId;

    @TableField("group_shop_id")
    private Long groupShopId;

    @TableField("sku_group_shop_price")
    private Integer skuGroupShopPrice;

}
