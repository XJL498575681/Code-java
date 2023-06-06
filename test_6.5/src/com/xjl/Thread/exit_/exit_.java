package com.xjl.Thread.exit_;

import com.sun.deploy.security.ValidationState;

import java.util.TreeMap;

public class exit_ {
    public static void main(String[] args) throws InterruptedException {

        T t = new T();
        t.start();

//        if(t.getCount() == 10){
//            t.setLoop(false);
//        }
/*
/如果希望main线程去控制t1 线程的终止，必须可以修改loop/
让t1 退出run方法，从而终止t1线程->通知方式
/让主线程休眠10秒，再通知t1线程退出
 */
        Thread.sleep(10 * 1000);
        t.setLoop(false);
    }
}

class T extends Thread{
    int count = 0 ;
    private boolean loop = true;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {

        while(loop){
            System.out.println("T++++++++++++" +(++count));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}