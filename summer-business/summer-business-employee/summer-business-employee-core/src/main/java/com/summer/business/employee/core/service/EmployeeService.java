package com.summer.business.employee.core.service;


import com.summer.business.employee.core.bean.Employee;

import java.util.List;

/**
 * @author yuzhuozhang
 */
public interface EmployeeService {

    /**
     * 根据id找员工
     * @param id
     * @return
     */
    public Employee findEmployeeById(Integer id);

    /**
     * 查询所有的员工
     * @return
     */
    public List<Employee> queryAll();

    /**
     * 增加员工信息
     * @param employee
     * @return
     */
    public Integer addEmployee(Employee employee);

    /**
     * 移除员工
     * 这里尝试实现逻辑删除
     * 给员工信息附加一个是否显示的boolean类型
     * 查询时候如果是false就不予以显示
     * 形成逻辑上的删除而不是物理上的删除
     * @param id
     * @return
     */
    public Integer removeEmployee(Integer id);

    /**
     * 更新员工信息
     * @param employee
     * @return
     */
    public Integer updateEmployeeInfo(Employee employee);

    /**
     * 测试函数
     */
    public String sayHello(String name);
}
