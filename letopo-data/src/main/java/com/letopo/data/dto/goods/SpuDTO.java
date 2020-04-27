package com.letopo.data.dto.goods;

import com.letopo.data.domain.SkuDO;
import com.letopo.data.domain.SpuAttributeDO;
import com.letopo.data.dto.CategoryDTO;
import com.letopo.data.dto.SuperDTO;
import com.letopo.data.dto.appraise.AppraiseResponseDTO;
import com.letopo.data.dto.freight.FreightTemplateDTO;
import com.letopo.data.model.Page;
import lombok.Data;

import java.util.List;

/**
 * 向前端传出评价信息的数据结构
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class SpuDTO extends SuperDTO {

    private List<SkuDO> skuList;

    private Integer originalPrice;

    private Integer price;

    private Integer vipPrice;

    private Integer stock;

    private Integer sales;

    private String title;

    /**
     * 主图
     */
    private String img;

    /**
     * 后面的图，仅在详情接口才出现
     */
    private List<String> imgList;

    private String detail;

    private String description;

    private Long categoryId;

    private List<Long> categoryIds;

    private List<CategoryDTO> categoryList;

    private List<SpuAttributeDO> attributeList;

    /**
     * 商品的第一页(前10条)评价
     */
    private Page<AppraiseResponseDTO> appraisePage;

    /**
     * 商品现在携带的团购信息
     */
    private GroupShopDTO groupShop;

    private String unit;

    private Long freightTemplateId;

    private FreightTemplateDTO freightTemplate;

    private Boolean collect;

    private Integer status;

}
