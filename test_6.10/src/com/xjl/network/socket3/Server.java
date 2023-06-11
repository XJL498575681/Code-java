package com.xjl.network.socket3;

import com.xjl.network.upload.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws  Exception{

        // 监听工作
        ServerSocket serverSocket = new ServerSocket(7777);
        System.out.println("服务器 在端口 7777 监听");
        // 接受socket
        Socket socket = serverSocket.accept();
        System.out.println("服务端" + socket.getClass());

        //创建读入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);


        //将数组 写入到 指定路径 得到文件
        String path = "src\\k.jpg";
        BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream(path));

        bos.write(bytes);
        bos.close();


        // 向客户端发送 收到图片
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        br.write("我是 server 已收到图片");
//        br.newLine();
//
        br.flush();//将内容刷新到 数据通道
        socket.shutdownOutput();

        br.close();




        //关闭流
        bis.close();
        socket.close();
        serverSocket.close();



    }
}
