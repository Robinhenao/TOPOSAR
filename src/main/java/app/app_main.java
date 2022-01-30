package app;

import scripts.conexionDB;
import views.view_main;

public class app_main {
    public static void main(String[] args) {
        conexionDB conectar=new conexionDB();    
        System.out.println(conectar.conectar());


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_main().setVisible(true);
            }
        });
    }
}
