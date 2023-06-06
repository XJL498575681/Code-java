package com.xjl.Thread.ticket;

import jdk.nashorn.internal.ir.CallNode;

public class Sell {
    public static void main(String[] args) {
//继承
//        Sell01 sell01 = new Sell01();
//        Sell01 sell02 = new Sell01();
//        Sell01 sell03 = new Sell01();
////票数超卖
//        sell01.start();
//        sell02.start();
//        sell03.start();



        //接口

        Sell03 sell03 = new Sell03 ();
        Sell03 sell04 = new Sell03 ();
        Sell03 sell05 = new Sell03 ();

        Thread thread  = new Thread(sell03);
        Thread thread1 = new Thread(sell04);
        Thread thread2 = new Thread(sell05);

        thread.start();
        thread1.start();
        thread2.start();


//        new Thread(sell03).start();
//        new Thread(sell03).start();
//        new Thread(sell03).start();



    }
}




//class Sell01 extends Thread{
//    private static  int num = 100;
//
//    @Override
//    public void run() {
//        while(true){
//            if(num <= 0){
//                System.out.println("卖完了");
//                break;
//            }
//
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("窗口" + Thread.currentThread().getName()+ "售出一张"
//            +"剩余" + (--num));
//        }
//    }
//}


//class Sell02 implements Runnable{
//    private static  int num = 100;
//
//    @Override
//    public void run() {
//        while(true){
//            if(num <= 0){
//                System.out.println("卖完了");
//
//                break;
//            }
//
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("窗口" + Thread.currentThread().getName()+ "售出一张"
//                    +"剩余" + (--num));
//        }
//    }
//}


class Sell03 implements Runnable {
    private static int num = 100;
    private boolean loop = true;
    Object object = new Object();  // 同一对象
/*
   public synchronized void m(){}  同步方法
   这时  锁 在this 对象
   也可以加在代码块上   synchronized

 */
//    public synchronized static void m1(){}
//    // public synchronized static void m1(){} 锁加在Sell03.class上

//    public static void m2(){
//        synchronized (Sell03.class){
//            System.out.println("jcuewbj ");  //想要在静态方法中实现一个同步代码块 this == 这个类名
//        }
//    }


    //synchronized  表示同一时间只能一个线程来执行m方法进行卖票
//    public synchronized void m(){
//        if(num <= 0){
//            System.out.println("卖完了");
//            loop = false;
//            return;
//        }
//
//        try {
//            Thread.sleep(50);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("窗口" + Thread.currentThread().getName()+ "售出一张"
//                +"剩余" + (--num));
//    }




    //代码块
    public void m() {
        synchronized (object/*this */){
            if (num <= 0) {
                System.out.println("卖完了");
                loop = false;
                return;
            }


        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("窗口" + Thread.currentThread().getName() + "售出一张"
                + "剩余" + (--num));
    }
}



    @Override
    public void run() {
        while(loop){
                m();
        }
    }
}