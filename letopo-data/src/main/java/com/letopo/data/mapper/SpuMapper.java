package com.letopo.data.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.letopo.data.domain.SpuDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public interface SpuMapper extends BaseMapper<SpuDO> {

    /**
     * 仅可传入叶子类目
     * @param categoryId
     * @return
     */
    public List<SpuDO> getSpuTitleByCategoryId(Long categoryId);

    /**
     * 增加Spu累计销量
     * @param spuId
     * @param delta
     * @return
     */
    public Integer incSales(@Param("spuId") Long spuId, @Param("delta") Integer delta);

    public List<SpuDO> getSpuTitleAll();

}
