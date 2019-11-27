package com.summer.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yuzhuozhang
 */
@SpringBootApplication
@ImportResource("classpath:*/dubbo-business.xml")
public class Starter {
    public static void main(String[] args) {
        System.out.println(Starter.class.getClassLoader().getResource("").getPath());
        SpringApplication.run(Starter.class,args);

        synchronized (Starter.class){
            try {
                Starter.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
