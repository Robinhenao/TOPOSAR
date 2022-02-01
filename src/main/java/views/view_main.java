package views;

import scripts.consulta;
import utils.cliente;
import utils.producto;

public class view_main extends javax.swing.JFrame {
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
        Pane_cliente = new javax.swing.JPanel();
        Pane_view_clients = new javax.swing.JPanel();
        ScrollPane_client = new javax.swing.JScrollPane();
        Table_client = new javax.swing.JTable();
        label_titulo_table = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
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
        TextField_cell2 = new javax.swing.JTextField();
        label_celular2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label_titulo_ingreso1 = new javax.swing.JLabel();
        TextField_name1 = new javax.swing.JTextField();
        TextField_lastname1 = new javax.swing.JTextField();
        TextField_id1 = new javax.swing.JTextField();
        TextField_cell1 = new javax.swing.JTextField();
        label_celular1 = new javax.swing.JLabel();
        label_cedula1 = new javax.swing.JLabel();
        label_apellido1 = new javax.swing.JLabel();
        label_nombre1 = new javax.swing.JLabel();
        Button_cancelar_client1 = new javax.swing.JButton();
        Button_guardar_client1 = new javax.swing.JButton();
        label_celular3 = new javax.swing.JLabel();
        TextField_cell3 = new javax.swing.JTextField();
        Button_guardar_client2 = new javax.swing.JButton();
        Pane_producto = new javax.swing.JPanel();
        Pane_view_producto = new javax.swing.JPanel();
        ScrollPane_producto = new javax.swing.JScrollPane();
        Table_product = new javax.swing.JTable();
        label_titulo_table2 = new javax.swing.JLabel();
        TabbedPane_producto = new javax.swing.JTabbedPane();
        Pane_add_producto = new javax.swing.JPanel();
        label_titulo_ingreso_producto = new javax.swing.JLabel();
        TextField_name_producto = new javax.swing.JTextField();
        TextField_price_producto = new javax.swing.JTextField();
        label_nombre_producto = new javax.swing.JLabel();
        label_precio_producto = new javax.swing.JLabel();
        label_descripcion_producto = new javax.swing.JLabel();
        Button_guardar_producto = new javax.swing.JButton();
        Button_cancelar_producto = new javax.swing.JButton();
        TextField_id_producto_modify1 = new javax.swing.JTextField();
        label_id1 = new javax.swing.JLabel();
        TextField_price_producto1 = new javax.swing.JTextField();
        label_precio_producto1 = new javax.swing.JLabel();
        TextField_description_producto2 = new javax.swing.JTextField();
        Pane_modify_producto = new javax.swing.JPanel();
        label_titulo_ingreso2 = new javax.swing.JLabel();
        Button_modify_producto = new javax.swing.JButton();
        Button_cancelar_producto_modify = new javax.swing.JButton();
        label_nombre_producto2 = new javax.swing.JLabel();
        TextField_name_producto1 = new javax.swing.JTextField();
        label_precio_producto2 = new javax.swing.JLabel();
        TextField_price_producto2 = new javax.swing.JTextField();
        label_precio_producto3 = new javax.swing.JLabel();
        TextField_price_producto3 = new javax.swing.JTextField();
        label_id2 = new javax.swing.JLabel();
        TextField_id_producto_modify2 = new javax.swing.JTextField();
        TextField_description_producto1 = new javax.swing.JTextField();
        label_descripcion_producto1 = new javax.swing.JLabel();
        Button_modify_producto1 = new javax.swing.JButton();
        label_nombre_producto3 = new javax.swing.JLabel();
        TextField_name_producto2 = new javax.swing.JTextField();

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

        javax.swing.GroupLayout PaneHead2Layout = new javax.swing.GroupLayout(PaneHead2);
        PaneHead2.setLayout(PaneHead2Layout);
        PaneHead2Layout.setHorizontalGroup(
            PaneHead2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1683, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
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

        Pane_add_client.setBackground(new java.awt.Color(102, 204, 255));

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

        Button_guardar_client.setText("GUARDAR");
        Button_guardar_client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_guardar_clientActionPerformed(evt);
            }
        });

        Button_cancelar_client.setText("CANCELAR");

        label_celular2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_celular2.setText("CORREO");

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
                    .addComponent(TextField_cell2)
                    .addGroup(Pane_add_clientLayout.createSequentialGroup()
                        .addComponent(Button_cancelar_client)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(Button_guardar_client))
                    .addComponent(TextField_name)
                    .addComponent(TextField_lastname)
                    .addComponent(TextField_id)
                    .addComponent(TextField_cell))
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
                    .addComponent(TextField_cell2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_celular2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_cancelar_client)
                    .addComponent(Button_guardar_client))
                .addGap(30, 30, 30))
        );

        jTabbedPane2.addTab("INGRESAR CLIENTE", Pane_add_client);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        label_titulo_ingreso1.setBackground(new java.awt.Color(0, 0, 0));
        label_titulo_ingreso1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_titulo_ingreso1.setText("MODIFICAR CLIENTE");

        label_celular1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_celular1.setText("CELULAR");

        label_cedula1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_cedula1.setText("CEDULA");

        label_apellido1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_apellido1.setText("APELLIDO");

        label_nombre1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_nombre1.setText("NOMBRE");

        Button_cancelar_client1.setText("CANCELAR");

        Button_guardar_client1.setText("GUARDAR");
        Button_guardar_client1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_guardar_client1ActionPerformed(evt);
            }
        });

        label_celular3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_celular3.setText("CORREO");

        Button_guardar_client2.setText("CARGAR");
        Button_guardar_client2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_guardar_client2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_cedula1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label_apellido1)
                                .addComponent(label_celular1)
                                .addComponent(label_celular3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label_nombre1)
                                .addGap(7, 7, 7)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TextField_id1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextField_lastname1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(Button_cancelar_client1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                        .addComponent(Button_guardar_client1))
                                    .addComponent(TextField_cell1)
                                    .addComponent(TextField_cell3)))
                            .addComponent(TextField_name1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Button_guardar_client2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(label_titulo_ingreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(label_titulo_ingreso1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_guardar_client2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_cedula1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_lastname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TextField_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField_cell1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_celular1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField_cell3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_celular3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_cancelar_client1)
                            .addComponent(Button_guardar_client1)))
                    .addComponent(label_apellido1))
                .addContainerGap())
        );

        jTabbedPane2.addTab("MODIFICAR CLIENTE", jPanel1);

        javax.swing.GroupLayout Pane_clienteLayout = new javax.swing.GroupLayout(Pane_cliente);
        Pane_cliente.setLayout(Pane_clienteLayout);
        Pane_clienteLayout.setHorizontalGroup(
            Pane_clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_clienteLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Pane_view_clients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(404, Short.MAX_VALUE))
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
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
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

        Pane_add_producto.setBackground(new java.awt.Color(102, 204, 255));

        label_titulo_ingreso_producto.setBackground(new java.awt.Color(0, 0, 0));
        label_titulo_ingreso_producto.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_titulo_ingreso_producto.setText("INGRESAR PRODCUTO");

        label_nombre_producto.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_nombre_producto.setText("NOMBRE");

        label_precio_producto.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_precio_producto.setText("PRECIO");

        label_descripcion_producto.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_descripcion_producto.setText("DESCRIPCION");

        Button_guardar_producto.setText("GUARDAR");
        Button_guardar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_guardar_productoActionPerformed(evt);
            }
        });

        Button_cancelar_producto.setText("CANCELAR");

        label_id1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_id1.setText("CANTIDAD");

        label_precio_producto1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_precio_producto1.setText("COSTO");

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
                        .addComponent(label_precio_producto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextField_price_producto1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_add_productoLayout.createSequentialGroup()
                        .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_id1)
                            .addComponent(label_descripcion_producto)
                            .addComponent(label_precio_producto))
                        .addGap(50, 50, 50)
                        .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextField_price_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField_id_producto_modify1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextField_description_producto2, javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addComponent(TextField_price_producto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_precio_producto1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_precio_producto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField_price_producto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id1)
                    .addComponent(TextField_id_producto_modify1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_descripcion_producto)
                    .addComponent(TextField_description_producto2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(Pane_add_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_cancelar_producto)
                    .addComponent(Button_guardar_producto))
                .addGap(78, 78, 78))
        );

        TabbedPane_producto.addTab("INGRESAR PRODUCTO", Pane_add_producto);

        Pane_modify_producto.setBackground(new java.awt.Color(102, 204, 255));

        label_titulo_ingreso2.setBackground(new java.awt.Color(0, 0, 0));
        label_titulo_ingreso2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        label_titulo_ingreso2.setText("MODIFICAR PRODCUTO");

        Button_modify_producto.setText("GUARDAR");

        Button_cancelar_producto_modify.setText("CANCELAR");

        label_nombre_producto2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_nombre_producto2.setText("NOMBRE");

        label_precio_producto2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_precio_producto2.setText("COSTO");

        label_precio_producto3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_precio_producto3.setText("PRECIO");

        label_id2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_id2.setText("CANTIDAD");

        label_descripcion_producto1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_descripcion_producto1.setText("DESCRIPCION");

        Button_modify_producto1.setText("CARGAR");
        Button_modify_producto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_modify_producto1ActionPerformed(evt);
            }
        });

        label_nombre_producto3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        label_nombre_producto3.setText("ID");

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
                                    .addComponent(label_descripcion_producto1)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pane_modify_productoLayout.createSequentialGroup()
                                    .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(label_precio_producto3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_nombre_producto2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_nombre_producto3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label_precio_producto2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                                .addComponent(label_id2)
                                .addGap(38, 38, 38)))
                        .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextField_id_producto_modify2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                                    .addComponent(Button_cancelar_producto_modify)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_modify_producto))
                                .addComponent(TextField_price_producto3)
                                .addComponent(TextField_name_producto1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TextField_description_producto1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                                    .addComponent(TextField_name_producto2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Button_modify_producto1)))
                            .addComponent(TextField_price_producto2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(label_titulo_ingreso2)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        Pane_modify_productoLayout.setVerticalGroup(
            Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_modify_productoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_titulo_ingreso2)
                .addGap(18, 18, 18)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nombre_producto3)
                    .addComponent(TextField_name_producto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_modify_producto1))
                .addGap(34, 34, 34)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_nombre_producto2)
                    .addComponent(TextField_name_producto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_precio_producto2)
                    .addComponent(TextField_price_producto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_precio_producto3)
                    .addComponent(TextField_price_producto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_id2)
                    .addComponent(TextField_id_producto_modify2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_descripcion_producto1)
                    .addComponent(TextField_description_producto1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(Pane_modify_productoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_cancelar_producto_modify)
                    .addComponent(Button_modify_producto))
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
                .addContainerGap(409, Short.MAX_VALUE))
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
        double cost=Double.parseDouble(TextField_price_producto.getText());
        int quantity=15;
        String description=TextField_description_producto.getText();

        produc= new producto(1,name,price,cost,quantity,description);
        consul.registrar_producto(produc);
        table_model_producto();
    }//GEN-LAST:event_Button_guardar_productoActionPerformed

    private void Button_guardar_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_guardar_clientActionPerformed
        String name=TextField_name.getText();
        String lastname=TextField_lastname.getText();
        int cc=Integer.parseInt(TextField_id.getText());
        int cell=Integer.parseInt(TextField_cell.getText());
        String email=TextField_cell.getText();
        client= new cliente(1,name,lastname,cc,cell,email);

        consul.registrar_cliente(client);
        table_model_cliente();
    }//GEN-LAST:event_Button_guardar_clientActionPerformed

    private void Button_modify_producto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_modify_producto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_modify_producto1ActionPerformed

    private void Button_guardar_client1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_guardar_client1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_guardar_client1ActionPerformed

    private void Button_guardar_client2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_guardar_client2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_guardar_client2ActionPerformed
    
    private void table_model_cliente(){
        Table_client.setModel(consul.consulta_cliente());
    }

    private void table_model_producto(){
        Table_product.setModel(consul.consulta_inventario());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_cancelar_client;
    private javax.swing.JButton Button_cancelar_client1;
    private javax.swing.JButton Button_cancelar_producto;
    private javax.swing.JButton Button_cancelar_producto_modify;
    private javax.swing.JButton Button_guardar_client;
    private javax.swing.JButton Button_guardar_client1;
    private javax.swing.JButton Button_guardar_client2;
    private javax.swing.JButton Button_guardar_producto;
    private javax.swing.JButton Button_modify_producto;
    private javax.swing.JButton Button_modify_producto1;
    private javax.swing.JPanel PaneHead;
    private javax.swing.JPanel PaneHead2;
    private javax.swing.JPanel Pane_add_client;
    private javax.swing.JPanel Pane_add_producto;
    private javax.swing.JPanel Pane_cliente;
    private javax.swing.JPanel Pane_modify_producto;
    private javax.swing.JPanel Pane_producto;
    private javax.swing.JPanel Pane_view_clients;
    private javax.swing.JPanel Pane_view_producto;
    private javax.swing.JScrollPane ScrollPane_client;
    private javax.swing.JScrollPane ScrollPane_producto;
    private javax.swing.JTabbedPane TabbedPane_producto;
    private javax.swing.JTable Table_client;
    private javax.swing.JTable Table_product;
    private javax.swing.JTextField TextField_cell;
    private javax.swing.JTextField TextField_cell1;
    private javax.swing.JTextField TextField_cell2;
    private javax.swing.JTextField TextField_cell3;
    private javax.swing.JTextField TextField_description_producto1;
    private javax.swing.JTextField TextField_description_producto2;
    private javax.swing.JTextField TextField_id;
    private javax.swing.JTextField TextField_id1;
    private javax.swing.JTextField TextField_id_producto_modify1;
    private javax.swing.JTextField TextField_id_producto_modify2;
    private javax.swing.JTextField TextField_lastname;
    private javax.swing.JTextField TextField_lastname1;
    private javax.swing.JTextField TextField_name;
    private javax.swing.JTextField TextField_name1;
    private javax.swing.JTextField TextField_name_producto;
    private javax.swing.JTextField TextField_name_producto1;
    private javax.swing.JTextField TextField_name_producto2;
    private javax.swing.JTextField TextField_price_producto;
    private javax.swing.JTextField TextField_price_producto1;
    private javax.swing.JTextField TextField_price_producto2;
    private javax.swing.JTextField TextField_price_producto3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_apellido1;
    private javax.swing.JLabel label_cedula;
    private javax.swing.JLabel label_cedula1;
    private javax.swing.JLabel label_celular;
    private javax.swing.JLabel label_celular1;
    private javax.swing.JLabel label_celular2;
    private javax.swing.JLabel label_celular3;
    private javax.swing.JLabel label_descripcion_producto;
    private javax.swing.JLabel label_descripcion_producto1;
    private javax.swing.JLabel label_id1;
    private javax.swing.JLabel label_id2;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_nombre1;
    private javax.swing.JLabel label_nombre_producto;
    private javax.swing.JLabel label_nombre_producto2;
    private javax.swing.JLabel label_nombre_producto3;
    private javax.swing.JLabel label_precio_producto;
    private javax.swing.JLabel label_precio_producto1;
    private javax.swing.JLabel label_precio_producto2;
    private javax.swing.JLabel label_precio_producto3;
    private javax.swing.JLabel label_titulo_ingreso;
    private javax.swing.JLabel label_titulo_ingreso1;
    private javax.swing.JLabel label_titulo_ingreso2;
    private javax.swing.JLabel label_titulo_ingreso_producto;
    private javax.swing.JLabel label_titulo_table;
    private javax.swing.JLabel label_titulo_table2;
    // End of variables declaration//GEN-END:variables
}
