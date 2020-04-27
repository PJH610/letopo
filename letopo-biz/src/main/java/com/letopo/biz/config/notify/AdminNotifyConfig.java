package com.letopo.biz.config.notify;

import com.letopo.biz.service.notify.AdminNotifyBizService;
import com.letopo.biz.service.notify.UniNotifyAdminNotifyBizServiceImpl;
import com.letopo.biz.service.notify.MockAdminNotifyBizServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-24 10:59
 */
@Configuration
public class AdminNotifyConfig {

    @Value("${com.iotechn.admin.notify.enable}")
    private String enable;

    @Bean
    public AdminNotifyBizService adminNotifyBizService() {
        if ("mock".equalsIgnoreCase(enable)) {
            return new MockAdminNotifyBizServiceImpl();
        } else if ("uninotify".equalsIgnoreCase(enable)) {
            return new UniNotifyAdminNotifyBizServiceImpl();
        } else {
            return null;
        }
    }

}
