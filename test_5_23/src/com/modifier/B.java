package com.modifier;

public class B {
    public void say(){
        A a = new A();
        //同一个包下 可以访问public protected 默认  不可private
        System.out.println("a= "+ a.a+"\tb ="+ a.b+"\tc ="+ a.c );
        a.f1();
        a.f2();
        a.f3();

    }
}
