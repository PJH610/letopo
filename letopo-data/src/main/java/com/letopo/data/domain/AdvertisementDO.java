package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:07
 */
@Data
@TableName("unimall_advertisement")
@NoArgsConstructor
@AllArgsConstructor
public class AdvertisementDO extends SuperDO {

    @TableField("ad_type")
    private Integer adType;

    private String title;

    private String url;

    @TableField("img_url")
    private String imgUrl;

    private Integer status;

    private String color;
}
