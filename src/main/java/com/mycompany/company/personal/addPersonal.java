
package com.mycompany.company.personal;

import com.mycompany.company.Inicio;
import com.mycompany.company.conectarDB.conectarBaseDeDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class addPersonal extends javax.swing.JFrame {
    
    private Connection conexion;
    
    public addPersonal() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_fecha_nac = new javax.swing.JLabel();
        lbl_add_personal = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_nombre1 = new javax.swing.JLabel();
        lbl_cargo = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        field_nombre = new javax.swing.JTextField();
        field_cargo = new javax.swing.JTextField();
        field_telefono = new javax.swing.JTextField();
        field_email = new javax.swing.JTextField();
        lbl_year = new javax.swing.JLabel();
        field_fecha_nac = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        lbl_empleado_id = new javax.swing.JLabel();
        field_empleado_id = new javax.swing.JTextField();
        field_apellido = new javax.swing.JTextField();
        btn_atras = new javax.swing.JButton();
        btn_ingresar1 = new javax.swing.JButton();
        cuadro_admin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cuadro_contacto1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_fecha_nac.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        lbl_fecha_nac.setForeground(new java.awt.Color(153, 153, 153));
        lbl_fecha_nac.setText("Fecha de nacimiento:");
        getContentPane().add(lbl_fecha_nac, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 200, 40));

        lbl_add_personal.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 30)); // NOI18N
        lbl_add_personal.setForeground(new java.awt.Color(51, 153, 0));
        lbl_add_personal.setText("Añadir Personal");
        getContentPane().add(lbl_add_personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 280, 70));

        lbl_email.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(153, 153, 153));
        lbl_email.setText("Email:");
        getContentPane().add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 80, 70));

        lbl_nombre1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        lbl_nombre1.setForeground(new java.awt.Color(153, 153, 153));
        lbl_nombre1.setText("Primer Nombre:");
        getContentPane().add(lbl_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 150, 70));

        lbl_cargo.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        lbl_cargo.setForeground(new java.awt.Color(153, 153, 153));
        lbl_cargo.setText("Cargo:");
        getContentPane().add(lbl_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 70, 70));

        lbl_telefono.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        lbl_telefono.setForeground(new java.awt.Color(153, 153, 153));
        lbl_telefono.setText("Teléfono:");
        getContentPane().add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 100, 70));

        field_nombre.setBackground(new java.awt.Color(242, 242, 242));
        field_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        field_nombre.setInheritsPopupMenu(true);
        field_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(field_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 290, 40));

        field_cargo.setBackground(new java.awt.Color(242, 242, 242));
        field_cargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        field_cargo.setInheritsPopupMenu(true);
        field_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_cargoActionPerformed(evt);
            }
        });
        getContentPane().add(field_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 380, 40));

        field_telefono.setBackground(new java.awt.Color(242, 242, 242));
        field_telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        field_telefono.setInheritsPopupMenu(true);
        field_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_telefonoActionPerformed(evt);
            }
        });
        getContentPane().add(field_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 420, 40));

        field_email.setBackground(new java.awt.Color(242, 242, 242));
        field_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        field_email.setInheritsPopupMenu(true);
        field_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_emailActionPerformed(evt);
            }
        });
        getContentPane().add(field_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 420, 40));

        lbl_year.setForeground(new java.awt.Color(204, 204, 204));
        lbl_year.setText("YYYY/MM/DD");
        getContentPane().add(lbl_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 80, 30));

        field_fecha_nac.setBackground(new java.awt.Color(242, 242, 242));
        field_fecha_nac.setToolTipText("YYYY/MM/DD");
        field_fecha_nac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        field_fecha_nac.setInheritsPopupMenu(true);
        field_fecha_nac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_fecha_nacActionPerformed(evt);
            }
        });
        getContentPane().add(field_fecha_nac, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 290, 40));

        lbl_apellido.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        lbl_apellido.setForeground(new java.awt.Color(153, 153, 153));
        lbl_apellido.setText("Primer Apellido:");
        getContentPane().add(lbl_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 160, 60));

        lbl_empleado_id.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 18)); // NOI18N
        lbl_empleado_id.setForeground(new java.awt.Color(153, 153, 153));
        lbl_empleado_id.setText("Empleado ID:");
        getContentPane().add(lbl_empleado_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 120, 70));

        field_empleado_id.setBackground(new java.awt.Color(242, 242, 242));
        field_empleado_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        field_empleado_id.setInheritsPopupMenu(true);
        field_empleado_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_empleado_idActionPerformed(evt);
            }
        });
        getContentPane().add(field_empleado_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 380, 40));

        field_apellido.setBackground(new java.awt.Color(242, 242, 242));
        field_apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        field_apellido.setInheritsPopupMenu(true);
        field_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_apellidoActionPerformed(evt);
            }
        });
        getContentPane().add(field_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 290, 40));

        btn_atras.setBackground(new java.awt.Color(51, 153, 0));
        btn_atras.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btn_atras.setForeground(new java.awt.Color(255, 255, 255));
        btn_atras.setText("Cancelar");
        btn_atras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 1, true));
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 450, 150, 40));

        btn_ingresar1.setBackground(new java.awt.Color(51, 153, 0));
        btn_ingresar1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btn_ingresar1.setForeground(new java.awt.Color(255, 255, 255));
        btn_ingresar1.setText("Registrar");
        btn_ingresar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 0), 1, true));
        btn_ingresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ingresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 210, 40));

        cuadro_admin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Información interna", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Unicode", 1, 18), new java.awt.Color(153, 153, 153))); // NOI18N
        getContentPane().add(cuadro_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 560, 160));
        cuadro_admin.getAccessibleContext().setAccessibleName("cuadro_info");

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Información Personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Unicode", 1, 18), new java.awt.Color(153, 153, 153))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 520, 330));

        cuadro_contacto1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Información de Contacto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Unicode", 1, 18), new java.awt.Color(153, 153, 153))); // NOI18N
        getContentPane().add(cuadro_contacto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 560, 160));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\paula\\Documents\\NetBeansProjects\\company\\src\\main\\java\\img\\tropicalfondo al 1.png")); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void field_fecha_nacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_fecha_nacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_fecha_nacActionPerformed

    private void field_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_nombreActionPerformed

    private void field_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_cargoActionPerformed

    private void field_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_emailActionPerformed

    private void field_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_telefonoActionPerformed

    private void field_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_apellidoActionPerformed

    private void field_empleado_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_empleado_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_empleado_idActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        Inicio volver = new Inicio();
        volver.setVisible(true);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_ingresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresar1ActionPerformed
    
        addPersonal();
        }
   

    private void addPersonal(){
        
     
    
    String empleado_id = field_empleado_id.getText();    
    String nombre = field_nombre.getText();
    String apellido = field_apellido.getText();
    String oficio = field_cargo.getText();
    String telefono = field_telefono.getText();
    String email = field_email.getText();
    String fecha_nac = field_fecha_nac.getText();
    
     if (empleado_id.isEmpty()||nombre.isEmpty()||apellido.isEmpty()||oficio.isEmpty()||telefono.isEmpty()||email.isEmpty()||fecha_nac.isEmpty()){
              JOptionPane.showMessageDialog(this, "Por favor complete todos los campos.");  
            }

    else{
                   
         conexion= conectarBaseDeDatos.conectarBaseDeDatos();
         
     java.sql.Date sqlDate = null;
        try {
            // Convertir la fecha de String a java.sql.Date
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            java.util.Date utilDate = sdf.parse(fecha_nac); // Convertir el String a java.util.Date
            sqlDate = new java.sql.Date(utilDate.getTime()); // Convertir java.util.Date a java.sql.Date
        } catch (ParseException e) {
            // Mostrar mensaje de error si la fecha no tiene el formato esperado
            JOptionPane.showMessageDialog(this, "La fecha debe tener el formato AAAA/MM/DD.");
            e.printStackTrace();
            return;
        }
        
            

        try {
            // Crear una consulta SQL para ingresarr el suministro
            String query = "INSERT INTO empleados (EMPLEADOS_ID, NOMBRE, APELLIDO, OFICIO, TELEFONO, EMAIL, FECHA_NAC) VALUES (?, ?, ?, ?,? ,? ,?)";
            PreparedStatement pst = conexion.prepareStatement(query);
            
            pst.setInt(1, Integer.parseInt(empleado_id));
            pst.setString(2, nombre);
            pst.setString(3, apellido);
            pst.setString(4, oficio);
            pst.setInt(5, Integer.parseInt(telefono));
            pst.setString(6, email);
            pst.setDate(7,sqlDate);
            
          

            // Ejecutar la actualización
            int filasAfectadas = pst.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Empleado registrado correctamente.");
            } 
            pst.close();   
            } 
            
            catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al realizar el registro: " + e.getMessage());
            e.printStackTrace();
        }
     }
        
    }//GEN-LAST:event_btn_ingresar1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_ingresar1;
    private javax.swing.JLabel cuadro_admin;
    private javax.swing.JLabel cuadro_contacto1;
    private javax.swing.JTextField field_apellido;
    private javax.swing.JTextField field_cargo;
    private javax.swing.JTextField field_email;
    private javax.swing.JTextField field_empleado_id;
    private javax.swing.JTextField field_fecha_nac;
    private javax.swing.JTextField field_nombre;
    private javax.swing.JTextField field_telefono;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_add_personal;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_cargo;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_empleado_id;
    private javax.swing.JLabel lbl_fecha_nac;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_year;
    // End of variables declaration//GEN-END:variables
}
