package com.summer.web.platform.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.summer.business.employee.core.service.EmployeeService;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author yuzhuozhang
 */
@RestController()
@RequestMapping("/api")
public class EmployeeController {

    @Reference
    EmployeeService employeeService;

//    @GetMapping()
//    public String getEmployeeById(@RequestParam Integer id){
//        try{
//            System.out.println("通过id查询员工:"+id);
//            return employeeService.findEmployeeById(id).toString();
//        }catch (Exception e){
//            System.out.println(ExceptionUtils.getStackTrace(e));
//            return null;
//        }
//    }

    @GetMapping("/hello")
    public String sayHello(String name){
        try{
            System.out.println("欢迎语句："+name);
            return employeeService.sayHello(name);
        }catch (Exception e){
            System.out.println(ExceptionUtils.getStackTrace(e));
            return null;
        }
    }

}
