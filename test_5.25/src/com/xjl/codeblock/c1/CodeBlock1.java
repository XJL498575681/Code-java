package com.xjl.codeblock.c1;

public class CodeBlock1 {
    public static void main(String[] args) {

        Movie movie = new Movie("你好 ");
        Movie movie1= new Movie("nierv", 80);

    }

}


class Movie{
    private String name;
    private double price;
    private String director;




    {
        System.out.println("电影开始");
        System.out.println("热舞厄尔始");
        System.out.println("电 围绕 ");
    };

    public Movie(String name) {
        System.out.println("Move(String name) 调用");
//        System.out.println("电影开始");
//        System.out.println("热舞厄尔始");
//        System.out.println("电 围绕 ");
        this.name =name;
    }

    public Movie(String name, double price) {
//        System.out.println("电影开始");
//        System.out.println("热舞厄尔始");
//        System.out.println("电 围绕 ");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
//        System.out.println("电影开始");
//        System.out.println("热舞厄尔始");
//        System.out.println("电 围绕 ");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}