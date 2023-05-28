package com.Exception;

public class ClassCast_ {
    public static void main(String[] args) {

        A b = new B();

        C c = (C)b;  //ClassCastException
    }
}

class A{}
class B extends A{}
class C extends A{}