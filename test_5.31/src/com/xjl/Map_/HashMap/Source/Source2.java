package com.xjl.Map_.HashMap.Source;

import java.util.HashMap;

public class Source2 {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 100 ; i++) {
            hashMap.put(i,"hello");
        }
    }
}

class A{
     private int num;

    public A(int num) {
        this.num = num;
    }


//    @Override
//    public int hashCode() {
//        return 100;
//    }
}
