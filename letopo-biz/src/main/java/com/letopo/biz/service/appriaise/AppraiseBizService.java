package com.letopo.biz.service.appriaise;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.letopo.core.Const;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.component.CacheComponent;
import com.letopo.data.domain.AppraiseDO;
import com.letopo.data.dto.appraise.AppraiseResponseDTO;
import com.letopo.data.enums.BizType;
import com.letopo.data.mapper.AppraiseMapper;
import com.letopo.data.mapper.ImgMapper;
import com.letopo.data.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-24 10:59
 */
@Service
public class AppraiseBizService {

    @Autowired
    private AppraiseMapper appraiseMapper;
    @Autowired
    private CacheComponent cacheComponent;
    @Autowired
    private ImgMapper imgMapper;

    public static final String CA_APPRAISE_KEY = "CA_APPRAISE_";

    public Page<AppraiseResponseDTO> getSpuAllAppraise(Long spuId, Integer pageNo, Integer pageSize) throws ServiceException {
        String cacheKey = CA_APPRAISE_KEY + spuId + "_" + pageNo + "_" + pageSize;
        Page obj = cacheComponent.getObj(cacheKey, Page.class);
        if (obj != null) {
            return obj;
        }
        Integer count = appraiseMapper.selectCount(new EntityWrapper<AppraiseDO>().eq("spu_id", spuId));
        Integer offset = pageSize * (pageNo - 1);
        List<AppraiseResponseDTO> appraiseResponseDTOS = appraiseMapper.selectSpuAllAppraise(spuId, offset, pageSize);
        for (AppraiseResponseDTO appraiseResponseDTO : appraiseResponseDTOS) {
            appraiseResponseDTO.setImgList(imgMapper.getImgs(BizType.COMMENT.getCode(), appraiseResponseDTO.getId()));
        }
        Page<AppraiseResponseDTO> page = new Page<>(appraiseResponseDTOS, pageNo, pageSize, count);
        cacheComponent.putObj(cacheKey, page, Const.CACHE_ONE_DAY);
        return page;
    }

}
