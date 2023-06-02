package com.xjl.List;

import java.util.ArrayList;

public class Source {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {


        //无参构造器创建ArraysList 对象
        ArrayList list = new ArrayList(8);
        //10个
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        //15个
        for (int i = 11; i <= 15 ; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}
