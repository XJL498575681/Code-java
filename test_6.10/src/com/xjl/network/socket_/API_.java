package com.xjl.network.socket_;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机InetAddress
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        //根据主机名 获取InetAddress
        InetAddress byName = InetAddress.getByName("DESKTOP-KJKSQFK");
        System.out.println(byName);
        //根据域名返回 InetAddress
        InetAddress byName1 = InetAddress.getByName("www.baidu.com");
        System.out.println(byName1);
        //根据InetAddress 返回对应的IP地址
        String hostAddress = byName1.getHostAddress();
        System.out.println(hostAddress);
        //根据InetAddress 获取对应的主机名 或者域名
        String hostName = byName1.getHostName();
        System.out.println(hostName);
    }
}
