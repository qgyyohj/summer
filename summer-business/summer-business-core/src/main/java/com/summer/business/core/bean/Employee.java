package com.summer.business.core.bean;

import lombok.Data;
/**
 * @author yuzhuozhang
 */
@Data
public class Employee {

    private int id;
    private String name;
    private int age;

    @Override
    public String toString(){
        return "id:"+id+"\n"+
                "name:"+name+"\n"+
                "age:"+age+"\n";
    }
}
