package com.extend_s.test;

import com.x.Dog;

public class t1 {
    public static void main(String[] args) {


        B b = new B();

    }
}
class A{
    A(){
        System.out.println("a");
    }
    A(String name){
        // super();  默认继承父类的无参构造器
        System.out.println("a.name");
    }
}


class B extends A {
    B(){
        this("abc");
        System.out.println("b");
    }
    B(String name){
        System.out.println("b.name");
    }
}