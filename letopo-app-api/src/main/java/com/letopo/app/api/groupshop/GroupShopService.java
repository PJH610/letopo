package com.letopo.app.api.groupshop;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.data.dto.goods.GroupShopDTO;
import com.letopo.data.model.Page;

import java.rmi.ServerException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: rize
 * Date: 2019/11/24
 * Time: 15:15
 */
@HttpOpenApi(group = "groupshop", description = "团购服务")
public interface GroupShopService {

    @HttpMethod(description = "获取团购列表")
    public Page<GroupShopDTO> getGroupShopPage(
            @HttpParam(name = "page", type = HttpParamType.COMMON, description = "页码", valueDef = "1") Integer pageNo,
            @HttpParam(name = "pageSize", type = HttpParamType.COMMON, description = "页码长度", valueDef = "10") Integer pageSize) throws ServerException;


}
