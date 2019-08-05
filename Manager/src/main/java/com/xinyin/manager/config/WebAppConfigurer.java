package com.xinyin.manager.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @version v1.0
 * @author: zdefys
 * @date: 2019/8/5 21:35
 */
public class WebAppConfigurer extends WebMvcConfigurationSupport {

    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/*");
    }
}
