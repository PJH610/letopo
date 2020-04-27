package com.letopo.data.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.letopo.data.domain.RecommendDO;
import com.letopo.data.dto.RecommendDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public interface RecommendMapper extends BaseMapper<RecommendDO> {

    //根据推荐类型，查找商品信息
    public List<RecommendDTO> getRecommendByType(@Param("recommendType") Integer recommendType, @Param("offset") Integer offset, @Param("pageSize") Integer pageSize);

    public List<RecommendDTO> getAllRecommend(@Param("offset") Integer offset,@Param("pageSize") Integer pageSize);

}
