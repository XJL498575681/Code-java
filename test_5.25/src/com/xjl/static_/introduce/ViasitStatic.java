package com.xjl.static_.introduce;

public class ViasitStatic {
    public static void main(String[] args) {

        //类变量是随着类的加载而创建  即使没有对象实例也可以访问
        System.out.println(A.name);

        A a = new A();
        System.out.println(a.name);
    }

}

class A{

    //类变量要遵循权限修饰符
    public static String name = "java";

    //普通属性 普通成员变量 非静态属性  实例变量

    private int num = 10;

}