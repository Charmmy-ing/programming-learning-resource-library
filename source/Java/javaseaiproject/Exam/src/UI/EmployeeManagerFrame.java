package UI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * WXG公司人事管理系统 - 员工管理界面（颜色修复版）
 * 修复说明：显式设置所有文字前景色，避免系统主题覆盖导致“字色=背景色”
 */
public class EmployeeManagerFrame extends JFrame {

    // ================= 1. UI 组件 =================
    private DefaultTableModel tableModel;
    private JTable employeeTable;
    private JTextField searchField;
    private JTextField nameField, deptField, positionField, phoneField;
    private JButton btnAdd, btnSave, btnCancel, btnDelete, btnSearch, btnRefresh;

    // ================= 2. 数据存储 =================
    private final List<Employee> employeeList = new ArrayList<>();
    private int selectedEmployeeId = -1;

    // 全局颜色常量（方便统一调整）
    private static final Color BG_MAIN = new Color(248, 248, 248);
    private static final Color BG_PANEL = Color.WHITE;
    private static final Color TEXT_DARK = new Color(40, 40, 40);
    private static final Color TEXT_GRAY = new Color(100, 100, 100);
    private static final Color BORDER_LIGHT = new Color(210, 210, 210);
    private static final Color BTN_PRIMARY_BG = new Color(45, 45, 45);
    private static final Color BTN_SECOND_BG = new Color(235, 235, 235);

    public EmployeeManagerFrame() {
        initUI();
        loadMockData();
        setupEvents();
    }

    private void initUI() {
        setTitle("WXG 公司人事管理系统");
        setSize(960, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(BG_MAIN);

        JPanel mainPanel = new JPanel(new BorderLayout(12, 12));
        mainPanel.setBackground(BG_MAIN);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));

        mainPanel.add(createTopPanel(), BorderLayout.NORTH);
        mainPanel.add(createTablePanel(), BorderLayout.CENTER);
        mainPanel.add(createFormPanel(), BorderLayout.SOUTH);

        add(mainPanel);
    }

    private JPanel createTopPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 12, 8));
        panel.setBackground(BG_PANEL);
        panel.setBorder(BorderFactory.createLineBorder(BORDER_LIGHT));
        panel.setPreferredSize(new Dimension(900, 52));

        JLabel lblSearch = new JLabel("快速检索：");
        lblSearch.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
        lblSearch.setForeground(TEXT_GRAY);

        searchField = new JTextField(22);
        searchField.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
        searchField.setForeground(TEXT_DARK); // ✅ 强制深色字
        searchField.setBackground(Color.WHITE);
        searchField.setBorder(BorderFactory.createLineBorder(BORDER_LIGHT));

        btnSearch = createButton("🔍 搜索", BTN_PRIMARY_BG, Color.WHITE);
        btnRefresh = createButton("🔄 刷新", BTN_SECOND_BG, TEXT_DARK);
        btnAdd = createButton("➕ 新增员工", BTN_PRIMARY_BG, Color.WHITE);

        panel.add(lblSearch);
        panel.add(searchField);
        panel.add(Box.createHorizontalStrut(10));
        panel.add(btnSearch);
        panel.add(btnRefresh);
        panel.add(Box.createHorizontalStrut(10));
        panel.add(btnAdd);
        return panel;
    }

    private JPanel createTablePanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(BG_PANEL);
        panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(BORDER_LIGHT),
                "员工列表", 0, 0, new Font("Microsoft YaHei", Font.BOLD, 14), TEXT_GRAY));

        String[] columns = {"工号", "姓名", "部门", "职位", "联系电话"};
        tableModel = new DefaultTableModel(columns, 0) {
            @Override public boolean isCellEditable(int row, int column) { return false; }
        };
        employeeTable = new JTable(tableModel);
        employeeTable.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
        employeeTable.setForeground(TEXT_DARK); // ✅ 表格文字强制深色
        employeeTable.setSelectionBackground(new Color(200, 220, 240));
        employeeTable.setSelectionForeground(TEXT_DARK);
        employeeTable.setGridColor(new Color(235, 235, 235));
        employeeTable.setIntercellSpacing(new Dimension(0, 0));

        JTableHeader header = employeeTable.getTableHeader();
        header.setFont(new Font("Microsoft YaHei", Font.BOLD, 13));
        header.setBackground(new Color(50, 50, 50));
        header.setForeground(Color.WHITE);
        header.setPreferredSize(new Dimension(header.getWidth(), 36));

        // 列宽
        employeeTable.getColumnModel().getColumn(0).setPreferredWidth(60);
        employeeTable.getColumnModel().getColumn(1).setPreferredWidth(90);
        employeeTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        employeeTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        employeeTable.getColumnModel().getColumn(4).setPreferredWidth(140);

        JScrollPane scrollPane = new JScrollPane(employeeTable);
        scrollPane.setBorder(null);
        panel.add(scrollPane, BorderLayout.CENTER);
        return panel;
    }

    private JPanel createFormPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(BG_PANEL);
        panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(BORDER_LIGHT),
                "员工信息录入 / 编辑", 0, 0, new Font("Microsoft YaHei", Font.BOLD, 14), TEXT_GRAY));

        JPanel formInner = new JPanel(new GridLayout(2, 4, 20, 15));
        formInner.setBackground(BG_PANEL);
        formInner.setBorder(BorderFactory.createEmptyBorder(12, 18, 12, 18));

        nameField = createInputField("姓名：", formInner);
        deptField = createInputField("部门：", formInner);
        positionField = createInputField("职位：", formInner);
        phoneField = createInputField("电话：", formInner);

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 12, 0));
        btnPanel.setBackground(BG_PANEL);
        btnSave = createButton("💾 保存", new Color(40, 120, 180), Color.WHITE);
        btnCancel = createButton("🗑 取消", BTN_SECOND_BG, TEXT_DARK);
        btnDelete = createButton("❌ 删除", new Color(180, 60, 60), Color.WHITE);
        btnPanel.add(btnSave);
        btnPanel.add(btnCancel);
        btnPanel.add(btnDelete);

        JPanel layoutPanel = new JPanel(new BorderLayout());
        layoutPanel.setBackground(BG_PANEL);
        layoutPanel.add(formInner, BorderLayout.CENTER);
        layoutPanel.add(btnPanel, BorderLayout.SOUTH);
        panel.add(layoutPanel);
        return panel;
    }

    private JButton createButton(String text, Color bg, Color fg) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Microsoft YaHei", Font.BOLD, 13));
        btn.setBackground(bg);
        btn.setForeground(fg);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn.setPreferredSize(new Dimension(105, 34));
        return btn;
    }

    private JTextField createInputField(String labelText, JPanel container) {
        JLabel lbl = new JLabel(labelText);
        lbl.setFont(new Font("Microsoft YaHei", Font.PLAIN, 14));
        lbl.setForeground(TEXT_GRAY);
        container.add(lbl);

        JTextField field = new JTextField();
        field.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13));
        field.setBackground(Color.WHITE);
        field.setForeground(TEXT_DARK); // ✅ 核心修复：强制深色字体
        field.setBorder(BorderFactory.createLineBorder(BORDER_LIGHT));
        container.add(field);
        return field;
    }

    // ================= 业务逻辑 =================

    private void loadMockData() {
        String[] depts = {"技术部", "人事部", "财务部", "市场部", "行政部"};
        String[] positions = {"工程师", "专员", "经理", "主管", "助理"};
        String[] names = {"张三", "李四", "王五", "赵六", "孙七", "周八", "吴九", "郑十",
                "钱一一", "刘二二", "陈三三", "杨四四", "黄五五", "朱六六", "林七七", "何八八", "高九九", "罗十十", "马一一", "梁二二"};

        for (int i = 1; i <= 20; i++) {
            employeeList.add(new Employee(i, names[i-1], depts[i % 5], positions[i % 5], "138" + String.format("%08d", i * 1000 + i)));
        }
        refreshTable();
    }

    private void refreshTable() {
        tableModel.setRowCount(0);
        String keyword = searchField.getText().trim().toLowerCase();
        for (Employee emp : employeeList) {
            if (keyword.isEmpty() ||
                    emp.getName().contains(keyword) ||
                    emp.getDept().contains(keyword) ||
                    emp.getPosition().contains(keyword)) {
                tableModel.addRow(new Object[]{emp.getId(), emp.getName(), emp.getDept(), emp.getPosition(), emp.getPhone()});
            }
        }
    }

    private void clearForm() {
        nameField.setText(""); deptField.setText(""); positionField.setText(""); phoneField.setText("");
        selectedEmployeeId = -1;
        employeeTable.clearSelection();
        btnSave.setText("💾 保存");
    }

    private void fillForm(Employee emp) {
        if (emp == null) return;
        nameField.setText(emp.getName());
        deptField.setText(emp.getDept());
        positionField.setText(emp.getPosition());
        phoneField.setText(emp.getPhone());
        selectedEmployeeId = emp.getId();
        btnSave.setText("💾 更新");
    }

    private void setupEvents() {
        btnAdd.addActionListener(e -> { clearForm(); nameField.requestFocus(); });
        btnSave.addActionListener(e -> {
            String name = nameField.getText().trim();
            String dept = deptField.getText().trim();
            String pos = positionField.getText().trim();
            String phone = phoneField.getText().trim();
            if (name.isEmpty() || dept.isEmpty() || phone.isEmpty()) {
                JOptionPane.showMessageDialog(this, "⚠ 姓名、部门、电话不能为空！", "提示", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (selectedEmployeeId == -1) {
                int newId = employeeList.isEmpty() ? 1 : employeeList.stream().mapToInt(Employee::getId).max().getAsInt() + 1;
                employeeList.add(new Employee(newId, name, dept, pos, phone));
            } else {
                for (Employee emp : employeeList) {
                    if (emp.getId() == selectedEmployeeId) {
                        emp.setName(name); emp.setDept(dept); emp.setPosition(pos); emp.setPhone(phone);
                        break;
                    }
                }
            }
            clearForm(); refreshTable();
        });
        btnDelete.addActionListener(e -> {
            if (selectedEmployeeId == -1) {
                JOptionPane.showMessageDialog(this, "⚠ 请先选中要删除的员工");
                return;
            }
            if (JOptionPane.showConfirmDialog(this, "确定删除该员工？", "确认", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                employeeList.removeIf(emp -> emp.getId() == selectedEmployeeId);
                clearForm(); refreshTable();
            }
        });
        btnCancel.addActionListener(e -> clearForm());
        btnSearch.addActionListener(e -> refreshTable());
        btnRefresh.addActionListener(e -> { searchField.setText(""); refreshTable(); });

        employeeTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int row = employeeTable.rowAtPoint(e.getPoint());
                if (row >= 0) {
                    employeeTable.setRowSelectionInterval(row, row);
                    int id = (int) tableModel.getValueAt(row, 0);
                    Employee emp = employeeList.stream().filter(emp1 -> emp1.getId() == id).findFirst().orElse(null);
                    fillForm(emp);
                }
            }
        });
    }

    public static void main(String[] args) {
        // ❌ 已移除 UIManager.setLookAndFeel()，避免系统主题覆盖自定义颜色导致“字色=背景色”
        SwingUtilities.invokeLater(() -> new EmployeeManagerFrame().setVisible(true));
    }
}

class Employee {
    private int id; private String name, dept, position, phone;
    public Employee(int id, String name, String dept, String position, String phone) {
        this.id = id; this.name = name; this.dept = dept; this.position = position; this.phone = phone;
    }
    public int getId() { return id; }
    public String getName() { return name; } public void setName(String n) { name = n; }
    public String getDept() { return dept; } public void setDept(String d) { dept = d; }
    public String getPosition() { return position; } public void setPosition(String p) { position = p; }
    public String getPhone() { return phone; } public void setPhone(String p) { phone = p; }
}
