package com.summer.web.controller;

import com.summer.business.core.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuzhuozhang
 */
@RestController
@RequestMapping("/say")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String sayHello(String name){
        return helloService.sayHello(name);
    }

    @GetMapping("/bye")
    public String sayBye(){
        return "Bye!";
    }

}
