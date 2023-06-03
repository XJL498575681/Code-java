package com.xjl.List;

import java.util.*;

public class Exercise2 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        //List list = new LinkedList();
        //List list = new Vector();
        list.add(new Book("红",90,"SS"));
        list.add(new Book("西",30,"AA"));
        list.add(new Book("水",60,"KK"));
        list.add(new Book("三",70,"MM"));

        Iterator iterator = list.iterator();
        for (Object o :list) {
            System.out.println(o);
        }

        System.out.println();
        sort(list);

        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }

    }
    public static void sort(List list){
        int listsize = list.size();
        for (int i = 0; i < listsize -1; i++) {
            for (int j = 0; j < listsize-1-i; j++) {

                //取出对象   向下转型
              Book book = (Book) list.get(j);
              Book book2 = (Book) list.get(j + 1 );

              if(book.getPrice() > book2.getPrice()){
                  list.set(j,book2);
                  list.set(j +1,book);

              }
            }
        }
    }

}

class Book{
    private String name;
    private double price;
    private String author;

    public Book() {
    }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\''
           ;
    }
}