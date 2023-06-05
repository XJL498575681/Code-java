package com.xjl.generic.Exercise;


import java.util.*;

public class GenericExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("jack",18));
        students.add(new Student("ja",15));
        students.add(new Student("j",16));

        for (Student student :students) {
            System.out.println(student);
        }


//        HashMap<String, Student> hm = new HashMap<String ,Student>();
//        hm.put("jack",new Student("jack",18));
//        hm.put("ja",new Student("ja",16));
//        hm.put("j",new Student("j",15));
//
//        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
//
//
//        Iterator<Map.Entry<String, Student>> iterator = entrySet.iterator();
//
//        while (iterator.hasNext()) {
//            Map.Entry<String, Student> next =  iterator.next();
//            System.out.println(next.getKey() + " " + next.getValue());
//        }

        HashMap hashMap = new HashMap();
        hashMap.put("jack",new Student("jack",18));
        hashMap.put("ja",new Student("ja",16));
        hashMap.put("j",new Student("j",15));

        Set set = hashMap.entrySet();

        Iterator iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            Map.Entry entry = (Map.Entry)next;
            System.out.println(entry.getValue());
        }

    }
}
class   Student{
    private String name ;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
