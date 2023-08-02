package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Register extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton registerButton;

    public Register() {
        setTitle("Register");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        panel.add(new JLabel("Username:"));
        usernameField = new JTextField();
        panel.add(usernameField);

        panel.add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        panel.add(new JLabel());
        registerButton = new JButton("Register");
        panel.add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] password = passwordField.getPassword();
                String hashedPassword = HashUtils.hashPassword(password);

                if (registerUser(username, hashedPassword)) {
                    JOptionPane.showMessageDialog(Register.this, "Registration Successful!");
                } else {
                    JOptionPane.showMessageDialog(Register.this, "Registration Failed.");
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    private boolean registerUser(String username, String hashedPassword) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
            writer.write(username + ":" + hashedPassword);
            writer.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
