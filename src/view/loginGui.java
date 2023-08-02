/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import view.registerGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import controller.HashUtils;
import test.Login;

/**
 *
 * @author ADMIN
 */
public class loginGui extends javax.swing.JFrame {

        /**
         * Creates new form LoginHihi
         */
        public loginGui() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                mainPanel = new javax.swing.JPanel();
                loginPanel = new javax.swing.JPanel();
                mainAppPanel = new javax.swing.JPanel();
                mainLoginPanel = new javax.swing.JPanel();
                loginTitle = new javax.swing.JLabel();
                username = new java.awt.TextField();
                password = new javax.swing.JPasswordField();
                userText = new javax.swing.JLabel();
                passText = new javax.swing.JLabel();
                mainTitle = new javax.swing.JLabel();
                loginButton = new javax.swing.JButton();
                questionText = new javax.swing.JLabel();
                registerButton = new javax.swing.JButton();
                avataPanel = new javax.swing.JPanel();
                socialQuestion = new javax.swing.JLabel();
                fbButton = new javax.swing.JButton();
                gitButton = new javax.swing.JButton();
                pornButton = new javax.swing.JButton();

                password.setEchoChar('*');

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                mainPanel.setBackground(new java.awt.Color(255, 153, 0));

                loginPanel.setBackground(new java.awt.Color(153, 255, 255));

                mainAppPanel.setBackground(new java.awt.Color(51, 255, 255));

                javax.swing.GroupLayout mainAppPanelLayout = new javax.swing.GroupLayout(mainAppPanel);
                mainAppPanel.setLayout(mainAppPanelLayout);
                mainAppPanelLayout.setHorizontalGroup(
                                mainAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 330, Short.MAX_VALUE));
                mainAppPanelLayout.setVerticalGroup(
                                mainAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));

                mainLoginPanel.setBackground(new java.awt.Color(255, 255, 255));

                loginTitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
                loginTitle.setText("LOGIN");
                loginTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                loginTitle.setRequestFocusEnabled(false);
                loginTitle.setVerifyInputWhenFocusTarget(false);

                username.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
                username.setForeground(new java.awt.Color(0, 0, 0));
                username.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                usernameActionPerformed(evt);
                        }
                });

                password.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
                password.setForeground(new java.awt.Color(0, 0, 0));
                password.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                passwordActionPerformed(evt);
                        }
                });

                userText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                userText.setText("Username");

                passText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                passText.setText("Password");

                mainTitle.setFont(new java.awt.Font("Bradley Hand ITC", 1, 28)); // NOI18N
                mainTitle.setText("UNDERTHEHOOD");

                loginButton.setText("Login");

                questionText.setText("No have account?");

                registerButton.setText("Register");

                javax.swing.GroupLayout avataPanelLayout = new javax.swing.GroupLayout(avataPanel);
                avataPanel.setLayout(avataPanelLayout);
                avataPanelLayout.setHorizontalGroup(
                                avataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 103, Short.MAX_VALUE));
                avataPanelLayout.setVerticalGroup(
                                avataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));

                socialQuestion.setText("Login with Social");

                fbButton.setText("Facebook");

                gitButton.setText("Github");

                pornButton.setText("Pornhub");

                javax.swing.GroupLayout mainLoginPanelLayout = new javax.swing.GroupLayout(mainLoginPanel);
                mainLoginPanel.setLayout(mainLoginPanelLayout);
                mainLoginPanelLayout.setHorizontalGroup(
                                mainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(mainLoginPanelLayout.createSequentialGroup()
                                                                .addGap(65, 65, 65)
                                                                .addComponent(registerButton)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(mainLoginPanelLayout.createSequentialGroup()
                                                                .addGap(59, 59, 59)
                                                                .addGroup(mainLoginPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(mainLoginPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(mainLoginPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(mainTitle,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addGroup(mainLoginPanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(mainLoginPanelLayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(userText)
                                                                                                                                                .addComponent(loginTitle)
                                                                                                                                                .addComponent(questionText))
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                                                .addGap(361, 361, 361))
                                                                                .addGroup(mainLoginPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(mainLoginPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(passText)
                                                                                                                .addComponent(username,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                270,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(mainLoginPanelLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addComponent(loginButton)
                                                                                                                                .addComponent(password,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                270,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGap(45, 45, 45)
                                                                                                .addComponent(avataPanel,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(mainLoginPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(mainLoginPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(mainLoginPanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(fbButton)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(gitButton)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(pornButton))
                                                                                                                .addComponent(socialQuestion))
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))));
                mainLoginPanelLayout.setVerticalGroup(
                                mainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(mainLoginPanelLayout.createSequentialGroup()
                                                                .addGap(54, 54, 54)
                                                                .addComponent(loginTitle)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(mainTitle,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                30, Short.MAX_VALUE)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(userText)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(mainLoginPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(mainLoginPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(username,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                26,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGap(27, 27, 27)
                                                                                                .addComponent(passText)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(password,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                26,
                                                                                                                Short.MAX_VALUE))
                                                                                .addComponent(avataPanel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(35, 35, 35)
                                                                .addComponent(loginButton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(questionText)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(registerButton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(socialQuestion)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(mainLoginPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(fbButton)
                                                                                .addComponent(gitButton)
                                                                                .addComponent(pornButton))
                                                                .addGap(77, 77, 77)));

                javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
                loginPanel.setLayout(loginPanelLayout);
                loginPanelLayout.setHorizontalGroup(
                                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(loginPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(mainAppPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(mainLoginPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                521,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
                loginPanelLayout.setVerticalGroup(
                                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(loginPanelLayout.createSequentialGroup()
                                                                .addGroup(loginPanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(mainAppPanel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(mainLoginPanel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE)));

                javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
                mainPanel.setLayout(mainPanelLayout);
                mainPanelLayout.setHorizontalGroup(
                                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addGap(125, 125, 125)
                                                                .addComponent(loginPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(112, Short.MAX_VALUE)));
                mainPanelLayout.setVerticalGroup(
                                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(68, Short.MAX_VALUE)
                                                                .addComponent(loginPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(63, 63, 63)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));

                pack();

                // ----------------------------------------------------------------------------------------------------------------------------------------

                // Handle Login anh Save to database

                loginButton.addActionListener(new java.awt.event.ActionListener() {
                        @Override
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                String enteredUsername = username.getText();
                                char[] enteredPassword = password.getPassword();
                                String hashedPassword = HashUtils.hashPassword(enteredPassword);

                                // Call your authentication logic here
                                if (verifyLogin(enteredUsername, hashedPassword)) {
                                        JOptionPane.showMessageDialog(loginGui.this, "Login Successful!");
                                } else {
                                        JOptionPane.showMessageDialog(loginGui.this,
                                                        "Login Failed. Please check your credentials.");
                                }

                        }
                });

                registerButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                dispose();
                                registerGui registerFrame = new registerGui();
                                registerFrame.setVisible(true);
                        }
                });

                // ----------------------------------------------------------------------------------------------------------------------------------------

        }

        // get data from file txt :v
        private boolean verifyLogin(String username, String hashedPassword) {
                try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                                String[] parts = line.split(":");
                                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(hashedPassword)) {
                                        return true;
                                }
                        }
                } catch (IOException e) {
                        e.printStackTrace();
                }
                return false;
        }

        // ----------------------------------------------------------------------------------------------------------------------------------------

        private void passwordActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void usernameActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        /**
         * @param args the command line arguments
         */
        // Variables declaration - do not modify
        private javax.swing.JPanel avataPanel;
        private javax.swing.JButton fbButton;
        private javax.swing.JButton gitButton;
        private javax.swing.JButton loginButton;
        private javax.swing.JPanel loginPanel;
        private javax.swing.JLabel loginTitle;
        private javax.swing.JPanel mainAppPanel;
        private javax.swing.JPanel mainLoginPanel;
        private javax.swing.JPanel mainPanel;
        private javax.swing.JLabel mainTitle;
        private javax.swing.JLabel passText;
        private JPasswordField password;
        private javax.swing.JButton pornButton;
        private javax.swing.JLabel questionText;
        private javax.swing.JButton registerButton;
        private javax.swing.JLabel socialQuestion;
        private javax.swing.JLabel userText;
        private java.awt.TextField username;

        public java.awt.TextField getUsernameTextRemote() {
                return username;
        }

        public JPasswordField getPasswordTextRemote() {
                return password;
        }
}