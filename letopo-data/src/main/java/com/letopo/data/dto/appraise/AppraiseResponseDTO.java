package com.letopo.data.dto.appraise;

import com.letopo.data.dto.SuperDTO;
import lombok.Data;

import java.util.List;

/**
 * 向前端传出评价信息的数据结构
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class AppraiseResponseDTO extends SuperDTO {

    private String content;

    private Integer score;

    private List<String> imgList;

    private Long userId;

    private String userNickName;

    private String userAvatarUrl;

    private Long orderId;

    private Long spuId;

    private String spuTitle;

    private Long skuId;

    private String skuTitle;

}
