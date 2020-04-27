package com.letopo.data.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.letopo.data.domain.GroupShopSkuDO;
import com.letopo.data.dto.goods.GroupShopSkuDTO;

import java.util.List;


/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public interface GroupShopSkuMapper extends BaseMapper<GroupShopSkuDO>{

    public List<GroupShopSkuDTO> getSkuList(Long groupShopId);

}
