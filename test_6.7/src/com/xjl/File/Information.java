package com.xjl.File;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.jupiter.api.Test;

import java.io.File;

public class Information {
    public static void main(String[] args) {

    }

    @Test

    public void info(){
        //先创建文件对象
        File file = new File("e:\\news1.txt");
        // 调用相应方法
        System.out.println("文件名字" +file.getName());

        System.out.println("文件绝对路径"  + file.getAbsolutePath());

        System.out.println("文件父级目录" + file.getParent());

        System.out.println("文件大小 按照字节计算"+ file.length());

        System.out.println("判断文件是否存在"+ file.exists());

        System.out.println("判断是不是一个文件" + file.isFile());

        System.out.println("判断是不是一个目录" + file.isDirectory());

    }

}
