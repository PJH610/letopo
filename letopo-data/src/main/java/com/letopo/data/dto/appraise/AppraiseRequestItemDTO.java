package com.letopo.data.dto.appraise;

import com.letopo.data.dto.SuperDTO;
import lombok.Data;

/**
 * 订单评价时，用来存储每种商品时的数据结构
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */


@Data
public class AppraiseRequestItemDTO extends SuperDTO {

    private Long spuId;

    private Long skuId;
    /**
     * 冗余信息
     */
    private Long orderId;

    private Long userId;

    /**
     * 以,分隔的图片路径。
     */
    private String imgUrl;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论星数
     */
    private Integer score;
}
