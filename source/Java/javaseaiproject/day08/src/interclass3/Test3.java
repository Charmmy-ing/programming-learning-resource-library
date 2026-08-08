package interclass3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        //需求创建一个登录窗口，只有一个登录按钮
        JFrame win = new JFrame("登录窗口");
        win.setSize(300, 200);
        win.setVisible(true);
        //设置窗口布局
        win.setLayout(null);
        //添加登录按钮
        JButton loginBtn = new JButton("登录");
        //设置登录按钮位置
        JPanel panel = new JPanel();
        panel.add(loginBtn);
        win.add(panel);
        //设置面板位置
        panel.setBounds(100, 100, 100, 30);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //java必须给按钮添加事件监听器，才能响应事件
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("登录按钮被点击了");
            }
        });

    }

}

