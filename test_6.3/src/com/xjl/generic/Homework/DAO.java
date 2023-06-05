package com.xjl.generic.Homework;

import java.util.*;

public class DAO <T>{

    private Map<String ,T > map = new HashMap<>();

    public T get(String id){
        return map.get(id);
    }

    public void update (String id,T entity){
        map.put(id,entity);
    }

    public List<T> list(){
        //创建Arraylist
        List<T> list = new ArrayList<>();

        Set<String> keySet = map.keySet();

        for (String  key :keySet) {
            list.add(get(key));
        }


        return list;
    }
    public void delete (String id){
        map.remove(id);
    }

    public void save(String id,T entity){
        map.put(id,entity);
    }

}
