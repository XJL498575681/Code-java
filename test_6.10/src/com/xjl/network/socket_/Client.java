package com.xjl.network.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //连接本机的9999端口
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        System.out.println("客户端"+   socket.getClass());

        //得到 和 socket 对象关联的 输出流对象
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("hello server ".getBytes());

        //设置写入结束标志
        socket.shutdownOutput();


        InputStream inputStream = socket.getInputStream();

        byte[] buf = new byte[1024];
        int len = 0;
        while((len = inputStream.read(buf))!= -1){
            System.out.println(new String(buf,0,len));
        }
        //关闭流对象
        outputStream.close();
        socket.close();
        System.out.println("客户端关闭");
    }
}
