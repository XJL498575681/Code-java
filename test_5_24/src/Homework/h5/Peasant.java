package Homework.h5;

public class Peasant extends Employee{
    public Peasant(double sal, String name) {
        super(sal, name);
    }

    @Override
    public void print() {
        System.out.print("农民\t");
        super.print();
    }
}
