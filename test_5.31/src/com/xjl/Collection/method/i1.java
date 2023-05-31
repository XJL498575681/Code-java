package com.xjl.Collection.method;

import java.util.ArrayList;

public class i1 {
    public static void main(String[] args) {
        @SuppressWarnings({"all"})

        ArrayList list = new ArrayList();
        //add 添加单个元素
        list.add("jack");
        list.add(10);  // 自动装箱Integer list.add(new Integer(10))   对象
        list.add(true);
        System.out.println(list);

        //remove 删除
      //  list.remove(0);//删除一个元素
        list.remove(true);//指定删除一个元素
        System.out.println(list);

        //contain 查找
        //System.out.println( list.contains(10));
        System.out.println(list.contains("jack"));

        //size 返回元素个数
        System.out.println( list.size());

        //isEmpty:判断是否为空
        System.out.println(list.isEmpty());

        //Fclear:清空
        list.clear();
        System.out.println(list);
        // addAll:添加多个元素

        ArrayList list2 = new ArrayList();
        list2.add("三国");
        list2.add("水浒传");

        list.addAll(list2);
        System.out.println(list);
        //containsAll:查找多个元素是否都存在

        System.out.println(list.containsAll(list2));
        // removeAll:删除多个元素

        list.removeAll(list2);
        list.add("西游记");
        System.out.println(list);

    }
}
