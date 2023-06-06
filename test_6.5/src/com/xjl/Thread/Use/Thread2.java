package com.xjl.Thread.Use;

public class Thread2 {
    public static void main(String[] args) {

        Dog dog = new Dog();

       // 创建一个Thread 把dog对象实现Runnable接口 开发线程
        Thread thread = new Thread(dog);//设计模式 代理模式
        thread.start();

        Tiger tiger = new Tiger();
        Proxy proxy = new Proxy(tiger);
        proxy.start();
    }
}

class Animal{

}

class Tiger extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("老虎叫");
    }
}
class Proxy implements Runnable{  //线程代理

    private Runnable target = null;//Runnable 属性 用于调用run
    @Override
    public void run() { //动态绑定tiger的run方法
        if(target != null){
            target.run();
        }
    }

    public Proxy(Runnable target) {
        this.target = target;
    }

    public void start0(){
        run();
    }
    public void start(){
        start0();
    }
}
class Dog implements Runnable{
    int count =0;
    @Override
    public void run() {
        while(true){
            System.out.println("汪汪汪" + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(count == 10){
                break;
            }
        }
    }
}