package scripts;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import utils.producto;

public class consulta {
    private final String SQL_INSERT_cliente ="INSERT INTO productos(nombre, apellido, celular, correo) values(?,?,?,?)";
    private final String SQL_INSERT_producto ="INSERT INTO productos(nombre, precio, costo, cantidad, descripcion) values(?,?,?,?,?)";
    private PreparedStatement ps;
    private conexionDB cn;

    public consulta() {
        ps=null;
        cn= new conexionDB();
    }


    
    public void consulta_inventario(){

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
