package com.Charmmy.demo3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPserversdemo2 {
    public static void main(String[] args) throws Exception {
        //接收端
        System.out.println("接收端启动");
        //1.创建接收端
        DatagramSocket socket = new DatagramSocket(8080);
        //2.创建接收数据的字节数组和内容
        while (true) {
            byte[] buffer = new byte[1024];
            //3.创建接收数据的包
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            //4.接收数据，将数据存储到包中
            socket.receive(packet);
            String str = new String(buffer,0,packet.getLength());
            System.out.println(str);
            String  IP = packet.getAddress().getHostAddress();
            System.out.println("客户端IP地址："+IP);
            int port = packet.getPort();
            System.out.println("客户端端口："+port);
        }
    }
}
