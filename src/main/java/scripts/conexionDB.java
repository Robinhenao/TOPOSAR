package scripts;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class conexionDB {
    
    private static final String bd="";
    private static final String url="jdbc:mysql://localhost:3306/";
    private static final String user="root";
    private static final String password="1234";
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static Connection cx=null;

    public conexionDB() {
    }


    public static Connection conectar(){
        if (cx==null) {
            try {
                Class.forName(driver);
                cx=DriverManager.getConnection(url+bd,user,password);
                System.out.println("SE conecto a BD"+bd);
            } catch (ClassNotFoundException  | SQLException ex) { 
                System.out.println("No se conecto a BD"+bd);
                Logger.getLogger(conexionDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cx;
    }

    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexionDB.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }


}
