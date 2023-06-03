package com.xjl.Map_.HashTable.Properties;

import java.util.Properties;

public class properties {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Properties properties = new Properties();


        properties.put("john",100);
//        properties.put("null",100);  异常
//        properties.put("john",null); 异常
        properties.put("grv er",100);
        properties.put("mmmm",100);
        properties.put("mmmm",99900); //修改values

        System.out.println(properties);
        //获取对应的值
        System.out.println(properties.get("john"));

        //删除
        properties.remove("mmmm");

        System.out.println(properties);
    }


}
