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
public class SkuDTO extends SuperDTO {

    private Long spuId;

    private String barCode;

    private Long categoryId;

    /**
     * SKU显示文字
     */
    private String title;

    private String spuTitle;

    private String img;

    private String spuImg;

    private Integer originalPrice;

    private Integer price;

    private Integer vipPrice;

    private Integer stock;

    private Integer status;

    private Integer freezeStock;

    private String unit;

}
