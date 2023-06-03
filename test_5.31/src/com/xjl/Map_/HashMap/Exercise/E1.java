package com.xjl.Map_.HashMap.Exercise;

import java.util.*;

public class E1 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(1,new Employee("jack",9000,1));
        map.put(2,new Employee("tom",21000,2));
        map.put(3,new Employee("lucy",30000,3));

        //遍历 1.keyset

        Set keyset = map.keySet();
        for (Object key :keyset) {
           //获取value
            Object o = map.get(key);
            Employee employee = (Employee) o;
            if (employee.getSal() > 18000){
                System.out.println(employee);
            }

        }

        System.out.println("++++++++++++++++++++");

        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Object o = map.get(next);
            Employee employee = (Employee) o;
            if (employee.getSal() > 18000){
                System.out.println(employee);
            }
        }


        System.out.println("++++++++++++++++++++");

        //values
        Collection values = map.values();

        for (Object obj :values) {
            Employee employee = (Employee) obj;
            if (employee.getSal() > 18000){
                System.out.println(obj);
            }
        }

        System.out.println("++++++++++++++++++++");

        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            Employee employee = (Employee) next;
            if (employee.getSal() > 18000){
                System.out.println(next);
            }
        }
        System.out.println("++++++++++++++++++++");

        //EntrySet
        Set entrySet = map.entrySet();
        for (Object obj :entrySet ) {
            Map.Entry entry = (Map.Entry) obj;
            Employee employee = (Employee) entry.getValue();
            if (employee.getSal() > 18000){
               // System.out.println(employee);
                System.out.println(entry.getValue());
            }
        }
        System.out.println("++++++++++++++++++++");

        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object next =  iterator2.next();
            Map.Entry entry = (Map.Entry)next;
            Employee employee = (Employee) entry.getValue();
            if (employee.getSal() > 18000){
                // System.out.println(employee);
                System.out.println(entry.getValue());
            }
        }


    }
}

class Employee{
    private String name;
    private double sal;
    private int id;

    public Employee() {
    }

    public Employee(String name, double sal, int id) {
        this.name = name;
        this.sal = sal;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}