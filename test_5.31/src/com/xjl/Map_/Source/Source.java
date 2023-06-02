package com.xjl.Map_.Source;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Source {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("no1","haha");
        map.put("no2","xixi");
        map.put(new Car(),new Person());



        /*
1。k-v最后是 HashMap$Node node = newNode(hash,key，value,null)
2，k-v为了方便程序员的遍历，还会创建 EntrySet集合，该集合存放的元素的类型Entry，而一个Entry
对象就有k,v EntrySet<Entry<K, V>>  即   transient Set<Map.Entry<K,V>> entrySet;
3.在entrySet 中 定义的类型是Map.Entry   但实际上存放的还是HashMap$Node
因为HashMap$Node类  实现了Map.Entry接口    多态
    static class Node<K,V> implements Map.Entry<K,V> {

4.当把HashMap$NOde 对象存放到entrySet就方便我们的遍历   Map.Entry<K,V>  提供了方法
         getKey();
         getValue();


         */

        Set set = map.entrySet();
        System.out.println(set.getClass());//HashMap$EntrySet

        //既然 是一个集合 可以进行打印
        for (Object obj :set) {
//            System.out.println(o.getClass()); //class java.util.HashMap$Node
            // 取出HashMap$Node k-v

            // 向下转型
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey()  +"  " + entry.getValue());
        }

        Set set1 = map.keySet();
        System.out.println(set1.getClass());  //class java.util.HashMap$KeySet
        Collection values = map.values();

        System.out.println(values.getClass()); //class java.util.HashMap$Values


    }
}


class Person{

}

class Car{

}
