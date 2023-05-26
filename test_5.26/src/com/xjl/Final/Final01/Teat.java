package com.xjl.Final.Final01;

public class Teat {

    public static void main(String[] args) {

        Circle circle = new Circle(5.1);
        System.out.println(circle.Area());

    }

}
class Circle{
    private double radius;
    private final double PI ;  //= 3.14;

    //

    public Circle(double radius) {
        this.radius = radius;
       // PI = 3.14;
    }
    {
        PI = 3.14;
    }
    public double Area(){
        return PI * radius *radius;
    }
}