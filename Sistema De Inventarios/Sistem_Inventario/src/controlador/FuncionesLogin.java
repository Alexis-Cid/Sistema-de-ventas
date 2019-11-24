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

import modelo.entidades.Usuarios;
import modelo.sql.UsuariosSQL;
/**
 *
 * @author ALEXIS
 */

public class FuncionesLogin implements ActionListener, MouseListener, MouseMotionListener {

    private LoginFrm plog;
    Usuarios modeloUsuario;
    UsuariosSQL sqlUsuario;
    int x, y;
    Conectar con;

    public FuncionesLogin(LoginFrm plog, Usuarios modeloUsuario, UsuariosSQL sqlUsuario) {
        this.plog = plog;
        this.modeloUsuario = modeloUsuario;
        this.sqlUsuario = sqlUsuario;
        initialize();
        /*this.plog.btniniciar.addActionListener(this);
        this.plog.btncerrar.addActionListener(this);
        this.plog.lblprinc.addMouseListener(this);
        this.plog.lblprinc.addMouseMotionListener(this);*/
    }
    
    private void initialize()
    {
        plog.setTitle("Log-In");
        plog.setLocationRelativeTo(null);
        plog.setVisible(true);
        plog.slidePanel.userPanel.lblError.setText("");
        plog.slidePanel.passPanel.lblError.setText("");
        
        plog.slidePanel.userPanel.btnNext.addActionListener(this::btnSiguiente);
        plog.slidePanel.passPanel.btnIniciarSesion.addActionListener(this::btnIniciarSesion);
        plog.slidePanel.passPanel.btnRetroceder.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                plog.slidePanel.moveRight();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
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
        });
    }
    
    public void btnSiguiente(ActionEvent evt)
    {
        modeloUsuario.setUsuario(plog.slidePanel.userPanel.txtUser.getText());
        if(sqlUsuario.siExisteUsuario(modeloUsuario))
        {
         //   plog.slidePanel.moveLeft();
            Usuarios encontrado = new Usuarios();
            encontrado = sqlUsuario.usuarioLogueado(modeloUsuario);
            if(encontrado.getEstado() == 0)
            {
                plog.slidePanel.userPanel.lblError.setText("El usuario no esta activo");
            }
            else
            {
                plog.slidePanel.moveLeft();
                plog.slidePanel.passPanel.lblNombre.setText(encontrado.getNombre_usuario());
                plog.slidePanel.passPanel.lblUsuario.setText(encontrado.getUsuario());
                plog.slidePanel.passPanel.lblPerfil.setText(encontrado.getPerfil());
            }
        }
        else
        {
            plog.slidePanel.userPanel.lblError.setText("El usuario es incorrecto");
        }
    }
    
    public void btnIniciarSesion(ActionEvent evt)
    {
        System.out.println(plog.slidePanel.passPanel.txtPassword.getText());
        modeloUsuario.setPassword(plog.slidePanel.passPanel.txtPassword.getText());
        if(sqlUsuario.iniciarSesion(modeloUsuario))
        {
            User_Admin admin = new User_Admin();
            admin.setVisible(true);
            plog.dispose();
        }
        else
        {
            plog.slidePanel.passPanel.lblError.setText("La contraseña es incorrecta");
        }
        
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
