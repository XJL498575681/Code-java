package com.xjl.Thread.state;

public class state_ {
    public static void main(String[] args) throws  InterruptedException{

        T t = new T();
        System.out.println(t.getName() + "状态" + t.getState());//NEW状态

        t.start();
        while(Thread.State.TERMINATED !=t.getState()){
            System.out.println(t.getName() + "状态" + t.getState());
            Thread.sleep(500);//等待状态
        }

        System.out.println(t.getName() + "状态" + t.getState());// 终止状态
    }
}


class T  extends Thread{
    @Override
    public void run() {
        while(true){
            for (int i = 0; i < 10; i++) {
                System.out.println("hi" + i );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }
}