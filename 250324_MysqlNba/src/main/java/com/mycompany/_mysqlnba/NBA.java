/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._mysqlnba;

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
public class NBA 
{
    private Connection con=null;
    private ResultSet rs=null;
    private String url;

    public NBA(String url)
    {
        this.url = url;
        try 
        {
            con = DriverManager.getConnection(url, "root", "");
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(NBA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Menu()
    {
        String driver=""; //"jdbc:mysql:";
        String IP=""; //"localhost" || "https://www.fbi.org/terroristas" || "127.0.0.1"
        String port=""; //"3306"
        String nombreBD=""; //"clientes"
        String user=""; //"guest"
        String password="";
        System.out.println("======Menu======");
        System.out.println("1.Seleciona el driver");
        System.out.println("2.Seleciona la IP");
        System.out.println("3.Seleciona el puerto");
        System.out.println("4.Seleciona el nombre de la base de datos");
        System.out.println("5.Seleciona el nombre del usuario");
        System.out.println("6.Seleciona la contraseña");
    }
    public ResultSet consultar(String consulta)
    {
        Statement sentencia;
        try
        {
            sentencia = con.createStatement();
            rs = sentencia.executeQuery(consulta);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(NBA.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public void borrar(String consulta)
    {
        Statement sentencia;
        try
        {
            sentencia = con.createStatement();
            sentencia.executeUpdate(consulta);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(NBA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void insertar(String consulta)
    {
    Statement sentencia;
        try
        {
            sentencia = con.createStatement();
            sentencia.executeUpdate(consulta);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(NBA.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public void ModificarConsulta(String consulta)
    {
        this.consultar(consulta);
    }
    
    public void mostrarColumna(String Columna)
    {
        try 
        {
            while(rs.next())
            {
                String var1 = rs.getString(Columna);
                System.out.println(var1);
            }  
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(NBA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
