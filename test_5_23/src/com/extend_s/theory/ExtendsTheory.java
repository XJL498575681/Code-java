package com.extend_s.theory;

public class ExtendsTheory {
    public static void main(String[] args) {

        Son son = new Son();
        System.out.println(son.name);
        System.out.println(son.getAge());
        System.out.println(son.hobby);
    }

}

class GrandPa{
    String name = "大头爷爷";
    String hobby = "旅游";

}
class Father extends GrandPa{
    String name = "大头爸爸";
    private int age = 39;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Son extends Father{
    String name = "大头儿子";
}