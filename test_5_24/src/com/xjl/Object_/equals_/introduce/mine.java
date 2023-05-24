package com.xjl.Object_.equals_.introduce;

public class mine {
    public static void main(String[] args) {

        Person person = new Person("jack", 20, '男');
        Person person1 = new Person("jack", 20, '男');
        System.out.println(person == person1);
        //重写的this 指的是person    person  指的是person1
        System.out.println(person.equals(person1));  //true


    }
}
class Person{
    private String name;
    private int age;
    private char gender;

    //重写Object 的 equals 方法
    public boolean equals(Object obj){
        //先判断两对象是否是统一对象
        if(this == obj){
            return true;
        }
        //类型判断
        if(obj instanceof Person){
             Person person = (Person)obj;//向下转型
             return this.name.equals(person.name) &&
                     this.age== person.age && this.gender == person.gender;

        }
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}