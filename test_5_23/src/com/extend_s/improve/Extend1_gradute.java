package com.extend_s.improve;

import com.extend_s.introduce.Graduate;
import com.extend_s.introduce.Pupil;

public class Extend1_gradute {
    public static void main(String[] args) {

        Pupil pupil = new Pupil();
        pupil.name = "小明/";
        pupil.age = 19;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();


        System.out.println();


        Graduate graduate = new Graduate();
        graduate.name = "大明/";
        graduate.age = 24;
        graduate.testing();
        graduate.setScore(90);
        graduate.showInfo();


    }

}
