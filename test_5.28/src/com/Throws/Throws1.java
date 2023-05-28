package com.Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws1 {
    public static void main(String[] args) {

    }

    public static void f1(){

        //此时是一个编译异常 我在f1()方法中过不去
        try {
            f2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static void f2() throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("d//aa.txt");

    }

    public static void f3(){
        //此时是一个运行时异常  运行是异常JVM有默认处理机制 不需要程序员默认处理机制
        f4();
    }

    public static void f4() throws RuntimeException{

    }

}
