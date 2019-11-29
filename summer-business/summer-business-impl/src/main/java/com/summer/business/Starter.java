package com.summer.business;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author yuzhuozhang
 */
@SpringBootApplication
@ImportResource("classpath:*/dubbo-business.xml")
public class Starter {
    public static void main(String[] args) {
        System.out.println(Starter.class.getClassLoader().getResource("").getPath());
        SpringApplication.run(Starter.class,args);

        String resource = "classpath:config/mybatis.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }


        synchronized (Starter.class){
            try {
                Starter.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
