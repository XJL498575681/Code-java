package com.xjl.Homework;

import java.util.HashSet;
import java.util.Objects;

public class h5 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet set = new HashSet();//ok
        Person1 p1 = new Person1(1001,"AA");
        Person1 p2 = new Person1(1002,"BB");
        set.add(p1);//ok
        set.add(p2);//ok
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);

        set.add(new Person1(1001,"CC"));
        System.out.println(set);

        set.add(new Person1(1001,"AA"));
        System.out.println(set);

    }
}

class Person1{
    public int id;
    public String name;

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return id == person1.id && Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}