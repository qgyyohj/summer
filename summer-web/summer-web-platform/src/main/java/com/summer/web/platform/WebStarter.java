package com.summer.web.platform;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuzhuozhang
 */
@SpringBootApplication(scanBasePackages = "com.summer")
@EnableDubboConfiguration
public class WebStarter {
    public static  void main(String[] args){
        SpringApplication.run(WebStarter.class,args);
    }
}
