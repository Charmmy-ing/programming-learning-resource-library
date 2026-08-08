package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        // 1. 窗口基础设置
        setTitle("WXG 公司人事管理系统 - 登录");
        setSize(420, 330);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 居中显示

        // 2. 主面板（浅灰背景）
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(245, 245, 245));

        // 3. 标题
        JLabel titleLabel = new JLabel("WXG 人事管理系统");
        titleLabel.setFont(new Font("微软雅黑", Font.BOLD, 22));
        titleLabel.setForeground(new Color(30, 30, 30)); // 近黑色
        titleLabel.setBounds(90, 30, 250, 35);
        mainPanel.add(titleLabel);

        // 4. 装饰分隔线（增强灰白黑层次感）
        JSeparator line = new JSeparator();
        line.setBounds(40, 70, 340, 2);
        line.setForeground(new Color(200, 200, 200));
        mainPanel.add(line);

        // 5. 用户名标签 & 输入框
        JLabel userLabel = new JLabel("用 户 名：");
        userLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        userLabel.setForeground(new Color(90, 90, 90)); // 深灰
        userLabel.setBounds(70, 90, 80, 30);
        mainPanel.add(userLabel);

        JTextField userField = new JTextField();
        userField.setBounds(160, 90, 180, 30);
        userField.setBackground(Color.WHITE);
        userField.setBorder(BorderFactory.createLineBorder(new Color(180, 180, 180)));
        mainPanel.add(userField);

        // 6. 密码标签 & 输入框
        JLabel passLabel = new JLabel("密    码：");
        passLabel.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        passLabel.setForeground(new Color(90, 90, 90));
        passLabel.setBounds(70, 140, 80, 30);
        mainPanel.add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(160, 140, 180, 30);
        passField.setBackground(Color.WHITE);
        passField.setBorder(BorderFactory.createLineBorder(new Color(180, 180, 180)));
        mainPanel.add(passField);

        // 7. 提示标签
        JLabel tipLabel = new JLabel("");
        tipLabel.setFont(new Font("微软雅黑", Font.PLAIN, 13));
        tipLabel.setBounds(120, 180, 220, 25);
        mainPanel.add(tipLabel);

        // 8. 登录按钮（深灰/黑色）
        JButton loginButton = new JButton("登 录");
        loginButton.setFont(new Font("微软雅黑", Font.BOLD, 14));
        loginButton.setBackground(new Color(40, 40, 40));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBounds(100, 220, 100, 35);
        loginButton.setFocusPainted(false);
        loginButton.setBorderPainted(false);
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mainPanel.add(loginButton);

        // 9. 重置按钮（浅灰色）
        JButton resetButton = new JButton("重 置");
        resetButton.setFont(new Font("微软雅黑", Font.PLAIN, 14));
        resetButton.setBackground(new Color(225, 225, 225));
        resetButton.setForeground(new Color(60, 60, 60));
        resetButton.setBounds(220, 220, 100, 35);
        resetButton.setFocusPainted(false);
        resetButton.setBorderPainted(false);
        resetButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        mainPanel.add(resetButton);

        // ================= 事件监听 =================

        // 登录按钮
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText().trim();
                String password = new String(passField.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    tipLabel.setText("⚠ 请输入用户名和密码");
                    tipLabel.setForeground(new Color(180, 50, 50));
                    return;
                }

                // 模拟验证（实际项目需连接数据库）
                if (username.equals("admin") && password.equals("123456")) {
                    tipLabel.setText("✓ 登录成功，欢迎进入系统");
                    tipLabel.setForeground(new Color(30, 100, 30));
                    // 此处可跳转主界面：new MainFrame().setVisible(true); dispose();
                } else {
                    tipLabel.setText("✗ 用户名或密码错误");
                    tipLabel.setForeground(new Color(180, 50, 50));
                }
            }
        });

        // 重置按钮
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userField.setText("");
                passField.setText("");
                tipLabel.setText("");
                userField.requestFocus(); // 光标回到用户名框
            }
        });

        // 将面板加入窗口
        add(mainPanel);
    }

    // 程序入口
    public static void main(String[] args) {
        // 使用系统默认外观，界面更现代
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 在事件分发线程中启动GUI（标准写法）
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}
