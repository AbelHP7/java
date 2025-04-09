/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._mysqlnba;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App
{
    public static void main(String[] args) 
    {
       String consulta;
       NBA nba=new NBA("jdbc:mysql://localhost/nba");
 
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Escribe la consulta que quieres hacer");
       consulta=sc.nextLine();
       ResultSet resul = nba.consultar(consulta);
       nba.mostrarColumna("Nombre");
       nba.mostrarConsulta();
    }
    public void MostrarConsulta(ResultSet resul,String consulta) throws SQLException
    {
        try((Statement consulta = conexion.Statement(consultarLista))
        {
            while(resul.next())
            {
                
            }
        }
        catch(Exception e)
        {
            System.out.println("Ha ocurrido un error al mostrar las parejas: " + e.getMessage());
        }     
    }
}
