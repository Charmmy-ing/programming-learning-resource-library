package com.Charmmy.demo3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


public class UDPdemo2 {
    public static void main(String[] args) throws Exception {
        //发送端多发多收
        //完成UDP通信
        //1.创建发送端
        DatagramSocket socket = new DatagramSocket();
        System.out.println("发送端启动");
        //发送端多发多收
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的内容");
            //2.创建发送数据的字节数组和内容
            byte[] buffer = sc.nextLine().getBytes();
            if (sc.nextLine().equals("exit")) {
                break;
            }
            //发送的数据，发送的长度，目标IP地址，目标端口
            DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(), 8080);
            //发送数据
            socket.send(datagramPacket);
        }


    }
}
