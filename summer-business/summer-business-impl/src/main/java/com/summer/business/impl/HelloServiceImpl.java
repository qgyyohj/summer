package com.summer.business.impl;

import com.summer.business.core.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author yuzhuozhang
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }
}
