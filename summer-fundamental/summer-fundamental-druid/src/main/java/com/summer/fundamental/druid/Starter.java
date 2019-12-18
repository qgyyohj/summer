package com.summer.fundamental.druid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:applicationContext-*.xml")
@MapperScan("com.summer.business.*.dao")
public class Starter {
    public void main(String[] args){
        SpringApplication.run(this,args);
    }
}
