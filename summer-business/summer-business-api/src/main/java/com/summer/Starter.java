package com.summer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yuzhuozhang
 */
@SpringBootApplication(scanBasePackages="com.summer.*")
public class Starter {
    public static void main(String[] args){
        SpringApplication.run(Starter.class,args);
    }
}
