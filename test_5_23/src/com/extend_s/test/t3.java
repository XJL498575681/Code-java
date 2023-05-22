package com.extend_s.test;

/*
编写Computer类,包含CPU、内存、硬盘等属性,getDetails方法用于返回Computer的详细信息
编写PC子类，继承Computer类,添加特有属性【品牌brand】
编写NotePad子类,继承Computer类,添加特有属性【演示color)
编写Test类,在main方法中创建PC和NotePad对象，分别给对象中特有的属性赋值，以及从Computer类继承的属性赋值，并使用方法并打印输出信息。

 */
public class t3 {
    public static void main(String[] args) {
        Pc pc = new Pc("intel",16,"3000","IBM");

        pc.printInfo();

    }
}

class Computer{
    private String cpu;
    private double memory;
    private String disk;

    public Computer(String cpu, double memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getDetails(){
        return ("cpu:" + cpu + "\t 内存"+ memory + "\t硬盘" + disk);
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }
}


class Pc extends Computer{

    private String brand;

    public Pc(String cpu, double memory, String disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void  printInfo(){
        System.out.println(getDetails() + "\tbrand  "+ getBrand());
    }
}

class Notepad extends Computer{

    private String Color;

    public Notepad(String cpu, double memory, String disk, String color) {
        super(cpu, memory, disk);
        Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void  printInfo(){
        System.out.println(getDetails() + "\tco;or"+ getColor());
    }

}