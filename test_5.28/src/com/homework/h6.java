package com.homework;

public class h6 {
    public static void main(String[] args) {
        Car car = new Car(20);
        car.getAir().flow();

    }
}

class Car{
    private double tem;

    public Car(double tem) {
        this.tem = tem;
    }

    class Air{
        public void flow(){
            if(tem < 0 ){
                System.out.println("暖气");
            }else if(tem > 40){
                System.out.println("冷气");
            }else{
                System.out.println("关闭空调");
            }
        }

    }

    public Air getAir(){
        return new Air();
    }
}