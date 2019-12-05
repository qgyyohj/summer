package com.summer.fundamental.druid.util;

import org.apache.ibatis.session.SqlSessionFactory;

import java.util.Map;

public class MybatisUtils {

    private final static String defaultResultMapName = "BaseResultMap";
    private String resultMapName;
    private SqlSessionFactory sessionFactory;
    private volatile Map<String, Map<String, String>> resultMaps;




}
