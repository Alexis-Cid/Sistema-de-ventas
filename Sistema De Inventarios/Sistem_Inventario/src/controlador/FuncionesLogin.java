package controlador;

import conectorMySQL.Conectar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.Connection;
import javax.swing.JOptionPane;
import vista.LoginFrm;
import vista.User_Admin;
import vista.User_Empleado;

/**
 *
 * @author ALEXIS
 */

public class FuncionesLogin implements ActionListener, MouseListener, MouseMotionListener {

    private LoginFrm plog;
    int x, y;
    Conectar con;

    public FuncionesLogin(LoginFrm plog) {
        this.plog = plog;
        /*this.plog.btniniciar.addActionListener(this);
        this.plog.btncerrar.addActionListener(this);
        this.plog.lblprinc.addMouseListener(this);
        this.plog.lblprinc.addMouseMotionListener(this);*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*if (e.getSource() == plog.btniniciar) {
            if (plog.jpcontraseña.getText().equals("123")) {
                con = new Conectar();
                Connection reg = con.getConnection();
                User_Admin admin = new User_Admin();
                admin.setVisible(true);
                plog.dispose();
            } else if (plog.jpcontraseña.getText().equals("abc")) {
                con = new Conectar();
                Connection reg = con.getConnection();
                User_Empleado emp = new User_Empleado();
                emp.setVisible(true);
                plog.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", 0);
                plog.txtusuario.setText("");
                plog.jpcontraseña.setText("");
            }
        }

        if (e.getSource() == plog.btncerrar) {
            System.exit(0);
        }*/
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        plog.setLocation(plog.getLocation().x + e.getX() - x, plog.getLocation().y + e.getY() - y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
