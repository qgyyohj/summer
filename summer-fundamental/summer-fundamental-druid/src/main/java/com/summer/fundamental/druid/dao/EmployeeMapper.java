package com.summer.fundamental.druid.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMapper {

    public Integer insert(Employee employee);

}
