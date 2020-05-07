package com.letopo.app.api.advertisement;

import com.letopo.core.annotation.HttpMethod;
import com.letopo.core.annotation.HttpOpenApi;
import com.letopo.core.annotation.HttpParam;
import com.letopo.core.annotation.HttpParamType;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.domain.AdvertisementDO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: kbq
 * Date: 2019-07-08
 * Time: 下午8:22
 */

@HttpOpenApi(group = "advertisement",description = "广告推销")
public interface AdvertisementService {

    @HttpMethod(description = "取得活跃广告")
    public List<AdvertisementDO> getActiveAd(
            @HttpParam(name = "adType",type = HttpParamType.COMMON,description = "广告类型")Integer adType)throws ServiceException;

}
