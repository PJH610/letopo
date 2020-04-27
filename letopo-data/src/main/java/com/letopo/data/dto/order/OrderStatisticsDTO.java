package com.letopo.data.dto.order;

import lombok.Data;
/**
 * Description: 订单统计传输模型
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
@Data
public class OrderStatisticsDTO {

    private Long spuId;

    private String spuTitle;

    private Long skuId;

    private String skuTitle;

    private Integer num;

}
