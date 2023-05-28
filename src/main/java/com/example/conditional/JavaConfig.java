package com.example.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @ConditionalOnProperty
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }
    @ConditionalOnProperty
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
