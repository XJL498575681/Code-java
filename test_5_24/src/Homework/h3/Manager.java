package Homework.h3;

public class Manager extends Employee{
    public Manager(String name, double sal, int day, double grade) {
        super(name, sal, day, grade);
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void print() {
        System.out.println("姓名\t" + getName() + "\t工资"+
               bonus + getDay() * getSal() * getGrade());;
    }
}

