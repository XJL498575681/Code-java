package com.xjl.Collection.method;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book("sanguo","cvsdhvu",10.2));
        col.add(new Book("qf v4ef o","c q43u",10.2));
        col.add(new Book("qc f43o","v fq43vu",10.2));

        System.out.println(col);


        //遍历col 集合
        //1.先得到col 对应的迭代器
        Iterator iterator = col.iterator();
        //  2.循环遍历
        while(iterator.hasNext()){ // 判断是否还有元素
            //返回下一元素
            Object obj = iterator.next();
            System.out.println(obj);
        }    // 快捷键  itit
        //3.当退出迭代器循环后 此时的iterator 已经指向最后一个元素
     //   iterator.next();  // NoSuchElementException

        System.out.println();
        //4.需要再次遍历时 要重置迭代器
            iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}