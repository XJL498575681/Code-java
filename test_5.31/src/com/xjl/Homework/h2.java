package com.xjl.Homework;

import java.util.ArrayList;
import java.util.Iterator;

public class h2 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        Car car1 = new Car("宝马", 49999);
        Car car2 = new Car("小法", 49008888);
        Car car3 = new Car("小法", 49008888);


        list.add(car1);
        list.add(car2);
        System.out.println(list);

        list.remove(car1);
        System.out.println(list);


        System.out.println(list.contains(car1));

        System.out.println(list.size());

        System.out.println(list.isEmpty());

      //  list.clear();
       // System.out.println(list);


//        list.add(list);
//        System.out.println(list);


        list.add(car3);
        for (Object o :list) {
            System.out.println(o);
        }

        System.out.println("===========");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("===========");
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Car cc = (Car) next;
            System.out.println();
        }

    }
}

class Car{
    private String name;
    private double price;


    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}