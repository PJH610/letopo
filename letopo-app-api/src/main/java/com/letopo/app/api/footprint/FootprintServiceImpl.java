package com.letopo.app.api.footprint;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.letopo.core.exception.ExceptionDefinition;
import com.letopo.core.exception.AppServiceException;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.domain.FootprintDO;
import com.letopo.data.dto.FootprintDTO;
import com.letopo.data.mapper.FootprintMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-30 14:18
 */
@Service
public class FootprintServiceImpl implements  FootprintService {

    @Autowired
    private FootprintMapper footprintMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean deleteFootprint(Long userId, Long footprintId) throws ServiceException {
        Integer judgeSQL = footprintMapper.delete(new EntityWrapper<FootprintDO>()
                .eq("user_id",userId)
                .eq("id",footprintId));
        if(judgeSQL > 0){
            return true;
        }
        throw new AppServiceException(ExceptionDefinition.FOOTPRINT_DELETE_FAILED);
    }

    @Override
    public List<FootprintDTO> getAllFootprint(Long userId) throws ServiceException {
        List<FootprintDTO> footprintDTOList = footprintMapper.getAllFootprint(userId,0,30);
        return footprintDTOList;
    }
}
