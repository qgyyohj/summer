package com.summer.business;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yuzhuozhang
 */
@SpringBootApplication
@EnableDubbo
@EnableDubboConfiguration
@DubboComponentScan
@MapperScan
public class Starter {
    public static void main(String[] args){
        SpringApplication.run(Starter.class,args);
    }
}
