package com.xjl.network.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9999);

        System.out.println("服务端 在9999端口监听 等待连接");
        Socket socket= serverSocket.accept();

        System.out.println("服务端"+ socket.getClass());

        // 读取socket 数据
        InputStream inputStream = socket.getInputStream();

        //io读取
        byte[] buf = new byte[1024];
        int len = 0;
        while((len = inputStream.read(buf))!= -1){
            System.out.println(new String(buf,0,len ));
        }



        //回发数据
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("hello , client".getBytes());


        //设置结束标志
        socket.shutdownOutput();

        inputStream.close();
        outputStream.close();


        socket.close();
        serverSocket.close();



    }
}
