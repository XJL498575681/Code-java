package com.xjl.Thread.exercise;

public class E3 {
    public static void main(String[] args) {
        D d = new D();

        Thread thread = new Thread(d);
        thread.setName("t1");
        Thread thread1 = new Thread(d);
        thread1.setName("t2");
        thread.start();
        thread1.start();
    }
}


class D implements Runnable{
    private double count = 10000;

    @Override
    public void run() {
        while(true){
            synchronized (this) {
                if (count < 1000) {
                    System.out.println("钱不够");
                    break;
                }
                count -= 1000;
                System.out.println(Thread.currentThread().getName() + "取出 " + "1000" + "还剩  " + count);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
    }
}