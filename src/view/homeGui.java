package view;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class homeGui extends JFrame {

    private boolean isAdmin = false; // Mặc định là không có quyền Admin
    private DefaultTableModel tableModel; // Khai báo biến tableModel

    public homeGui() {
        super("Underthehood");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1080, 720);

        JPanel sidebar = new JPanel();
        sidebar.setBackground(new Color(40, 48, 87));
        sidebar.setPreferredSize(new Dimension(200, 720));

        JButton addButton = createSidebarButton("Thêm");
        JButton editButton = createSidebarButton("Sửa");
        JButton deleteButton = createSidebarButton("Xoá");
        JButton adminButton = createSidebarButton("Admin: No");
        JButton outButton = createSidebarButton("Log Out");

        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.add(Box.createVerticalGlue());
        sidebar.add(addButton);
        sidebar.add(editButton);
        sidebar.add(deleteButton);
        sidebar.add(adminButton);
        sidebar.add(outButton);
        sidebar.add(Box.createVerticalGlue());

        JTable table = new JTable();
        tableModel = new DefaultTableModel(
                new Object[][] {},
                new String[] { "ID", "Username", "Password", "Admin" });
        table.setModel(tableModel);

        try {
            BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                boolean userIsAdmin = parts.length > 3 && parts[3].equalsIgnoreCase("yes");
                tableModel.addRow(new Object[] { parts[0], parts[1], parts[2], userIsAdmin ? "Yes" : "No" });
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Áp dụng renderer tùy chỉnh cho các cột
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(new UneditableTableCellRenderer());
        }

        JScrollPane tableScrollPane = new JScrollPane(table);

        add(sidebar, BorderLayout.WEST);
        add(tableScrollPane, BorderLayout.CENTER);

        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isAdmin = !isAdmin;
                if (isAdmin) {
                    adminButton.setText("Admin: Yes");
                } else {
                    adminButton.setText("Admin: No");
                }
            }
        });

        outButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(homeGui.this, "Bạn có chắc muốn đăng xuất?",
                        "Xác nhận đăng xuất", JOptionPane.YES_NO_OPTION);

                if (choice == JOptionPane.YES_OPTION) {
                    dispose();

                    if (isAdmin) {
                        saveDataToFile();
                    }
                }
            }
        });

        setVisible(true);
    }

    private JButton createSidebarButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(40, 48, 87));
        button.setForeground(Color.WHITE);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setPreferredSize(new Dimension(100, 50));
        return button;
    }

    private void saveDataToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt"));

            for (int i = 0; i < tableModel.getRowCount(); i++) {
                for (int j = 0; j < tableModel.getColumnCount(); j++) {
                    writer.write(tableModel.getValueAt(i, j).toString());
                    if (j < tableModel.getColumnCount() - 1) {
                        writer.write(":");
                    }
                }
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class UneditableTableCellRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
                int row, int column) {
            Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row,
                    column);
            cellComponent.setEnabled(isAdmin); // Chỉ cho phép sửa khi có quyền Admin
            return cellComponent;
        }
    }
}
