package com.ploy.introduce;

public class Poly {
    public static void main(String[] args) {



        Master tom = new Master("汤姆");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("骨头");
        tom.feed(dog,bone);
        System.out.println();

        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("黄花鱼");
        tom.feed(cat,fish);


        Pig pig = new Pig("小猪");
        Rice rice = new Rice("米饭");
        tom.feed(pig,rice);

    }
}
