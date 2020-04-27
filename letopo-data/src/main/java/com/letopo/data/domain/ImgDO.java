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
@TableName("unimall_img")
public class ImgDO extends SuperDO {

    @TableField("biz_type")
    private Integer bizType;

    @TableField("biz_id")
    private Long bizId;

    private String url;


}
