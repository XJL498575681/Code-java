package com.extend_s.eg1;

class Person extends Creature {
    String name;
    private int age; //父类私有化

//    public Person() {
//        System.out.println("Person 父类 的构造器" );
//    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    private void eat() {
        System.out.println("吃饭");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("名字：" + name + "\t年龄" + getAge() + "");
    }
}
