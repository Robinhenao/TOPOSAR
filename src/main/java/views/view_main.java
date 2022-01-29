package views;

public class view_main extends javax.swing.JFrame {

   
    public view_main() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
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
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1080, 720));

        jLabel1.setText("SISTEMA DE VENTAS E INVENTARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(327, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(469, 469, 469))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
        );

        Pane_add_client.setBackground(new java.awt.Color(204, 255, 255));
        Pane_add_client.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label_titulo_ingreso.setBackground(new java.awt.Color(0, 0, 0));
        label_titulo_ingreso.setText("INGRESAR CLIENTE");

        TextField_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_nameActionPerformed(evt);
            }
        });

        label_nombre.setText(" NOMBRE");

        label_apellido.setText("APELLIDO");

        label_cedula.setText("CEDULA");

        label_celular.setText("CELULAR");

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
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_add_clientLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(label_titulo_ingreso))
                    .addGroup(Pane_add_clientLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_nombre)
                            .addComponent(label_apellido)
                            .addComponent(label_cedula)
                            .addComponent(label_celular))
                        .addGap(66, 66, 66)
                        .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextField_name, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(TextField_lastname)
                            .addComponent(TextField_id)
                            .addComponent(TextField_cell))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_add_clientLayout.createSequentialGroup()
                .addGap(0, 143, Short.MAX_VALUE)
                .addComponent(Button_cancelar_client)
                .addGap(46, 46, 46)
                .addComponent(Button_guardar_client)
                .addGap(55, 55, 55))
        );
        Pane_add_clientLayout.setVerticalGroup(
            Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_add_clientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_titulo_ingreso)
                .addGap(33, 33, 33)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(Pane_add_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_guardar_client)
                    .addComponent(Button_cancelar_client))
                .addGap(106, 106, 106))
        );

        Pane_view_clients.setBackground(new java.awt.Color(204, 255, 255));

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

        label_titulo_table.setText("LISTA CLIENTES");

        javax.swing.GroupLayout Pane_view_clientsLayout = new javax.swing.GroupLayout(Pane_view_clients);
        Pane_view_clients.setLayout(Pane_view_clientsLayout);
        Pane_view_clientsLayout.setHorizontalGroup(
            Pane_view_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_view_clientsLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(ScrollPane_client, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(Pane_view_clientsLayout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(label_titulo_table)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pane_view_clientsLayout.setVerticalGroup(
            Pane_view_clientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_view_clientsLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(label_titulo_table)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(ScrollPane_client, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout PaneTabberd_clientLayout = new javax.swing.GroupLayout(PaneTabberd_client);
        PaneTabberd_client.setLayout(PaneTabberd_clientLayout);
        PaneTabberd_clientLayout.setHorizontalGroup(
            PaneTabberd_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneTabberd_clientLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(Pane_add_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(Pane_view_clients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        PaneTabberd_clientLayout.setVerticalGroup(
            PaneTabberd_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneTabberd_clientLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PaneTabberd_clientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pane_add_client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pane_view_clients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CLIENTE", PaneTabberd_client);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 983, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("INVENTARIO", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 983, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("VENTAS", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
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

    private void TextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_nameActionPerformed

    private void Button_guardar_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_guardar_clientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_guardar_clientActionPerformed

    private void Button_cancelar_clientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_cancelar_clientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_cancelar_clientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_cancelar_client;
    private javax.swing.JButton Button_guardar_client;
    private javax.swing.JPanel PaneTabberd_client;
    private javax.swing.JPanel Pane_add_client;
    private javax.swing.JPanel Pane_view_clients;
    private javax.swing.JScrollPane ScrollPane_client;
    private javax.swing.JTable Table_client;
    private javax.swing.JTextField TextField_cell;
    private javax.swing.JTextField TextField_id;
    private javax.swing.JTextField TextField_lastname;
    private javax.swing.JTextField TextField_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label_apellido;
    private javax.swing.JLabel label_cedula;
    private javax.swing.JLabel label_celular;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_titulo_ingreso;
    private javax.swing.JLabel label_titulo_table;
    // End of variables declaration//GEN-END:variables
}
