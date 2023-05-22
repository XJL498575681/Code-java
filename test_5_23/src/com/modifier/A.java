package com.modifier;
//权限修饰符
public class A {

    public int a = 100;
    protected  int b = 200;
    int c = 300;
    private int d = 400;

    public void f1(){
        System.out.println("public");
        System.out.println("a= "+ a+"\tb ="+ b+"\tc ="+c + "\td ="+d);
    }
    protected void f2(){
        System.out.println("protected");
    }
     void f3(){
        System.out.println("默认");
    }
    private void f4(){
        System.out.println("private");
    }

}
