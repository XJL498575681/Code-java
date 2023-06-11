package com.xjl.network.homework.h3;

import com.xjl.network.upload.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //1.    输入指定下载文件
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要下载的文件");
        String downLoadFileName = scanner.next();

        //  2. 客户端 连接 服务端  准备发送
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);


        // 3 获取和Socket 关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downLoadFileName.getBytes());
        //设置写入结束标志
        socket.shutdownOutput();


        //4  读取服务端返回的文件 字节数据
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //5. 输出流 将bytes 写入到磁盘文件
        String path = "e:\\" + downLoadFileName + ".mp3";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
        bos.write(bytes);

        //关闭流
        bos.close();
        bis.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端下载完毕");


    }
}
