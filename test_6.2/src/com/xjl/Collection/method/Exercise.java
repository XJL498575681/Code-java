package com.xjl.Collection.method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Exercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection col1 = new ArrayList();
        col1.add(new Dog("小黄" ,19));
        col1.add(new Dog("小傻",18));

       Iterator iterator = col1.iterator();


        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        iterator = col1.iterator();
        System.out.println();

        for (Object dog :col1) {
            System.out.println(dog);
        }


    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
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
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}