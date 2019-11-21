package vista;

import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controlador.FuncionesEmp;
import modelo.CambioPanel;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;

/**
 * 
 *
 *
 */

public final class User_Empleado extends JFrame
{
	private JPanel miP;
	public JPanel jpSup, pnlPrincipal = new JPanel(), jpmenu = new JPanel();
	private JLabel lblinvitado;
	public JButton btnmenu, btnventas, btnfacturar, btnclientes, btnconsultas, btncerrar;
	private JScrollPane js;
	
	public User_Empleado()
	{
		init();
		FuncionesEmp fun = new FuncionesEmp(this);
		getContentPane().setBackground(new Color(255, 255, 255));
		setSize(900,800);
        setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
	}
	public void init()
	{
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
		jpSup.setBackground(new Color(80, 80, 255));
		jpSup.setBounds(0, 0, js.getWidth(), 100);
		jpSup.setVisible(true);
		miP.add(jpSup);
		
		lblinvitado = new JLabel("E  M  P  L  E  A  D  O :");
		lblinvitado.setForeground(new Color(255, 255, 255));
		lblinvitado.setFont(new Font("Agency FB", Font.PLAIN, 30));
		lblinvitado.setBounds(jpSup.getWidth()/2-100, 25, 200, 30);
		jpSup.add(lblinvitado);
		
		btnmenu = new JButton();
		btnmenu.setIcon(new ImageIcon(User_Admin.class.getResource("/img/menu.png")));
		btnmenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnmenu.setContentAreaFilled(false);
		btnmenu.setBounds(5, 20, 60, 60);
		jpSup.add(btnmenu);
		
		jpmenu.setLayout(null);
		jpmenu.setBackground(new Color(80, 80, 255));
		jpmenu.setBounds(-300, 100, 300, js.getHeight()-145);
		jpmenu.setVisible(true);
		miP.add(jpmenu);
		
		btnventas = new JButton("VENTAS");
		btnventas.setForeground(new Color(255, 255, 255));
		btnventas.setBackground(new Color(255, 255, 255));
		btnventas.setFont(new Font("Agency FB", Font.PLAIN, 24));
		btnventas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnventas.setContentAreaFilled(false);
		btnventas.setOpaque(true);
		btnventas.setEnabled(false);
		btnventas.setBounds(0, 200, 300, 55);
		jpmenu.add(btnventas);
		
		btnfacturar = new JButton("FACTURAR");
		btnfacturar.setForeground(new Color(255, 255, 255));
		btnfacturar.setBackground(new Color(255, 255, 255));
		btnfacturar.setFont(new Font("Agency FB", Font.PLAIN, 24));
		btnfacturar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnfacturar.setContentAreaFilled(false);
		btnfacturar.setBounds(0, 255, 300, 55);
		jpmenu.add(btnfacturar);
		
		btnclientes = new JButton("CLIENTES");
		btnclientes.setForeground(new Color(255, 255, 255));
		btnclientes.setBackground(new Color(255, 255, 255));
		btnclientes.setFont(new Font("Agency FB", Font.PLAIN, 24));
		btnclientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnclientes.setContentAreaFilled(false);
		btnclientes.setBounds(0, 310, 300, 55);
		jpmenu.add(btnclientes);
		
		btnconsultas = new JButton("CONSULTAS");
		btnconsultas.setForeground(new Color(255, 255, 255));
		btnconsultas.setBackground(new Color(255, 255, 255));
		btnconsultas.setFont(new Font("Agency FB", Font.PLAIN, 24));
		btnconsultas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnconsultas.setBounds(0, 365, 300, 55);
		btnconsultas.setContentAreaFilled(false);
		jpmenu.add(btnconsultas);
		
		btncerrar = new JButton("CERRAR SECION");
		btncerrar.setBackground(new Color(255, 255, 255));
		btncerrar.setFont(new Font("Agency FB", Font.PLAIN, 16));
		btncerrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btncerrar.setBounds(75, jpmenu.getHeight()-100, 150, 30);
		jpmenu.add(btncerrar);
		
		pnlPrincipal.setBackground(new Color(255, 255, 255));
		pnlPrincipal.setLayout(new BoxLayout(pnlPrincipal, BoxLayout.LINE_AXIS));
		pnlPrincipal.setBounds(1, 101, js.getWidth()-20, js.getHeight()-150);
		miP.add(pnlPrincipal);
		
		CambioPanel cambioPanel = new CambioPanel(pnlPrincipal, new vista.Panel_SalidaMercancia());
		
		add(js);
	}
}
