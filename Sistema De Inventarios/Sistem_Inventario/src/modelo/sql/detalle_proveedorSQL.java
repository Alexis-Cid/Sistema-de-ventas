/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.sql;

import conectorMySQL.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.detalle_proveedor;

/**
 *
 *
 */
public class detalle_proveedorSQL extends Conectar {

    public boolean registrar(detalle_proveedor dt) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "INSERT detalle_proveedor (codigo_proveedor, Nombre_proveedor, nombre_producto, categoria_producto, precio_compra) VALUES(?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dt.getCodigo_Proveedor());
            ps.setString(2, dt.getNombre_probveedor());
            ps.setString(3, dt.getNombre_producto());
            ps.setString(4, dt.getCategoria_producto());
            ps.setDouble(5, dt.getPrecio_compra());
            ps.execute();

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR = " + e, "ERROR", 0);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERROR = " + e, "ERROR", 0);
            }
        }
    }
}
