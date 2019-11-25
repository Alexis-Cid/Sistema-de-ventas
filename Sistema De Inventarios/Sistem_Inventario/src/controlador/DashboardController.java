package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.Dashboard;
import modelo.entidades.Usuarios;
import modelo.sql.UsuariosSQL;
import vista.LoginFrm;

import vista.Panel_Empleados;

public class DashboardController {
    
    Dashboard vistaDashboard;
    Usuarios modeloUsuarios;
    UsuariosSQL sql;
    
    public DashboardController(Dashboard vista, Usuarios modelo, UsuariosSQL sql)
    {
        vistaDashboard = vista;
        modeloUsuarios = modelo;
        this.sql = sql;
        iniciar();
    }
    
    private void iniciar()
    {
        vistaDashboard.lblNombreUsuario.setText(modeloUsuarios.getNombre_usuario());
        vistaDashboard.lblPerfil.setText(modeloUsuarios.getPerfil());
        vistaDashboard.setVisible(true);
        vistaDashboard.setLocationRelativeTo(null);
        
        vistaDashboard.btnEmpleados.addActionListener(this::btnEmpleados);
        
        vistaDashboard.lblCerrarSesion.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                LoginFrm princ = new LoginFrm();
                Usuarios modelo = new Usuarios();
                UsuariosSQL sql = new UsuariosSQL();
        
                FuncionesLogin ctrl = new FuncionesLogin(princ, modelo, sql);
                vistaDashboard.dispose();
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
    
    public void btnEmpleados(ActionEvent evt)
    {
        Panel_Empleados pnlEmpleados = new Panel_Empleados();
        vistaDashboard.lblEmpleados.setBackground(new Color(0,204,106));
        vistaDashboard.lblProductos.setBackground(new Color(255, 255, 255));
        vistaDashboard.lblClientes.setBackground(new Color(255, 255, 255));
        vistaDashboard.lblVentas.setBackground(new Color(255, 255, 255));
        
        vistaDashboard.pnlBody.removeAll();
        vistaDashboard.pnlBody.repaint();
        vistaDashboard.pnlBody.revalidate();
        vistaDashboard.pnlBody.add(pnlEmpleados);
        vistaDashboard.pnlBody.repaint();
        vistaDashboard.pnlBody.revalidate();
    }
}
