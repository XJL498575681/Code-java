package com.xjl.Map_.HashMap.introduce;

import java.util.HashMap;
import java.util.Map;

public class m1 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("no1","haha");
        map.put("no2","xixi");
        map.put("no1","xxxx");//相同key  还是hash值  确定索引位置  等价于替换
        map.put("no3","xxxx");//value 可以重复
        map.put("null","xxxx");
        map.put("12334","yyyy"); // key 只可以一次   value 相当于替换

        map.put("no4","null");// value 无数次
        map.put("no5","null"); // value 无数次


        map.put(new Object(),"小猫");
        map.put(1,"dede");
        System.out.println(map);


       // remove:根据键删除映射关系

        map.remove(null);

       // get:根据键获取值
        System.out.println(map.get("no1"));
       // size:获取元素个数
        System.out.println(map.size());

       // isEmpty:判断个数是否为0
        System.out.println(map.isEmpty());
        // clear:清除
    //    map.clear();
        System.out.println(map);
      //  containsKey:查找键是否存在
        System.out.println(map.containsKey("12334"));

        //System.out.println(map.get("no1"));  //一一对应关系
    }
}
