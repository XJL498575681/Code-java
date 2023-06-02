package com.xjl.Map_.Source;

import java.util.HashMap;

public class Source1 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put( "java",10); //ok
        map.put( "php",10);//ok
        map.put( "java",20);//替换value
        System.out.println("map=" + map);

    }
}
