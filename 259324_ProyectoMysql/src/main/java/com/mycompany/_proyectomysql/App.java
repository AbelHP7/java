/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._proyectomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) throws SQLException {
        Connection con=null;
        String url="jdbc:mysql://localhost/jardineria";
        
        
        try {
            con = DriverManager.getConnection(url, "root", "");
            String sql="SELECT * from clientes";
            Statement sentencia = con.createStatement();
            ResultSet rs = sentencia.executeQuery(sql);
            while(rs.next())
            {
                String var1 = rs.getString("NombreCliente");
                String var2 = rs.getString("NombreContacto");
                System.out.println(var1);
                System.out.println(var2);

            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
      
            
    }
}
