package com.ploy.Array;

public class Teacher extends Person{
    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return "老师 "+super.say() +"\tsalary" + getSalary();
    }

    public void teacher(){
        System.out.println("teacher");
    }
}
