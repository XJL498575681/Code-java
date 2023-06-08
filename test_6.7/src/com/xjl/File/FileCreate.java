package com.xjl.File;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }
    //方式一
@Test
    public void create01(){
        String filePath = "e:\\news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    // v/   方式2new File(File parent,String child)//根据父目录文件+子路径构建
    public void create02(){
        File filee = new File("e:\\");
        String  fileName = "news2.txt";
        File file1 = new File(filee, fileName);
        try {
            file1.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式3 new File(String parent, String child)//根据父目录+子路径构建

    @Test
    public void create03(){
        String parentPath = "e:\\";
        String fileName  = "news3.txt";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
