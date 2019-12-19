package com.summer.web.platform.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.summer.business.employee.core.service.EmployeeService;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuzhuozhang
 */
@RestController("/api")
public class EmployeeController {

    @Reference
    EmployeeService employeeService;

    @GetMapping("/{id}")
    public String getEmployeeById(@PathVariable Integer id){
        String str=null;
        try{
            str = employeeService.findEmployeeById(id).toString();
            System.out.println("通过id查询员工:"+id);
            return str;
        }catch (Exception e){
            System.out.println(ExceptionUtils.getStackTrace(e));
            return str;
        }
    }

    @GetMapping("/hello")
    public String sayHello(String name){
        try{
            System.out.println("欢迎语句："+name);
            return "欢迎语句："+name;
            //employeeService.sayHello(name);
        }catch (Exception e){
            System.out.println(ExceptionUtils.getStackTrace(e));
            return null;
        }
    }

}
