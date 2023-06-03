package com.xjl.set.LinkHasSet;

import java.util.LinkedHashSet;
@SuppressWarnings({"all"})
public class LinkHashSet_ {
    public static void main(String[] args) {

        LinkedHashSet set = new LinkedHashSet();

        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("小王",18));
        set.add(123);
        set.add("KKK");

        System.out.println(set);
/*
1。LinkedHashSet 加入顺序和取出元素/数据的顺序一致
2. LinkedHashSet底层维护的是一个LinkedHashMap(是HashMap的子类)
3. LinkedHashSet底层结构〔数组table+双向链表)
4．添加第一次时，直接将数组table 扩容到16,存放的结点类型是 LinkedHashMap$Entry
5．数组是 HashMap$Node[]存放的元素/数据是 LinkedHashMap$Entry类型

    继承关系是在内部类完成的
    static class Entry<K,V> extends HashMap.Node<K,V> {
        Entry<K,V> before, after;
        Entry(int hash, K key, V value, Node<K,V> next) {
            super(hash, key, value, next);
        }
    }

    static class Node<K,V> implements Map.Entry<K,V> {

 */
    }
}

class Customer{
    private String name ;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}