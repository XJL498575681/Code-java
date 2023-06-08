package com.xjl.properties;

import java.io.*;
import java.util.Properties;

public class properties01 {
    public static void main(String[] args) throws IOException {

        //读取配置文件
        //1 创建对象
        Properties properties = new Properties();

        //加载配置文件
        properties.load(new FileReader("src\\mysql.properties"));

        //k-v 显示控制台
        properties.list(System.out);

        //获取对应值

        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println(user);
        System.out.println(pwd);



        //创建配置文件

        Properties properties1 = new Properties();
        //添加信息
        properties1.setProperty("key","utf8");
        properties1.setProperty("name","哈哈");  //中文的unicode 值
        properties1.setProperty("pwd","123");


        //存储位置
        properties1.store(new FileOutputStream("src\\myspl2.properties"),null);


        //没有key 就是创建 有就是替换







    }
}
