package com.xjl.Thread.introduce;

public class CPU_ {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int Cup = runtime.availableProcessors();

        System.out.println(Cup);

    }
}
