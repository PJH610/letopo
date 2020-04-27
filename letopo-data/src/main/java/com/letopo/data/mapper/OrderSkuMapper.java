package com.letopo.data.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.letopo.data.domain.OrderSkuDO;
import com.letopo.data.dto.order.OrderStatisticsDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:18
 */
public interface OrderSkuMapper extends BaseMapper<OrderSkuDO> {

    public List<OrderStatisticsDTO> statistics(@Param("orderIds") List<Long> orderIds);

}
