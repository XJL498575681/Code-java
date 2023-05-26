package com.xjl.interface_.introduce;

public class Camera implements UsbFace{
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机开始工作");
    }
}
