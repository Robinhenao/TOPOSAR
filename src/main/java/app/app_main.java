package app;

import views.view_main;

public class app_main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_main().setVisible(true);
            }
        });
    }
}
