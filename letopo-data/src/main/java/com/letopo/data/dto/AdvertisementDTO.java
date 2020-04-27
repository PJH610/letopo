package com.letopo.data.dto;

import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class AdvertisementDTO extends SuperDTO {

    private Integer adType;

    private String title;

    private String url;

    private String imgUrl;

    private Integer status;

    private String color;

    /**
     * 附加广告数据
     */
    private Object data;
}
