package com.pkg;

import com.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //只有public可以在不同包下可以访问
        System.out.println(a.a );
        a.f1();
        //不能访问另外三种
    }
}
