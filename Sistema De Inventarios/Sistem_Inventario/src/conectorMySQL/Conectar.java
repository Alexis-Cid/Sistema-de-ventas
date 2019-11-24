package conectorMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ALEXIS
 */
public class Conectar {

    private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/blancos";

    public Conectar() {
        con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(this.url, this.user, this.password);

            if (con != null) {
                System.out.println("CONEXION ESTABLECIDA");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ERROR DE CONEXION = " + e);
        }
    }

    public Connection getConnection() {
        return con;
    }

    public void desconectar() {
        con = null;

        if (con == null) {
            System.out.println("CONEXION TERMINADA");
        }
    }
}
