package com.summer.fundamental;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuzhuozhang
 */
@DubboComponentScan("com.summer.business")
@EnableDubboConfiguration
@SpringBootApplication
public class DubboStarter {
    public static void main(String[] args) {
        SpringApplication.run(DubboStarter.class,args);
    }
}
