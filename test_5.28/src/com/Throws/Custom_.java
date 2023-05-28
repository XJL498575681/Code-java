package com.Throws;

public class Custom_ {
    public static void main(String[] args) {
        int age = 180;
        if(!(age>= 18 && age <= 120)){
            throw new my_Exception("18 - 120");
        }
        System.out.println(age);
    }
}

//一般把自定义异常定义为 运行时异常  可以使用默认处理机制
class my_Exception extends  RuntimeException{
    public my_Exception(String message){

        super(message);
    }
}