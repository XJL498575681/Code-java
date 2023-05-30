package com.Math_;

public class method {
    public static void main(String[] args) {

        //1.abs绝对值
        int abs = Math.abs(9);System.out.println(abs);

        //2.pow求幂
        double pow =Math.pow(-3.5,4);
        System.out.println(pow);

        //3.ceil向上取整,返回>=该参数的最小整数(double);
        double ceil = Math.ceil(-3.0001);
        System.out.println(ceil);

        //4.floor向下取整，返回<=该参数的最大整数
        double floor = Math.floor(-4.999);
        System.out.println(floor);

        //5.round四舍五入Math.floor(该参数+0.5)
        long round = Math.round(-5.001);
        System.out.println(round);

        //6.sqrt求开方
        double sqrt = Math.sqrt(-9.0);
        System.out.println(sqrt);

        //7.random返回随机数   [0—1)

       // int num =(int)(Math.random()*(b-a+1) +a);
        for (int i = 0; i < 20; i++) {
            int num =(int)(2 + Math.random()*(7-2+1));
            System.out.println(num);
        }

    //    double random = Math.random();


    }
}
