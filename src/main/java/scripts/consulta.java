package scripts;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import utils.producto;

public class consulta {
    private final String SQL_INSERT_cliente ="INSERT INTO productos(nombre, apellido, celular, correo) values(?,?,?,?)";
    private final String SQL_INSERT_producto ="INSERT INTO productos(nombre, precio, costo, cantidad, descripcion) values(?,?,?,?,?)";
    private PreparedStatement ps;
    private Statement pc;
    private conexionDB cn;

    public consulta() {
        pc=null;
        ps=null;
        cn= new conexionDB();
    }


    
    public DefaultTableModel consulta_inventario(){
        String sql="SELECT * FROM productos";
        String[] registro =new String[6];

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("Nombre");
        model.addColumn("Precio");
        model.addColumn("Costo");
        model.addColumn("Cantidad");
        model.addColumn("Descripcion");
        
        try {
            pc=cn.conectar().createStatement();
            ResultSet result=pc.executeQuery(sql);
            while (result.next()) {
                registro[0]=result.getString(1);
                registro[1]=result.getString(2);
                registro[2]=result.getString(3);
                registro[3]=result.getString(4);
                registro[4]=result.getString(5);
                registro[5]=result.getString(6);
                model.addRow(registro);  
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            pc=null;
            cn.desconectar();
        }
        return model;
    }
    public void consulta_cliente(){

    }
    public void registrar_cliente(){

    }
    public void registrar_producto(producto producto){
        try {
            ps=cn.conectar().prepareStatement(SQL_INSERT_producto);
            ps.setString(1, producto.getName());
            ps.setDouble(2, producto.getPrice());
            ps.setDouble(3, producto.getCost());
            ps.setDouble(4, producto.getQuantity());
            ps.setString(5, producto.getDescription());
            ps.execute();
            
        } catch (SQLException e) {
            System.err.println("error sql "+e.getMessage());
        }
        finally{
            ps=null;
            cn.desconectar();
        }
    }

}
