package scripts;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import utils.cliente;
import utils.producto;

public class consulta {
    private final String SQL_INSERT_cliente ="INSERT INTO clientes(nombre, apellido,cedula, celular, correo) values(?,?,?,?,?)";
    private final String SQL_INSERT_producto ="INSERT INTO productos(nombre, precio, costo, cantidad, descripcion) values(?,?,?,?,?)";
    
    private PreparedStatement ps;
    private Statement pc;
    private conexionDB cn;
    private producto produc;
    private cliente client; 

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
           
        }
        return model;
    }

    public DefaultTableModel consulta_cliente(){
        String sql="SELECT * FROM clientes";
        String[] registro =new String[6];
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("Nombre");
        model.addColumn("Lastname");
        model.addColumn("Cedula");
        model.addColumn("Celular");
        model.addColumn("email");
   
        
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
           
        }
        return model;
    }

    public void registrar_cliente(cliente cliente){
        try {
            
            ps=cn.conectar().prepareStatement(SQL_INSERT_cliente);
            ps.setString(1, cliente.getName());
            ps.setString(2, cliente.getLastname());
            ps.setInt(3, cliente.getCc());
            ps.setInt(4, cliente.getCell());
            ps.setString(5, cliente.getEmail());
            
            ps.execute();
            
        } catch (SQLException e) {
            System.err.println("error sql "+e.getMessage());
        }
        finally{
            ps=null;
        }
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
        }
    }

    public cliente modificar_cliente_load(int cc){
        String sql="SELECT * FROM clientes";
        try {
            pc=cn.conectar().createStatement();
            ResultSet result=pc.executeQuery(sql);
            while (result.next()) {
                if (Integer.parseInt(result.getString(4))==cc) {
                    int id=Integer.parseInt(result.getString(1));
                    String name=result.getString(2);
                    String lastname=result.getString(3);
                    //int cc=Integer.parseInt(result.getString(4));
                    int cell=Integer.parseInt(result.getString(5));
                    String email=result.getString(6);
                    client=new cliente(id,name,lastname,cc,cell,email);
                }
                
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            pc=null;
           
        }
        return client;
    }

    public void modificar_cliente(cliente client){
        String SQL_UPDATE_cliente ="UPDATE clientes SET nombre='"+client.getName()+"', apellido='"+client.getLastname()+"',celular='"+client.getCell()+"', "
                                    + "correo='"+client.getEmail()+"' WHERE cedula="+client.getCc();
        try {
            ps=cn.conectar().prepareStatement(SQL_UPDATE_cliente);
            ps.execute();
            System.out.println("se modifico");
        } catch (SQLException e) {
            System.err.println("error sql "+e.getMessage());
        } finally {
            ps=null;
        }
    }

    public producto modificar_producto_load(int id){
        String sql="SELECT * FROM productos";
        try {
            pc=cn.conectar().createStatement();
            ResultSet result=pc.executeQuery(sql);
            while (result.next()) {
                if (Integer.parseInt(result.getString(1))==id) {
                    //int idp=Integer.parseInt(result.getString(1));
                    String name=result.getString(2);
                    double price= Double.parseDouble(result.getString(3));
                    double cost=Double.parseDouble(result.getString(4));
                    int quantity=Integer.parseInt(result.getString(5));
                    String description=result.getString(6);
                    produc=new producto(id,name,price,cost,quantity,description);
                }
                
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            pc=null;
        }
        return produc;
    }

    public void modificar_producto(producto product){
        String SQL_UPDATE_producto ="UPDATE productos SET nombre='"+product.getName()+"', precio='"+product.getPrice()+"',"
 + "                                costo='"+product.getCost()+"', cantidad='"+product.getQuantity()+"', descripcion='"+product.getDescription()+"' WHERE id_producto="+product.getId();
        try {
            ps=cn.conectar().prepareStatement(SQL_UPDATE_producto);
            ps.execute();
            System.out.println("se modifico producto");
        } catch (SQLException e) {
            System.err.println("error sql "+e.getMessage());
        } finally {
            ps=null;
        }
    }

}
