package com.extend_s.introduce;

public class Extends1 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 19;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();


        System.out.println();


        Graduate graduate = new Graduate();
        graduate.name = "大明";
        graduate.age = 24;
        graduate.setScore(90);
        graduate.showInfo();

    }
}
