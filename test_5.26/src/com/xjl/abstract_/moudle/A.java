package com.xjl.abstract_.moudle;

public class A extends Template {

    public void job(){
       long num = 0;

        for (long i =1 ; i <= 1000000; i++) {
            num += i;
        }
    }
}
