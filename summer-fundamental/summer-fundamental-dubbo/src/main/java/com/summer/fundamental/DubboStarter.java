package com.summer.fundamental;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuzhuozhang
 */
@EnableDubboConfiguration
@SpringBootApplication
public class DubboStarter {
    public static void main(String[] args) {
        SpringApplication.run(DubboStarter.class,args);
    }
}
