package com.letopo.data.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.letopo.data.domain.ImgDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public interface ImgMapper extends BaseMapper<ImgDO> {

    public List<String> getImgs(@Param("bizType") Integer bizType, @Param("bizId") Long bizId);

    public Integer insertImgs(List<ImgDO> imgs);

}
