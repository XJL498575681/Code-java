package com.xjl.homework;

import java.io.*;

public class h2 {
    public static void main(String[] args) throws IOException {

//        String filePath = "e:\\kkss.txt";
//   //     BufferedReader bufferedReader = null;
//        String line = " ";
//        int lineNum = 0;
//        try {
//            bufferedReader = new BufferedReader(new FileReader(filePath));
//            while((line = bufferedReader.readLine()) != null){
//                System.out.println(++lineNum +line);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if(bufferedReader != null){
//                    bufferedReader.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        String filePath = "e:\\kkss.txt";
        int lineNum = 0;
        String line = " ";
        BufferedReader bufferedReader = null;

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath),"gbk");
             bufferedReader = new BufferedReader(inputStreamReader);
            while((line = bufferedReader.readLine())!= null){
                System.out.println(++lineNum +line);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }

    }
}
