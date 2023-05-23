package com.override.exercise;

public class Person {
    private String name;
    private int age;


    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public String  say(){
       return("我叫" + getName()+ "\t年龄\t" + getAge());
    }

}
