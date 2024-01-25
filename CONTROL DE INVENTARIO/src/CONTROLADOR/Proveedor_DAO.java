package CONTROLADOR;

import static MODELO.Conexion.getConexion;
import MODELO.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author QUIMIS
 */
public class Proveedor_DAO {

    //metodo para insertar proveedor
    public void InsertarUsuarioProveedor(Usuarios u) {
        //Manejo de Excepciones
        try {
            //conectamos
            Connection con = getConexion();
            //sentencia sql para insertar datos de la tabla usuarios
            PreparedStatement pst = con.prepareStatement("INSERT INTO usuarios (ruc,nombre,apellido, direccion,telefono,correo, genero,fecha_nacimiento)"
                    + "     VALUES(?,?,?,?,?,?,?,?)");
            pst.setInt(1, u.getRuc());
            pst.setString(2, u.getNombre());
            pst.setString(3, u.getApellido());
            pst.setString(4, u.getDireccion());
            pst.setString(5, u.getTelefono());
            pst.setString(6, u.getCorreo());
            pst.setString(7, u.getGenero());
            pst.setDate(8, new java.sql.Date(u.getFecha_nacimiento().getTime()));
            pst.executeUpdate();

        } catch (SQLException ex) {
            //imprime mensaje de excepcion
            System.out.println(ex.getMessage());
            System.out.println("Error en los datos");
        }
    }

    public Usuarios BuscarUsuarioPorRUC(int ruc) {
        Usuarios usuario = null;
        try {
            Connection con = getConexion();
            PreparedStatement pst = con.prepareStatement("SELECT ruc, nombre, apellido, direccion, telefono, correo, genero, fecha_nacimiento "
                    + "FROM usuarios WHERE ruc = ?");
            pst.setInt(1, ruc);
            ResultSet resul = pst.executeQuery();

            if (resul.next()) {
                usuario = new Usuarios();
                usuario.setRuc(resul.getInt("ruc"));
                usuario.setNombre(resul.getString("nombre"));
                usuario.setApellido(resul.getString("apellido"));
                usuario.setDireccion(resul.getString("direccion"));
                usuario.setTelefono(resul.getString("telefono"));
                usuario.setCorreo(resul.getString("correo"));
                usuario.setGenero(resul.getString("genero"));
                usuario.setFecha_nacimiento(resul.getDate("fecha_nacimiento"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("HA OCURRIDO UN ERROR");
        }
        return usuario;
    }

    public void modificarProveedor(Usuarios modificar) {
        try {
            Connection con = getConexion();
            PreparedStatement pst = con.prepareStatement("UPDATE usuarios SET nombre=?, apellido=?, direccion=?, "
                    + "telefono=?, correo=?, genero=?, fecha_nacimiento=? WHERE ruc=?");

            pst.setString(1, modificar.getNombre());
            pst.setString(2, modificar.getApellido());
            pst.setString(3, modificar.getDireccion());
            pst.setString(4, modificar.getTelefono());
            pst.setString(5, modificar.getCorreo());
            pst.setString(6, modificar.getGenero());
            pst.setDate(7, new java.sql.Date(modificar.getFecha_nacimiento().getTime()));
            pst.setInt(8, modificar.getRuc());
            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("ERROR AL MODIFICAR ");
        }
    }

    public void EliminarProveedor(int ruc) {
        try {
            Connection con = getConexion();
            PreparedStatement pst = con.prepareStatement("DELETE FROM usuarios WHERE ruc=?");
            pst.setInt(1, ruc);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Error al eliminar usuario");
        }
    }

}
