package com.override.exercise;

public class Student extends Person{

    private int id;
    private double score;



    public Student(String name,int age,int id,double score){
        super(name,age);   //调用父类的构造器
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say(){
       return (super.say() + "\tid\t" + id + "\tscore\t" + score);
    }

}
