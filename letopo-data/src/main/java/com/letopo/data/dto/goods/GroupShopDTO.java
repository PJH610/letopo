package com.letopo.data.dto.goods;

import com.letopo.data.domain.GroupShopSkuDO;
import com.letopo.data.dto.SuperDTO;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 向前端传出评价信息的数据结构
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */

@Data
public class GroupShopDTO extends SuperDTO {

    private Long spuId;

    private Integer minPrice;

    private Integer maxPrice;

    private Date gmtStart;

    private Date gmtEnd;

    private Integer minimumNumber;

    private Integer alreadyBuyNumber;

    private Integer automaticRefund;

    /**
     * GroupShopSkuDTO列表
     */
    private List<GroupShopSkuDTO> groupShopSkuDTOList;

    private List<GroupShopSkuDO> groupShopSkuList;

    /**
     * spu属性
     */
    private Integer originalPrice;

    private Integer price;

    private Integer vipPrice;

    private String title;

    private Integer sales;

    private String img;

    private String detail;

    private String description;

    private Long categoryId;

    private Long freightTemplateId;

    private String unit;

    private Integer status;
}
