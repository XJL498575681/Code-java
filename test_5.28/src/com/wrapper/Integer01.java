package com.wrapper;

public class Integer01 {
    public static void main(String[] args) {

        //jdk 5 之前  手动装箱  int -》 Intager
        int n1 = 100;
        Integer integer = new Integer(n1);

        Integer integer1 = Integer.valueOf(n1);


        //拆箱  Intager -> int
        int i = integer.intValue();


        //自动装箱

        int n2 = 200;
        Integer integer2 = n2;
        /*  本质底层还是   Intager.valueof
        public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
         */

        int n3 = integer2;
/*
   public int intValue() {
        return value;
    }
 */



    }
}
