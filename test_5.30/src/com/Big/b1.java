package com.Big;

import java.math.BigInteger;

public class b1 {
    public static void main(String[] args) {
        //是指是将数字按照字符串存进去
        BigInteger bigInteger = new BigInteger("32743089740379074264237480238");

        BigInteger bigInteger2 = new BigInteger("100");

        //不可直接加减
        BigInteger bigInteger3 = bigInteger.add(bigInteger2);
        BigInteger bigInteger4 = bigInteger.subtract(bigInteger2);

        System.out.println(bigInteger);
        System.out.println(bigInteger3);
    }
}
