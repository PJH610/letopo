package com.letopo.data.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.letopo.data.domain.AdvertisementDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public interface AdvertisementMapper extends BaseMapper<AdvertisementDO> {

    public List<AdvertisementDO> getAdvertisementByTypeAndStatus(@Param("adType") Integer adType, @Param("status")Integer Status, @Param("offset")Integer offset, @Param("size")Integer size);

    public List<AdvertisementDO> getAllAdvertisement(@Param("offset")Integer offset,@Param("size")Integer size);
}
