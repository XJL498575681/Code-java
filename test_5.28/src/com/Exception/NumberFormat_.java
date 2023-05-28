package com.Exception;

public class NumberFormat_ {
    public static void main(String[] args) {

        String name = "中文";

        int num = Integer.parseInt(name);   //NumberFormatException
        System.out.println(num); //1234

    }
}

