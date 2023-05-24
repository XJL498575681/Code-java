//package com.xjl.Object_.equals_.exercise;
//
//public class Exercise {
//    public static void main(String[] args) {
//        com.xjl.Object_.equals_.introduce.Person p1 = new com.xjl.Object_.equals_.introduce.Person();
//        p1.name = "abcdf";
//        com.xjl.Object_.equals_.introduce.Person p2 = new com.xjl.Object_.equals_.introduce.Person();
//        p2.name = "abcdf";
//
//        System.out.println(p1 ==p2); // == new  两个不同的空间 flase
//        System.out.println(p1.name.equals(p2.name));
//        //name String类型 已经进行了重写  true
//
//        System.out.println(p1.equals(p2));
//        //person 对象的比较 没有自定义equals重写  false
//
//        String s1 = new String("abcd");
//        String s2 = new String("abcd");
//        System.out.println(s1.equals(s2)); //T
//        System.out.println(s1 == s2); //F
//
//
//
//    }
//}
//
//class Person{
//    public String  name;
//}