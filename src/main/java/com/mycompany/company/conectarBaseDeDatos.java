
package com.mycompany.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class conectarBaseDeDatos {
    
    
    private Connection conexion;
    public JFrame frame;
    
    public void conectarBaseDeDatos() {
        
        
        try {
            
            String url = "jdbc:mysql://localhost:3306/company";
            String usuario = "root";
            String contrasena = "Sol";
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Conexión exitosa!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(frame, "Error de conexión: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormularioActualizarSuministros.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
