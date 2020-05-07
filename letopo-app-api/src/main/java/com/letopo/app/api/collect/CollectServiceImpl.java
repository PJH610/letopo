package com.letopo.app.api.collect;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.letopo.biz.service.collect.CollectBizService;
import com.letopo.biz.service.goods.GoodsBizService;
import com.letopo.core.exception.ExceptionDefinition;
import com.letopo.core.exception.AppServiceException;
import com.letopo.core.Const;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.component.CacheComponent;
import com.letopo.data.domain.CollectDO;
import com.letopo.data.dto.CollectDTO;
import com.letopo.data.mapper.CollectMapper;
import com.letopo.data.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-30 13:12
 */
@Service
public class CollectServiceImpl implements CollectService {


    @Autowired
    private CollectMapper collectMapper;

    @Autowired
    private CacheComponent cacheComponent;

    @Autowired
    private GoodsBizService goodsBizService;

    @Autowired
    private CollectBizService collectBizService;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean addCollect(Long userId, Long spuId) throws ServiceException {
        //校验SPU是否存在
        goodsBizService.getSpuById(spuId);
        List<CollectDO> collectDOS = collectMapper.selectList(new EntityWrapper<CollectDO>()
                .eq("user_id", userId)
                .eq("spu_id", spuId));
        if (!CollectionUtils.isEmpty(collectDOS)) {
            throw new AppServiceException(ExceptionDefinition.COLLECT_ALREADY_EXISTED);
        }
        CollectDO collectDO = new CollectDO(userId, spuId);
        Date now = new Date();
        collectDO.setGmtCreate(now);
        collectDO.setGmtUpdate(collectDO.getGmtCreate());
        cacheComponent.putSetRaw(CollectBizService.CA_USER_COLLECT_HASH + userId, spuId + "", Const.CACHE_ONE_DAY);
        return collectMapper.insert(collectDO) > 0;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean deleteCollect(Long userId, Long spuId) throws ServiceException {
        Integer num = collectMapper.delete(new EntityWrapper<CollectDO>()
                .eq("user_id", userId)
                .eq("spu_id", spuId)
        );
        if (num > 0) {
            cacheComponent.removeSetRaw(CollectBizService.CA_USER_COLLECT_HASH + userId, spuId + "");
            return true;
        }

        throw new AppServiceException(ExceptionDefinition.PARAM_CHECK_FAILED);
    }

    @Override
    public Page<CollectDTO> getCollectAll(Long userId, Integer pageNo, Integer pageSize) throws ServiceException {
        Integer count = collectMapper.selectCount(new EntityWrapper<CollectDO>().eq("user_id", userId));
        Integer offset = pageSize * (pageNo - 1);
        List<CollectDTO> collectAll = collectMapper.getCollectAll(userId, offset, pageSize);
        Page<CollectDTO> page = new Page<CollectDTO>(collectAll, pageNo, pageSize, count);
        return page;
    }

    @Override
    public CollectDTO getCollectById(Long userId, Long collectId, Long spuId) throws ServiceException {
        return collectMapper.getCollectById(userId, collectId, spuId);
    }

    @Override
    public Boolean getCollectBySpuId(Long spuId, Long userId) throws ServiceException {
        return collectBizService.getCollectBySpuId(spuId, userId);
    }
}
