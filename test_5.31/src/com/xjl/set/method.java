package com.xjl.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class method {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
/*
1。以Set接口的实现类 HashSet 来讲解Set接口的方法
2. set接口的实现类的对象(Set接口对象)，不能存放重复的元素，可以添加一个null
3. set接口对象存放数据是无序(即添加的顺序和取出的顺序不一致)
4。注意:取出的顺序的顺序虽然不是添加的顺序，但是他的固定。

 */
        Set set = new HashSet();

        set.add("j");
        set.add("ja");
        set.add("ja");//重复
        set.add("jack");
        set.add("lucy");


        set.add("null");
        set.add("null");//再次添加

        System.out.println(set);


        //遍历
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }

        System.out.println();

        for (Object o :set) {
            System.out.println(o);
        }

        System.out.println();



//        for (int i = 0; i < set.size(); i++) {
//            //但是没有get 方法  不能通过索引
//        }

    }
}
