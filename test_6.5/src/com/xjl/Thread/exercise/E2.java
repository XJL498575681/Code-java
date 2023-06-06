package com.xjl.Thread.exercise;

import java.util.Locale;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {

        A a = new A();
        B b = new B(a);
        a.start();
        b.start();
    }
}


class A extends Thread{

    private boolean loop = true;

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while(loop){
            System.out.println((int)(Math.random()* 100 + 1 ));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class B extends Thread{
    private A a;

    private Scanner scanner = new Scanner(System.in);

    public B(A a){
        this.a = a;
    }

    @Override
    public void run() {
         while(true) {
             System.out.println("输入");
             char key = scanner.next().toUpperCase().charAt(0);
             if(key == 'Q'){
                 a.setLoop(false);
                 System.out.println("b退出");
                 break;
                  }
             }
        }
}
