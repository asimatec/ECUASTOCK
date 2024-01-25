
package CONTROLADOR;

import static MODELO.Conexion.getConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis Gonzalez
 */
public class Login_DAO {

        public int obtenerAcceso(String usuario, String clave) {

        int valor = 0;
        try {
           Connection cone = getConexion();
            Statement sta = cone.createStatement();
            ResultSet rs = sta.executeQuery("Select * from adm Where usuario = '" + usuario + "' and contraseña = '" + clave + "'");

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "BIENVENIDOS SU SISTEMA DE CONTROL DE INVENTARIO ", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                valor = 1;
            } else {
                JOptionPane.showMessageDialog(null, "usuario y contraseña incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);

                valor = 0;

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error" + e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);

        }

        return valor;
    }
}
