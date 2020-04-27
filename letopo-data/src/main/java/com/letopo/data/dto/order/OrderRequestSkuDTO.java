package com.letopo.data.dto.order;

import lombok.Data;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
@Data
public class OrderRequestSkuDTO {

    private Long skuId;

    private Integer price;

    private Integer num;

}
