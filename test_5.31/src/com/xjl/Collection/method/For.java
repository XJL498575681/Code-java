package com.xjl.Collection.method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class For {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        //List list = new ArrayList();

        col.add(new Book("sanguo","cvsdhvu",10.2));
        col.add(new Book("qf v4ef o","c q43u",10.2));
        col.add(new Book("qc f43o","v fq43vu",10.2));



        //增强for循环  在collection 使用

        // 底层任然是迭代器    简化版的  快捷键大写I
        for (Object book:col){
            System.out.println(book);
        }

        for (Object book :col) {
            System.out.println(book);
        }


//        // 数组也可以使用
//        int num[] = {1,3,54,5};
//        for(int i :num){
//            System.out.println(i);
//        }
    }
}
