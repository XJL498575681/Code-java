package com.xjl.Thread.method;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class method3 {
    public static void main(String[] args)throws InterruptedException {

        T2 t2 = new T2();
        t2.start();
        for (int i = 1; i < 20; i++) {
              Thread.sleep(1000);
            System.out.println("主线程 吃了"+ i + "包子");
            if(i == 5){
                System.out.println("主线程先吃");
//                t2.join();
//                System.out.println("子线程继续吃");


            }
        }
    }
}

class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            System.out.println("子线程吃" + i  + "包子");
        }
    }

}