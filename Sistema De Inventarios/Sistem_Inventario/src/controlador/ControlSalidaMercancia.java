package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Panel_SalidaMercancia;

public class ControlSalidaMercancia implements ActionListener
{
	private Panel_SalidaMercancia pVentas;
	
	public ControlSalidaMercancia(Panel_SalidaMercancia pVentas)
	{
		this.pVentas = pVentas;
		this.pVentas.btnnuevo.addActionListener(this);
		this.pVentas.btnagregar.addActionListener(this);
		this.pVentas.btnvender.addActionListener(this);
		this.pVentas.btneliminar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource() == pVentas.btnnuevo)
		{
			
		}
		if(evt.getSource() == pVentas.btnagregar)
		{
			
		}
		if(evt.getSource() == pVentas.btnvender)
		{
			
		}
		if(evt.getSource() == pVentas.btneliminar)
		{
			
		}
	}
}
