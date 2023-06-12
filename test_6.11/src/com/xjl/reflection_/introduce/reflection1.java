package com.xjl.reflection_.introduce;

import java.lang.reflect.Method;

// 测试反射性能  和优化
public class reflection1 {
    public static void main(String[] args) throws Exception {

        reflection1 reflection1 = new reflection1();
        reflection1.m1();
        reflection1.m2();
        reflection1.m3();

    }

    // 传统 方法
    public void m1(){
        Cat cat = new Cat();
        long  start =   System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("m1()" + (end -start));
    }

    // 反射
    public void m2() throws Exception {
        Class<?> cls = Class.forName("com.xjl.reflection_.introduce.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long  start =   System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2()" + (end -start));
    }

    //优化
    public void m3() throws Exception {
        Class<?> cls = Class.forName("com.xjl.reflection_.introduce.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);
        long  start =   System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2()" + (end -start));
    }

}
