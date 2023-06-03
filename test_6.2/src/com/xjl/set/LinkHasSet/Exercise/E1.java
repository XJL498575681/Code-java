package com.xjl.set.LinkHasSet.Exercise;



import sun.text.resources.th.BreakIteratorInfo_th;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

public class E1 {
    public static void main(String[] args) {

        LinkedHashSet linkedHashSet = new LinkedHashSet();

        linkedHashSet.add(new Car("小法", 900000));
        linkedHashSet.add(new Car("小ls", 900000));
        linkedHashSet.add(new Car("小法", 900000));

        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}


