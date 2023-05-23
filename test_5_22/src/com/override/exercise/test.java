package com.override.exercise;

public class test {
    public static void main(String[] args) {
        Person person = new Person("张世超",19);
        System.out.println( person.say());


        Student student = new Student("张三",19,1,89);
        System.out.println( student.say());


    }
}
