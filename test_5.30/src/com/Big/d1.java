package com.Big;


import java.math.BigDecimal;

public class d1 {
    public static void main(String[] args) {
//        double d = 89.4589489437974789475947055979;
//        System.out.println(d);

        BigDecimal bigDecimal = new BigDecimal("89.45894864677689475947055979");
        BigDecimal bigDecimal1 = new BigDecimal("895045");

        System.out.println(bigDecimal);
        //加减运算
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal1 .subtract(bigDecimal));
        //除法可能异常   无限小数
        //如果有无限小数 保留分子精度
        System.out.println(bigDecimal.divide(bigDecimal1,bigDecimal.ROUND_CEILING));

    }
}
