package com.xjl.reflection_.class_;

import java.lang.reflect.Field;

// class 常用方法
public class Class2 {
    public static void main(String[] args) throws  Exception{
        String  filePath = "com.xjl.reflection_.class_.Car";

        Class<?> cls = Class.forName(filePath);


        // 输出类
        System.out.println(cls); // 显示是 哪个类的class 对象

        System.out.println(cls.getClass()); // 运行类型 class java.lang.Class

        // 包名
        System.out.println(cls.getPackage().getName());

        // 全类名
        System.out.println(cls.getName());

        // cls 创建对象 实例
        Car car = (Car) cls.newInstance();
        System.out.println(car);



        // 得到属性
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));


        //属性赋值
        brand.set(car,"liji");
        System.out.println(car);
        System.out.println(brand.get(car));


        Field[] fields = cls.getFields();
        for (Field field :fields) {
            System.out.println(field.get(car));
            System.out.println(field.getName());
        }

    }
}
