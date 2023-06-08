package com.xjl.ChuLiClass.BufferedInOutStream;

import java.io.*;

public class copy_ {
    public static void main(String[] args) {

        String srcFilePath = "e:\\C.jpg";
        String destFilePath = "d:\\C.jpg";

        BufferedOutputStream bufferedOutputStream = null;
        BufferedInputStream bufferedInputStream = null;

        byte[] buf = new byte[1024];
        int readLen = 0;

        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));
            while((readLen = bufferedInputStream.read(buf))!= -1){
                bufferedOutputStream.write(buf,0,readLen);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedInputStream != null){
                    bufferedInputStream.close();
                }
                if(bufferedOutputStream != null){
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
