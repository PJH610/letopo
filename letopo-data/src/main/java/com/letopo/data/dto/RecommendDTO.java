package com.letopo.data.dto;

import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class RecommendDTO extends SuperDTO {

    private Integer recommendType;

    private Long spuId;

    private Integer spuOriginalPrice;

    private Integer spuPrice;

    private Integer spuVipPrice;

    private Integer spuSales;

    private String spuImg;

    private String spuTitle;

    private Long spuCategoryId;
}
