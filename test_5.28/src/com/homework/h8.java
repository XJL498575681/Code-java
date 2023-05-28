package com.homework;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class h8 {
    public static void main(String[] args) {

        Color green = Color.GREEN;
        green.show();
        switch (green){
            case RED:
                System.out.println("宏色");
            case BLUE:
                System.out.println("蓝色");
            case BLACK:
                System.out.println("黑色");
            case YELLOW:
                System.out.println("黄色");
            default :
                System.out.println("wu");
        }

    }
}

enum Color implements Test{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);

    @Override
    public void show() {
        System.out.println(redValue + " " +greenValue +"  " +blueValue);
    }

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public int getRedValue() {
        return redValue;
    }


    public int getGreenValue() {
        return greenValue;
    }


    public int getBlueValue() {
        return blueValue;
    }

//    @Override
//    public String toString() {
//        return "Color{" +
//                "redValue=" + redValue +
//                ", greenValue=" + greenValue +
//                ", blueValue=" + blueValue +
//                '}';
//    }
}

interface Test{
    public void show();
}
