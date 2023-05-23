package com.dynamic.introduce;


//动态绑定机制
public class Binding {
    public static void main(String[] args) {


        // a 编译类型
        A a = new B();
        System.out.println(a.sum());   //  不屏蔽  40
        System.out.println(a.sum1());  //  不屏蔽  30
    }
}

class A{
    public int i =10;

    public int sum(){
        return  getI() + 10;  //  屏蔽 sum  20 + 10
    }
    public int sum1(){
        return  i + 10;
    }
    public int getI(){
        return i;
    }
}

class B extends A{
    public int i =20;

//    public int sum(){
//        return  i + 20;
//    }

//    public int sum1(){  //  屏蔽 sum 30
//        return  i + 10;
//    }
    public int getI(){
        return i;
    }
}