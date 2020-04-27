package com.letopo.data.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:10
 */
@Data
@TableName("unimall_freight_template_carriage")
@AllArgsConstructor
@NoArgsConstructor
public class FreightTemplateCarriageDO extends SuperDO{


    //指定使用该运费计算的运费模板,必有存在
    @TableField("template_id")
    private Long templateId;

    //指定该运费的区域
    @TableField("designated_area")
    private String designatedArea;

    @TableField("free_price")
    private Integer freePrice;

    //首次记件数量，为超过该件数不加价
    @TableField("first_num")
    private Integer firstNum;

    //首次记件价格
    @TableField("first_money")
    private Integer firstMoney;

    //续件一次的数量
    @TableField("continue_num")
    private Integer continueNum;

    //续件一次的价格
    @TableField("continue_money")
    private Integer continueMoney;


}

