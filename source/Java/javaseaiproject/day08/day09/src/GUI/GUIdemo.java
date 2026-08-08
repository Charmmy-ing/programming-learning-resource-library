package GUI;

import javax.swing.*;

public class GUIdemo {
    public static void main(String[] args) {
        //Swing编程
        //创建一个窗口，有一个登录按钮
        // 给我每一步的注解
        JFrame frame = new JFrame("登录窗口");
        //添加桌布, 可以自适应大小
        JPanel panel = new JPanel();
        frame.add(panel);
//关闭窗口
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);

        //登录按钮
       JButton jB=new JButton("登录");
       jB.setBounds(100,100,100,50);
       //加到桌布上上
       panel.add(jB);
       //显示窗口
        frame.setVisible(true);







    }
}
