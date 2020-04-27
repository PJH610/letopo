package com.letopo.data.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.letopo.data.domain.GroupShopDO;
import com.letopo.data.dto.goods.GroupShopDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public interface GroupShopMapper extends BaseMapper<GroupShopDO> {

    public List<GroupShopDTO> getGroupShopPage(@Param("offset") Integer offset, @Param("limit") Integer limit);

    public GroupShopDTO detail(Long groupShopId);

    /**
     * 增加当前人数
     * @param id 团购活动Id
     * @param num 增加人数量
     * @return
     */
    public Integer incCurrentNum(@Param("id") Long id,@Param("num") Integer num);

}
