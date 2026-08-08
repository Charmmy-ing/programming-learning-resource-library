/*package GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;

public class ModernLogin extends JFrame {

    // ─── 颜色主题 ───
    private static final Color PRIMARY      = new Color(99, 102, 241);   // 靛蓝
    private static final Color PRIMARY_DARK = new Color(79, 70, 229);
    private static final Color BG_TOP       = new Color(141, 78, 221);   // 紫色渐变
    private static final Color BG_BOT       = new Color(59, 130, 246);   // 蓝色渐变
    private static final Color CARD_BG      = Color.WHITE;
    private static final Color TEXT_DARK    = new Color(31, 41, 55);
    private static final Color TEXT_GRAY    = new Color(107, 114, 128);
    private static final Color INPUT_BG     = new Color(243, 244, 246);
    private static final Color INPUT_BORDER = new Color(209, 213, 219);

    public ModernLogin() {
        setTitle("登录");
        setSize(420, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setUndecorated(true);               // 去掉默认标题栏

        // ─── 可拖拽窗口 ───
        enableDragging();

        add(new LoginPanel());
        setVisible(true);
    }

    /* ============================================================
     *  自定义拖拽（因为去掉了标题栏）
     * ============================================================ */
    private void enableDragging() {
        final int[] offset = {0, 0};
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                offset[0] = e.getX();
                offset[1] = e.getY();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                setLocation(getLocation().x + e.getX() - offset[0],
                        getLocation().y + e.getY() - offset[1]);
            }
        });
    }

    /* ============================================================
     *  主面板
     * ============================================================ */
    private class LoginPanel extends JPanel {

        LoginPanel() {
            setLayout(new GridBagLayout());
            setBorder(new EmptyBorder(0, 0, 0, 0));

            // 渐变背景
            setBackground(BG_TOP);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.insets = new Insets(0, 0, 0, 0);

            // 圆角卡片
            CardPanel card = new CardPanel();
            card.setLayout(new BorderLayout(0, 0));
            card.setBorder(new EmptyBorder(40, 36, 40, 36));

            // ── 顶部 Logo 区域 ──
            JPanel header = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
            header.setOpaque(false);
            header.setBorder(new EmptyBorder(0, 0, 28, 0));

            // 圆形图标
            JPanel iconCircle = new JPanel() {
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
                    // 渐变圆
                    GradientPaint gp = new GradientPaint(0, 0, PRIMARY, 0, 40, PRIMARY_DARK);
                    g2.setPaint(gp);
                    g2.fillOval(0, 0, 56, 56);
                    // 白色锁图标
                    g2.setColor(Color.WHITE);
                    g2.setStroke(new BasicStroke(2.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                    g2.drawRoundRect(16, 24, 24, 18, 4, 4);
                    g2.drawArc(19, 18, 18, 12, 180, 180);
                    g2.fillOval(25, 28, 6, 6);
                    g2.dispose();
                }
            };
            iconCircle.setPreferredSize(new Dimension(56, 56));
            iconCircle.setOpaque(false);
            header.add(iconCircle);

            // ── 标题 ──
            JLabel titleLabel = new JLabel("欢迎回来");
            titleLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
            titleLabel.setForeground(TEXT_DARK);
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

            JLabel subLabel = new JLabel("请登录您的账户以继续");
            subLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
            subLabel.setForeground(TEXT_GRAY);
            subLabel.setHorizontalAlignment(SwingConstants.CENTER);

            JPanel titlePanel = new JPanel(new BorderLayout(0, 6));
            titlePanel.setOpaque(false);
            titlePanel.add(titleLabel, BorderLayout.CENTER);
            titlePanel.add(subLabel, BorderLayout.SOUTH);
            titlePanel.setBorder(new EmptyBorder(12, 0, 28, 0));

            // ── 表单区域 ──
            JPanel formPanel = new JPanel();
            formPanel.setOpaque(false);
            formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));

            StyledTextField userField = new StyledTextField("用户名 / 邮箱");
            StyledPasswordField passField = new StyledPasswordField("密码");

            formPanel.add(userField);
            formPanel.add(Box.createVerticalStrut(16));
            formPanel.add(passField);

            // ── 记住我 & 忘记密码 ──
            JPanel optionsPanel = new JPanel(new BorderLayout());
            optionsPanel.setOpaque(false);
            optionsPanel.setBorder(new EmptyBorder(14, 0, 0, 0));

            StyledCheckBox rememberBox = new StyledCheckBox("记住我");
            HyperlinkLabel forgotLink = new HyperlinkLabel("忘记密码？");
            optionsPanel.add(rememberBox, BorderLayout.WEST);
            optionsPanel.add(forgotLink, BorderLayout.EAST);

            // ── 登录按钮 ──
            GradientButton loginBtn = new GradientButton("登 录");
            loginBtn.setBorder(new EmptyBorder(16, 0, 0, 0));

            // 登录事件
            loginBtn.addActionListener(e -> handleLogin(userField, passField));
            forgotLink.addActionListener(e -> JOptionPane.showMessageDialog(
                    ModernLogin.this, "请联系管理员重置密码", "提示", JOptionPane.INFORMATION_MESSAGE));

            // ── 底部注册提示 ──
            JPanel registerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 4, 0));
            registerPanel.setOpaque(false);
            registerPanel.setBorder(new EmptyBorder(20, 0, 0, 0));
            registerPanel.add(new JLabel("还没有账户？", new Font("Microsoft YaHei", Font.PLAIN, 13), TEXT_GRAY));
            HyperlinkLabel regLink = new HyperlinkLabel("立即注册");
            registerPanel.add(regLink);

            // ── 组装 ──
            card.add(header, BorderLayout.NORTH);

            JPanel centerPanel = new JPanel(new BorderLayout(0, 0));
            centerPanel.setOpaque(false);
            centerPanel.add(titlePanel, BorderLayout.NORTH);
            centerPanel.add(formPanel, BorderLayout.CENTER);
            centerPanel.add(optionsPanel, BorderLayout.SOUTH);
            card.add(centerPanel, BorderLayout.CENTER);

            JPanel bottomPanel = new JPanel(new BorderLayout(0, 0));
            bottomPanel.setOpaque(false);
            bottomPanel.add(loginBtn, BorderLayout.NORTH);
            bottomPanel.add(registerPanel, BorderLayout.SOUTH);
            card.add(bottomPanel, BorderLayout.SOUTH);

            gbc.gridx = 0;
            gbc.gridy = 0;
            // 卡片尺寸
            int cardW = 360, cardH = 440;
            card.setPreferredSize(new Dimension(cardW, cardH));
            add(card, gbc);
        }

        private void handleLogin(StyledTextField user, StyledPasswordField pass) {
            String username = user.getText().trim();
            String password = new String(pass.getPassword());

            if (username.isEmpty()) {
                user.setError("请输入用户名");
                return;
            }
            if (password.isEmpty()) {
                pass.setError("请输入密码");
                return;
            }
            // ── 模拟验证 ──
            if ("admin".equals(username) && "123456".equals(password)) {
                JOptionPane.showMessageDialog(ModernLogin.this,
                        "🎉 登录成功！欢迎 " + username,
                        "成功", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(ModernLogin.this,
                        "用户名或密码错误",
                        "登录失败", JOptionPane.ERROR_MESSAGE);
                pass.setError("密码不正确");
            }
        }
    }

    /* ============================================================
     *  圆角白色卡片
     * ============================================================ */
    private class CardPanel extends JPanel {
        private final int radius = 20;

        CardPanel() {
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // 阴影
            g2.setColor(new Color(0, 0, 0, 45));
            for (int i = 0; i < 12; i++) {
                float alpha = 1.0f - (i / 12.0f);
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha * 0.15f));
                g2.fill(new RoundRectangle2D.Float(
                        getWidth() - 370 + i, getHeight() - 450 + i,
                        getWidth() - 20, getHeight() - 20,
                        radius, radius));
            }
            g2.setComposite(AlphaComposite.SrcOver);

            // 白色卡片
            g2.setColor(CARD_BG);
            g2.fill(new RoundRectangle2D.Float(10, 10, getWidth() - 20, getHeight() - 20, radius, radius));
            g2.dispose();
        }
    }

    /* ============================================================
     *  自定义文本输入框
     * ============================================================ */
    private class StyledTextField extends JPanel {
        private final JTextField textField;
        private final JLabel iconLabel;
        private final JLabel placeholder;
        private final JLabel errorLabel;
        private boolean isFocused = false;
        private boolean hasError = false;
        private String errorText = "";

        StyledTextField(String placeholderText) {
            setOpaque(false);
            setLayout(new BorderLayout(0, 0));
            setBorder(new EmptyBorder(0, 0, 0, 0));

            // 图标区域
            iconLabel = new JLabel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                    g2.setColor(TEXT_GRAY);
                    g2.setStroke(new BasicStroke(1.8f));
                    // 用户图标
                    g2.drawOval(10, 4, 10, 10);
                    g2.drawArc(4, 16, 22, 12, 0, -180);
                    g2.dispose();
                }
            };
            iconLabel.setPreferredSize(new Dimension(36, 30));

            textField = new JTextField();
            textField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
            textField.setForeground(TEXT_DARK);
            textField.setBackground(INPUT_BG);
            textField.setBorder(null);
            textField.setOpaque(true);
            textField.setPreferredSize(new Dimension(0, 34));

            // 焦点监听
            textField.addFocusListener(new FocusAdapter() {
                public void focusGained(FocusEvent e) { isFocused = true; repaint(); }
                public void focusLost(FocusEvent e)   { isFocused = false; clearError(); repaint(); }
            });

            placeholder = new JLabel(placeholderText, SwingConstants.LEFT);
            placeholder.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
            placeholder.setForeground(TEXT_GRAY);
            placeholder.setBorder(new EmptyBorder(0, 10, 0, 0));

            // 点击 placeholder 聚焦
            placeholder.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) { textField.requestFocus(); }
            });

            textField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
                public void insertUpdate(javax.swing.event.DocumentEvent e) { updatePlaceholder(); }
                public void removeUpdate(javax.swing.event.DocumentEvent e) { updatePlaceholder(); }
                public void changedUpdate(javax.swing.event.DocumentEvent e) { updatePlaceholder(); }
            });

            errorLabel = new JLabel("");
            errorLabel.setFont(new Font("Microsoft YaHei", Font.PLAIN, 11));
            errorLabel.setForeground(new Color(239, 68, 68));
            errorLabel.setBorder(new EmptyBorder(4, 12, 0, 0));

            // 布局
            JPanel inputWrapper = new JPanel(new BorderLayout());
            inputWrapper.setBackground(INPUT_BG);
            inputWrapper.setBorder(new EmptyBorder(4, 4, 4, 4));
            inputWrapper.add(iconLabel, BorderLayout.WEST);
            inputWrapper.add(textField, BorderLayout.CENTER);

            add(inputWrapper, BorderLayout.CENTER);
            add(errorLabel, BorderLayout.SOUTH);
        }

        private void updatePlaceholder() {
            placeholder.setVisible(textField.getText().isEmpty());
        }

        void setError(String msg) {
            hasError = true;
            errorText = msg;
            errorLabel.setText("⚠ " + msg);
            repaint();
        }

        void clearError() {
            hasError = false;
            errorText = "";
            errorLabel.setText("");
            repaint();
        }

        String getText() { return textField.getText(); }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            Color borderColor = hasError ? new Color(239, 68, 68)
                    : isFocused ? PRIMARY
                    : INPUT_BORDER;
            int r = 10;
            int w = getWidth() - 2, h = getHeight() - 2;

            g2.setColor(borderColor);
            g2.setStroke(new BasicStroke(isFocused ? 2f : 1.5f));
            g2.draw(new RoundRectangle2D.Float(1, 1, w, h, r, r));
            g2.dispose();
        }
    }

    /* ============================================================
     *  自定义密码输入框
     * ============================================================ */
    private class StyledPasswordField extends StyledTextField {
        private final JPasswordField passField;
        private JToggleButton toggleBtn;

        StyledPasswordField(String placeholderText) {
            super(placeholderText);

            // 重新获取 textField 替换为密码框
            passField = new JPasswordField();
            passField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
            passField.setForeground(TEXT_DARK);
            passField.setBackground(INPUT_BG);
            passField.setBorder(null);
            passField.setOpaque(true);
            passField.setPreferredSize(new Dimension(0, 34));
            passField.setEchoChar('●');

            // 显示/隐藏密码按钮
            toggleBtn = new JToggleButton("👁") {
                {
                    setContentAreaFilled(false);
                    setBorderPainted(false);
                    setFocusPainted(false);
                    setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    setPreferredSize(new Dimension(30, 24));
                }
            };
            toggleBtn.addItemListener(e -> {
                passField.setEchoChar(toggleBtn.isSelected() ? (char)0 : '●');
            });

            // 替换
            remove(getComponent(0));
            JPanel inputWrapper = new JPanel(new BorderLayout());
            inputWrapper.setBackground(INPUT_BG);
            inputWrapper.setBorder(new EmptyBorder(4, 4, 4, 4));
            inputWrapper.add(getIcon(), BorderLayout.WEST);
            inputWrapper.add(passField, BorderLayout.CENTER);
            inputWrapper.add(toggleBtn, BorderLayout.EAST);
            add(inputWrapper, BorderLayout.CENTER);
            add(getErrorLabel(), BorderLayout.SOUTH);

            passField.addFocusListener(new FocusAdapter() {
                public void focusGained(FocusEvent e) { /* already handled */ }
                public void focusLost(FocusEvent e) { clearError(); }
            });
            passField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
                public void insertUpdate(javax.swing.event.DocumentEvent e) {}
                public void removeUpdate(javax.swing.event.DocumentEvent e) {}
                public void changedUpdate(javax.swing.event.DocumentEvent e) {}
            });
        }

        private Component getIcon() {
            return getComponents()[0] instanceof JPanel
                    ? ((JPanel) getComponent(0)).getComponent(0) : null;
        }

        private JLabel getErrorLabel() {
            return (JLabel) getComponent(1);
        }

        char[] getPassword() { return passField.getPassword(); }
    }

    /* ============================================================
     *  渐变按钮
     * ============================================================ */
    private class GradientButton extends JButton {
        private boolean isHover = false;

        GradientButton(String text) {
            super(text);
            setContentAreaFilled(false);
            setFocusPainted(false);
            setBorderPainted(false);
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
            setForeground(Color.WHITE);
            setPreferredSize(new Dimension(0, 46));

            addMouseListener(new MouseAdapter() {
                public void mouseEntered(MouseEvent e)  { isHover = true;  repaint(); }
                public void mouseExited(MouseEvent e)   { isHover = false; repaint(); }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int r = 12;
            if (isHover) {
                g2.setColor(new Color(79, 70, 229));
            } else {
                GradientPaint gp = new GradientPaint(0, 0, PRIMARY, getWidth(), 0, PRIMARY_DARK);
                g2.setPaint(gp);
            }
            g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), r, r));

            // 文字
            FontMetrics fm = g2.getFontMetrics();
            int x = (getWidth() - fm.stringWidth(getText())) / 2;
            int y = (getHeight() - fm.getHeight()) / 2 + fm.getAscent();
            g2.setColor(getForeground());
            g2.drawString(getText(), x, y);
            g2.dispose();
        }
    }

    /* ============================================================
     *  自定义复选框
     * ============================================================ */
    private class StyledCheckBox extends JCheckBox {
        StyledCheckBox(String text) {
            super(text);
            setFont(new Font("Microsoft YaHei", Font.PLAIN, 12));
            setForeground(TEXT_GRAY);
            setFocusPainted(false);
            setOpaque(false);
            setIcon(new CheckBoxIcon(false));
            setSelectedIcon(new CheckBoxIcon(true));
        }

        private class CheckBoxIcon implements Icon {
            private final boolean selected;

            CheckBoxIcon(boolean selected) { this.selected = selected; }

            public int getIconWidth()  { return 16; }
            public int getIconHeight() { return 16; }

            public void paintIcon(Component c, Graphics g, int x, int y) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                if (selected) {
                    g2.setColor(PRIMARY);
                    g2.fill(new RoundRectangle2D.Float(x, y, 16, 16, 4, 4));
                    g2.setColor(Color.WHITE);
                    g2.setStroke(new BasicStroke(2f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                    g2.drawLine(x + 4, y + 8, x + 7, y + 11);
                    g2.drawLine(x + 7, y + 11, x + 12, y + 5);
                } else {
                    g2.setColor(INPUT_BORDER);
                    g2.setStroke(new BasicStroke(1.5f));
                    g2.draw(new RoundRectangle2D.Float(x, y, 16, 16, 4, 4));
                }
                g2.dispose();
            }
        }
    }

    /* ============================================================
     *  超链接样式标签
     * ============================================================ */
    private class HyperlinkLabel extends JLabel {
        HyperlinkLabel(String text) {
            super(text);
            setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
            setForeground(PRIMARY);
            setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // 下划线
            FontMetrics fm = g.getFontMetrics();
            int y = getHeight() - 4;
            g.setColor(getForeground());
            g.drawLine(0, y, fm.stringWidth(getText()), y);
        }
    }

    /* ============================================================
     *  主入口
     * ============================================================ */
    public static void main(String[] args) {
        // 启用系统抗锯齿
        System.setProperty("sun.java2d.opengl", "true");

        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}
            new ModernLogin();
        });
    }
}
