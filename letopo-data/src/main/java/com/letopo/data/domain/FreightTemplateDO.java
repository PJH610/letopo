package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("unimall_freight_template")
public class FreightTemplateDO extends SuperDO{

    @TableField("template_name")
    private String templateName;

    //商品发货地址
    @TableField("spu_location")
    private String spuLocation;

    //多久时间内发货，一天还是几天
    @TableField("delivery_deadline")
    private Integer deliveryDeadline;

    //0包邮 -1永不包邮，正数表示满好多包邮
    @TableField("default_free_price")
    private Integer defaultFreePrice;

    @TableField("default_first_num")
    private Integer defaultFirstNum;

    @TableField("default_first_money")
    private Integer defaultFirstMoney;

    @TableField("default_continue_num")
    private Integer defaultContinueNum;

    @TableField("default_continue_money")
    private Integer defaultContinueMoney;

}

