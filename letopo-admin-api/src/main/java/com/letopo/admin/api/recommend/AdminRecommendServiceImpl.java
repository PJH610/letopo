package com.letopo.admin.api.recommend;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.letopo.biz.service.recommend.RecommendBizService;
import com.letopo.core.exception.AdminServiceException;
import com.letopo.core.exception.ExceptionDefinition;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.component.CacheComponent;
import com.letopo.data.domain.RecommendDO;
import com.letopo.data.domain.SpuDO;
import com.letopo.data.dto.RecommendDTO;
import com.letopo.data.mapper.RecommendMapper;
import com.letopo.data.mapper.SpuMapper;
import com.letopo.data.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-05-05 12:17
 */
@Service
public class AdminRecommendServiceImpl implements AdminRecommendService {

    @Autowired
    private CacheComponent cacheComponent;
    @Autowired
    private RecommendMapper recommendMapper;
    @Autowired
    private SpuMapper spuMapper;
    @Autowired
    private RecommendBizService recommendBizService;

    private final static String RECOMMEND_NAME = "RECOMMEND_TYPE_";

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean addRecommend(Long adminId, Long spuId, Integer recommendType) throws ServiceException {

        if (!(spuMapper.selectCount(new EntityWrapper<SpuDO>().eq("id", spuId)) > 0)) {
            throw new AdminServiceException(ExceptionDefinition.RECOMMEND_SPU_NO_HAS);
        }

        if (recommendMapper.selectCount(new EntityWrapper<RecommendDO>()
                .eq("spu_id", spuId)
                .eq("recommend_type", recommendType)) > 0) {
            throw new AdminServiceException(ExceptionDefinition.RECOMMEND_ALREADY_HAS);
        }
        RecommendDO recommendDO = new RecommendDO(spuId, recommendType);
        Date now = new Date();
        recommendDO.setGmtCreate(now);
        recommendDO.setGmtUpdate(now);
        if (!(recommendMapper.insert(recommendDO) > 0)) {
            throw new AdminServiceException(ExceptionDefinition.RECOMMEND_SQL_ADD_FAILED);
        }
        cacheComponent.delPrefixKey(RECOMMEND_NAME+recommendType);
        return true;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean deleteRecommend(Long adminId, Long id, Integer recommendType) throws ServiceException {

        Integer judgeSQL = recommendMapper.delete(new EntityWrapper<RecommendDO>()
                .eq("id", id)
                .eq("recommend_type",recommendType));

        if(judgeSQL > 0){
            cacheComponent.delPrefixKey(RECOMMEND_NAME + recommendType);
            return true;
        }

        throw new AdminServiceException(ExceptionDefinition.RECOMMEND_SQL_DELETE_FAILED);
    }

    @Override
    public Page<RecommendDTO> queryRecommendByType(Long adminId, Integer recommendType, Integer pageNo, Integer pageSize) throws ServiceException {
        if(recommendType == null){
            return recommendBizService.queryAllRecommend(pageNo, pageSize);
        }

        Integer count = recommendMapper.selectCount(new EntityWrapper<RecommendDO>().eq("recommend_type",recommendType));
        List<RecommendDTO> recommendDTOList = recommendMapper.getRecommendByType(recommendType,(pageNo-1)*pageSize,pageSize);
        Page<RecommendDTO> page = new Page<>(recommendDTOList,pageNo,pageSize,count);
        return page;
    }

    @Override
    public Page<RecommendDTO> queryAllRecommend(Long adminId, Integer pageNo, Integer pageSize) throws ServiceException {
        return recommendBizService.queryAllRecommend(pageNo, pageSize);
    }
}
