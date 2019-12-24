package com.summer.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;

/**
 * @author yuzhuozhang
 */
@SpringBootConfiguration
@MapperScan("com.summer.business")
public class MybatisAutoConfig {
}
