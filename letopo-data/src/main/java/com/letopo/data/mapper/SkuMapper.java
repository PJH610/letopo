package com.letopo.data.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.letopo.data.domain.SkuDO;
import com.letopo.data.dto.goods.SkuDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public interface SkuMapper extends BaseMapper<SkuDO> {

    public SkuDTO getSkuDTOById(Long skuId);

    public Integer decSkuStock(@Param("skuId") Long skuId, @Param("stock") Integer stock);

    public Integer returnSkuStock(@Param("skuId") Long skuId, @Param("stock") Integer stock);

    public Integer decSkuFreezeStock(@Param("skuId") Long skuId, @Param("stock") Integer stock);

    /**
     * 删除SPUID
     * @param spuId
     * @return
     */
    public List<Long> getSkuIds(@Param("spuId") Long spuId);

    List<Long> selectSkuIdsBySpuIds(@Param("ids") List<Long> ids);
}
