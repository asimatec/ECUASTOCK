
package MODELO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Quimis
 */
public class Conexion {
    
    public static Connection getConexion(){
        
  String url = "jdbc:sqlserver://MISHA:1433;database=CONTROL INVENTARIO;user=Mishi;password=12345;loginTimeout=30;"
                + "encrypt=true;trustServerCertificate=true;";       
               
        try{
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException e){
            System.out.println(e.toString());
            return null;
        }
        
    }
}
