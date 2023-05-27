package com.xjl.InnerClass.member;

public class StaticMember {
    public static void main(String[] args) {
        // 外部类访问内部类
        Outer01 outer01 = new Outer01();
        outer01.m1();

        // 外部其他类 访问 成员内部类
        Outer01.Inner01 inner01 = new Outer01.Inner01();
        inner01.say();

        //
        Outer01.Inner01 inner011 = outer01.get();
        inner011.say();

    }

}

//外部类
class Outer01{
    private int n1 = 10;
    private static String name = "jack";

    //静态内部类
    public static class Inner01{
        public void say(){
            System.out.println( name);
        }
    }

    //方法返回静态成员内部类
    public static Inner01 get(){
        return new Inner01();
    }

    // 外部类访问成员内部类
    public void m1(){
        Inner01 inner01 = new Inner01();
        inner01.say();
    }

}