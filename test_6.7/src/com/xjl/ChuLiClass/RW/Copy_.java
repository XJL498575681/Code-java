package com.xjl.ChuLiClass.RW;

import java.io.*;

public class Copy_ {

    public static void main(String[] args) {
        String srcFilePath = "e:\\kk.txt";
        String destFilePath = "d:\\ll.txt";
//
//
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFilePath));
//
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));
//
//        String line ;
//
//        while((line = bufferedReader.readLine()) != null){
//           bufferedWriter.write(line);
//           bufferedWriter.newLine();
//        }
//        System.out.println("拷贝完毕");
//        bufferedReader.close();
//        bufferedWriter.close();

        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;

        String line;

        try {
            bufferedReader = new BufferedReader(new FileReader(srcFilePath));
            bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));
            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("拷贝完毕");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(bufferedReader != null){
                    bufferedReader.close();
                }
                if(bufferedWriter !=null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
