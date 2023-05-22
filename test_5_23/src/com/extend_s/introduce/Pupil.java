package com.extend_s.introduce;

public class Pupil {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing(){
        System.out.println("小学生"+ name+ "正在考小学数学");
    }
    public void showInfo(){
        System.out.println("学生名"+ name + "\t年龄" + age + "\t成绩" + score);
    }
}
