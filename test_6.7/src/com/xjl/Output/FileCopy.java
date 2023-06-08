package com.xjl.Output;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {


//完成拷贝  将e:\\C.jpg 拷贝到 d:\\

        String srcFilePath ="e:\\\\C.jpg ";
        String destFilePath ="d:\\\\C.jpg ";

        FileInputStream fileInputStream= null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
           fileOutputStream = new FileOutputStream(destFilePath);


            //定义字节数组提高效率
            byte[] buf = new byte[1024];
            int readLen = 0;
            while((readLen = fileInputStream.read(buf)) != -1){
                //边读边写
                fileOutputStream.write(buf,0,readLen);  //一定要这个方法
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fileInputStream != null){
                    fileInputStream.close();
                }
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

