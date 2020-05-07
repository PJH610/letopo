package com.letopo.app.api.goods;

import com.letopo.biz.service.goods.GoodsBizService;
import com.letopo.biz.service.groupshop.GroupShopBizService;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.goods.SpuDTO;
import com.letopo.data.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author jh
 * @version 1.0
 * @date 2020-04-30 15:15
 */
@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsBizService goodsBizService;

    @Autowired
    private GroupShopBizService groupShopBizService;

    @Override
    public Page<SpuDTO> getGoodsPage(Integer pageNo, Integer pageSize, Long categoryId, String orderBy,Boolean isAsc, String title) throws ServiceException {
        return goodsBizService.getGoodsPage(pageNo, pageSize, categoryId, orderBy, isAsc, title);
    }

    @Override
    public SpuDTO getGoods(Long spuId, Long groupShopId, Long userId) throws ServiceException {
        //若团购Id不为空，则额外添加团购信息
        SpuDTO goods = goodsBizService.getGoods(spuId, userId);
        if (groupShopId != null) {
            goods.setGroupShop(groupShopBizService.getGroupShopById(groupShopId));
        }
        return goods;
    }
}
