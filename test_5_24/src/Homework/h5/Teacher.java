package Homework.h5;

public class Teacher extends Employee{

    private int classDay;
    private double classSal;

    public Teacher(double sal, String name, int classDay, double classSal) {
        super(sal, name);
        this.classDay = classDay;
        this.classSal = classSal;
    }

    @Override
    public void print() {
        System.out.printf("老师\t");
        System.out.println(getName() + "\t基本工资\t" + getSal() + "\t课酬\t"
                +classSal * classDay);
    }
}
