package com.xjl.codeblock.datail;

public class Detail03 {
    public static void main(String[] args) {

        E e = new E();

    }
}
class D{
    {
        System.out.println("D的普通代码快");  //1
    }
    public D(){
        // super()  父类object 的空参构造器
        // 自身普通代码块
        System.out.println("D 构造器");  //2
    }
}

class E  extends D{
    {
        System.out.println("E的代码块");  //3
    }
    public E(){
        // super()  父类D的空参构造器
        // 自身普通代码块
        System.out.println("E的构造器"); //4
    }
}