package com.xjl.Homework;

import java.util.TreeSet;

public class h4 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();

        treeSet.add(new Person());
        treeSet.add(new Person());
        treeSet.add(new Person());
        treeSet.add(new Person());
        System.out.println(treeSet);

    }
}
//修改版   让person类实现Comparable
class Person implements Comparable{

    private  String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
       return 0 ;
    }
}