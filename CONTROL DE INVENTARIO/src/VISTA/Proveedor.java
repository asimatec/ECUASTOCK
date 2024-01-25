package VISTA;

import CONTROLADOR.Proveedor_DAO;
import MODELO.Usuarios;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author QUIMIS
 */
public class Proveedor extends javax.swing.JFrame {

    /**
     * Creates new form Proveedor1
     */
    public Proveedor() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GENERO = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fecha_naci = new com.toedter.calendar.JDateChooser();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        ntmLimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtGmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        genero = new javax.swing.JComboBox<>();
        lblCerrar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 240, -1));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6451984_glass_logistic_magnifier_magnifying_shipping_icon.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ingrese el RUC para buscar:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 220, -1));

        txtValor.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 140, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Teléfono:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 70, -1));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 140, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Dirección:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 81, -1));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 140, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fecha de nacimiento:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 150, -1));

        fecha_naci.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(fecha_naci, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 220, -1));

        btnGuardar.setBackground(new java.awt.Color(204, 204, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 51, 51));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/285657_floppy_guardar_save_icon.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        btnModificar.setBackground(new java.awt.Color(204, 204, 255));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 51, 51));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5402373_write_modify_tool_edit_pen_icon.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(204, 204, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 51, 51));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/9004743_trash_delete_bin_remove_icon.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        ntmLimpiar.setBackground(new java.awt.Color(204, 204, 255));
        ntmLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ntmLimpiar.setForeground(new java.awt.Color(0, 51, 51));
        ntmLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/8008257_brush_paint_wide brush_paint brush_repair_icon.png"))); // NOI18N
        ntmLimpiar.setText("Limpiar");
        ntmLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ntmLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntmLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(ntmLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Genero:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 70, -1));

        txtGmail.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtGmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 140, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Correo:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 70, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 66, -1));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 140, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 140, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 66, -1));

        genero.setBackground(new java.awt.Color(255, 255, 255));
        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Femenino", "Masculino" }));
        jPanel1.add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 140, -1));

        lblCerrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(153, 0, 0));
        lblCerrar.setText("X");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 20, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("RUC / CI:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //metodo para limpiar los campos 
    private void limpiarCampos() {
        txtValor.setText("");
        txtBuscar.setText("");
        txtNombre.setText("");
        txtGmail.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        genero.setSelectedIndex(0);  // Ajusta el índice según la lógica de tu programa
        fecha_naci.setDate(null);
    }

    //metodo para validar los campos 
    private boolean validarCampos() {
        if (txtValor.getText().isEmpty()
                || txtNombre.getText().isEmpty()
                || txtGmail.getText().isEmpty()
                || txtApellido.getText().isEmpty()
                || txtDireccion.getText().isEmpty()
                || txtTelefono.getText().isEmpty()
                || genero.getSelectedIndex() == -1
                || fecha_naci.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean validarCampoBuscar() {
        if (txtBuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (validarCampos()) {
            Usuarios user = new Usuarios();
            //se agrega los campos para almacenar los datos
            user.setRuc(Integer.parseInt(txtValor.getText()));
            user.setNombre(txtNombre.getText());
            user.setCorreo(txtGmail.getText());
            user.setApellido(txtApellido.getText());
            user.setDireccion(txtDireccion.getText());
            user.setTelefono(txtTelefono.getText());
            user.setGenero(genero.getSelectedItem().toString());
            user.setFecha_nacimiento(fecha_naci.getDate());
            //se llama el metodo 
            Proveedor_DAO provedor = new Proveedor_DAO();
            provedor.InsertarUsuarioProveedor(user);
            //si cumple con todo envia un mensaje 
            JOptionPane.showMessageDialog(this, "Guardado correctamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
           
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        if (validarCampos()) {
            int rucModificado = Integer.parseInt(txtBuscar.getText());
            String nombreModificado = txtNombre.getText();
            String correoModificado = txtGmail.getText();
            String apellidoModificado = txtApellido.getText();
            String direccionModificada = txtDireccion.getText();
            String telefonoModificado = txtTelefono.getText();
            String generoModificado = genero.getSelectedItem().toString();
            Date fechaNacimientoModificada = fecha_naci.getDate();

            // Crea un objeto Usuarios con los datos actualizados
            Usuarios usuarioModificado = new Usuarios(rucModificado, nombreModificado, correoModificado, apellidoModificado,
                    telefonoModificado, direccionModificada, generoModificado, fechaNacimientoModificada);

            // Crea una instancia de Proveedor_DAO
            Proveedor_DAO provedor = new Proveedor_DAO();

            // Realiza la modificación
            provedor.modificarProveedor(usuarioModificado);

            // Muestra un mensaje indicando que la modificación fue exitosa
            JOptionPane.showMessageDialog(this, "Proveedor modificado correctamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (validarCampos()) {
            int rucEliminar = Integer.parseInt(txtBuscar.getText());

            // Crea una instancia de Proveedor_DAO
            Proveedor_DAO provedor = new Proveedor_DAO();

            // Realiza la eliminación
            provedor.EliminarProveedor(rucEliminar);

            // Muestra un mensaje indicando que la eliminación fue exitosa
            JOptionPane.showMessageDialog(this, "Proveedor eliminado correctamente", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);

            // Limpiar los campos después de la eliminación
            limpiarCampos();
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void ntmLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntmLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_ntmLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (validarCampoBuscar()) {
            int rucABuscar = Integer.parseInt(txtBuscar.getText());

            // Crea una instancia de Proveedor_DAO
            Proveedor_DAO provedor = new Proveedor_DAO();

            // Realiza la búsqueda
            Usuarios usuarioEncontrado = provedor.BuscarUsuarioPorRUC(rucABuscar);
            txtValor.setText(String.valueOf(rucABuscar));

            // Si se encontró un usuario, actualiza los campos de texto
            if (usuarioEncontrado != null) {
                txtNombre.setText(usuarioEncontrado.getNombre());
                txtGmail.setText(usuarioEncontrado.getCorreo());
                txtApellido.setText(usuarioEncontrado.getApellido());
                txtDireccion.setText(usuarioEncontrado.getDireccion());
                txtTelefono.setText(usuarioEncontrado.getTelefono());
                genero.setSelectedItem(usuarioEncontrado.getGenero());
                fecha_naci.setDate(usuarioEncontrado.getFecha_nacimiento());
            } else {
                // Si no se encontró, muestra un mensaje indicando que no existe
                JOptionPane.showMessageDialog(this, "Proveedor no encontrado", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        dispose();
        MenuPrincipal principal = new MenuPrincipal();
        principal.setVisible(true);
    }//GEN-LAST:event_lblCerrarMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Proveedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Proveedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Proveedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Proveedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Proveedor1().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GENERO;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private com.toedter.calendar.JDateChooser fecha_naci;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JButton ntmLimpiar;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
