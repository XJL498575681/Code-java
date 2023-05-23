package com.ploy.introduce;

public class PloyMethod {
    public static void main(String[] args) {


        //重载多态的体现
        A a = new A();
        System.out.println(a.sum(1,2));
        System.out.println(a.sum(1,2,3));
        a.say();

        //重写的体现
        B b = new B();
        b.say();
    }
}

class B{
    //不同对象
    public void say(){
        System.out.println("B 的方法被调用");
    }
}


class A extends B{
    //重载多态的体现  输入不同参数对象
    public int sum(int n1,int n2){
        return n1 + n2;
    }
    public int sum(int n1 ,int n2,int n3){
        return n1+ n2 + n3;
    }

    // 不同对象
    public void say(){
        System.out.println("A 的方法被调用");
    }

}