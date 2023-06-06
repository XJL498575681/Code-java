package com.xjl.Thread.Use;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jdk.nashorn.internal.ir.CallNode;

public class ThreadUse {
    public static void main(String[] args) throws  InterruptedException{

        //创建对象 当做 线程使用
        Cat cat = new Cat();
        cat.start();//调用run  启动线程
        // 当main 线程启动 子线程 主线程不会阻塞 会继续执行

//        cat.run();//直接调用run
        // 只是执行一个简单的方法    没有真正的启动一个线程 会先将run执行结束后再执行下面代码

        System.out.println("主线程继续执行"+Thread.currentThread().getName());

        for (int i = 0; i < 60; i++) {
            System.out.println("主线程" + i);
            Thread.sleep(1000);
        }



    }
}

/*
11。当一个类继承了 Thread类，该类就可以当做线程使用1
2。我们会重写 run方法，写上自己的业务代码
13. run Thread 类实现了 Runnable接口的run方法


    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
 */
class Cat extends Thread{
    int times = 0;

    @Override
    public void run() {
      while(true){
          System.out.println("喵喵喵" +(++times)+ "线程名" + Thread.currentThread().getName() );

          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          if(times == 80){  //80 次退出
              break;
          }
      }
    }

}