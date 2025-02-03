
package com.mycompany.company.conectarDB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class conectarBaseDeDatos {
    
    
    private static Connection conexion;
    private static JFrame frame;
    
    
    public static Connection conectarBaseDeDatos() {
        
        
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
            
        }
    return conexion;
    }

    PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
