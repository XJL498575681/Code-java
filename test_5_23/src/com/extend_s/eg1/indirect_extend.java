package com.extend_s.eg1;

public class indirect_extend {
    public static void main(String[] args) {

//        Person person = new Person();
//        person.name = "张三";
//        person.setAge(19);
//        person.info();


        Student student = new Student();
        student.setAge(24);
        student.name = "王五";
        student.info();
        student.study();
        student.sleep();
    }
}


