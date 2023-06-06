package com.xjl.Thread.method;



public class method1 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("胥贱人");
        t.setPriority(Thread.MIN_PRIORITY);

        t.start();//子线程

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi" + i);
        }
        System.out.println(t.getName() + "优先级" + t.getPriority());
        t.interrupt();
    }
}


class T extends Thread {
    @Override
    public void run() {
        while(true){
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "吃包子sss" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中si");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
//当该线程执行到一个interrupt方法时，就会catch 一个异常，可以加入自己的业务代码
                //中断异常
                System.out.println(Thread.currentThread().getName() + "被 interrupt了");
            }
        }
    }
}