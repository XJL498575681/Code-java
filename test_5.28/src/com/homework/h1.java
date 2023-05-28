package com.homework;

public class h1 {
    public static void main(String[] args) {

    }
}


class Frock{
    private static int currentNum = 100000;

    private int serialNumber;

    public static int getCurrentNum() {
        return currentNum += 100;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        serialNumber = getCurrentNum();
    }
}

class TestFrock{
    public static void main(String[] args) {
        System.out.println(Frock.getCurrentNum());
        System.out.println(Frock.getCurrentNum());


        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        System.out.println(frock.getSerialNumber());
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());


    }
}