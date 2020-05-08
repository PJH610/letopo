package com.letopo.plugin.core.inter;

import com.letopo.data.dto.order.OrderRequestDTO;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 16:08
 */
public interface IPluginPreOrder {

    public OrderRequestDTO invoke(OrderRequestDTO requestDTO);

}
