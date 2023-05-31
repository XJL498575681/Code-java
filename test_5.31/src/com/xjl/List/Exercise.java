package com.xjl.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("nuedhv");
        list.add("nvf4rvdhv");
        list.add("nuvrevrev");
        list.add("nuvrrvvredhv");
        list.add("nvv regvuedhv");
        list.add("nuerverddhv");
        list.add("nuervrtryrjnewdhv");
        list.add("nuevbrewhqhgbdfvedhv");
        list.add("nuevbq35hb35rdhv");
        list.add("nuvreqbvrebregredhv");


        list.add(1,"韩顺平");
        list.get(4);
        list.remove(6);
        list.set(6,"hahhah");


        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }

        System.out.println();
        for (Object o :list) {
            System.out.println(o);
        }

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            Object object = list.get(i);
            System.out.println(object);
        }

    }
}
