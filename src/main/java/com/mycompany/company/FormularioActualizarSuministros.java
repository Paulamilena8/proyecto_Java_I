
package com.mycompany.company;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FormularioActualizarSuministros {
    
     // Elementos de la interfaz gráfica
    public JFrame frame;
    private JTextField txtAmbo_Num, txtSum_Id, txtSum_Nombre, txtCantidad, txtFecha_Exp;
    private JButton btnIngresar;
    public Connection conexion;

    public FormularioActualizarSuministros() {
        // Inicializar la conexión con la base de datos
        new conectarBaseDeDatos();

        // Crear la interfaz
        frame = new JFrame ("Actualizar Suministros");
        frame.setSize(800,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        frame.add(new JLabel("Número Ambulancia:"));
        txtAmbo_Num = new JTextField(3);
        frame.add(txtAmbo_Num);

        frame.add(new JLabel("Suministro ID:"));
        txtSum_Id = new JTextField(7);
        frame.add(txtSum_Id);

        frame.add(new JLabel("Nombre de Suministro:"));
        txtSum_Nombre = new JTextField(20);
        frame.add(txtSum_Nombre);

        frame.add(new JLabel("Cantidad:"));
        txtCantidad = new JTextField(3);
        frame.add(txtCantidad);

        frame.add(new JLabel("Fecha de Expiración (AAAA/MM/DD):"));
        txtFecha_Exp = new JTextField(10);
        frame.add(txtFecha_Exp);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarSuministros();
            }
        });
        frame.add(btnIngresar);

        frame.setVisible(true);
    }

    
    
    

    private void actualizarSuministros() {
        String ambnum = txtAmbo_Num.getText();
        String sumid = txtSum_Id.getText();
        String nombre = txtSum_Nombre.getText();
        String cantidad = txtCantidad.getText();
        String fechaexp = txtFecha_Exp.getText();
        
        
        if (ambnum.isEmpty() || nombre.isEmpty() || sumid.isEmpty() || cantidad.isEmpty()|| fechaexp.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Por favor complete todos los campos.");
            return;
        }
        
        java.sql.Date sqlDate = null;
        try {
            // Convertir la fecha de String a java.sql.Date
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            java.util.Date utilDate = sdf.parse(fechaexp); // Convertir el String a java.util.Date
            sqlDate = new java.sql.Date(utilDate.getTime()); // Convertir java.util.Date a java.sql.Date
        } catch (ParseException e) {
            // Mostrar mensaje de error si la fecha no tiene el formato esperado
            JOptionPane.showMessageDialog(frame, "La fecha debe tener el formato AAAA/MM/DD.");
            e.printStackTrace();
            return;
        }
        
            

        try {
            // Crear una consulta SQL para ingresarr el suministro
            String query = "INSERT INTO suministros (AMBU_NUM, SUM_ID, SUB_NOMBRE, CANTIDAD,FECHA_EXP) VALUES (?, ?, ?, ?,?)";
            PreparedStatement pst = conexion.prepareStatement(query);
            
            pst.setInt(1, Integer.parseInt(ambnum));
            pst.setInt(2, Integer.parseInt(sumid));
            pst.setString(3, nombre);
            pst.setInt(4, Integer.parseInt(cantidad));
            pst.setDate(5,sqlDate);
            
          

            // Ejecutar la actualización
            int filasAfectadas = pst.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(frame, "Suministro actualizado correctamente.");
            } else {
                JOptionPane.showMessageDialog(frame, "No se encontró un suministro con ese ID.");
                }
            pst.close();   
            } 
            
            catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Error al actualizar el suministro: " + e.getMessage());
            e.printStackTrace();
        }
    }

   
}
    

