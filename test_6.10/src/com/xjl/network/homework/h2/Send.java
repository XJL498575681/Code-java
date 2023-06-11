package com.xjl.network.homework.h2;


import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws IOException {
        //创建  datagramSocket  在9998 接受数据
        DatagramSocket socket = new DatagramSocket(9998);


        // 将要发送的数据包装到packet

        Scanner scanner = new Scanner(System.in);
        System.out.println("你的问题是什么");
        String question = scanner.next();

        byte[] bytes = question.getBytes();
        DatagramPacket packet =
                new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.1.11"), 9999);

        socket.send(packet);




        //准备接受
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);


        //接受后进行拆封
        int len = packet.getLength();
        bytes = packet.getData();
        String s = new String(bytes,0,len);
        System.out.println(s);


        socket.close();



    }
}
