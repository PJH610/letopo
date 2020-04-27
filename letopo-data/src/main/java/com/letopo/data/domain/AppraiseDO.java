package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:07
 */
@TableName("unimall_appraise")
@Data
public class AppraiseDO extends SuperDO{

    @TableField("spu_id")
    private Long spuId;
    @TableField("sku_id")
    private Long skuId;
    @TableField("order_id")
    private Long orderId;
    @TableField("user_id")
    private Long userId;

    //评论内容
    private String content;
    //评论星数
    private Integer score;


}
