package com.letopo.app.api.freight;

import com.letopo.biz.service.freight.FreightBizService;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.order.OrderRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-30 15:08
 */
@Service
public class FreightTemplateServiceImpl implements FreightTemplateService {

    @Autowired
    private FreightBizService freightBizService;

    @Override
    public Integer getFreightMoney(Long userId, OrderRequestDTO orderRequestDTO) throws ServiceException {
        return freightBizService.getFreightMoney(orderRequestDTO);
    }
}
