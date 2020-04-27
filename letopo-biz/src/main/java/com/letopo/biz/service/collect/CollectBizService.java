package com.letopo.biz.service.collect;

import com.letopo.core.Const;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.component.CacheComponent;
import com.letopo.data.mapper.CollectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-24 10:59
 */
@Service
public class CollectBizService {

    @Autowired
    private CollectMapper collectMapper;

    @Autowired
    private CacheComponent cacheComponent;

    public static final String CA_USER_COLLECT_HASH = "CA_USER_COLLECT_";

    public Boolean getCollectBySpuId(Long spuId, Long userId) throws ServiceException {
        boolean hasKey = cacheComponent.hasKey(CA_USER_COLLECT_HASH + userId);
        if (!hasKey) {
            //若没有Key，则添加缓存
            List<String> spuIds = collectMapper.getUserCollectSpuIds(userId);
            if (CollectionUtils.isEmpty(spuIds)) {
                //redis set不能为空
                spuIds.add("0");
            }
            cacheComponent.putSetRawAll(CA_USER_COLLECT_HASH + userId, spuIds.toArray(new String[0]), Const.CACHE_ONE_DAY);
        }
        return cacheComponent.isSetMember(CA_USER_COLLECT_HASH + userId, spuId + "");
    }

}
