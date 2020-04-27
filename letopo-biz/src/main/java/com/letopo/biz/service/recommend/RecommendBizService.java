package com.letopo.biz.service.recommend;

import com.letopo.core.exception.ServiceException;
import com.letopo.data.component.CacheComponent;
import com.letopo.data.dto.RecommendDTO;
import com.letopo.data.mapper.RecommendMapper;
import com.letopo.data.model.Page;
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
public class RecommendBizService {

    @Autowired
    private CacheComponent cacheComponent;

    @Autowired
    private RecommendMapper recommendMapper;

    private static final String RECOMMEND_NAME = "RECOMMEND_TYPE_";

    public List<RecommendDTO> getRecommendByType(Integer recommendType, Integer pageNo, Integer pageSize) throws ServiceException {
        List<RecommendDTO> recommendDTOList = cacheComponent.getObjList(RECOMMEND_NAME + recommendType + "_" + pageNo + "_" + pageSize, RecommendDTO.class);
        if (CollectionUtils.isEmpty(recommendDTOList)) {
            recommendDTOList = recommendMapper.getRecommendByType(recommendType, (pageNo - 1) * pageSize, pageSize);
            if (!CollectionUtils.isEmpty(recommendDTOList)) {
                cacheComponent.putObj(RECOMMEND_NAME + recommendType + "_" + pageNo + "_" + pageSize, recommendDTOList, 1000);
            }
        }
        return recommendDTOList;
    }

    public Page<RecommendDTO> queryAllRecommend(Integer pageNo, Integer pageSize) throws ServiceException {
        Integer count = recommendMapper.selectCount(null);
        List<RecommendDTO> recommendDTOList = recommendMapper.getAllRecommend((pageNo - 1) * pageSize, pageSize);
        Page<RecommendDTO> page = new Page<>(recommendDTOList, pageNo, pageSize, count);
        return page;
    }
}
