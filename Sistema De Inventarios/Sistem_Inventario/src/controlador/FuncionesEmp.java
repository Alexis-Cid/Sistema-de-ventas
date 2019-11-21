package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import AppPackage.AnimationClass;

import modelo.CambioPanel;
import vista.Principal_Login;
import vista.User_Empleado;

public class FuncionesEmp implements ActionListener
{
	private final User_Empleado uEmp;
	
	public FuncionesEmp(User_Empleado uEmp)
	{
		this.uEmp = uEmp;
		this.uEmp.btnmenu.addActionListener(this);
		this.uEmp.btnventas.addActionListener(this);
		this.uEmp.btnfacturar.addActionListener(this);
		this.uEmp.btnclientes.addActionListener(this);
		this.uEmp.btnconsultas.addActionListener(this);
		this.uEmp.btncerrar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource() == uEmp.btnmenu)
		{
			int posicion = uEmp.jpmenu.getX();
			if(posicion > -1)
			{
				Animacion.Animacion.mover_izquierda(0, -300, 2, 3, uEmp.jpmenu);
			}
			else
			{
				Animacion.Animacion.mover_derecha(-300, 1, 2, 3, uEmp.jpmenu);
			}
		}
		else if(evt.getSource() == uEmp.btnventas)
		{
                    CambioPanel cambioPanel = new CambioPanel(uEmp.pnlPrincipal, new vista.Panel_SalidaMercancia());
			uEmp.btnventas.setOpaque(true);
			uEmp.btnventas.setEnabled(false);
			uEmp.btnfacturar.setOpaque(false);
			uEmp.btnfacturar.setEnabled(true);
			uEmp.btnclientes.setOpaque(false);
			uEmp.btnclientes.setEnabled(true);
			uEmp.btnconsultas.setOpaque(false);
			uEmp.btnconsultas.setEnabled(true);
			Animacion.Animacion.mover_izquierda(0, -300, 2, 3, uEmp.jpmenu);
		}
		else if(evt.getSource() == uEmp.btnfacturar)
		{
                    CambioPanel cambioPanel = new CambioPanel(uEmp.pnlPrincipal, new vista.Panel_Facturar());
			uEmp.btnfacturar.setOpaque(true);
			uEmp.btnfacturar.setEnabled(false);
			uEmp.btnventas.setOpaque(false);
			uEmp.btnventas.setEnabled(true);
			uEmp.btnclientes.setOpaque(false);
			uEmp.btnclientes.setEnabled(true);
			uEmp.btnconsultas.setOpaque(false);
			uEmp.btnconsultas.setEnabled(true);;
			Animacion.Animacion.mover_izquierda(0, -300, 2, 3, uEmp.jpmenu);
		}
		else if(evt.getSource() == uEmp.btnclientes)
		{
                    CambioPanel cambioPanel = new CambioPanel(uEmp.pnlPrincipal, new vista.Panel_Clientes());
			uEmp.btnclientes.setOpaque(true);
			uEmp.btnclientes.setEnabled(false);
			uEmp.btnventas.setOpaque(false);
			uEmp.btnventas.setEnabled(true);
			uEmp.btnfacturar.setOpaque(false);
			uEmp.btnfacturar.setEnabled(true);
			uEmp.btnconsultas.setOpaque(false);
			uEmp.btnconsultas.setEnabled(true);
			Animacion.Animacion.mover_izquierda(0, -300, 2, 3, uEmp.jpmenu);
		}
		else if(evt.getSource() == uEmp.btnconsultas)
		{
			uEmp.btnconsultas.setOpaque(true);
			uEmp.btnconsultas.setEnabled(false);
			uEmp.btnventas.setOpaque(false);
			uEmp.btnventas.setEnabled(true);
			uEmp.btnfacturar.setOpaque(false);
			uEmp.btnfacturar.setEnabled(true);
			uEmp.btnclientes.setOpaque(false);
			uEmp.btnclientes.setEnabled(true);
			Animacion.Animacion.mover_izquierda(0, -300, 2, 3, uEmp.jpmenu);
                        JOptionPane.showMessageDialog(null, uEmp.getWidth() + " - " + uEmp.getHeight());
		}
		else if(evt.getSource() == uEmp.btncerrar)
		{
			Principal_Login princ = new Principal_Login();
			princ.setVisible(true);
			uEmp.dispose();
		}
	}
}
