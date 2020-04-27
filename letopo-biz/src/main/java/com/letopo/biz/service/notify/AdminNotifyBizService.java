package com.letopo.biz.service.notify;

import com.letopo.data.dto.order.OrderDTO;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-24 10:59
 */
public interface AdminNotifyBizService {

    public void newOrder(OrderDTO orderDTO);

    public void refundOrder(OrderDTO orderDTO);

}
