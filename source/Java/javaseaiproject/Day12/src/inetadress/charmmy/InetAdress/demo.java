package inetadress.charmmy.InetAdress;

import java.net.InetAddress;
public class demo {
    public static void main(String[] args) {
        //认识InetAdress
        try {
            //获取本地主机的InetAddress
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress.getHostAddress());
            //获取指定主机的InetAddress
            inetAddress = InetAddress.getByName("www.bilili.com");
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress.getHostAddress());
            //判断本机能不能和某一个机器互通
            boolean reachable = inetAddress.isReachable(5000);
            System.out.println(reachable);

        } catch (Exception e) {
            e.printStackTrace();

        }


    }

}
