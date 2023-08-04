package proyectointgrador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tabla extends javax.swing.JFrame {
    
    List<Legajo> lista = new ArrayList <>(); 
    
    DefaultTableModel modelo;
    int fila = 0;
    
    public Tabla() {
        initComponents();
        
        String [] columnNames = {"Matricula", "DNI", "Nombre", "Apellido", "Direccion", "Correo", "Telefono", "Año", "Curso", "Especialidad"};
        modelo = new DefaultTableModel (columnNames, fila);
        tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        cmdAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        txtEspecialidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmdBorrar = new javax.swing.JButton();
        cmdBuscar1 = new javax.swing.JButton();
        cmdBuscar2 = new javax.swing.JButton();
        cmdBuscar3 = new javax.swing.JButton();
        cmdActualizar = new javax.swing.JButton();
        cmdDesarrolladores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setType(java.awt.Window.Type.POPUP);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Matricula");

        txtMatricula.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("DNI");

        txtDNI.setBackground(new java.awt.Color(153, 204, 255));

        tabla.setBackground(new java.awt.Color(102, 153, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.setToolTipText("");
        tabla.setGridColor(new java.awt.Color(204, 204, 204));
        tabla.setSelectionBackground(new java.awt.Color(153, 204, 255));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        cmdAgregar.setBackground(new java.awt.Color(102, 153, 255));
        cmdAgregar.setForeground(new java.awt.Color(255, 255, 255));
        cmdAgregar.setText("Agregar");
        cmdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        txtNombre.setBackground(new java.awt.Color(153, 204, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Apellido");

        txtApellido.setBackground(new java.awt.Color(153, 204, 255));

        txtDireccion.setBackground(new java.awt.Color(153, 204, 255));

        txtCorreo.setBackground(new java.awt.Color(153, 204, 255));

        txtTelefono.setBackground(new java.awt.Color(153, 204, 255));

        txtAño.setBackground(new java.awt.Color(153, 204, 255));

        txtCurso.setBackground(new java.awt.Color(153, 204, 255));

        txtEspecialidad.setBackground(new java.awt.Color(153, 204, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Direccion");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Correo Electronico");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Telefono");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Año");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Curso");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Especialidad");

        cmdBorrar.setBackground(new java.awt.Color(102, 153, 255));
        cmdBorrar.setForeground(new java.awt.Color(255, 255, 255));
        cmdBorrar.setText("Dar de baja");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });

        cmdBuscar1.setBackground(new java.awt.Color(102, 153, 255));
        cmdBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        cmdBuscar1.setText("Buscar");
        cmdBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscar1ActionPerformed(evt);
            }
        });

        cmdBuscar2.setBackground(new java.awt.Color(102, 153, 255));
        cmdBuscar2.setForeground(new java.awt.Color(255, 255, 255));
        cmdBuscar2.setText("Buscar");
        cmdBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscar2ActionPerformed(evt);
            }
        });

        cmdBuscar3.setBackground(new java.awt.Color(102, 153, 255));
        cmdBuscar3.setForeground(new java.awt.Color(255, 255, 255));
        cmdBuscar3.setText("Buscar");
        cmdBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscar3ActionPerformed(evt);
            }
        });

        cmdActualizar.setBackground(new java.awt.Color(102, 153, 255));
        cmdActualizar.setForeground(new java.awt.Color(255, 255, 255));
        cmdActualizar.setText("Actualizar");
        cmdActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarActionPerformed(evt);
            }
        });

        cmdDesarrolladores.setBackground(new java.awt.Color(102, 153, 255));
        cmdDesarrolladores.setForeground(new java.awt.Color(255, 255, 255));
        cmdDesarrolladores.setText("DESARROLLADORES");
        cmdDesarrolladores.setToolTipText("");
        cmdDesarrolladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDesarrolladoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmdBuscar1)
                                    .addComponent(cmdBuscar2)
                                    .addComponent(cmdBuscar3))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAño)
                                        .addComponent(txtCurso)
                                        .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmdBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmdActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdDesarrolladores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdBuscar1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdBuscar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmdBuscar3)
                            .addComponent(cmdBorrar)
                            .addComponent(cmdAgregar)
                            .addComponent(cmdActualizar)
                            .addComponent(cmdDesarrolladores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(48, 48, 48)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarActionPerformed
        Legajo L1 = new Legajo (txtMatricula.getText(), txtDNI.getText(), txtNombre.getText(), txtApellido.getText(), txtDireccion.getText(), txtCorreo.getText(), txtTelefono.getText(), txtAño.getText(), txtCurso.getText(), txtEspecialidad.getText());
        
        lista.add(L1);
        
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object [] objFila = {lista.get(i).getMatricula(), lista.get(i) .getDni(), lista.get(i) .getNombre(), lista.get(i) .getApellido(), lista.get(i) .getDireccion(), lista.get(i) .getCorreo(), lista.get(i) .getTelefono(), lista.get(i) .getAño(), lista.get(i) .getCurso(), lista.get(i) .getEspecialidad() };
            modelo.addRow(objFila);
          
        }
    }//GEN-LAST:event_cmdAgregarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        modelo.removeRow(fila);
        lista.remove(fila);
        
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object [] objFila = {lista.get(i).getMatricula(), lista.get(i) .getDni(), lista.get(i) .getNombre(), lista.get(i) .getApellido(), lista.get(i) .getDireccion(), lista.get(i) .getCorreo(), lista.get(i) .getTelefono(), lista.get(i) .getAño(), lista.get(i) .getCurso(), lista.get(i) .getEspecialidad() };
            modelo.addRow(objFila);
          
        }
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        fila = tabla.getSelectedRow();
        
        txtMatricula.setText(modelo.getValueAt(fila, 0).toString());
        txtDNI.setText(modelo.getValueAt(fila, 1).toString());
        txtNombre.setText(modelo.getValueAt(fila, 2).toString());
        txtApellido.setText(modelo.getValueAt(fila, 3).toString());
        txtDireccion.setText(modelo.getValueAt(fila, 4).toString());
        txtCorreo.setText(modelo.getValueAt(fila, 5).toString());
        txtTelefono.setText(modelo.getValueAt(fila, 6).toString());
        txtAño.setText(modelo.getValueAt(fila, 7).toString());
        txtCurso.setText(modelo.getValueAt(fila, 8).toString());
        txtEspecialidad.setText(modelo.getValueAt(fila, 9).toString());
    }//GEN-LAST:event_tablaMouseClicked

    private void cmdBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscar1ActionPerformed
        
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object [] objFila = {lista.get(i).getMatricula(), lista.get(i) .getDni(), lista.get(i) .getNombre(), lista.get(i) .getApellido(), lista.get(i) .getDireccion(), lista.get(i) .getCorreo(), lista.get(i) .getTelefono(), lista.get(i) .getAño(), lista.get(i) .getCurso(), lista.get(i) .getEspecialidad() };
            
            if (lista.get(i).getMatricula().startsWith(txtMatricula.getText())){
            modelo.addRow(objFila);
        
            } 
        }
    }//GEN-LAST:event_cmdBuscar1ActionPerformed

    private void cmdBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscar2ActionPerformed
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object [] objFila = {lista.get(i).getMatricula(), lista.get(i) .getDni(), lista.get(i) .getNombre(), lista.get(i) .getApellido(), lista.get(i) .getDireccion(), lista.get(i) .getCorreo(), lista.get(i) .getTelefono(), lista.get(i) .getAño(), lista.get(i) .getCurso(), lista.get(i) .getEspecialidad() };
            
            if (lista.get(i).getDni().startsWith(txtDNI.getText())){
            modelo.addRow(objFila);
        
            } 
        }
    }//GEN-LAST:event_cmdBuscar2ActionPerformed

    private void cmdBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscar3ActionPerformed
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object [] objFila = {lista.get(i).getMatricula(), lista.get(i) .getDni(), lista.get(i) .getNombre(), lista.get(i) .getApellido(), lista.get(i) .getDireccion(), lista.get(i) .getCorreo(), lista.get(i) .getTelefono(), lista.get(i) .getAño(), lista.get(i) .getCurso(), lista.get(i) .getEspecialidad() };
            
            if (lista.get(i).getApellido().startsWith(txtApellido.getText())){
            modelo.addRow(objFila);
        
            } 
        }
    }//GEN-LAST:event_cmdBuscar3ActionPerformed

    private void cmdActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarActionPerformed
        
        lista.get(fila).setMatricula(txtMatricula.getText());
        lista.get(fila).setDni(txtDNI.getText());
        lista.get(fila).setNombre(txtNombre.getText());
        lista.get(fila).setApellido(txtApellido.getText());
        lista.get(fila).setDireccion(txtDireccion.getText());
        lista.get(fila).setCorreo(txtCorreo.getText());
        lista.get(fila).setTelefono(txtTelefono.getText());
        lista.get(fila).setAño(txtAño.getText());
        lista.get(fila).setCurso(txtCurso.getText());
        lista.get(fila).setEspecialidad(txtEspecialidad.getText());
        
        modelo.setRowCount(0);
        for (int i = 0; i < lista.size(); i++) {
            Object [] objFila = {lista.get(i).getMatricula(), lista.get(i) .getDni(), lista.get(i) .getNombre(), lista.get(i) .getApellido(), lista.get(i) .getDireccion(), lista.get(i) .getCorreo(), lista.get(i) .getTelefono(), lista.get(i) .getAño(), lista.get(i) .getCurso(), lista.get(i) .getEspecialidad() };
            modelo.addRow(objFila);
          
        }
        
    }//GEN-LAST:event_cmdActualizarActionPerformed

    private void cmdDesarrolladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDesarrolladoresActionPerformed
        JOptionPane.showMessageDialog(null,"Desarrolladores: Diaz Matias, Jurado David y Garaban Luciano.\nCurso: 7mo3ra");
    }//GEN-LAST:event_cmdDesarrolladoresActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdActualizar;
    private javax.swing.JButton cmdAgregar;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdBuscar1;
    private javax.swing.JButton cmdBuscar2;
    private javax.swing.JButton cmdBuscar3;
    private javax.swing.JButton cmdDesarrolladores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
