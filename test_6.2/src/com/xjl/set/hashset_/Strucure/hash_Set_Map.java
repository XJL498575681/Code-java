package com.xjl.set.hashset_.Strucure;


//数组加链表  存储高效
//hashset = hashmap  底层
public class hash_Set_Map {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        //创建数组   Node[]数组 称为变为  表
        Node[] table = new Node[16];

        Node john = new Node("john", null);
        table[2] = john;

        Node jack = new Node("jack", null);
        john.next = jack;

        Node rose = new Node("rose", null);
        jack.next = rose;


        Node lucy = new Node("lucy", null);
        table[3] = lucy;

        System.out.println(table);


    }
}

class Node{
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}