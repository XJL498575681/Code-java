package com.xjl.main;

public class Main01 {



    private static String name = "1234";

    public  static void m1(){
        System.out.println("Main01");
    }
    public static void main(String[] args) {

        System.out.println(name);
        m1();
        Main01.m1();
    }
}

