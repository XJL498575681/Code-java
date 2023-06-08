package com.xjl.File;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

public class Directory {
    public static void main(String[] args) {

    }
    @Test
    public void m1(){
            String filePath = "e:\\news1.txt";
        File file = new File(filePath);
        if(file.exists()){
           if( file.delete()){
               System.out.println("删除成功");
           }else{
               System.out.println("删除失败");
           }

        }else{
            System.out.println("不存在");
        }
    }

    @Test
    //目录被当做一个特殊的文件
    public void m2(){
        String filePath = "e:\\demo02";
        File file = new File(filePath);
        if(file.exists()){
            if( file.delete()){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }

        }else{
            System.out.println("目录不存在");
        }
    }

@Test
    //目录
    public void m3(){
        String DirectoryPath = "e:\\demo\\a\\b\\c";
        File file = new File(DirectoryPath );
        if(file.exists()){
            if( file.exists()){
                System.out.println("文件存在");
            }
        }else{
          if(file.mkdirs()){
              System.out.println("目录创建成功");
          }else{
              System.out.println("文件创建失败");
          }
        }


    }
}

