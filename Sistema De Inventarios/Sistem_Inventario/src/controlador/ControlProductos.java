package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Panel_Productos;

public class ControlProductos implements ActionListener
{
	private Panel_Productos pProductos;
	
	public ControlProductos(Panel_Productos pArticulos)
	{
		this.pProductos = pArticulos;
		this.pProductos.btnnuevo.addActionListener(this);
		this.pProductos.btnregistrar.addActionListener(this);
		this.pProductos.btnmodificar.addActionListener(this);
		this.pProductos.btneliminar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evt)
	{
		if(evt.getSource() == pProductos.btnnuevo)
		{
			
		}
		if(evt.getSource() == pProductos.btnregistrar)
		{
			
		}
		if(evt.getSource() == pProductos.btnmodificar)
		{
			
		}
		if(evt.getSource() == pProductos.btneliminar)
		{
			
		}
	}
}
