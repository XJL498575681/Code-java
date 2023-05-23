package com.ploy.introduce;

public class Master {

    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    //animal 可以接受所有子类的动物信息  food 可以接受所有子类的食物信息 ， 可以方便进行添加
    //多态机制实现统一管理主人喂食问题
    public void feed(Animal animal, Food food){
        System.out.println("主人"+ name +"\t给"+
                animal.getName()+"\t喂"+food.getName() );
    }




    //主人给小狗喂骨头

//    public void feed(Dog dog,Bone bone){
//        System.out.println("主人"+ name +"\t给"+
//                dog.getName()+"\t喂"+bone.getName() );
//    }
//    //主人给小猫喂鱼
//        public void feed(Cat cat,Fish fish){
//        System.out.println("主人"+ name +"\t给"+
//                cat.getName()+"\t喂"+fish.getName() );
//    }

}
