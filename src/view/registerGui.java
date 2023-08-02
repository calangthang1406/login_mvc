package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import view.loginGui;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import controller.HashUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class registerGui extends javax.swing.JFrame {

        /**
         * Creates new form register
         */
        public registerGui() {
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

                jPanel1 = new javax.swing.JPanel();
                mainPanel = new javax.swing.JPanel();
                loginPanel = new javax.swing.JPanel();
                mainAppPanel = new javax.swing.JPanel();
                mainLoginPanel = new javax.swing.JPanel();
                registerTitle = new javax.swing.JLabel();
                username = new java.awt.TextField();
                password = new javax.swing.JPasswordField();
                userText = new javax.swing.JLabel();
                rePassText = new javax.swing.JLabel();
                mainTitle = new javax.swing.JLabel();
                registerButton = new javax.swing.JButton();
                questionText = new javax.swing.JLabel();
                loginButton = new javax.swing.JButton();
                avataPanel = new javax.swing.JPanel();
                socialQuestion = new javax.swing.JLabel();
                fbButton = new javax.swing.JButton();
                gitButton = new javax.swing.JButton();
                pornButton = new javax.swing.JButton();
                rePassword = new javax.swing.JPasswordField();
                passText = new javax.swing.JLabel();

                password.setEchoChar('*');
                rePassword.setEchoChar('*');

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(255, 102, 0));

                jPanel1.setBackground(new java.awt.Color(255, 102, 0));

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

                registerTitle.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
                registerTitle.setText("REGISTER");
                registerTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                registerTitle.setRequestFocusEnabled(false);
                registerTitle.setVerifyInputWhenFocusTarget(false);

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

                rePassText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                rePassText.setText("Retype Password");

                mainTitle.setFont(new java.awt.Font("Bradley Hand ITC", 1, 28)); // NOI18N
                mainTitle.setText("UNDERTHEHOOD");

                registerButton.setText("Register");
                registerButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                registerButtonActionPerformed(evt);
                        }
                });

                questionText.setText("No have account?");

                loginButton.setText("Login");

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

                rePassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
                rePassword.setForeground(new java.awt.Color(0, 0, 0));
                rePassword.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                rePasswordActionPerformed(evt);
                        }
                });

                passText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                passText.setText("Password");

                javax.swing.GroupLayout mainLoginPanelLayout = new javax.swing.GroupLayout(mainLoginPanel);
                mainLoginPanel.setLayout(mainLoginPanelLayout);
                mainLoginPanelLayout.setHorizontalGroup(
                                mainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(mainLoginPanelLayout.createSequentialGroup()
                                                                .addGap(59, 59, 59)
                                                                .addGroup(mainLoginPanelLayout
                                                                                .createParallelGroup(
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
                                                                                                                                                .addComponent(registerTitle)
                                                                                                                                                .addComponent(questionText))
                                                                                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                                                                .addGap(361, 361, 361))
                                                                                .addGroup(mainLoginPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(mainLoginPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(rePassText)
                                                                                                                .addComponent(username,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                270,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(mainLoginPanelLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addComponent(registerButton)
                                                                                                                                .addComponent(password,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                270,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addComponent(passText))
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
                                                                                                                .addComponent(rePassword,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                270,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(loginButton)
                                                                                                                .addComponent(socialQuestion)
                                                                                                                .addGroup(mainLoginPanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(fbButton)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(gitButton)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(pornButton)))
                                                                                                .addGap(0, 0, Short.MAX_VALUE)))));
                mainLoginPanelLayout.setVerticalGroup(
                                mainLoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(mainLoginPanelLayout.createSequentialGroup()
                                                                .addGap(54, 54, 54)
                                                                .addComponent(registerTitle)
                                                                .addGap(32, 32, 32)
                                                                .addComponent(mainTitle,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                30, Short.MAX_VALUE)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(userText)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(mainLoginPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(mainLoginPanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(username,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                26,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGap(37, 37, 37)
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
                                                                .addGap(34, 34, 34)
                                                                .addComponent(rePassText)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rePassword,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                26, Short.MAX_VALUE)
                                                                .addGap(22, 22, 22)
                                                                .addComponent(registerButton)
                                                                .addGap(15, 15, 15)
                                                                .addComponent(questionText)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(loginButton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(socialQuestion)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(mainLoginPanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(fbButton)
                                                                                .addComponent(gitButton)
                                                                                .addComponent(pornButton))
                                                                .addGap(93, 93, 93)));

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
                                                                .addGroup(
                                                                                loginPanelLayout.createParallelGroup(
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
                                                                .addGap(110, 110, 110)
                                                                .addComponent(loginPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(127, Short.MAX_VALUE)));
                mainPanelLayout.setVerticalGroup(
                                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(mainPanelLayout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(loginPanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(38, Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
                // ------------------------------------------------------------------------------------------------------------------

                registerButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                String enteredUsername = username.getText();
                                char[] enteredPassword = password.getPassword();
                                char[] enteredRePassword = rePassword.getPassword();

                                String handelPassword = HashUtils.hashPassword(enteredPassword);
                                String handelRePassword = HashUtils.hashPassword(enteredRePassword);

                                if (!handelPassword.equals(handelRePassword)) {
                                        JOptionPane.showMessageDialog(registerGui.this, "Passwords do not match!",
                                                        "Error",
                                                        JOptionPane.ERROR_MESSAGE);
                                }

                                if (registerUser(enteredUsername, handelPassword, handelRePassword)
                                                && !enteredUsername.equals("") && !enteredPassword.equals("")
                                                && !enteredRePassword.equals("")) {
                                        JOptionPane.showMessageDialog(registerGui.this, "Đăng ký thành công!");
                                } else {
                                        JOptionPane.showMessageDialog(registerGui.this, "Đăng ký thất bại.");
                                }
                        }
                });

                loginButton.addActionListener(new java.awt.event.ActionListener() {
                        @Override
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                dispose();
                                loginGui loginFrame = new loginGui();
                                loginFrame.setVisible(true);
                        }
                });

        }

        // ------------------------------------------------------------------------------------------------------------------

        private boolean registerUser(String enteredUsername, String handlePassword, String handleRePassword) {
                if (!enteredUsername.equals("") && !handlePassword.equals("") && !handleRePassword.equals("")) {
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
                                writer.write(enteredUsername + ":" + handlePassword);
                                writer.newLine();
                                return true;
                        } catch (IOException e) {
                                e.printStackTrace();
                        }
                }
                return false;
        }

        // ------------------------------------------------------------------------------------------------------------------

        private void usernameActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void passwordActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void rePasswordActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        /**
         * @param args the command line arguments
         */
        /*
         * public static void main(String args[]) {
         * 
         * try {
         * for (javax.swing.UIManager.LookAndFeelInfo info :
         * javax.swing.UIManager.getInstalledLookAndFeels()) {
         * if ("Nimbus".equals(info.getName())) {
         * javax.swing.UIManager.setLookAndFeel(info.getClassName());
         * break;
         * }
         * }
         * } catch (ClassNotFoundException ex) {
         * java.util.logging.Logger.getLogger(registerGui.class.getName()).log(java.util
         * .logging.Level.SEVERE, null,
         * ex);
         * } catch (InstantiationException ex) {
         * java.util.logging.Logger.getLogger(registerGui.class.getName()).log(java.util
         * .logging.Level.SEVERE, null,
         * ex);
         * } catch (IllegalAccessException ex) {
         * java.util.logging.Logger.getLogger(registerGui.class.getName()).log(java.util
         * .logging.Level.SEVERE, null,
         * ex);
         * } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         * java.util.logging.Logger.getLogger(registerGui.class.getName()).log(java.util
         * .logging.Level.SEVERE, null,
         * ex);
         * }
         * java.awt.EventQueue.invokeLater(new Runnable() {
         * public void run() {
         * new registerGui().setVisible(true);
         * }
         * });
         * }
         */

        // Variables declaration - do not modify
        private javax.swing.JPanel avataPanel;
        private javax.swing.JButton fbButton;
        private javax.swing.JButton gitButton;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JButton loginButton;
        private javax.swing.JPanel loginPanel;
        private javax.swing.JPanel mainAppPanel;
        private javax.swing.JPanel mainLoginPanel;
        private javax.swing.JPanel mainPanel;
        private javax.swing.JLabel mainTitle;
        private javax.swing.JLabel passText;
        private JPasswordField password;
        private javax.swing.JButton pornButton;
        private javax.swing.JLabel questionText;
        private javax.swing.JLabel rePassText;
        private JPasswordField rePassword;
        private javax.swing.JButton registerButton;
        private javax.swing.JLabel registerTitle;
        private javax.swing.JLabel socialQuestion;
        private javax.swing.JLabel userText;
        private java.awt.TextField username;
        // End of variables declaration

        public java.awt.TextField getUsername() {
                return username;
        }

        public JPasswordField getPassword() {
                return password;
        }

        public JPasswordField getRePassword() {
                return rePassword;
        }

}