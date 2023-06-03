package com.xjl.List;

import java.util.ArrayList;
import java.util.List;

public class list1 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        //添加取出顺序一致 元素可重复 认为存在两个对象
        list.add("jack");
        list.add("fcdwegv");
        list.add("jfwef");
        list.add("jack");
        System.out.println(list);
        System.out.println();


        //2.List集合中的每个元素都有其对应的顺序索引，即支持索引  0 开始
        System.out.println(list.get(3));




    }
}
