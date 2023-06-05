package com.xjl.generic.introduce;

import jdk.nashorn.internal.ir.CallNode;

/*
1泛型的作用是:可以在类声明时通过一个标识表示类中某个属性的类型，
或者是某个方法的返回值的类型，或者是参数类型

 */
public class Generic2 {
    public static void main(String[] args) {

        Person<String> stringPerson = new Person<String>("tom");
        stringPerson.show();
/*
class Person{
    String s;

    public Person(String s){
        this.s = s;
    }

    public String  f(){
        return  s;
    }
}
 */

        Person<Integer> integerPerson = new Person<Integer>(100);

        integerPerson.show();


    }
}


class Person<E>{
    E s;  // s的数据类型 是E

    public Person(E s){  //E  参数类型
        this.s = s;
    }

    public E f(){ // E 返回类型
        return  s;
    }
    public void show(){
        System.out.println(s.getClass());
    }
}