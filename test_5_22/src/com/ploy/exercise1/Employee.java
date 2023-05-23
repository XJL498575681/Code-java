package com.ploy.exercise1;

public class Employee {
    private String name;
    private double month_salary;

    public Employee(String name, double month_salary) {
        this.name = name;
        this.month_salary = month_salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonth_salary() {
        return month_salary;
    }

    public void setMonth_salary(double month_salary) {
        this.month_salary = month_salary;
    }
    public double getAnnual(){
       return(getMonth_salary() * 12);
    }

}


class worker extends Employee{
    public worker(String name, double month_salary) {
        super(name, month_salary);
    }

    public void work(){
        System.out.println("员工工作");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name, double month_salary, double bonus) {
        super(name, month_salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + getBonus();
    }
    public void manger(){
        System.out.println("manager");
    }
}