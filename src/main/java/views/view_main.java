package views;

public class view_main extends javax.swing.JFrame {

   
    public view_main() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        PaneTabberd_client = new javax.swing.JPanel();
        Pane_add_client = new javax.swing.JPanel();
        label_titulo_ingreso = new javax.swing.JLabel();
        TextField_name = new javax.swing.JTextField();
        TextField_lastname = new javax.swing.JTextField();
        TextField_id = new javax.swing.JTextField();
        TextField_cell = new javax.swing.JTextField();
        label_nombre = new javax.swing.JLabel();
        label_apellido = new javax.swing.JLabel();
        label_cedula = new javax.swing.JLabel();
        label_celular = new javax.swing.JLabel();
        Button_guardar_client = new javax.swing.JButton();
        Button_cancelar_client = new javax.swing.JButton();
        Pane_view_clients = new javax.swing.JPanel();
        ScrollPane_client = new javax.swing.JScrollPane();
        Table_client = new javax.swing.JTable();
        label_titulo_table = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Pane_view_producto = new javax.swing.JPanel();
        ScrollPane_producto = new javax.swing.JScrollPane();
        Table_client2 = new javax.swing.JTable();
        label_titulo_table2 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Pane_add_producto = new javax.swing.JPanel();
        label_titulo_ingreso1 = new javax.swing.JLabel();
        TextField_name_producto = new javax.swing.JTextField();
        TextField_price = new javax.swing.JTextField();
        TextField_nit = new javax.swing.JTextField();
        TextField_description = new javax.swing.JTextField();
        label_nombre_producto = new javax.swing.JLabel();
        label_precio = new javax.swing.JLabel();
        label_nit = new javax.swing.JLabel();
        label_descripcion = new javax.swing.JLabel();
        Button_guardar_producto = new javax.swing.JButton();
        Button_cancelar_producto = new javax.swing.JButton();
        Pane_modify_producto = new javax.swing.JPanel();
        label_titulo_ingreso2 = new javax.swing.JLabel();
        TextField_name_producto_modify = new javax.swing.JTextField();
        TextField_price_modify = new javax.swing.JTextField();
        TextField_nit_modify = new javax.swing.JTextField();
        TextField_description_modify = new javax.swing.JTextField();
        label_nombre_producto1 = new javax.swing.JLabel();
        label_precio1 = new javax.swing.JLabel();
        label_nit1 = new javax.swing.JLabel();
        label_descripcion1 = new javax.swing.JLabel();
        Button_modify_producto = new javax.swing.JButton();
        Button_cancelar_producto_modify = new javax.swing.JButton();

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
                .addContainerGap(641, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(586, 586, 586))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(485, 485, 485))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1576, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("VENTAS", jPanel4);

        PaneTabberd_client.setBackground(new java.awt.Color(153, 204, 255));

        Pane_add_client.setBackground(new java.awt.Color(153, 204, 255));

        label_titulo_ingreso.setBackground(new java.awt.Color(0, 0, 0));
        label_titulo_ingreso.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_titulo_ingreso.setText("INGRESAR CLIENTE");

        label_nombre.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_nombre.setText(" NOMBRE");

        label_apellido.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_apellido.setText("APELLIDO");

        label_cedula.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_cedula.setText("CEDULA");

        label_celular.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_celular.setText("CELULAR");

        Button_guardar_client.setText("GUARDAR");

        Button_cancelar_client.setText("CANCELAR");

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
                    .addComponent(label_celular))
                .addGap(66, 66, 66)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField_name, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(TextField_lastname)
                    .addComponent(TextField_id)
                    .addComponent(TextField_cell))
                .addGap(110, 110, 110))
            .addGroup(Pane_add_clientLayout.createSequentialGroup()
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_add_clientLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(label_titulo_ingreso))
                    .addGroup(Pane_add_clientLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(Button_cancelar_client)
                        .addGap(45, 45, 45)
                        .addComponent(Button_guardar_client)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pane_add_clientLayout.setVerticalGroup(
            Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_add_clientLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(label_titulo_ingreso)
                .addGap(18, 18, 18)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nombre))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_apellido))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cedula))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_cell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_celular))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_cancelar_client)
                    .addComponent(Button_guardar_client))
                .addContainerGap(213, Short.MAX_VALUE))
        );

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
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(Pane_view_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_view_clientsLayout.createSequentialGroup()
                        .addComponent(ScrollPane_client, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_view_clientsLayout.createSequentialGroup()
                        .addComponent(label_titulo_table)
                        .addGap(217, 217, 217))))
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

        javax.swing.GroupLayout PaneTabberd_clientLayout = new javax.swing.GroupLayout(PaneTabberd_client);
        PaneTabberd_client.setLayout(PaneTabberd_clientLayout);
        PaneTabberd_clientLayout.setHorizontalGroup(
            PaneTabberd_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneTabberd_clientLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(Pane_add_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pane_view_clients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(404, Short.MAX_VALUE))
        );
        PaneTabberd_clientLayout.setVerticalGroup(
            PaneTabberd_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneTabberd_clientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaneTabberd_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pane_add_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pane_view_clients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CLIENTE", PaneTabberd_client);

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        Pane_view_producto.setBackground(new java.awt.Color(153, 204, 255));

        Table_client2.setModel(new javax.swing.table.DefaultTableModel(
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
        ScrollPane_producto.setViewportView(Table_client2);

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

        Pane_add_producto.setBackground(new java.awt.Color(102, 204, 255));

        label_titulo_ingreso1.setBackground(new java.awt.Color(0, 0, 0));
        label_titulo_ingreso1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_titulo_ingreso1.setText("INGRESAR PRODCUTO");

        label_nombre_producto.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_nombre_producto.setText(" NOMBRE");

        label_precio.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_precio.setText("PRECIO");

        label_nit.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_nit.setText("NIT");

        label_descripcion.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_descripcion.setText("DESCRIPCION");

        Button_guardar_producto.setText("GUARDAR");

        Button_cancelar_producto.setText("CANCELAR");

        javax.swing.GroupLayout Pane_add_productoLayout = new javax.swing.GroupLayout(Pane_add_producto);
        Pane_add_producto.setLayout(Pane_add_productoLayout);
        Pane_add_productoLayout.setHorizontalGroup(
            Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_add_productoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_add_productoLayout.createSequentialGroup()
                        .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nit)
                            .addComponent(label_precio)
                            .addComponent(label_nombre_producto))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_add_productoLayout.createSequentialGroup()
                        .addComponent(label_descripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TextField_name_producto)
                    .addComponent(TextField_price)
                    .addComponent(TextField_nit)
                    .addComponent(TextField_description, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_add_productoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Button_cancelar_producto)
                .addGap(46, 46, 46)
                .addComponent(Button_guardar_producto)
                .addGap(55, 55, 55))
            .addGroup(Pane_add_productoLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(label_titulo_ingreso1)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        Pane_add_productoLayout.setVerticalGroup(
            Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_add_productoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(label_titulo_ingreso1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_name_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nombre_producto))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_precio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nit))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField_description, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_descripcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_guardar_producto)
                    .addComponent(Button_cancelar_producto))
                .addGap(31, 31, 31))
        );

        jTabbedPane2.addTab("INGRESAR PRODUCTO", Pane_add_producto);

        Pane_modify_producto.setBackground(new java.awt.Color(102, 204, 255));

        label_titulo_ingreso2.setBackground(new java.awt.Color(0, 0, 0));
        label_titulo_ingreso2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_titulo_ingreso2.setText("INGRESAR PRODCUTO");

        label_nombre_producto1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_nombre_producto1.setText(" NOMBRE");

        label_precio1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_precio1.setText("PRECIO");

        label_nit1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_nit1.setText("NIT");

        label_descripcion1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_descripcion1.setText("DESCRIPCION");

        Button_modify_producto.setText("GUARDAR");

        Button_cancelar_producto_modify.setText("CANCELAR");

        javax.swing.GroupLayout Pane_modify_productoLayout = new javax.swing.GroupLayout(Pane_modify_producto);
        Pane_modify_producto.setLayout(Pane_modify_productoLayout);
        Pane_modify_productoLayout.setHorizontalGroup(
            Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nombre_producto1)
                            .addComponent(label_precio1)
                            .addComponent(label_nit1))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_modify_productoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_descripcion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField_name_producto_modify, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(TextField_price_modify)
                    .addComponent(TextField_nit_modify)
                    .addComponent(TextField_description_modify))
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_modify_productoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Button_cancelar_producto_modify)
                .addGap(46, 46, 46)
                .addComponent(Button_modify_producto)
                .addGap(55, 55, 55))
            .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(label_titulo_ingreso2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pane_modify_productoLayout.setVerticalGroup(
            Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(label_titulo_ingreso2)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                        .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField_name_producto_modify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_nombre_producto1))
                        .addGap(18, 18, 18)
                        .addComponent(TextField_price_modify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextField_nit_modify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(label_precio1)
                        .addGap(18, 18, 18)
                        .addComponent(label_nit1)))
                .addGap(18, 18, 18)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_descripcion1)
                    .addComponent(TextField_description_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_modify_producto)
                    .addComponent(Button_cancelar_producto_modify))
                .addGap(31, 31, 31))
        );

        jTabbedPane2.addTab("MODIFICAR PRODUCTO", Pane_modify_producto);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pane_view_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pane_view_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INVENTARIO", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("TABBE");

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_cancelar_client;
    private javax.swing.JButton Button_cancelar_producto;
    private javax.swing.JButton Button_cancelar_producto_modify;
    private javax.swing.JButton Button_guardar_client;
    private javax.swing.JButton Button_guardar_producto;
    private javax.swing.JButton Button_modify_producto;
    private javax.swing.JPanel PaneTabberd_client;
    private javax.swing.JPanel Pane_add_client;
    private javax.swing.JPanel Pane_add_producto;
    private javax.swing.JPanel Pane_modify_producto;
    private javax.swing.JPanel Pane_view_clients;
    private javax.swing.JPanel Pane_view_producto;
    private javax.swing.JScrollPane ScrollPane_client;
    private javax.swing.JScrollPane ScrollPane_producto;
    private javax.swing.JTable Table_client;
    private javax.swing.JTable Table_client2;
    private javax.swing.JTextField TextField_cell;
    private javax.swing.JTextField TextField_description;
    private javax.swing.JTextField TextField_description_modify;
    private javax.swing.JTextField TextField_id;
    private javax.swing.JTextField TextField_lastname;
    private javax.swing.JTextField TextField_name;
    private javax.swing.JTextField TextField_name_producto;
    private javax.swing.JTextField TextField_name_producto_modify;
    private javax.swing.JTextField TextField_nit;
    private javax.swing.JTextField TextField_nit_modify;
    private javax.swing.JTextField TextField_price;
    private javax.swing.JTextField TextField_price_modify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_cedula;
    private javax.swing.JLabel label_celular;
    private javax.swing.JLabel label_descripcion;
    private javax.swing.JLabel label_descripcion1;
    private javax.swing.JLabel label_nit;
    private javax.swing.JLabel label_nit1;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_nombre_producto;
    private javax.swing.JLabel label_nombre_producto1;
    private javax.swing.JLabel label_precio;
    private javax.swing.JLabel label_precio1;
    private javax.swing.JLabel label_titulo_ingreso;
    private javax.swing.JLabel label_titulo_ingreso1;
    private javax.swing.JLabel label_titulo_ingreso2;
    private javax.swing.JLabel label_titulo_table;
    private javax.swing.JLabel label_titulo_table2;
    // End of variables declaration//GEN-END:variables
}
