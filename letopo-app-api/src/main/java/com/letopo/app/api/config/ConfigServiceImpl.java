package com.letopo.app.api.config;

import com.letopo.biz.service.config.ConfigBizService;
import com.letopo.core.exception.ServiceException;
import com.letopo.data.dto.ConfigDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-30 13:22
 */
@Service
public class ConfigServiceImpl implements ConfigService{

    @Autowired
    private ConfigBizService configBizService;

    @Override
    public ConfigDTO getMerchantConfig() throws ServiceException {
        return configBizService.getMerchantConfig();
    }
}
