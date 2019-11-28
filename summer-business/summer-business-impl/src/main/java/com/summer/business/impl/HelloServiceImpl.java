package com.summer.business.impl;

import com.summer.business.core.bean.Employee;
import com.summer.business.core.service.HelloService;
import com.summer.business.dao.EmployeeMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author yuzhuozhang
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    private EmployeeMapper employeeMapper;

    @Override
    public String sayHello(String name) {
        return "hello"+name;
    }

    @Override
    public String addEmployee(Employee employee) {
        return ""+employeeMapper.insert(employee);
    }

    @Override
    public String removeEmployee(int employeeId) {
        return ""+employeeMapper.removeEmployeeById(employeeId);
    }

    @Override
    public String updateEmployee(Employee employee) {
        return ""+employeeMapper.updateEmployee(employee);
    }

    @Override
    public String queryAllEmployee() {
        return employeeMapper.queryAll().toArray().toString();
    }

    @Override
    public String queryEmployee(int employeeId) {
        return employeeMapper.selectEmployeeById(employeeId).toString();
    }
}
