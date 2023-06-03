package com.xjl.Collections;

import java.util.*;

public class collection {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add( "tom");
        list.add( "smith");
        list.add("king");
        list.add( "milan");
        list.add( "milan");


        System.out.println(list);

        // reverse(List):反转 List中元素的顺序

        Collections.reverse(list);
        System.out.println(list);


        // shuffle(List):对 List集合元素进行随机排序
//        Collections.shuffle(list);
//        System.out.println(list);

        //sort(List):根据元素的自然顺序对指定List集合元素按升序排序       默认按照字符串大小排序
        Collections.sort(list);
        System.out.println("自然排序后");
        System.out.println(list);


        //sort(List，Comparator):根据指定的Comparator产生的顺序对List集合元素

        //自定义 长度大小排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
//                if(o1 instanceof String){
//                }
                return ((String)o1).length()  - ((String)o2).length();

            }
        });

        System.out.println("长度");
        System.out.println(list);

        // swap(List，int, int):将指定list 集合中的i处元素和j处元素进行交换

        Collections.swap(list,1,3);
        System.out.println(list);


     //   1) Object max(Collection):根据元素的自然顺序，返回给定集合中的最大元素


        System.out.println("自然排序最大元素" + Collections.max(list));
      //  2) Object max(Collection,Comparator):根据Comparator指定的顺序，返回给定集合中的最大元素
        System.out.println("长度最大元素" + Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length()  - ((String)o2).length();
            }
        }));
      //  3) Object min(Collection)


       //  4) Object min(Collection,Comparator)


      //  5) int frequency(Collection,Object):返回指定集合中指定元素的出现次数

        System.out.println(Collections.frequency(list,"milan"));
     //   6) void copy(List dest,List src):将src中的内容复制到dest中

        ArrayList dest = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            dest.add(" ");
        }
        Collections.copy(dest,list);
        System.out.println("dest" + dest);

        //  7) boolean replaceAll(List list,Object oldVal, Object newVal):使用新值替换List对象的所有旧值

        Collections.replaceAll(list,"tom","汤姆");
        System.out.println(list);


    }
}
