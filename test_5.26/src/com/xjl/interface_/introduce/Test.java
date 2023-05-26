package com.xjl.interface_.introduce;

public class Test {
    public static void main(String[] args) {
        Camera camera = new Camera();

        Phone phone = new Phone();


        //手机接入电脑
        Computer computer = new Computer();
        computer.work(phone);


    }
}
