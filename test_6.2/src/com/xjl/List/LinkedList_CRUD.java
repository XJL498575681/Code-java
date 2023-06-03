package com.xjl.List;



import java.util.Iterator;
import java.util.LinkedList;
public class LinkedList_CRUD {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        //添加节点
        linkedList.add(1);

        linkedList.add(2);

        linkedList.add(3);


       // linkedList.remove();   删除节点
        linkedList.remove(1);
        System.out.println(linkedList);
        // 修改节点值
        linkedList.set(1,99);
        System.out.println(linkedList);
        //得到节点

        System.out.println( linkedList.get(1));

        System.out.println();

        Iterator iterator = linkedList.iterator();


//遍历
        while (iterator.hasNext()) {
            Object obj=  iterator.next();
            System.out.println(obj);
        }



        for (Object o :linkedList) {
            System.out.println(o);
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

    }


}
