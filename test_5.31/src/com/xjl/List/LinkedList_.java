package com.xjl.List;

import java.util.concurrent.atomic.AtomicLong;

public class LinkedList_ {
    public static void main(String[] args) {

        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node lucy = new Node("lucy");
        Node jjj = new Node("王八");


        jack.next = tom;
        tom.next = jjj;
        jjj.next = lucy;


        lucy.pre = jjj;
        tom.pre = jack;
        jjj.pre = tom;

        Node first = jack;  //头结点
        Node last = lucy;   //尾节点


        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        System.out.println();

        while(true){
            if(last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }


        //添加一个



    }
}


class Node{
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object name){
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name =" + item ;
    }
}