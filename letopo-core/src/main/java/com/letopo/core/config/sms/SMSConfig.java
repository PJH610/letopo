package com.letopo.core.config.sms;

import com.letopo.core.notify.AliyunSMSClient;
import com.letopo.core.notify.MockSMSClient;
import com.letopo.core.notify.QCloudSMSClient;
import com.letopo.core.notify.SMSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-25 22:38
 */
@Configuration
public class SMSConfig {

    @Value("${sms.enable}")
    private String enable;

    @Bean
    public SMSClient smsClient() {
        if ("qcloud".equals(enable)) {
            return new QCloudSMSClient();
        } else if ("aliyun".equals(enable)) {
            return new AliyunSMSClient();
        } else if ("mock".equals(enable)) {
            return new MockSMSClient();
        } else {
            return new MockSMSClient();
        }
    }
}
