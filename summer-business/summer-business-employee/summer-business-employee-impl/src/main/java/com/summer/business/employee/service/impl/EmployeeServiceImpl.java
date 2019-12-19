package com.summer.business.employee.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.summer.business.employee.core.bean.Employee;
import com.summer.business.employee.core.service.EmployeeService;
import com.summer.business.employee.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author yuzhuozhang
 */
@Service(interfaceClass = EmployeeService.class)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public Employee findEmployeeById(Integer id) {
        return employeeMapper.selectEmployeeById(id);
    }

    @Override
    public List<Employee> queryAll() {
        return employeeMapper.queryAll();
    }

    @Override
    public Integer addEmployee(Employee employee) {
        return employeeMapper.insert(employee);
    }

    @Override
    public Integer removeEmployee(Integer id) {
        return employeeMapper.removeEmployeeById(id);
    }

    @Override
    public Integer updateEmployeeInfo(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }

    @Override
    public String sayHello(String name) {
        return "hello\t"+name;
    }
}
