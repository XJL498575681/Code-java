package com.homework;
/*
1.有一个交通工具接口类Vehicles，有work接口
2.有Horse类和Boat类分别实现Vehicles
3.创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
4.有Person类，有name和Vehicles属性，在构造器中为两个属性赋值
5.实例化Person对象“唐僧"，要求一般情况下用Horse作为交通工具，
遇到大河时用Boat
使用代码实现上面的要求

 */
public class h5 {
    public static void main(String[] args) {

        Person sn = new Person("SN", new Horse());

        sn.common();
        sn.passRiver();
        sn.passRiver();
        sn.common();
        sn.flying();

    }
}

//接口类 暂不确定哪种工作方式
interface Vehicles{
    public void work();
}

//马儿实现
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("使用马");
    }
}
//过河用小船
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("过河使用小船");
    }
}

class Air1 implements Vehicles{
    @Override
    public void work() {
        System.out.println("使用飞机过火焰山");
    }
}


class Factory{
    //饿汉式 保持始终是同一匹马
    private static Horse  horse = new Horse();

    private  Factory() {
    }

    public static Horse getHorse(){
//        return new Horse();
        return horse;
    }

    public static Boat getBoat(){
        return new Boat();
    }

    public static Air1 getAir(){
        return new Air1();
    }

}



class Person{
    private  String name;

    private Vehicles vehicles;



    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    //工具类 人 -》 工具 -》  马？船

    //判断交通工具是否为空 避免浪费交通工具对象
    /*1.
      public void passRiver(){
        Boat boat = Factory.getBoat();   //此时构造器已经new了一个Boat对象
        boat.work();
        }
    }2.此时再我的交通工具一直是第一个vehicles 换一个交通工具没发生变化  需要用interface
      public void passRiver(){
        if((vehicles == null)){
            vehicles = Factory.getBoat();
        }
        vehicles.work();
    }

     */
    public void passRiver(){

        if(!(vehicles instanceof Boat)){
            vehicles = Factory.getBoat();
        }
        vehicles.work();
    }
    public void common(){

        if(!(vehicles instanceof Horse)){
           vehicles = Factory.getHorse();  //接口上转型   多态
        }
        vehicles.work();  //接口调用  编译类型是接口 运行类型是Horse
    }
    public void flying(){
        if(!(vehicles instanceof Air1)){
           vehicles = Factory.getAir();
        }
        vehicles.work();
    }
}