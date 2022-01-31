package app;

import scripts.consulta;
import utils.producto;
import views.view_main;

public class app_main {
    public static void main(String[] args) {
        //consulta cs=new consulta();
        //producto pro=new producto(1,"nombre",5200,6000,5,"prueba para llenar");

        //cs.registrar_producto(pro);

         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_main().setVisible(true);
            }
        });
        
    }
}
