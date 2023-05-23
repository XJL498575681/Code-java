package com.Super;

public class C extends B {
    public int n1 = 888;

    public void n1(){
        System.out.println(n1);   //888
        System.out.println(this.n1); // 888
        System.out.println(super.n1);//100  如果父类没有n1   则直接调用父类的父类

    }
}
