package com.letopo.app.config.wx;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-28 17:17
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "com.letopo.wx")
public class WxProperties {

    private String mchId;

    private String mchKey;

    private String notifyUrl;

    private String keyPath;

}
