package com.letopo.app.api.recommend;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.annotation.param.NotNull;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.RecommendDTO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: kbq
 * Date: 2019-07-08
 * Time: 下午3:33
 */

@HttpOpenApi(group = "recommend", description = "推荐商品接口")
public interface RecommendService {
    @HttpMethod(description = "根据传入推荐类型获得对应类型推荐商品")
    public List<RecommendDTO> getRecommendByType(
            @NotNull @HttpParam(name = "recommendType", type = HttpParamType.COMMON, description = "所需推荐类型") Integer recommedType,
            @HttpParam(name = "pageNo", type = HttpParamType.COMMON, description = "页码", valueDef = "1") Integer pageNo,
            @HttpParam(name = "pageSize", type = HttpParamType.COMMON, description = "页面长度", valueDef = "10") Integer pageSize) throws ServiceException;
}
