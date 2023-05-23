package com.ploy.Instanceof;

public class ef {
    public static void main(String[] args) {
         B b = new B();
        System.out.println(b instanceof B); //是
        System.out.println(b instanceof A);//是



        A a = new B();
        System.out.println(a instanceof B);//是
        System.out.println(a instanceof A);//是
        System.out.println(a instanceof Object);//是

        Object obj = new Object();
        System.out.println(obj instanceof A);//否


        String str = "cnien";
        System.out.println(str instanceof Object); //是


    }

}
class A{

}

class B extends A{

}