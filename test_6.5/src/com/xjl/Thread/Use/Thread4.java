package com.xjl.Thread.Use;

public class Thread4 {
    public static void main(String[] args)throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("+++++ ");
            Thread.sleep(1000);
        }
    }
}


class MyDaemonThread extends Thread {
    public void run() {
        for (; ; ) {//无限循环
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("马蓉和宋喆快乐聊天，哈哈哈~~~");
        }
    }
}