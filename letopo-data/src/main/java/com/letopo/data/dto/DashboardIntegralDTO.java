package com.letopo.data.dto;

import com.letopo.data.model.KVModel;
import lombok.Data;

import java.util.List;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class DashboardIntegralDTO {

    private Integer waitStockCount;

    private Integer goodsCount;

    private List<Object[]> daysOrder;

    private List<Object[]> daysSum;

    private List<KVModel<String, Long>> area;

    private List<KVModel<String, Long>> channel;

}
