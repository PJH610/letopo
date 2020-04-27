package com.letopo.launcher.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-26 22:59
 */
@Configuration
public class CorsConfig extends WebMvcConfigurerAdapter {
    @Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*")
				.allowedMethods("GET", "HEAD", "POST","PUT", "DELETE", "OPTIONS")
				.allowCredentials(true).maxAge(3600);
	}
}