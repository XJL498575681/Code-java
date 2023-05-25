package com.xjl.codeblock.datail;

public class Detail2 {

    public static void main(String[] args) {
        AA aa = new AA(1);

    }
}

class AA{
    //静态属性
    private static int n1 = getN1();
    private  int n2 = getN2();


    //静态代码块
    static {
        System.out.println("AA的静态代码块");  //2
    }
    //普通代码块
     {
        System.out.println("AA的普通代码块");  //2
    }

    //构造器
    public AA() {
        System.out.println("垃圾构造器  无参 最后一名 ");
    }

    public AA(int n2) {
        System.out.println("垃圾构造器 有参  最后一名 ");
        this.n2 = n2;
    }

    //static 方法
    public static int getN1(){
        System.out.println("getN1 静态方法被调用");  //1
        return 100;
    }
    //普通方法
    public  int getN2(){
        System.out.println("getN2 普通方法被调用");  //1
        return 100;
    }
}


