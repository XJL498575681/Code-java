package com.xjl.Map_.HashTable.Source;

import java.util.Hashtable;

public class Source1 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Hashtable table = new Hashtable();//ok table: "”
        table.put("john",100); //ok table:"”
        //table.put(null,100);//异常 NullPointerException
        // table.put("john" , null);//异常NullPointerExceptiontable.
        table.put("lucy ",100);//ok
        table.put("lic",100); //ok
        table.put("lic",88);// 替换
        table.put("hello1",88);//
        table.put("hello2",88);//
        table.put("hello3",88);//
        table.put("hello4",88);//
        table.put("hello5",88);//
        table.put("hello7",88);//
        table.put("hello6",88);//
        table.put("hello8",88);//
        System.out.println(table);

        /*
  1简单说明一下Hashtable的底层
  2。底层有数组 Hashtable$Entry[]初始化大小为11
  3．临界值threshold 8 =11 *0.75
  4。扩容:按照自己的扩容机制来进行即可.

         */
    }
}
