package com.xjl.reflection_.hw;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class h1 {
    public static void main(String[] args)  throws  Exception{

        // 获取类
        Class<?> cls = Class.forName("com.xjl.reflection_.hw.PrivateTest");

        // 创建对象
        Object o = cls.newInstance();

        //
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"hahhaha");

        Method getName = cls.getMethod("getName");
        Object invoke = getName.invoke(o)  ;
        System.out.println(invoke);

    }
}

class PrivateTest{
    private String name = "hellokitty";

    public String getName() {
        return name;
    }



}