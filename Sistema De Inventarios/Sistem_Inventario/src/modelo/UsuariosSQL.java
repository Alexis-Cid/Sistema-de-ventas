/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import conectorMySQL.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.time.Clock.system;

/**
 *

 */
public class UsuariosSQL extends Conectar
{
    Connection conectar;
    
    public boolean Insertar(Usuarios modelo)
    {
      PreparedStatement sql;
      try
      {
        conectar = getConnection();
        sql = conectar.prepareStatement("INSER INTO usuarios (nombre_usuario, password) VALUES(?,?)");
        sql.setString(2, modelo.getNombre_usuario());
        sql.setString(3, modelo.getPassword());
        sql.executeUpdate();
        return true;
      }
      catch(SQLException e)
      {
        return false;  
      }
      finally
      {
          try
          {
              conectar.close();
          }
          catch (Exception e)
          {
              System.err.print(e);
          }
      }
    }
        public boolean Modificar(Usuarios modelo)
    {
      PreparedStatement sql;
      try
      {
        conectar = getConnection();
        sql = conectar.prepareStatement("UPDATE usuarios SET Id_Usuario=?, nombre_usuario=?, password=? WHERE Id_Usuario=?");
        sql.setString(1, modelo.getNombre_usuario());
        sql.setString(2, modelo.getPassword());
        sql.setInt(3,modelo.getId_Usuario());
        sql.executeUpdate();
        return true;
      }
      catch(SQLException e)
      {
        return false;  
      }
      finally
      {
          try
          {
              conectar.close();
          }
          catch (Exception e)
          {
              System.err.print(e);
          }
      }
    }
          public boolean Eliminar(Usuarios modelo)
    {
      PreparedStatement sql;
      try
      {
        conectar = getConnection();
        sql = conectar.prepareStatement("DELETE FROM usuarios WHERE Id_Usurio=?");
        sql.setInt(1, modelo.getId_Usuario());
        sql.executeUpdate();
        return true;
      }
      catch(SQLException e)
      {
        return false;  
      }
      finally
      {
          try
          {
              conectar.close();
          }
          catch (Exception e)
          {
              System.err.print(e);
          }
      }
    }
        public boolean Consultar(Usuarios modelo)
    {
      PreparedStatement sql;
      ResultSet rs = null;
      try
      {
        conectar = getConnection();
        sql = conectar.prepareStatement("SELECT * FROM usuarios WHERE Id_Usurio=?");
        sql.setInt(1, modelo.getId_Usuario());
        rs = sql.executeQuery();
        
        if(rs.next())
        {
            modelo.setId_Usuario(Integer.parseInt(rs.getString("Id_Usuario")));
            modelo.setNombre_usuario(rs.getString("Nombre_Usuario"));
            modelo.setPassword(rs.getString("Password"));
            return true;
        }
        
        
        return true;
      }
      catch(SQLException e)
      {
        return false;  
      }
      finally
      {
          try
          {
              conectar.close();
          }
          catch (Exception e)
          {
              System.err.print(e);
          }
      }
    }
}
