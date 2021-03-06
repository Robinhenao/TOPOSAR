package views;

import java.awt.*;
import java.awt.print.*;
import javax.swing.JOptionPane;
import scripts.consulta;
import utils.cliente;
import utils.producto;

public class view_main extends javax.swing.JFrame implements Printable {
    private consulta consul;
    private producto produc;
    private cliente client; 
   
    public view_main() {
        initComponents();
        consul=new consulta();
        table_model_producto();
        table_model_cliente();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaneHead = new javax.swing.JPanel();
        PaneHead2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Pane_prefactura = new javax.swing.JPanel();
        Label_fecha_prefactura = new javax.swing.JLabel();
        TextField_fecha_prefactura = new javax.swing.JTextField();
        Label_cliente_prefactura = new javax.swing.JLabel();
        Button_agregar_cliente = new javax.swing.JButton();
        Label_producto_prefactura = new javax.swing.JLabel();
        Button_agregar_producto = new javax.swing.JButton();
        Label_idventa_prefactura = new javax.swing.JLabel();
        Label_numero_prefactura = new javax.swing.JLabel();
        Label_productosadd_prefactura = new javax.swing.JLabel();
        ScrollPane_productos_prefactura = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        recibo = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Pane_date_cliente = new javax.swing.JPanel();
        Label_cc_cliente = new javax.swing.JLabel();
        Label_name_cliente = new javax.swing.JLabel();
        Label_cell_cliente = new javax.swing.JLabel();
        Label_email_cliente = new javax.swing.JLabel();
        Label_id_cliente = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        Pane_cliente = new javax.swing.JPanel();
        Pane_view_clients = new javax.swing.JPanel();
        ScrollPane_client = new javax.swing.JScrollPane();
        Table_client = new javax.swing.JTable();
        label_titulo_table = new javax.swing.JLabel();
        TabbedPane_cliente = new javax.swing.JTabbedPane();
        Pane_add_client = new javax.swing.JPanel();
        label_titulo_ingreso = new javax.swing.JLabel();
        TextField_name_cliente = new javax.swing.JTextField();
        TextField_lastname_cliente = new javax.swing.JTextField();
        TextField_id_cliente = new javax.swing.JTextField();
        TextField_cell_cliente = new javax.swing.JTextField();
        TextField_email_cliente = new javax.swing.JTextField();
        label_nombre = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        label_cedula = new javax.swing.JLabel();
        label_celular = new javax.swing.JLabel();
        label_celular2 = new javax.swing.JLabel();
        Button_guardar_client = new javax.swing.JButton();
        Button_cancelar_client = new javax.swing.JButton();
        Pane_modify_client = new javax.swing.JPanel();
        label_titulo_ingreso1 = new javax.swing.JLabel();
        TextField_id_cliente_modifiy = new javax.swing.JTextField();
        TextField_cc_cliente_modifiy = new javax.swing.JTextField();
        TextField_name_cliente_modifiy = new javax.swing.JTextField();
        TextField_lastname_cliente_modifiy = new javax.swing.JTextField();
        TextField_cell_cliente_modifiy = new javax.swing.JTextField();
        TextField_email_cliente_modifiy = new javax.swing.JTextField();
        label_celular1 = new javax.swing.JLabel();
        label_cedula1 = new javax.swing.JLabel();
        label_apellido1 = new javax.swing.JLabel();
        label_nombre1 = new javax.swing.JLabel();
        label_celular3 = new javax.swing.JLabel();
        Button_cancelar_cliente_modify = new javax.swing.JButton();
        Button_guardar_cliente_modifiy = new javax.swing.JButton();
        Button_load_cliente_modifiy = new javax.swing.JButton();
        labelclientenumero = new javax.swing.JLabel();
        Pane_producto = new javax.swing.JPanel();
        Pane_view_producto = new javax.swing.JPanel();
        ScrollPane_producto = new javax.swing.JScrollPane();
        Table_product = new javax.swing.JTable();
        label_titulo_table2 = new javax.swing.JLabel();
        TabbedPane_producto = new javax.swing.JTabbedPane();
        Pane_add_producto = new javax.swing.JPanel();
        label_titulo_ingreso_producto = new javax.swing.JLabel();
        TextField_name_producto = new javax.swing.JTextField();
        TextField_cost_producto = new javax.swing.JTextField();
        TextField_price_producto = new javax.swing.JTextField();
        TextField_quantity_producto = new javax.swing.JTextField();
        TextField_description_producto = new javax.swing.JTextField();
        label_nombre_producto = new javax.swing.JLabel();
        label_precio_producto = new javax.swing.JLabel();
        label_descripcion_producto = new javax.swing.JLabel();
        label_quantity_producto = new javax.swing.JLabel();
        label_cost_producto = new javax.swing.JLabel();
        Button_guardar_producto = new javax.swing.JButton();
        Button_cancelar_producto = new javax.swing.JButton();
        Pane_modify_producto = new javax.swing.JPanel();
        label_titulo_ingreso_modify = new javax.swing.JLabel();
        TextField_id_producto_modify = new javax.swing.JTextField();
        TextField_name_producto_modify = new javax.swing.JTextField();
        TextField_cost_producto_modify = new javax.swing.JTextField();
        TextField_price_producto_modify = new javax.swing.JTextField();
        TextField_quantity_producto_modify = new javax.swing.JTextField();
        TextField_description_producto_modify = new javax.swing.JTextField();
        Button_guardar_producto_modify = new javax.swing.JButton();
        Button_cancelar_producto_modify = new javax.swing.JButton();
        Button_load_producto_modify = new javax.swing.JButton();
        label_id_producto_modify = new javax.swing.JLabel();
        label_nombre_producto_modify = new javax.swing.JLabel();
        label_cost_producto_modify = new javax.swing.JLabel();
        label_precio_producto_modify = new javax.swing.JLabel();
        label_quantity_producto_modify = new javax.swing.JLabel();
        label_descripcion_producto_modify = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1080, 720));

        jPanel5.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("SISTEMA DE VENTAS E INVENTARIO");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("TOPOSAR S.A.S");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(601, 601, 601)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(101, 101, 101))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(732, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout PaneHead2Layout = new javax.swing.GroupLayout(PaneHead2);
        PaneHead2.setLayout(PaneHead2Layout);
        PaneHead2Layout.setHorizontalGroup(
            PaneHead2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneHead2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PaneHead2Layout.setVerticalGroup(
            PaneHead2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneHead2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PaneHeadLayout = new javax.swing.GroupLayout(PaneHead);
        PaneHead.setLayout(PaneHeadLayout);
        PaneHeadLayout.setHorizontalGroup(
            PaneHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneHeadLayout.createSequentialGroup()
                .addComponent(PaneHead2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PaneHeadLayout.setVerticalGroup(
            PaneHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaneHead2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        Pane_prefactura.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Label_fecha_prefactura.setText("FECHA:");

        TextField_fecha_prefactura.setEditable(false);

        Label_cliente_prefactura.setText("CLIENTE:");

        Button_agregar_cliente.setText("Agregar Cliente ");
        Button_agregar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_agregar_clienteActionPerformed(evt);
            }
        });

        Label_producto_prefactura.setText("PRODUCTO: ");

        Button_agregar_producto.setText("Agregar Producto");

        Label_idventa_prefactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Label_idventa_prefactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_idventa_prefactura.setText("ID VENTA ");

        Label_numero_prefactura.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Label_numero_prefactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_numero_prefactura.setText("0342");

        Label_productosadd_prefactura.setText("Productos Agragados:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "PRECIO UNIDAD", "CANTIDAD", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPane_productos_prefactura.setViewportView(jTable1);

        jLabel6.setText("SUBTOTAL:");

        jLabel35.setText("ENTREGO EN CAJA:");

        jLabel33.setText("SALDO:");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField2.setText("0");

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField3.setText("0");

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextField4.setText("0");

        jButton4.setText("CANCELAR");

        jButton1.setText("GUARDAR");

        javax.swing.GroupLayout Pane_prefacturaLayout = new javax.swing.GroupLayout(Pane_prefactura);
        Pane_prefactura.setLayout(Pane_prefacturaLayout);
        Pane_prefacturaLayout.setHorizontalGroup(
            Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_prefacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_prefacturaLayout.createSequentialGroup()
                        .addGroup(Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pane_prefacturaLayout.createSequentialGroup()
                                .addComponent(Label_fecha_prefactura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextField_fecha_prefactura, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pane_prefacturaLayout.createSequentialGroup()
                                .addGroup(Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Label_cliente_prefactura)
                                    .addComponent(Label_producto_prefactura))
                                .addGap(6, 6, Short.MAX_VALUE)
                                .addGroup(Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button_agregar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(Button_agregar_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_idventa_prefactura, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_prefacturaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_numero_prefactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_prefacturaLayout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_prefacturaLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_prefacturaLayout.createSequentialGroup()
                                    .addComponent(jLabel33)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_prefacturaLayout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(Pane_prefacturaLayout.createSequentialGroup()
                        .addGroup(Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScrollPane_productos_prefactura, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_productosadd_prefactura))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Pane_prefacturaLayout.setVerticalGroup(
            Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_prefacturaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Label_fecha_prefactura)
                    .addGroup(Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextField_fecha_prefactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Label_idventa_prefactura)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_numero_prefactura, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_cliente_prefactura)
                    .addComponent(Button_agregar_cliente))
                .addGap(27, 27, 27)
                .addGroup(Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_producto_prefactura)
                    .addComponent(Button_agregar_producto))
                .addGap(11, 11, 11)
                .addComponent(Label_productosadd_prefactura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane_productos_prefactura, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pane_prefacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        recibo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Fecha:");

        jLabel9.setText("Factura de venta No??:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("0342");

        jLabel11.setText("25 de Enero 2022");

        jLabel12.setText("NIT:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("129.292.928-2");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Pane_date_cliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Label_cc_cliente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Label_cc_cliente.setText("xxxxxxxxxxx");

        Label_name_cliente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Label_name_cliente.setText("xxxxxxxxxxx");

        Label_cell_cliente.setText("xxxxxxxxxxx");

        Label_email_cliente.setText("xxxxxxxxxxx");

        Label_id_cliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_id_cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_id_cliente.setText("XXXXXX");

        jLabel15.setText("Cedula:");

        jLabel17.setText("Nombre:");

        jLabel19.setText("No?? Celular:");

        jLabel21.setText("Email:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("CODIGO CLIENTE");

        javax.swing.GroupLayout Pane_date_clienteLayout = new javax.swing.GroupLayout(Pane_date_cliente);
        Pane_date_cliente.setLayout(Pane_date_clienteLayout);
        Pane_date_clienteLayout.setHorizontalGroup(
            Pane_date_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_date_clienteLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(Pane_date_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Pane_date_clienteLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_email_cliente))
                    .addGroup(Pane_date_clienteLayout.createSequentialGroup()
                        .addGroup(Pane_date_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Pane_date_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_name_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_cc_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Pane_date_clienteLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(Label_cell_cliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Pane_date_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_id_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        Pane_date_clienteLayout.setVerticalGroup(
            Pane_date_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_date_clienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pane_date_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Label_cc_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_date_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Label_name_cliente)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_date_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Label_cell_cliente)
                    .addComponent(Label_id_cliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_date_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Label_email_cliente))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel14.setText("Datos del cliente:");

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CONCEPTO ", "CANTIDAD", "PRECIO UNIDAD", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel25.setText("0");
        jLabel25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel26.setText("VALOR A PAGAR:");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel27.setText("0");
        jLabel27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel28.setText("SUBTOTAL:");

        jLabel29.setText("ENTREGO EN CAJA:");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel30.setText("0");
        jLabel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel31.setText("Nota:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel28)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel25))))
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel32.setText("datos de la empresa: telefono, direccion, correo, No?? de cuenta bancaria");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel37.setText("NOMBRE O LOGO DE LA EMPRESA");

        javax.swing.GroupLayout reciboLayout = new javax.swing.GroupLayout(recibo);
        recibo.setLayout(reciboLayout);
        reciboLayout.setHorizontalGroup(
            reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reciboLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pane_date_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(reciboLayout.createSequentialGroup()
                        .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        reciboLayout.setVerticalGroup(
            reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reciboLayout.createSequentialGroup()
                .addGroup(reciboLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reciboLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(reciboLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel37)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pane_date_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton5.setText("IMPRIMIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IMPRIME(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pane_prefactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(849, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pane_prefactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("VENTAS", jPanel4);

        Pane_cliente.setBackground(new java.awt.Color(153, 204, 255));

        Pane_view_clients.setBackground(new java.awt.Color(153, 204, 255));

        Table_client.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ScrollPane_client.setViewportView(Table_client);

        label_titulo_table.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_titulo_table.setText("LISTA CLIENTES");

        javax.swing.GroupLayout Pane_view_clientsLayout = new javax.swing.GroupLayout(Pane_view_clients);
        Pane_view_clients.setLayout(Pane_view_clientsLayout);
        Pane_view_clientsLayout.setHorizontalGroup(
            Pane_view_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_view_clientsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Pane_view_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_view_clientsLayout.createSequentialGroup()
                        .addComponent(label_titulo_table)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_view_clientsLayout.createSequentialGroup()
                        .addComponent(ScrollPane_client, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        Pane_view_clientsLayout.setVerticalGroup(
            Pane_view_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_view_clientsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(label_titulo_table)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane_client, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        Pane_add_client.setBackground(new java.awt.Color(204, 204, 204));

        label_titulo_ingreso.setBackground(new java.awt.Color(0, 0, 0));
        label_titulo_ingreso.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_titulo_ingreso.setText("INGRESAR CLIENTE");

        label_nombre.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_nombre.setText("NOMBRE");

        label_apellido.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_apellido.setText("APELLIDO");

        label_cedula.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_cedula.setText("CEDULA");

        label_celular.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_celular.setText("CELULAR");

        label_celular2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_celular2.setText("CORREO");

        Button_guardar_client.setText("GUARDAR");
        Button_guardar_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_guardar_clientActionPerformed(evt);
            }
        });

        Button_cancelar_client.setText("CANCELAR");
        Button_cancelar_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_cancelar_clientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pane_add_clientLayout = new javax.swing.GroupLayout(Pane_add_client);
        Pane_add_client.setLayout(Pane_add_clientLayout);
        Pane_add_clientLayout.setHorizontalGroup(
            Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_add_clientLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nombre)
                    .addComponent(label_apellido)
                    .addComponent(label_cedula)
                    .addComponent(label_celular)
                    .addComponent(label_celular2))
                .addGap(66, 66, 66)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField_email_cliente)
                    .addGroup(Pane_add_clientLayout.createSequentialGroup()
                        .addComponent(Button_cancelar_client)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(Button_guardar_client))
                    .addComponent(TextField_name_cliente)
                    .addComponent(TextField_lastname_cliente)
                    .addComponent(TextField_id_cliente)
                    .addComponent(TextField_cell_cliente))
                .addGap(110, 110, 110))
            .addGroup(Pane_add_clientLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(label_titulo_ingreso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pane_add_clientLayout.setVerticalGroup(
            Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_add_clientLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(label_titulo_ingreso)
                .addGap(18, 18, 18)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_name_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nombre))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_lastname_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_apellido))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cedula))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_cell_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_celular))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_email_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_celular2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_cancelar_client)
                    .addComponent(Button_guardar_client))
                .addGap(30, 30, 30))
        );

        TabbedPane_cliente.addTab("INGRESAR CLIENTE", Pane_add_client);

        Pane_modify_client.setBackground(new java.awt.Color(204, 204, 204));

        label_titulo_ingreso1.setBackground(new java.awt.Color(0, 0, 0));
        label_titulo_ingreso1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_titulo_ingreso1.setText("MODIFICAR CLIENTE");

        TextField_id_cliente_modifiy.setEditable(false);

        label_celular1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_celular1.setText("CELULAR");

        label_cedula1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_cedula1.setText("CEDULA");

        label_apellido1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_apellido1.setText("APELLIDO");

        label_nombre1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_nombre1.setText("NOMBRE");

        label_celular3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_celular3.setText("CORREO");

        Button_cancelar_cliente_modify.setText("CANCELAR");

        Button_guardar_cliente_modifiy.setText("GUARDAR");
        Button_guardar_cliente_modifiy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_guardar_cliente_modifiyActionPerformed(evt);
            }
        });

        Button_load_cliente_modifiy.setText("CARGAR");
        Button_load_cliente_modifiy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_load_cliente_modifiyActionPerformed(evt);
            }
        });

        labelclientenumero.setText("#Cliente");

        javax.swing.GroupLayout Pane_modify_clientLayout = new javax.swing.GroupLayout(Pane_modify_client);
        Pane_modify_client.setLayout(Pane_modify_clientLayout);
        Pane_modify_clientLayout.setHorizontalGroup(
            Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_modify_clientLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_cedula1)
                    .addGroup(Pane_modify_clientLayout.createSequentialGroup()
                        .addGroup(Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_apellido1)
                                .addComponent(label_celular1)
                                .addComponent(label_celular3))
                            .addGroup(Pane_modify_clientLayout.createSequentialGroup()
                                .addComponent(label_nombre1)
                                .addGap(7, 7, 7)))
                        .addGroup(Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pane_modify_clientLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TextField_lastname_cliente_modifiy, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextField_name_cliente_modifiy, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pane_modify_clientLayout.createSequentialGroup()
                                        .addComponent(Button_cancelar_cliente_modify)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                        .addComponent(Button_guardar_cliente_modifiy))
                                    .addComponent(TextField_cell_cliente_modifiy)
                                    .addComponent(TextField_email_cliente_modifiy)))
                            .addComponent(TextField_cc_cliente_modifiy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(Button_load_cliente_modifiy)
                .addContainerGap())
            .addGroup(Pane_modify_clientLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(label_titulo_ingreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(TextField_id_cliente_modifiy, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_modify_clientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelclientenumero)
                .addGap(44, 44, 44))
        );
        Pane_modify_clientLayout.setVerticalGroup(
            Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_modify_clientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelclientenumero)
                .addGap(5, 5, 5)
                .addGroup(Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_titulo_ingreso1)
                    .addComponent(TextField_id_cliente_modifiy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button_load_cliente_modifiy)
                    .addGroup(Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextField_cc_cliente_modifiy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_cedula1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_name_cliente_modifiy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_modify_clientLayout.createSequentialGroup()
                        .addComponent(TextField_lastname_cliente_modifiy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField_cell_cliente_modifiy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_celular1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField_email_cliente_modifiy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_celular3))
                        .addGap(29, 29, 29)
                        .addGroup(Pane_modify_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_cancelar_cliente_modify)
                            .addComponent(Button_guardar_cliente_modifiy)))
                    .addComponent(label_apellido1))
                .addContainerGap())
        );

        TabbedPane_cliente.addTab("MODIFICAR CLIENTE", Pane_modify_client);

        javax.swing.GroupLayout Pane_clienteLayout = new javax.swing.GroupLayout(Pane_cliente);
        Pane_cliente.setLayout(Pane_clienteLayout);
        Pane_clienteLayout.setHorizontalGroup(
            Pane_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_clienteLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(TabbedPane_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Pane_view_clients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(652, Short.MAX_VALUE))
        );
        Pane_clienteLayout.setVerticalGroup(
            Pane_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_clienteLayout.createSequentialGroup()
                .addGroup(Pane_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_clienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Pane_view_clients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pane_clienteLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(TabbedPane_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CLIENTE", Pane_cliente);

        Pane_producto.setBackground(new java.awt.Color(153, 204, 255));

        Pane_view_producto.setBackground(new java.awt.Color(153, 204, 255));

        Table_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ScrollPane_producto.setViewportView(Table_product);

        label_titulo_table2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_titulo_table2.setText("LISTA CLIENTES");

        javax.swing.GroupLayout Pane_view_productoLayout = new javax.swing.GroupLayout(Pane_view_producto);
        Pane_view_producto.setLayout(Pane_view_productoLayout);
        Pane_view_productoLayout.setHorizontalGroup(
            Pane_view_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_view_productoLayout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(label_titulo_table2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_view_productoLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(ScrollPane_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Pane_view_productoLayout.setVerticalGroup(
            Pane_view_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_view_productoLayout.createSequentialGroup()
                .addComponent(label_titulo_table2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPane_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        Pane_add_producto.setBackground(new java.awt.Color(204, 204, 204));

        label_titulo_ingreso_producto.setBackground(new java.awt.Color(0, 0, 0));
        label_titulo_ingreso_producto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_titulo_ingreso_producto.setText("INGRESAR PRODCUTO");

        label_nombre_producto.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_nombre_producto.setText("NOMBRE");

        label_precio_producto.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_precio_producto.setText("PRECIO");

        label_descripcion_producto.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_descripcion_producto.setText("DESCRIPCION");

        label_quantity_producto.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_quantity_producto.setText("CANTIDAD");

        label_cost_producto.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_cost_producto.setText("COSTO");

        Button_guardar_producto.setText("GUARDAR");
        Button_guardar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_guardar_productoActionPerformed(evt);
            }
        });

        Button_cancelar_producto.setText("CANCELAR");
        Button_cancelar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_cancelar_productoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pane_add_productoLayout = new javax.swing.GroupLayout(Pane_add_producto);
        Pane_add_producto.setLayout(Pane_add_productoLayout);
        Pane_add_productoLayout.setHorizontalGroup(
            Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_add_productoLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Pane_add_productoLayout.createSequentialGroup()
                        .addComponent(label_nombre_producto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextField_name_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_add_productoLayout.createSequentialGroup()
                        .addComponent(label_cost_producto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextField_cost_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_add_productoLayout.createSequentialGroup()
                        .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_quantity_producto)
                            .addComponent(label_descripcion_producto)
                            .addComponent(label_precio_producto))
                        .addGap(50, 50, 50)
                        .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextField_price_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_quantity_producto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextField_description_producto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Pane_add_productoLayout.createSequentialGroup()
                                .addComponent(Button_cancelar_producto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_guardar_producto)))))
                .addGap(67, 67, 67))
            .addGroup(Pane_add_productoLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(label_titulo_ingreso_producto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pane_add_productoLayout.setVerticalGroup(
            Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_add_productoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(label_titulo_ingreso_producto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nombre_producto)
                    .addComponent(TextField_name_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_cost_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cost_producto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_precio_producto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField_price_producto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_quantity_producto)
                    .addComponent(TextField_quantity_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_descripcion_producto)
                    .addComponent(TextField_description_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_cancelar_producto)
                    .addComponent(Button_guardar_producto))
                .addGap(78, 78, 78))
        );

        TabbedPane_producto.addTab("INGRESAR PRODUCTO", Pane_add_producto);

        Pane_modify_producto.setBackground(new java.awt.Color(204, 204, 204));

        label_titulo_ingreso_modify.setBackground(new java.awt.Color(0, 0, 0));
        label_titulo_ingreso_modify.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_titulo_ingreso_modify.setText("MODIFICAR PRODCUTO");

        Button_guardar_producto_modify.setText("GUARDAR");
        Button_guardar_producto_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_guardar_producto_modifyActionPerformed(evt);
            }
        });

        Button_cancelar_producto_modify.setText("CANCELAR");
        Button_cancelar_producto_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_cancelar_producto_modifyActionPerformed(evt);
            }
        });

        Button_load_producto_modify.setText("CARGAR");
        Button_load_producto_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_load_producto_modifyActionPerformed(evt);
            }
        });

        label_id_producto_modify.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_id_producto_modify.setText("ID");

        label_nombre_producto_modify.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_nombre_producto_modify.setText("NOMBRE");

        label_cost_producto_modify.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_cost_producto_modify.setText("COSTO");

        label_precio_producto_modify.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_precio_producto_modify.setText("PRECIO");

        label_quantity_producto_modify.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_quantity_producto_modify.setText("CANTIDAD");

        label_descripcion_producto_modify.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_descripcion_producto_modify.setText("DESCRIPCION");

        javax.swing.GroupLayout Pane_modify_productoLayout = new javax.swing.GroupLayout(Pane_modify_producto);
        Pane_modify_producto.setLayout(Pane_modify_productoLayout);
        Pane_modify_productoLayout.setHorizontalGroup(
            Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                                    .addComponent(label_descripcion_producto_modify)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pane_modify_productoLayout.createSequentialGroup()
                                    .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(label_precio_producto_modify, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_nombre_producto_modify, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_id_producto_modify, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_cost_producto_modify, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                                .addComponent(label_quantity_producto_modify)
                                .addGap(38, 38, 38)))
                        .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField_quantity_producto_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                                    .addComponent(Button_cancelar_producto_modify)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_guardar_producto_modify))
                                .addComponent(TextField_price_producto_modify)
                                .addComponent(TextField_name_producto_modify, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TextField_description_producto_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                                    .addComponent(TextField_id_producto_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Button_load_producto_modify)))
                            .addComponent(TextField_cost_producto_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(label_titulo_ingreso_modify)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        Pane_modify_productoLayout.setVerticalGroup(
            Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_titulo_ingreso_modify)
                .addGap(18, 18, 18)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id_producto_modify)
                    .addComponent(TextField_id_producto_modify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_load_producto_modify))
                .addGap(34, 34, 34)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_nombre_producto_modify)
                    .addComponent(TextField_name_producto_modify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_cost_producto_modify)
                    .addComponent(TextField_cost_producto_modify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_precio_producto_modify)
                    .addComponent(TextField_price_producto_modify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_quantity_producto_modify)
                    .addComponent(TextField_quantity_producto_modify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_descripcion_producto_modify)
                    .addComponent(TextField_description_producto_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_cancelar_producto_modify)
                    .addComponent(Button_guardar_producto_modify))
                .addGap(31, 31, 31))
        );

        TabbedPane_producto.addTab("MODIFICAR PRODUCTO", Pane_modify_producto);

        javax.swing.GroupLayout Pane_productoLayout = new javax.swing.GroupLayout(Pane_producto);
        Pane_producto.setLayout(Pane_productoLayout);
        Pane_productoLayout.setHorizontalGroup(
            Pane_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_productoLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(TabbedPane_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pane_view_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(593, Short.MAX_VALUE))
        );
        Pane_productoLayout.setVerticalGroup(
            Pane_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_productoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(Pane_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TabbedPane_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pane_view_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INVENTARIO", Pane_producto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PaneHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PaneHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("TABBE");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_guardar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_guardar_productoActionPerformed
        String name=TextField_name_producto.getText();
        double price=Double.parseDouble(TextField_price_producto.getText());
        double cost=Double.parseDouble(TextField_cost_producto.getText());
        int quantity=Integer.parseInt(TextField_quantity_producto.getText());
        String description=TextField_description_producto.getText();
        produc= new producto(1,name,price,cost,quantity,description);
        consul.registrar_producto(produc);
        table_model_producto();
    }//GEN-LAST:event_Button_guardar_productoActionPerformed

    private void Button_guardar_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_guardar_clientActionPerformed
        String name=TextField_name_cliente.getText();
        String lastname=TextField_lastname_cliente.getText();
        int cc=Integer.parseInt(TextField_id_cliente.getText());
        int cell=Integer.parseInt(TextField_cell_cliente.getText());
        String email=TextField_email_cliente.getText();
        client=new cliente(1,name,lastname,cc,cell,email);
        consul.registrar_cliente(client);
        table_model_cliente();
    }//GEN-LAST:event_Button_guardar_clientActionPerformed

    private void Button_cancelar_producto_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_cancelar_producto_modifyActionPerformed
        TextField_id_producto_modify.setText("");
        TextField_name_producto_modify.setText("");
        TextField_price_producto_modify.setText("");
        TextField_cost_producto_modify.setText("");
        TextField_quantity_producto_modify.setText("");
        TextField_description_producto_modify.setText("");
    }//GEN-LAST:event_Button_cancelar_producto_modifyActionPerformed

    private void Button_cancelar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_cancelar_productoActionPerformed
        TextField_name_producto.setText("");
        TextField_price_producto.setText("");
        TextField_cost_producto.setText("");
        TextField_quantity_producto.setText("");
        TextField_description_producto.setText("");
    }//GEN-LAST:event_Button_cancelar_productoActionPerformed

    private void Button_cancelar_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_cancelar_clientActionPerformed
        TextField_name_cliente.setText("");
        TextField_lastname_cliente.setText("");
        TextField_id_cliente.setText("");
        TextField_cell_cliente.setText("");
        TextField_email_cliente.setText("");
    }//GEN-LAST:event_Button_cancelar_clientActionPerformed

    private void Button_load_cliente_modifiyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_load_cliente_modifiyActionPerformed
        client=consul.modificar_cliente_load(Integer.parseInt(TextField_cc_cliente_modifiy.getText()));
        TextField_id_cliente_modifiy.setText(String.valueOf(client.getId()));
        TextField_name_cliente_modifiy.setText(client.getName());
        TextField_lastname_cliente_modifiy.setText(client.getLastname());
        TextField_cc_cliente_modifiy.setText(String.valueOf(client.getCc()));
        TextField_cell_cliente_modifiy.setText(String.valueOf(client.getCell()));
        TextField_email_cliente_modifiy.setText(client.getEmail());
        client=null;
    }//GEN-LAST:event_Button_load_cliente_modifiyActionPerformed

    private void Button_guardar_cliente_modifiyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_guardar_cliente_modifiyActionPerformed
        int id=Integer.parseInt(TextField_id_cliente_modifiy.getText());
        String name=TextField_name_cliente_modifiy.getText();
        String lastname=TextField_lastname_cliente_modifiy.getText();
        int cc=Integer.parseInt(TextField_cc_cliente_modifiy.getText());
        int cell=Integer.parseInt(TextField_cell_cliente_modifiy.getText());
        String email=TextField_email_cliente_modifiy.getText();
        client=new cliente(id,name,lastname,cc,cell,email);
        consul.modificar_cliente(client);
        table_model_cliente();
        client=null;
    }//GEN-LAST:event_Button_guardar_cliente_modifiyActionPerformed

    private void IMPRIME(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IMPRIME
        try{
            PrinterJob gap =  PrinterJob.getPrinterJob();
            gap.setPrintable(this);
            boolean top = gap.printDialog();
            if(top){
                gap.print();
            }
        }
        
        catch(PrinterException pex)
        {
            JOptionPane.showMessageDialog(null, "ERORR DE PROGRAMA", "Error/n"+pex,JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_IMPRIME

    private void Button_load_producto_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_load_producto_modifyActionPerformed
        produc=consul.modificar_producto_load(Integer.parseInt(TextField_id_producto_modify.getText()));
        TextField_name_producto_modify.setText(produc.getName());
        TextField_price_producto_modify.setText(String.valueOf(produc.getPrice()));
        TextField_cost_producto_modify.setText(String.valueOf(produc.getCost()));
        TextField_quantity_producto_modify.setText(String.valueOf(produc.getQuantity()));
        TextField_description_producto_modify.setText(produc.getDescription());
        produc=null;
        System.out.println("error intermedio load");
    }//GEN-LAST:event_Button_load_producto_modifyActionPerformed

    private void Button_guardar_producto_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_guardar_producto_modifyActionPerformed
        int id=Integer.parseInt(TextField_id_producto_modify.getText());
        String name=TextField_name_producto_modify.getText();
        double price=Double.parseDouble(TextField_price_producto_modify.getText());
        double cost=Double.parseDouble(TextField_cost_producto_modify.getText());
        int quantity=Integer.parseInt(TextField_quantity_producto_modify.getText());
        String description=TextField_description_producto_modify.getText();
        produc= new producto(id,name,price,cost,quantity,description);
        consul.modificar_producto(produc);
        produc=null;
        table_model_producto();
    }//GEN-LAST:event_Button_guardar_producto_modifyActionPerformed

    private void Button_agregar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_agregar_clienteActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_cliente().setVisible(true);
            }
        });
    }//GEN-LAST:event_Button_agregar_clienteActionPerformed

    private void table_model_cliente(){
        Table_client.setModel(consul.consulta_cliente());
    }

    private void table_model_producto(){
        Table_product.setModel(consul.consulta_inventario());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_agregar_cliente;
    private javax.swing.JButton Button_agregar_producto;
    private javax.swing.JButton Button_cancelar_client;
    private javax.swing.JButton Button_cancelar_cliente_modify;
    private javax.swing.JButton Button_cancelar_producto;
    private javax.swing.JButton Button_cancelar_producto_modify;
    private javax.swing.JButton Button_guardar_client;
    private javax.swing.JButton Button_guardar_cliente_modifiy;
    private javax.swing.JButton Button_guardar_producto;
    private javax.swing.JButton Button_guardar_producto_modify;
    private javax.swing.JButton Button_load_cliente_modifiy;
    private javax.swing.JButton Button_load_producto_modify;
    private javax.swing.JLabel Label_cc_cliente;
    private javax.swing.JLabel Label_cell_cliente;
    private javax.swing.JLabel Label_cliente_prefactura;
    private javax.swing.JLabel Label_email_cliente;
    private javax.swing.JLabel Label_fecha_prefactura;
    private javax.swing.JLabel Label_id_cliente;
    private javax.swing.JLabel Label_idventa_prefactura;
    private javax.swing.JLabel Label_name_cliente;
    private javax.swing.JLabel Label_numero_prefactura;
    private javax.swing.JLabel Label_producto_prefactura;
    private javax.swing.JLabel Label_productosadd_prefactura;
    private javax.swing.JPanel PaneHead;
    private javax.swing.JPanel PaneHead2;
    private javax.swing.JPanel Pane_add_client;
    private javax.swing.JPanel Pane_add_producto;
    private javax.swing.JPanel Pane_cliente;
    private javax.swing.JPanel Pane_date_cliente;
    private javax.swing.JPanel Pane_modify_client;
    private javax.swing.JPanel Pane_modify_producto;
    private javax.swing.JPanel Pane_prefactura;
    private javax.swing.JPanel Pane_producto;
    private javax.swing.JPanel Pane_view_clients;
    private javax.swing.JPanel Pane_view_producto;
    private javax.swing.JScrollPane ScrollPane_client;
    private javax.swing.JScrollPane ScrollPane_producto;
    private javax.swing.JScrollPane ScrollPane_productos_prefactura;
    private javax.swing.JTabbedPane TabbedPane_cliente;
    private javax.swing.JTabbedPane TabbedPane_producto;
    private javax.swing.JTable Table_client;
    private javax.swing.JTable Table_product;
    private javax.swing.JTextField TextField_cc_cliente_modifiy;
    private javax.swing.JTextField TextField_cell_cliente;
    private javax.swing.JTextField TextField_cell_cliente_modifiy;
    private javax.swing.JTextField TextField_cost_producto;
    private javax.swing.JTextField TextField_cost_producto_modify;
    private javax.swing.JTextField TextField_description_producto;
    private javax.swing.JTextField TextField_description_producto_modify;
    private javax.swing.JTextField TextField_email_cliente;
    private javax.swing.JTextField TextField_email_cliente_modifiy;
    private javax.swing.JTextField TextField_fecha_prefactura;
    private javax.swing.JTextField TextField_id_cliente;
    private javax.swing.JTextField TextField_id_cliente_modifiy;
    private javax.swing.JTextField TextField_id_producto_modify;
    private javax.swing.JTextField TextField_lastname_cliente;
    private javax.swing.JTextField TextField_lastname_cliente_modifiy;
    private javax.swing.JTextField TextField_name_cliente;
    private javax.swing.JTextField TextField_name_cliente_modifiy;
    private javax.swing.JTextField TextField_name_producto;
    private javax.swing.JTextField TextField_name_producto_modify;
    private javax.swing.JTextField TextField_price_producto;
    private javax.swing.JTextField TextField_price_producto_modify;
    private javax.swing.JTextField TextField_quantity_producto;
    private javax.swing.JTextField TextField_quantity_producto_modify;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_apellido1;
    private javax.swing.JLabel label_cedula;
    private javax.swing.JLabel label_cedula1;
    private javax.swing.JLabel label_celular;
    private javax.swing.JLabel label_celular1;
    private javax.swing.JLabel label_celular2;
    private javax.swing.JLabel label_celular3;
    private javax.swing.JLabel label_cost_producto;
    private javax.swing.JLabel label_cost_producto_modify;
    private javax.swing.JLabel label_descripcion_producto;
    private javax.swing.JLabel label_descripcion_producto_modify;
    private javax.swing.JLabel label_id_producto_modify;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_nombre1;
    private javax.swing.JLabel label_nombre_producto;
    private javax.swing.JLabel label_nombre_producto_modify;
    private javax.swing.JLabel label_precio_producto;
    private javax.swing.JLabel label_precio_producto_modify;
    private javax.swing.JLabel label_quantity_producto;
    private javax.swing.JLabel label_quantity_producto_modify;
    private javax.swing.JLabel label_titulo_ingreso;
    private javax.swing.JLabel label_titulo_ingreso1;
    private javax.swing.JLabel label_titulo_ingreso_modify;
    private javax.swing.JLabel label_titulo_ingreso_producto;
    private javax.swing.JLabel label_titulo_table;
    private javax.swing.JLabel label_titulo_table2;
    private javax.swing.JLabel labelclientenumero;
    private javax.swing.JPanel recibo;
    // End of variables declaration//GEN-END:variables

    //metodo de imprecion 
    @Override
    public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException {
        if (index>0)
        {
           return NO_SUCH_PAGE; 
        }  
        Graphics2D hub = (Graphics2D) graf;
        hub.translate(pagfor.getImageableX()+ 30, pagfor.getImageableY()+30);
        hub.scale(1.0, 1.0);
        
        recibo.printAll(graf);
        return PAGE_EXISTS;
    }
}
