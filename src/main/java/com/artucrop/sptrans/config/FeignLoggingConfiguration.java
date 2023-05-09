package com.artucrop.sptrans.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static feign.Logger.Level.BASIC;

@Configuration
public class FeignLoggingConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return BASIC;
    }
}
