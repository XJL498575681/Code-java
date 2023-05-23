package com.ploy.Object.exercise;

import com.ploy.Object.exercise.Animal;
import com.ploy.Object.exercise.Cat;
import com.ploy.Object.exercise.Dog;

public class Ploy {
    public static void main(String[] args) {


        //体验多态的特点

        //编译类型就是 Animal  运行类型就是Dog
        Animal animal = new Cat();
        //运行时，执行到该行的Animal类型就是Dog，此时的方法就是重写的方法
        animal.cry();  //猫猫叫


        animal = new Dog();
        animal.cry();
    }
}
