package com.letopo.app.api.recommend;

import com.letopo.biz.service.recommend.RecommendBizService;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.RecommendDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-30 20:08
 */
@Service
public class RecommendServiceImpl implements RecommendService {

    @Autowired
    private RecommendBizService recommendBizService;

    @Override
    public List<RecommendDTO> getRecommendByType(Integer recommendType,Integer pageNo,Integer pageSize) throws ServiceException {
        return recommendBizService.getRecommendByType(recommendType,pageNo,pageSize);
    }
}
