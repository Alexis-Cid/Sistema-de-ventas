package vista;

import java.awt.*;
import javax.swing.*;

import controlador.FuncionesAdmin;
import modelo.CambioPanel;

/**
 *
 *
 *
 */
public final class User_Admin extends JFrame {

    private JPanel miP;
    public JPanel jpSup, pnlPrincipal = new JPanel(), jpmenu = new JPanel();
    private JLabel lbladmin;
    public JButton btnmenu, btnempleados, btnproveedores, btnclientes, btnproductos, btnRegVentas, btnfacturar, btncerrar;
    private JScrollPane js;

    public User_Admin() {
        init();
        FuncionesAdmin fun = new FuncionesAdmin(this);
        getContentPane().setBackground(new Color(255, 255, 255));
        setSize(900, 800);
        setExtendedState(MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void init() {
        js = new JScrollPane();
        js.setBounds(0, 0, 1938, 1098);

        miP = new JPanel();
        miP.setLayout(null);
        miP.setBackground(new Color(55, 255, 255));
        miP.setPreferredSize(new Dimension(1888, 1048));
        miP.setVisible(true);
        js.setViewportView(miP);

        jpSup = new JPanel();
        jpSup.setLayout(null);
        jpSup.setBackground(new Color(5, 5, 5));
        jpSup.setBounds(0, 0, js.getWidth(), 100);
        jpSup.setVisible(true);
        miP.add(jpSup);

        lbladmin = new JLabel("A D M I N I S T R A D O R");
        lbladmin.setForeground(new Color(255, 255, 255));
        lbladmin.setFont(new Font("Agency FB", Font.PLAIN, 30));
        lbladmin.setBounds(jpSup.getWidth() / 2 - 100, 35, 200, 30);
        jpSup.add(lbladmin);

        btnmenu = new JButton();
        btnmenu.setIcon(new ImageIcon(User_Admin.class.getResource("/img/menu.png")));
        btnmenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnmenu.setContentAreaFilled(false);
        btnmenu.setBounds(5, 20, 60, 60);
        jpSup.add(btnmenu);

        jpmenu.setLayout(null);
        jpmenu.setBackground(new Color(5, 5, 5));
        jpmenu.setBounds(-300, 100, 300, js.getHeight() - 145);
        jpmenu.setVisible(true);
        miP.add(jpmenu);

        btnempleados = new JButton("EMPLEADOS");
        btnempleados.setForeground(new Color(255, 255, 255));
        btnempleados.setBackground(new Color(255, 255, 255));
        btnempleados.setFont(new Font("Agency FB", Font.PLAIN, 24));
        btnempleados.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnempleados.setContentAreaFilled(false);
        btnempleados.setOpaque(true);
        btnempleados.setEnabled(false);
        btnempleados.setBounds(0, jpmenu.getHeight() / 4 - 50, 300, 55);
        jpmenu.add(btnempleados);

        btnproveedores = new JButton("PROVEEDORES");
        btnproveedores.setForeground(new Color(255, 255, 255));
        btnproveedores.setBackground(new Color(255, 255, 255));
        btnproveedores.setFont(new Font("Agency FB", Font.PLAIN, 24));
        btnproveedores.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnproveedores.setContentAreaFilled(false);
        btnproveedores.setBounds(0, btnempleados.getY() + 55, 300, 55);
        jpmenu.add(btnproveedores);

        btnclientes = new JButton("CLIENTES");
        btnclientes.setForeground(new Color(255, 255, 255));
        btnclientes.setBackground(new Color(255, 255, 255));
        btnclientes.setFont(new Font("Agency FB", Font.PLAIN, 24));
        btnclientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnclientes.setContentAreaFilled(false);
        btnclientes.setBounds(0, btnproveedores.getY() + 55, 300, 55);
        jpmenu.add(btnclientes);

        btnproductos = new JButton("PRODUCTOS");
        btnproductos.setForeground(new Color(255, 255, 255));
        btnproductos.setBackground(new Color(255, 255, 255));
        btnproductos.setFont(new Font("Agency FB", Font.PLAIN, 24));
        btnproductos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnproductos.setBounds(0, btnclientes.getY() + 55, 300, 55);
        btnproductos.setContentAreaFilled(false);
        jpmenu.add(btnproductos);

        btnRegVentas = new JButton("REGISTRO DE VENTAS");
        btnRegVentas.setForeground(new Color(255, 255, 255));
        btnRegVentas.setBackground(new Color(255, 255, 255));
        btnRegVentas.setFont(new Font("Agency FB", Font.PLAIN, 24));
        btnRegVentas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRegVentas.setBounds(0, btnproductos.getY() + 55, 300, 55);
        btnRegVentas.setContentAreaFilled(false);
        jpmenu.add(btnRegVentas);

        btnfacturar = new JButton("FACTURAR");
        btnfacturar.setForeground(new Color(255, 255, 255));
        btnfacturar.setBackground(new Color(255, 255, 255));
        btnfacturar.setFont(new Font("Agency FB", Font.PLAIN, 24));
        btnfacturar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnfacturar.setBounds(0, btnRegVentas.getY() + 55, 300, 55);
        btnfacturar.setContentAreaFilled(false);
        jpmenu.add(btnfacturar);

        btncerrar = new JButton("CERRAR SECION");
        btncerrar.setBackground(new Color(255, 255, 255));
        btncerrar.setFont(new Font("Agency FB", Font.PLAIN, 16));
        btncerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btncerrar.setBounds(75, jpmenu.getHeight() - 100, 150, 30);
        jpmenu.add(btncerrar);

        pnlPrincipal.setBackground(new Color(55, 55, 55));
        pnlPrincipal.setLayout(new BoxLayout(pnlPrincipal, BoxLayout.LINE_AXIS));
        pnlPrincipal.setBounds(1, 101, js.getWidth() - 20, js.getHeight() - 150);
        miP.add(pnlPrincipal);

        CambioPanel CambioPanel = new CambioPanel(pnlPrincipal, new vista.Panel_Empleados());

        add(js);
    }
    
    public static void main(String[] args) {
        new User_Admin();
    }
}
