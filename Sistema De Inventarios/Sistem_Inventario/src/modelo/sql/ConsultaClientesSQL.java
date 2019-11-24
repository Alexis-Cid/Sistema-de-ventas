package modelo.sql;

import modelo.entidades.ModeloClientes;
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
 *
 *
 */
public class ConsultaClientesSQL extends Conectar {

    public boolean registrar(ModeloClientes mcliente) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        String sql = "INSERT INTO clientes (RFC, Nombre, apellidoPaterno, apellidoMaterno, telefono, direccion) VALUES(?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mcliente.getRfc());
            ps.setString(2, mcliente.getNom());
            ps.setString(3, mcliente.getApP());
            ps.setString(4, mcliente.getApM());
            ps.setString(5, mcliente.getNumT());
            ps.setString(6, mcliente.getDireccion());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR = " + e, "ERROR", 0);
            return false;
        }
    }

    public boolean eliminar(ModeloClientes mcliente) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        String sql = "DELETE FROM clientes WHERE RFC = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mcliente.getRfc());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR = " + e, "ERROR", 0);
            return false;
        }
    }

    public boolean actualizar(ModeloClientes mcliente) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "UPDATE clientes SET Nombre = ?, apellidoPaterno = ?, apellidoMaterno = ?, telefono = ?, direccion = ? WHERE RFC = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(6, mcliente.getRfc());
            ps.setString(1, mcliente.getNom());
            ps.setString(2, mcliente.getApP());
            ps.setString(3, mcliente.getApM());
            ps.setString(4, mcliente.getNumT());
            ps.setString(5, mcliente.getDireccion());
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

    public List<ModeloClientes> listaClientes() {
        List<ModeloClientes> lista = null;
        PreparedStatement consulta = null;
        Connection con = getConnection();
        ResultSet conjuntoResultados = null;
        try {
            consulta = con.prepareStatement("select * from clientes");
            conjuntoResultados = consulta.executeQuery();
            lista = new ArrayList<>();
            while (conjuntoResultados.next()) {
                lista.add(new ModeloClientes(
                        conjuntoResultados.getString("Nombre"),
                        conjuntoResultados.getString("apellidoPaterno"),
                        conjuntoResultados.getString("apellidoMaterno"),
                        conjuntoResultados.getString("telefono"),
                        conjuntoResultados.getString("direccion"),
                        conjuntoResultados.getString("RFC")
                ));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }
}
