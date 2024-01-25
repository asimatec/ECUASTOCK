/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jorge
 */
public class Conexion {
    
    public static Connection getConexion(){
        
        String url = "jdbc:sqlserver://MSI\\SQLEXPRESS:57401;" + "database=Juguetes_DB;" +"user=sa;" + "password=dramayluz;encrypt=false;";
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }
}
