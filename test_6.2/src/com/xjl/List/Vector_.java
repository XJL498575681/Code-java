package com.xjl.List;

import java.util.Vector;

public class Vector_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //无参构造器
        Vector vector = new Vector(8);
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(10);
    }
}
