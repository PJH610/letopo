package com.letopo.data.dto;

import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class CollectDTO extends SuperDTO {

    private Long userId;
    private Long spuId;
    private Integer originalPrice;
    private Integer price;
    private Integer vipPirce;
    private String title;
    private Integer sales;
    private String img;
    private String description;
    private String unit;
    private Integer status;

}
