package com.xjl.homework;

import org.junit.jupiter.api.Test;

import java.io.*;

public class h1 {
    public static void main(String[] args) {

    }
    @Test
    public void create1(){
        String filePath = "e:\\mytemp";
        File file = new File(filePath);
        if(file.exists()){
            System.out.println("目录已经创建");
        }else{
            file.mkdirs();
            System.out.println("创建目录成功");
        }
    }



@Test
    public void create(){
        String filePath = "e:\\mytemp\\hello.txt";
        File file = new File(filePath);

        if(file.exists()){
            System.out.println("文件已经存在");
        }else{
            try {
                file.createNewFile();
                System.out.println("创建文件成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
                bufferedWriter.write("你好");
                bufferedWriter.close();


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
