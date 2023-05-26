package com.xjl.interface_;

public class extends_vs_interface {

    public static void main(String[] args) {

        son son = new son("monkey");
        son.climbing();

        son.swimming();
        son.flying();
    }
}


class Monkey{
    private  String name;

    public Monkey(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println("猴子爬树");
    }
}

//继承
class son extends Monkey implements Fish,fly{
    public son(String name) {
        super(name);
    }


    // 实现 必须事项接口中所具备的所有方法
    @Override
    public void swimming() {
        System.out.println("小猴子"+ getName()+ "通过学习可以实现鱼一样 游泳");
    }

    @Override
    public void flying() {
        System.out.println("小猴子"+ getName()+ "通过学习可以实现鸟一样 飞翔");
    }
}

//接口  实现鱼的游泳机制

interface Fish {
    void swimming();
}


//多个接口
interface fly{
    public abstract void flying();
}

