package com.letopo.data.dto;

import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class FootprintDTO extends SuperDTO {

    private Long userId;

    private Long spuId;

    private String spuTitle;

    private Integer spuPrice;

    private String spuImg;
}
