package com.letopo.biz.service.notify;

import com.alibaba.fastjson.JSONObject;
import com.letopo.data.dto.order.OrderDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-24 10:59
 */
public class MockAdminNotifyBizServiceImpl implements AdminNotifyBizService {

    private static final Logger logger = LoggerFactory.getLogger(MockAdminNotifyBizServiceImpl.class);

    @Override
    public void newOrder(OrderDTO orderDTO) {
        logger.info("[mock通知 有新订单] 请及时发货：" + JSONObject.toJSONString(orderDTO));
    }

    @Override
    public void refundOrder(OrderDTO orderDTO) {
        logger.info("[mock通知 有新退款] 请及时处理：" + JSONObject.toJSONString(orderDTO));
    }
}
