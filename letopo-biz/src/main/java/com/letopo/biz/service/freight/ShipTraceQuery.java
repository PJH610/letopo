package com.letopo.biz.service.freight;

import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.freight.ShipTraceDTO;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-24 10:59
 */
public interface ShipTraceQuery {

    public ShipTraceDTO query(String shipNo, String shipCode) throws ServiceException;

}
