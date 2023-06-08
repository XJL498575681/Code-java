package com.xjl.ChuLiClass.moshi;

public class BufferReader_ extends Reader_{

    private Reader_ reader_;  //属性是父类 Reader_ 类型

    public BufferReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    @Override
    public void read() {
        reader_.read();
    }


    public void read(int num){
        for (int i = 0; i < num; i++) {
            reader_.read();
        }
    }



    //    public void readFile(){  // 封装一层
//        reader_.readFile();
//    }
//
//    //使得可以多次读取文件    扩展功能  更加灵活 进行批量处理
//    public void readFile(int num){
//        for (int i = 0; i < num; i++) {
//            reader_.readFile();
//        }
//    }
//
//    public void readString (int num){
//        for (int i = 0; i < num; i++) {
//            reader_.readString();
//        }
//    }

}
