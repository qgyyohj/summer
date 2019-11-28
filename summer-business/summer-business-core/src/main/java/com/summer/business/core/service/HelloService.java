package com.summer.business.core.service;

import com.summer.business.core.bean.Employee;

/**
 * @author yuzhuozhang
 */
public interface HelloService {

    /**
     * service的接口
     * @param name
     * @return 欢迎字符串
     */
    public String sayHello(String name);

    /**
     * 添加员工数据
     * @param employee
     * @return
     */
    public String addEmployee(Employee employee);

    /**
     * 删除员工数据
     * @param employeeId
     * @return
     */
    public String removeEmployee(int employeeId);

    /**
     * 更新员工数据
     * @param employee
     * @return
     */
    public String updateEmployee(Employee employee);

    /**
     * 查询所有的员工信息
     * @return
     */
    public String queryAllEmployee();


    /**
     * 根据工号查询员工
     * @param employeeId
     * @return
     */
    public String queryEmployee(int employeeId);

}
