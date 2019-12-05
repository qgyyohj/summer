package com.summer.web.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yuzhuozhang
 */
@SpringBootApplication
@ImportResource("classpath*:applicationContext-*.xml")
public class WebStarter {
    public static  void main(String[] args){
        SpringApplication.run(WebStarter.class,args);
    }
}
