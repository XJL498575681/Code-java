package com.xjl.generic.Exercise1;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercise {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack",8000,
                new MyDate(2000,4,5)));
        employees.add(new Employee("lucy",9000,
                new MyDate(1999,8,5)));
        employees.add(new Employee("jack",8000,
                new MyDate(2000,4,6)));

        System.out.println(employees);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    return 0;
                }
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0) {
                    return i;
                }

                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        System.out.println(employees);
    }

}



