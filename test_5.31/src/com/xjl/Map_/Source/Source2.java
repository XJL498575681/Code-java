package com.xjl.Map_.Source;

import java.util.HashMap;
import java.util.Objects;

public class Source2 {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 12 ; i++) {
            hashMap.put(new A(i),"hello");
        }
    }
}

class A{
     private int num;

    public A(int num) {
        this.num = num;
    }


    @Override
    public int hashCode() {
        return 100;
    }
}
