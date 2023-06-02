package com.xjl.set.hashset_.Strucure;

import java.util.HashMap;
import java.util.HashSet;

public class Source {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("lll");
        hashSet.add("java");

        System.out.println(hashSet);
    }
}
