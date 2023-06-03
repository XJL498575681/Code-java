package com.xjl.set.hashset_.exercise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Exercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        //三个都是new 得到的hash值自然不同
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack",19));
        hashSet.add(new Employee("lucy",20));
        hashSet.add(new Employee("jack",19));

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object obj=  iterator.next();
            System.out.println(obj);
        }

    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
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
        return
                "name='" + name + '\'' +
                ", age=" + age ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    // name 和age 相同返回相同的hash code
    public int hashCode() {
        return Objects.hash(name, age);
    }
}