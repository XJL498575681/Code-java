package com.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class Exercise {
    public static void main(String[] args) {

        Book[] books = new Book[4];
        books[0] = new Book("红丫丫", 100);
        books[1] = new Book("蓝蓝", 20);
        books[2] = new Book("绿油油哟", 90);
        books[3] = new Book("紫吃的不恶化", 60);

//        sort(books);
//        System.out.println(Arrays.toString(books));
//
//    }
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                //按照价格
//                int  ret = (int)(book2.getPrice() - book1.getPrice());
                //按照shuming
                int ret  = book2.getName().length() - book1.getName().length();

                return  ret;
            }
        });

        System.out.println(Arrays.toString(books));
    }

    public static void sort(Book [] book){
        for (int i = 0; i < book.length- 1; i++) {
            for (int j = 0; j < book.length - 1 -i; j++) {
                if(book[j].getPrice() > book[j+ 1].getPrice()){
                    Book tmp = book[j];
                    book[j] = book[j +1];
                    book[j+ 1] = tmp;
                 }
            }
        }
    }


}
class Book{
        private String name;
        private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
