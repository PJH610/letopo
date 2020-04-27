package com.letopo.data.dto.goods;

import com.letopo.data.dto.SuperDTO;
import lombok.Data;

import java.util.Date;

/**
 * 向前端传出评价信息的数据结构
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class GroupShopSkuDTO extends SpuDTO {

    private Integer skuGroupShopPrice;

    private Integer groupShopId;

    private Long skuId;

    /**
     * sku属性
     */
    private Long spuId;

    private String barCode;

    private String title;

    private String img;

    private Integer original_price;

    private Integer vipPrice;

    private Integer stock;

    private Integer freezeStock;

}
