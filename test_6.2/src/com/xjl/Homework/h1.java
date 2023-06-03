package com.xjl.Homework;

import java.util.ArrayList;
import java.util.Collections;

public class h1 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(new New("吃呢女很漫长IC卡就是次哦v模拟两次是打发"));
        list.add(new New("及凝结i阿女孩不vu哦哦测怒欧克模具内幕 缴纳额89你们8偶看"));

        for (int i = list.size() - 1; i >= 0     ; i--) {

            New news = (New) list.get(i);
            System.out.println(process(news.getName()));
        }

    }

    public static String process(String name) {

        if (name == null) {
            return "null";
        }
        if (name.length() > 15) {
            return name.substring(0, 15) + ",,,,";
        } else {
            return name;
        }
    }
}

 class New{
    private String name;
    private String text;

    public New(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "New{" +
                "标题  ='" + name + '\'' +
                '}';
    }
}