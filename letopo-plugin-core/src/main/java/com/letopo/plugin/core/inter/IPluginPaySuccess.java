package com.letopo.plugin.core.inter;

import com.letopo.data.dto.order.OrderDTO;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 16:08
 */
public interface IPluginPaySuccess {

    public OrderDTO invoke(OrderDTO orderDTO, String prepayId);

}
