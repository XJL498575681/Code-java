package Homework.h5;

public class Employee {
    private double sal;
    private String name;
    private int mouth = 12;

    public Employee(double sal, String name) {
        this.sal = sal;
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }
    public void print(){
        System.out.println(name + "\t年工资是\t" + mouth *sal);
    }
}
