package Homework.h3;

public class Employee {
    private String name;
    private double sal;
    private int day;
    private double grade;

    public Employee(String name, double sal, int day, double grade) {
        this.name = name;
        this.sal = sal;
        this.day = day;
        this.grade = grade;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void print(){
        System.out.println("姓名\t" + name + "\t工资"+
                day * sal * grade);
    }


}
