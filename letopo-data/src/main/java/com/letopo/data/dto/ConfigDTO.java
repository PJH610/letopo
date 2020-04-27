package com.letopo.data.dto;

import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class ConfigDTO extends SuperDTO {
    private String title;
    private String logoUrl;
    private String description;
    private String address;
    private Integer showType;
    private Integer status;
}
