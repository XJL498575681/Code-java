package com.xjl.List;

import java.util.ArrayList;
import java.util.List;

public class method {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list= new ArrayList();

        list.add("jjj");
        list.add("kkk");
        list.add("jjj");

        //中间插入
        list.add(1,"ddd");
        System.out.println(list);

        //多个加入
        List list1= new ArrayList();
        list1.add("吃不饱");
        list1.add("饿不死");

        list.add(2,list1);
        System.out.println(list);

       // int indexOf(0bject obj):返回obj在集合中首次出现的位置

        System.out.println(list.indexOf("ddd"));  // 1
        //int lastIndexOf(0bject obj):返回obj在当前集合中末次出现的位置

        System.out.println(list.lastIndexOf("jjj")); //4
       //  remove(int index):移除指定index位置的元素，并返回此元素

        list.remove(0);
        System.out.println(list);
       // Object set(int index,0bject ele):设置指定index位置的元素为ele ，相当于是替换.

        list.set(1,"yiya");
        System.out.println(list);

        //  List subList(int fromIndex, int toIndex):
        //  返回从fromIndex到toIndex位置的子集合   前闭后开

        List newlist = list.subList(0,2);
        System.out.println(newlist);

    }

}
