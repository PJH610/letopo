package com.letopo.data.dto;

import lombok.Data;

import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class CartDTO extends SuperDTO {

    private Long skuId;

    private Integer num;

    private String title;

    private Integer originalPrice;

    private Integer price;

    private Integer vipPrice;

    private String skuTitle;

    private String spuImg;

    private String skuImg;

    private Integer stock;

    private Long spuId;

    private Long categoryId;

    private List<Long> categoryIdList;

}
