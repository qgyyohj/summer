package com.summer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yuzhuozhang
 */
@SpringBootApplication(scanBasePackages = "com.summer")
@ImportResource("classpath*:application*.xml")
public class WebStarter {
    public static void main(String[] args){
        SpringApplication.run(WebStarter.class,args);
    }
}
