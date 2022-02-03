package views;

import scripts.consulta;

public class view_cliente extends javax.swing.JFrame {
    private consulta consul;

    public view_cliente() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Label_titulo = new javax.swing.JLabel();
        ScrollPane_clientes = new javax.swing.JScrollPane();
        Table_cliente = new javax.swing.JTable();
        Button_cancelar = new javax.swing.JButton();
        Button_aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_titulo.setText("LISTA CLIENTES");

        Table_cliente.setModel(new javax.swing.table.DefaultTableModel(
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
        ScrollPane_clientes.setViewportView(Table_cliente);

        Button_cancelar.setText("CANCELAR");
        Button_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_cancelarActionPerformed(evt);
            }
        });

        Button_aceptar.setText("ACEPTAR");
        Button_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Button_cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(Button_aceptar)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ScrollPane_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(514, 514, 514)
                .addComponent(Label_titulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Label_titulo)
                .addGap(18, 18, 18)
                .addComponent(ScrollPane_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_cancelar)
                    .addComponent(Button_aceptar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_aceptarActionPerformed
        table_model_cliente();
    }//GEN-LAST:event_Button_aceptarActionPerformed

    private void Button_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_cancelarActionPerformed
        this.setVisible(false); 
    }//GEN-LAST:event_Button_cancelarActionPerformed
    private void table_model_cliente(){
        Table_cliente.setModel(consul.consulta_cliente());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_aceptar;
    private javax.swing.JButton Button_cancelar;
    private javax.swing.JLabel Label_titulo;
    private javax.swing.JScrollPane ScrollPane_clientes;
    private javax.swing.JTable Table_cliente;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
