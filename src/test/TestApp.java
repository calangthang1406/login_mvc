package test;

public class TestApp {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login();
                new Register();
            }
        });
    }
}
