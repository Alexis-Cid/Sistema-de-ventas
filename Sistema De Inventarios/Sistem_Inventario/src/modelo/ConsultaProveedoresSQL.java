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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *

 */
public class ConsultaProveedoresSQL extends Conectar
{
    public boolean registrar(ModeloProveedores mproveedor)
    {
        PreparedStatement ps = null;
        Connection con = getConnection();
        String sql = "INSERT INTO proveedores (Codigo, Nombre, Apellido_Paterno, Apellido_Materno, Empresa, Telefono, Direccion) VALUES(?,?,?,?,?,?,?)";
        try
        {
            ps = con.prepareStatement(sql);
            ps.setString(1, mproveedor.getCodigo());
            ps.setString(2, mproveedor.getNombre());
            ps.setString(3, mproveedor.getApellido_Paterno());
            ps.setString(4, mproveedor.getApellido_Materno());
            ps.setString(5, mproveedor.getEmpresa());
            ps.setString(6, mproveedor.getTelefono());
            ps.setString(7, mproveedor.getDireccion());
            ps.execute();
            return true;
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "ERROR = " + e, "ERROR", 0);
            return false;
        }
    }
    
    public boolean eliminar(ModeloProveedores mproveedor)
    {
        PreparedStatement ps = null;
        Connection con = getConnection();
        String sql = "DELETE FROM proveedor WHERE Codigo = ?";
        try
        {
            ps = con.prepareStatement(sql);
            ps.setString(1, mproveedor.getCodigo());
            ps.execute();
            return true;
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "ERROR = " + e, "ERROR", 0);
            return false;
        }
    }
    
    public List<ModeloProveedores> listaProveedores()
    {
        List<ModeloProveedores> lista = null;
        PreparedStatement consulta = null;
        Connection con = getConnection();
        ResultSet conjuntoResultados = null;
        try 
        {
            consulta = con.prepareStatement("select * from proveedores");
            conjuntoResultados = consulta.executeQuery();
            lista = new ArrayList<>();
            while(conjuntoResultados.next())
            {
                lista.add(new ModeloProveedores(
                        conjuntoResultados.getString("Codigo"),
                        conjuntoResultados.getString("Nombre"),
                        conjuntoResultados.getString("Apellido_Paterno"),
                        conjuntoResultados.getString("Apellido_Materno"),
                        conjuntoResultados.getString("Empresa"),
                        conjuntoResultados.getString("Telefono"),
                        conjuntoResultados.getString("direccion")
                ));
            }
        }
        catch (Exception e) 
        {
            System.err.println(e.getMessage());
        }
        return lista;
    }
}
