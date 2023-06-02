package com.xjl.Map_;

import java.util.*;

public class traversal {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("A","a");
        map.put("B","b");
        map.put("C","null");
        map.put("null","d");
        map.put("E","e");


        // 第一组.先取出所有的key 通过key 取出对应的value
        //①
        Set set = map.keySet();
        for (Object key :set) {
            System.out.println(key +" " + map.get(key));
        }

        System.out.println("++++++++++++++++++++++++");
        //②
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + " "+ map.get(key));
        }
        System.out.println("++++++++++++++++++++++++");
        //第二组 将所有的values取出  只能看values
        Collection values = map.values();
        for (Object values1 :values) {
            System.out.println(values1);
        }
        System.out.println("++++++++++++++++++++++++");
        Iterator iterator1 = values.iterator();

        while (iterator1.hasNext()) {
            Object valuess=  iterator1.next();
            System.out.println(valuess);
        }

        System.out.println("++++++++++++++++++++++++");

        //第三组 通过EntrySet  获取k - v

        Set entrySet = map.entrySet(); //EntrySet<Map.Entry<k,v>>
        for (Object entry :entrySet) {
            //将values 转成Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() +  " "+  m.getValue());
        }
        System.out.println("++++++++++++++++++++++++");


        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object en =  iterator2.next();
            //System.out.println(en);
            //向下转型
            Map.Entry entry = (Map.Entry)en;
            System.out.println(entry.getKey() + " " +entry.getValue());
        }



    }
}
