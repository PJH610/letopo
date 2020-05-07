package com.letopo.app.api.goods;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.annotation.param.NotNull;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.goods.SpuDTO;
import com.letopo.data.model.Page;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-30 15:11
 */
@HttpOpenApi(group = "goods", description = "商品服务")
public interface GoodsService {

    @HttpMethod(description = "搜索Goods列表")
    public Page<SpuDTO> getGoodsPage(
            @HttpParam(name = "pageNo", type = HttpParamType.COMMON, description = "页码", valueDef = "1") Integer pageNo,
            @HttpParam(name = "pageSize", type = HttpParamType.COMMON, description = "页码长度", valueDef = "10") Integer pageSize,
            @HttpParam(name = "categoryId", type = HttpParamType.COMMON, description = "搜索分类") Long categoryId,
            @HttpParam(name = "orderBy", type = HttpParamType.COMMON, description = "排序 id 或 sales", valueDef = "id") String orderBy,
            @HttpParam(name = "isAsc", type = HttpParamType.COMMON, description = "是否升序", valueDef = "false") Boolean isAsc,
            @HttpParam(name = "title", type = HttpParamType.COMMON, description = "搜索标题") String title) throws ServiceException;

    @HttpMethod(description = "获取商品详情")
    public SpuDTO getGoods(
            @NotNull @HttpParam(name = "spuId", type = HttpParamType.COMMON, description = "商品Id") Long spuId,
            @HttpParam(name = "groupShopId", type = HttpParamType.COMMON, description = "团购Id") Long groupShopId,
            @HttpParam(name = "userId", type = HttpParamType.USER_ID, description = "用户Id") Long userId) throws ServiceException;

}
