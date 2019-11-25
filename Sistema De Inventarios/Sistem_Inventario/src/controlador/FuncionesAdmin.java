package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import AppPackage.AnimationClass;
import modelo.CambioPanel;
import modelo.entidades.Usuarios;
import modelo.sql.UsuariosSQL;
import vista.LoginFrm;
import vista.User_Admin;

public class FuncionesAdmin implements ActionListener {

    private final User_Admin admin;
    

    public FuncionesAdmin(User_Admin admin) {
        this.admin = admin;
        this.admin.btnmenu.addActionListener(this);
        this.admin.btnempleados.addActionListener(this);
        this.admin.btnproveedores.addActionListener(this);
        this.admin.btnclientes.addActionListener(this);
        this.admin.btnproductos.addActionListener(this);
        this.admin.btnRegVentas.addActionListener(this);
        this.admin.btnfacturar.addActionListener(this);
        this.admin.btncerrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == admin.btnmenu) {
            int posicion = admin.jpmenu.getX();
            if (posicion > -1) {
                Animacion.Animacion.mover_izquierda(0, -300, 2, 3, admin.jpmenu);
            } else {
                Animacion.Animacion.mover_derecha(-300, 1, 2, 3, admin.jpmenu);
            }
        } else if (evt.getSource() == admin.btnempleados) {
            CambioPanel cambioPanel = new CambioPanel(admin.pnlPrincipal, new vista.Panel_Empleados());
            admin.btnempleados.setOpaque(true);
            admin.btnempleados.setEnabled(false);
            admin.btnproveedores.setOpaque(false);
            admin.btnproveedores.setEnabled(true);
            admin.btnclientes.setOpaque(false);
            admin.btnclientes.setEnabled(true);
            admin.btnproductos.setOpaque(false);
            admin.btnproductos.setEnabled(true);
            admin.btnRegVentas.setOpaque(false);
            admin.btnRegVentas.setEnabled(true);
            admin.btnfacturar.setOpaque(false);
            admin.btnfacturar.setEnabled(true);
            Animacion.Animacion.mover_izquierda(0, -300, 2, 3, admin.jpmenu);
        } else if (evt.getSource() == admin.btnproveedores) {
            CambioPanel cambioPanel = new CambioPanel(admin.pnlPrincipal, new vista.Panel_Proveedor());
            admin.btnproveedores.setOpaque(true);
            admin.btnproveedores.setEnabled(false);
            admin.btnempleados.setOpaque(false);
            admin.btnempleados.setEnabled(true);
            admin.btnclientes.setOpaque(false);
            admin.btnclientes.setEnabled(true);
            admin.btnproductos.setOpaque(false);
            admin.btnproductos.setEnabled(true);
            admin.btnRegVentas.setOpaque(false);
            admin.btnRegVentas.setEnabled(true);
            admin.btnfacturar.setOpaque(false);
            admin.btnfacturar.setEnabled(true);
            Animacion.Animacion.mover_izquierda(0, -300, 2, 3, admin.jpmenu);
        } else if (evt.getSource() == admin.btnclientes) {
            CambioPanel cambioPanel = new CambioPanel(admin.pnlPrincipal, new vista.Panel_Clientes());
            admin.btnclientes.setOpaque(true);
            admin.btnclientes.setEnabled(false);
            admin.btnempleados.setOpaque(false);
            admin.btnempleados.setEnabled(true);
            admin.btnproveedores.setOpaque(false);
            admin.btnproveedores.setEnabled(true);
            admin.btnproductos.setOpaque(false);
            admin.btnproductos.setEnabled(true);
            admin.btnRegVentas.setOpaque(false);
            admin.btnRegVentas.setEnabled(true);
            admin.btnfacturar.setOpaque(false);
            admin.btnfacturar.setEnabled(true);
            Animacion.Animacion.mover_izquierda(0, -300, 2, 3, admin.jpmenu);
        } else if (evt.getSource() == admin.btnproductos) {
            CambioPanel cambioPanel = new CambioPanel(admin.pnlPrincipal, new vista.Panel_Productos());
            admin.btnproductos.setOpaque(true);
            admin.btnproductos.setEnabled(false);
            admin.btnempleados.setOpaque(false);
            admin.btnempleados.setEnabled(true);
            admin.btnproveedores.setOpaque(false);
            admin.btnproveedores.setEnabled(true);
            admin.btnclientes.setOpaque(false);
            admin.btnclientes.setEnabled(true);
            admin.btnRegVentas.setOpaque(false);
            admin.btnRegVentas.setEnabled(true);
            admin.btnfacturar.setOpaque(false);
            admin.btnfacturar.setEnabled(true);
            Animacion.Animacion.mover_izquierda(0, -300, 2, 3, admin.jpmenu);
        } else if (evt.getSource() == admin.btnRegVentas) {
            CambioPanel cambioPanel = new CambioPanel(admin.pnlPrincipal, new vista.Panel_Registro_Ventas());
            admin.btnRegVentas.setOpaque(true);
            admin.btnRegVentas.setEnabled(false);
            admin.btnproductos.setOpaque(false);
            admin.btnproductos.setEnabled(true);
            admin.btnempleados.setOpaque(false);
            admin.btnempleados.setEnabled(true);
            admin.btnproveedores.setOpaque(false);
            admin.btnproveedores.setEnabled(true);
            admin.btnclientes.setOpaque(false);
            admin.btnclientes.setEnabled(true);
            admin.btnfacturar.setOpaque(false);
            admin.btnfacturar.setEnabled(true);
            Animacion.Animacion.mover_izquierda(0, -300, 2, 3, admin.jpmenu);
        } else if (evt.getSource() == admin.btnfacturar) {
            new CambioPanel(admin.pnlPrincipal, new vista.Panel_Facturar());
            admin.btnfacturar.setOpaque(true);
            admin.btnfacturar.setEnabled(false);
            admin.btnempleados.setOpaque(false);
            admin.btnempleados.setEnabled(true);
            admin.btnproveedores.setOpaque(false);
            admin.btnproveedores.setEnabled(true);
            admin.btnclientes.setOpaque(false);
            admin.btnclientes.setEnabled(true);
            admin.btnproductos.setOpaque(false);
            admin.btnproductos.setEnabled(true);
            admin.btnRegVentas.setOpaque(false);
            admin.btnRegVentas.setEnabled(true);
            Animacion.Animacion.mover_izquierda(0, -300, 2, 3, admin.jpmenu);
        } else if (evt.getSource() == admin.btncerrar) {
            LoginFrm princ = new LoginFrm();
            Usuarios modelo = new Usuarios();
            UsuariosSQL sql = new UsuariosSQL();
        
            FuncionesLogin ctrl = new FuncionesLogin(princ, modelo, sql);
            admin.dispose();
        }
    }
}
