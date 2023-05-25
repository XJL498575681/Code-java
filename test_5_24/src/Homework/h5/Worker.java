package Homework.h5;

public class Worker extends Employee{
    public Worker(double sal, String name) {
        super(sal, name);
    }

    @Override
    public void print() {
        System.out.print("工人\t");
        super.print();
    }
}
