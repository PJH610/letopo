package com.letopo.app.api.freight;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.annotation.param.NotNull;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.order.OrderRequestDTO;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: kbq
 * Date: 2019-07-07
 * Time: 下午7:40
 */
@HttpOpenApi(group = "freight", description = "运费计算api")
public interface FreightTemplateService {

    @HttpMethod(description = "得到订单的运费")
    public Integer getFreightMoney(
            @NotNull @HttpParam(name = "userId", type = HttpParamType.USER_ID, description = "用户ID") Long userId,
            @NotNull @HttpParam(name = "orderRequestDTO", type = HttpParamType.COMMON, description = "订单传回数据") OrderRequestDTO orderRequestDTO) throws ServiceException;
}
