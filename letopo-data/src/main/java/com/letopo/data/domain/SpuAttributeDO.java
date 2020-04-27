package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:16
 */
@TableName("unimall_spu_attribute")
@Data
public class SpuAttributeDO extends SuperDO {

    @TableField("spu_id")
    private Long spuId;

    private String attribute;

    private String value;

}
