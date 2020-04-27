package com.letopo.data.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.letopo.data.domain.FreightTemplateDO;
import org.apache.ibatis.annotations.Param;


/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public interface FreightTemplateMapper extends BaseMapper<FreightTemplateDO> {

    public FreightTemplateDO selectFreightBySkuId(@Param("skuId") Long skuId);
}
