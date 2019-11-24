/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.sql;

import modelo.entidades.ModeloEmpleados;
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
 */
public class ConsultaEmpleadosSQL extends Conectar {

    Connection con;

    public boolean registrar(ModeloEmpleados Empleados) {
        PreparedStatement ps = null;
        con = getConnection();

        String sql = "INSERT INTO empleados (Codigo, Nombre, Apellido_paterno, Apellido_materno, Dieccion, Nacionalidad, Sexo, Telefono) VALUES(?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, Empleados.getCodigo());
            ps.setString(2, Empleados.getNombre());
            ps.setString(3, Empleados.getApellido_Paterno());
            ps.setString(4, Empleados.getApellido_Materno());
            ps.setString(5, Empleados.getDireccion());
            ps.setString(6, Empleados.getNacionalidad());
            ps.setString(7, Empleados.getSexo());
            ps.setString(8, Empleados.getTelefono());
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

    public List<ModeloEmpleados> lista() {
        List<ModeloEmpleados> listaEmpleados = null;
        try {
            con = getConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM empleado");
            ResultSet conjuntoRes = stmt.executeQuery();
            listaEmpleados = new ArrayList<>();
            while (conjuntoRes.next()) {
                listaEmpleados.add(new ModeloEmpleados(
                        conjuntoRes.getInt("Codigo"),
                        conjuntoRes.getString("Nombre"),
                        conjuntoRes.getString("Apellido_paterno"),
                        conjuntoRes.getString("Apellido_materno"),
                        conjuntoRes.getString("Dieccion"),
                        conjuntoRes.getString("Nacionalidad"),
                        conjuntoRes.getString("Sexo"),
                        conjuntoRes.getString("Telefono")
                ));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return listaEmpleados;
    }
}
