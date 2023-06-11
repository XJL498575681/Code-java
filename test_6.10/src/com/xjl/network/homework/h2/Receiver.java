package com.xjl.network.homework.h2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Receiver {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket  接受数据
        DatagramSocket socket = new DatagramSocket(9999);
        //创建一个DatagramPacket
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);//此时还是一个空的

        // 没有数据发送到 端口的时候 就会进行阻塞等待
        // 调用 接受方法 通过网路传输到Packet 对象 进行填充

        System.out.println("接受端在等待数据");
        socket.receive(packet);

        //接受到packet  后进行拆装
        int len = packet.getLength();  //实际接受到的数据字节长度
        byte[] data = packet.getData();
        String s = new String(data,0,len);
        String answer = "";
        if("四大名著是什么".equals(s)){
            answer = "西游记 ++++=";
        }else{
            answer = " 什么 ？";
        }





        data = answer.getBytes();
        packet = new DatagramPacket
                (data,data.length, InetAddress.getByName("192.168.1.11"), 9998);

        socket.send(packet);




        //关闭流、
        socket.close();

    }
}
