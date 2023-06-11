package com.xjl.network.homework.h1;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端 在8888 端口等待");

        Socket socket = serverSocket.accept();


        System.out.println("服务器的" + socket.getClass());
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String s= bufferedReader.readLine();
        String answer = "";
        if("name".equals(s)){
            answer = "我是+++";
        }else if("hobby".equals(s)){
            answer = "java ";
        }else{
            answer = "你在说什么 ";
        }


        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write(answer);
        bufferedWriter.newLine();
        bufferedWriter.flush();


        bufferedReader.close();
        bufferedWriter.close();
        socket.close();



    }
}
