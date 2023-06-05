package com.xjl.generic.Homework;

import org.junit.jupiter.api.Test;

import java.util.List;

public class h1 {
    public static void main(String[] args) {


    }

    @Test
    public void test(){

        //指定DAO的泛型T是 User_
        DAO<User_> user_dao = new DAO<>();

        user_dao.save("1",new User_(1,18,"jack"));
        user_dao.save("2",new User_(2,14,"lucy"));

        List<User_> list = user_dao.list();

        System.out.println(list );

        user_dao.update("1",new User_(2,37,"jack"));

        user_dao.delete("2");

        List<User_> list1 = user_dao.list();

        System.out.println(list1);


    }
}


