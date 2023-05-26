package com.xjl.abstract_.exersice;

public class Common extends Employee{
    public Common(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工"+ getName()+ "工作中");
    }
}
