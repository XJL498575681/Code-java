package com.xjl.network.socket3;

import com.xjl.network.upload.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws  Exception{
        Socket socket = new Socket(InetAddress.getLocalHost(), 7777);
        System.out.println("客户端" + socket.getClass());


        // 创建读取磁盘文件的输入流
        String path = "e:\\c.jpg";
        BufferedInputStream bis= new BufferedInputStream(new FileInputStream(path));


        //文件对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //创建socket的输出流          将文件传给服务器
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);

        bis.close();//
        socket.shutdownOutput();  //文件写入数据的结束标志


//        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        System.out.println(new String(br.readLine()));
//
//        br.close();

        //接受服务端的数据
        InputStream inputStream = socket.getInputStream();
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);


        //关闭流
        bos.close();
        socket.close();

    }
}
