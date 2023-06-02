package com.xjl.set.hashset_.Strucure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class tt {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
//        for (int i = 0; i < 100; i++) {
//            hashSet.add(i);
//        }

        for (int i = 0; i <= 12; i++) {
            hashSet.add(new A(i));
        }

        System.out.println(hashSet);

        //链表  只要保证同一个hash值


    }
}


class A{
    private int n;
    public A(int n){
        this.n = n;
    }


    @Override
    //将返回的hash值固定
    public int hashCode() {
        return 100;
    }
}






