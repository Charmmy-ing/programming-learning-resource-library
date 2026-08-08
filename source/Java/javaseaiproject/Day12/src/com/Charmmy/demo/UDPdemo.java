package com.Charmmy.demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPdemo {
    public static void main(String[] args) throws Exception {
        //完成UDP通信
        //1.创建发送端
        System.out.println("发送端启动");
        DatagramSocket socket = new DatagramSocket();
        //2.创建发送数据的字节数组和内容
        byte[] buffer = "hello".getBytes();
        //发送的数据，发送的长度，目标IP地址，目标端口
        DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8080);
        //发送数据
        socket.send(datagramPacket);
        //3.关闭发送端
        socket.close();


    }
}
