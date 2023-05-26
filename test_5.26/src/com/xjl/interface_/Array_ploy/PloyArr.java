package com.xjl.interface_.Array_ploy;

public class PloyArr {
    public static void main(String[] args) {
        Usb[] usb = new Usb[2];
        usb[0] = new Camera();
        usb[1] = new Phone();


        for (int i = 0; i < usb.length; i++) {
            usb[i].work();  //动态绑定机制
                if(usb[i] instanceof Phone){
                    ((Phone) usb[i]).call();     // 向下转型
                }else{

                }
        }
    }
}



interface Usb{

    void work();
}


class Phone implements Usb{
    void call(){
        System.out.println("打电话");
    }

    @Override
    public void work() {
        System.out.println("手机工作中");
    }
}
class Camera implements Usb{

    @Override
    public void work() {
        System.out.println("手机拍照中");
    }
}