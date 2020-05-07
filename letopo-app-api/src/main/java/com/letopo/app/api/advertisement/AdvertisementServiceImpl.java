package com.letopo.app.api.advertisement;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.component.CacheComponent;
import com.letopo.data.domain.AdvertisementDO;
import com.letopo.data.enums.StatusType;
import com.letopo.data.mapper.AdvertisementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-30 17:16
 */
@Service
public class AdvertisementServiceImpl implements AdvertisementService {

    @Autowired
    private AdvertisementMapper advertisementMapper;
    @Autowired
    private CacheComponent cacheComponent;

    private final static String ADVERTISEMENT_NAME = "ADVERTISEMENT_TYPE_";

    @Override
    public List<AdvertisementDO> getActiveAd(Integer adType) throws ServiceException {
        List<AdvertisementDO> advertisementDOList
                = cacheComponent.getObjList(ADVERTISEMENT_NAME + adType, AdvertisementDO.class);
        if (CollectionUtils.isEmpty(advertisementDOList)) {
            Wrapper<AdvertisementDO> wrapper = new EntityWrapper<AdvertisementDO>()
                    .eq("status", StatusType.ACTIVE.getCode());
            if (adType != null) {
                wrapper.eq("ad_type", adType);
            }
            advertisementDOList = advertisementMapper.selectList(wrapper);
            cacheComponent.putObj(ADVERTISEMENT_NAME + adType, advertisementDOList, 100);
        }
        return advertisementDOList;
    }

}
