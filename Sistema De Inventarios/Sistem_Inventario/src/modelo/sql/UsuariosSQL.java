/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.sql;

import modelo.entidades.Usuarios;
import conectorMySQL.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.time.Clock.system;

/**
 *
 *
 */
public class UsuariosSQL extends Conectar {

    Connection conectar;

    public boolean Insertar(Usuarios modelo) {
        PreparedStatement sql;
        try {
            conectar = getConnection();
            sql = conectar.prepareStatement("INSER INTO usuarios (nombre_usuario, password) VALUES(?,?)");
            sql.setString(2, modelo.getNombre_usuario());
            sql.setString(3, modelo.getPassword());
            sql.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            try {
                conectar.close();
            } catch (Exception e) {
                System.err.print(e);
            }
        }
    }

    public boolean Modificar(Usuarios modelo) {
        PreparedStatement sql;
        try {
            conectar = getConnection();
            sql = conectar.prepareStatement("UPDATE usuarios SET Id_Usuario=?, nombre_usuario=?, password=? WHERE Id_Usuario=?");
            sql.setString(1, modelo.getNombre_usuario());
            sql.setString(2, modelo.getPassword());
            sql.setInt(3, modelo.getId_Usuario());
            sql.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            try {
                conectar.close();
            } catch (Exception e) {
                System.err.print(e);
            }
        }
    }

    public boolean Eliminar(Usuarios modelo) {
        PreparedStatement sql;
        try {
            conectar = getConnection();
            sql = conectar.prepareStatement("DELETE FROM usuarios WHERE Id_Usurio=?");
            sql.setInt(1, modelo.getId_Usuario());
            sql.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            try {
                conectar.close();
            } catch (Exception e) {
                System.err.print(e);
            }
        }
    }

    public boolean Consultar(Usuarios modelo) {
        PreparedStatement sql;
        ResultSet rs = null;
        try {
            conectar = getConnection();
            sql = conectar.prepareStatement("SELECT * FROM usuarios WHERE Id_Usurio=?");
            sql.setInt(1, modelo.getId_Usuario());
            rs = sql.executeQuery();

            if (rs.next()) {
                modelo.setId_Usuario(Integer.parseInt(rs.getString("Id_Usuario")));
                modelo.setNombre_usuario(rs.getString("Nombre_Usuario"));
                modelo.setPassword(rs.getString("Password"));
                return true;
            }

            return true;
        } catch (SQLException e) {
            return false;
        } finally {
            try {
                conectar.close();
            } catch (Exception e) {
                System.err.print(e);
            }
        }
    }
    
    public boolean siExisteUsuario(Usuarios modelo)
    {
        PreparedStatement stmt;
        ResultSet rs;
        System.out.println(modelo.getUsuario());
        try {
            conectar = getConnection();
            stmt = conectar.prepareStatement("SELECT * FROM usuarios WHERE Usuario = ?");
            stmt.setString(1, modelo.getUsuario());
            rs = stmt.executeQuery();
            return rs.next();
        } 
        catch (SQLException e) {
            
        }
        finally
        {
            try {
                conectar.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        return false;
    }
    
    public Usuarios usuarioLogueado(Usuarios modelo)
    {
        PreparedStatement stmt;
        ResultSet rs;
        Usuarios usuario = new Usuarios();
        System.out.println(modelo.getUsuario());
        try {
            conectar = getConnection();
            stmt = conectar.prepareStatement("SELECT * FROM usuarios WHERE Usuario = ?");
            stmt.setString(1, modelo.getUsuario());
            rs = stmt.executeQuery();
            while(rs.next())
            {
                usuario.setId_Usuario(Integer.parseInt(rs.getString("id")));
                usuario.setNombre_usuario(rs.getString("Nombre"));
                usuario.setUsuario(rs.getString("Usuario"));
                usuario.setPerfil(rs.getString("Perfil"));
                usuario.setEstado(rs.getInt("estado"));
            }
        } 
        catch (SQLException e) {
            
        }
        finally
        {
            try {
                conectar.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        return usuario;
    }
    
    public boolean iniciarSesion(Usuarios modelo)
    {
        PreparedStatement stmt;
        ResultSet rs;
        //System.out.println(modelo.getUsuario());
        try {
            conectar = getConnection();
            stmt = conectar.prepareStatement("SELECT * FROM usuarios WHERE Usuario = ? and"
                    + " Password = ?");
            stmt.setString(1, modelo.getUsuario());
            stmt.setString(2, modelo.getPassword());
            rs = stmt.executeQuery();
            if(rs.next())
                return true;
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        finally
        {
            try {
                conectar.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
        return false;
    }
}
