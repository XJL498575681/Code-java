package com.xjl.Homework;

import sun.font.FontRunIterator;

import java.util.*;

public class h3 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Map map = new HashMap();

        map.put("jack",650);
        map.put("tom",750);
        map.put("lucy",880);

        System.out.println(map);
        map.put("jack",2600);

        Set  keySet = map.keySet();
        for (Object key :keySet) {
            map.put(key,(Integer)map.get(key)+100);
        }

        System.out.println(map);
        System.out.println("+++keySet+++++");
        for (Object key1 :keySet) {
            System.out.println(key1 + " " + map.get(key1));
        }


        Iterator iterator = keySet.iterator();

        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next + " " + map.get(next));
        }

        System.out.println("+++entrySet+++++");
        //遍历所有员工  entrySet
        Set entrySet = map.entrySet();

        for (Object o :entrySet) {
            System.out.println(o);
        }

        System.out.println("");

        Iterator iterator3 = entrySet.iterator();

        while (iterator3.hasNext()) {
            Object entry =  iterator3.next();
            Map.Entry entry1 = (Map.Entry) entry;
            System.out.println(entry1.getKey() + " " + entry1.getValue());
        }




        System.out.println("++++values 遍历++++");
        //遍历工资

        Collection values = map.values();
        for (Object valuess :values) {
            System.out.println(valuess);
        }


        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }


    }
}
