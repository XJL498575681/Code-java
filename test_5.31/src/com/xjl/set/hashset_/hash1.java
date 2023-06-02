package com.xjl.set.hashset_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class hash1 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set hashset = new HashSet();


        //执行add后 成功返回true  错误返回false   指定删除  不能添加相同的元素或者对象
        System.out.println(hashset.add("john")); //T
        System.out.println(hashset.add("jack"));
        System.out.println(hashset.add("john"));//F
        System.out.println(hashset.add("lucy"));
        System.out.println(hashset.add("tom"));

        hashset.remove("tom");
        System.out.println(hashset);


        //不能添加相同元素 / 数据？
        hashset = new HashSet();
        System.out.println(hashset);//null

        hashset.add("lucy");
        hashset.add("lucy"); //错误  同一对象

        hashset.add(new Dog("小黄"));
        hashset.add(new Dog("小黄"));   // 不同对象  只是同名而已
        System.out.println(hashset);

        //经典面试   追加源码   真正原因
        hashset.add(new String("xjl")); // ok
        hashset.add(new String("xjl"));

        System.out.println(hashset);



    }
}

class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}