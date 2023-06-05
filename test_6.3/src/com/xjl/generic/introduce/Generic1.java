package com.xjl.generic.introduce;

import java.util.ArrayList;

public class Generic1 {
    @SuppressWarnings({"all" })
    public static void main(String[] args) {

//        //传统方法
//        ArrayList list = new ArrayList();
//        list.add(new Dog("jack",10));
//        list.add(new Dog("lucy",8));
//
//        //得到姓名 年龄
//
//        list.add(new Cat("tom",12));
//
//        for (Object o :list) {
//            //下转型
//            Dog dog = (Dog)o;
//            System.out.println(dog.getName() + " " +dog.getAge());
//        }
//
//        //出现的问题 Dog数量过多 每次都要转换   而且没有约束


        ArrayList<Dog> arrayList = new ArrayList<>();
        arrayList.add(new Dog("jack",10));
        arrayList.add(new Dog("tom",20));
 //       arrayList.add(new Cat("tom",12));   //此时报错 类型为Dog

        for (Dog dog :arrayList) {
            //避免向下转型
            System.out.println(dog.getName() + " " + dog.getAge());
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



class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
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