package com.xjl.network.homework.h3;

import com.xjl.network.upload.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        //1 设置服务器 监听端口
        ServerSocket serverSocket = new ServerSocket(9999);

        System.out.println("服务端 在9999 端口监听 等待下载文件");
        //2 等待客户连接
        Socket socket = serverSocket.accept();

        //3 读取客户端要下载的文件名
        InputStream inputStream = socket.getInputStream();

        byte[] b =new byte[1024];
        int len = 0;
        String downFileName = "";
        while((len = inputStream.read(b))!= -1){
            downFileName += new String(b,0,len);
        }
        System.out.println("客户要下载" + downFileName);

        // 4 确定要返回的文件
        String resFileName = "";
        if("高山流水".equals(downFileName)){
            resFileName = "src\\高山流水.mp3";
        }else{
            resFileName = "src\\无名.mp3";
        }


        //5. 创建输入流 读取服务端的文件

        BufferedInputStream bis=
                new BufferedInputStream(new FileInputStream(resFileName));

        //6. 使用工具类 读取文件到一个 字节数组中
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //7 得到和Socket 关联的输出流
        BufferedOutputStream bos =
                new BufferedOutputStream(socket.getOutputStream());
        // 8 写入数据通道  返回客户端
        bos.write(bytes);
        socket.shutdownOutput(); // 结束表示

        // 9 关闭流
        bis.close();
        bos.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出");


    }
}
