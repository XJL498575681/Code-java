package com.xjl.network.homework.h1;


// 字符流


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

        OutputStream outputStream = socket.getOutputStream();

        System.out.println("客户端的" + socket.getClass());
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));


        //从键盘读取用户的问题
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String question = scanner.next();



        bufferedWriter.write(question);
        bufferedWriter.newLine();
        bufferedWriter.flush();


        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
       String s = bufferedReader.readLine();
        System.out.println(s);

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
