package com.summer.fundamental.dubbo.config;

import com.alibaba.dubbo.config.*;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yuzhuozhang
 */
@SpringBootConfiguration
public class DubboAutoConfig {

    @Bean
    @ConfigurationProperties(prefix="dubbo.registry")
    public RegistryConfig registryConfig(){return new RegistryConfig();}

    @Bean
    @ConfigurationProperties(prefix="dubbo.consumer")
    public ReferenceConfig referenceConfig(){return referenceConfig();}

    @Bean
    @ConfigurationProperties(prefix="dubbo.provider")
    public ServiceConfig serviceConfig(){return new ServiceConfig();}

    @Bean
    @ConfigurationProperties(prefix="dubbo.app")
    public ApplicationConfig applicationConfig(){return new ApplicationConfig();}

    @Bean
    @ConfigurationProperties(prefix="dubbo.protocol")
    public ProtocolConfig protocolConfig(){return new ProtocolConfig();}

}
