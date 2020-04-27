package com.letopo.data.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.letopo.data.domain.FootprintDO;
import com.letopo.data.dto.FootprintDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public interface FootprintMapper extends BaseMapper<FootprintDO> {

    public List<FootprintDTO> getAllFootprint(@Param("userId")Long userId, @Param("offset")Integer offset, @Param("size")Integer size);

}
