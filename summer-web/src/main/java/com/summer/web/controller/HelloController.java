package com.summer.web.controller;

import com.summer.business.core.bean.Employee;
import com.summer.business.core.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{employeeId}")
    public String getEmployeeById( @PathVariable int employeeId){
        try{
            return helloService.queryEmployee(employeeId);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/queryAllEmployee")
    public String getAllEmployee(){
        try{
            return helloService.queryAllEmployee();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    @PostMapping("/update")
    public String update(Employee employee){
        try{
            return helloService.updateEmployee(employee);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @PostMapping("/addEmployee")
    public String addEmployee(Employee employee){
        try{
            return helloService.addEmployee(employee);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }


}
