package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Panel_SalidaMercancia extends JPanel
{
	private JPanel p1 = new JPanel(), p2 = new JPanel(), p3 = new JPanel();
	private JLabel lblcodigo, lbltipoVenta, lblcantidad, lblsubT, lbliva, lbltotal;
	public JTextField txtcodigo, txtcantidad;
	public JComboBox<String> cbtipoVenta;
	public JButton btnnuevo, btnagregar, btneliminar, btnvender;
	public JTable jtregistro;
	
	public Panel_SalidaMercancia()
	{
		init();
	}
	
	public void init()
	{
		setLayout(null);
		setBackground(new Color(255, 255, 255));
		
		p1.setLayout(null);
		p1.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(80, 80, 255), 1), "Venta - Ingresar datos", TitledBorder.CENTER, TitledBorder.TOP, new Font("Agency FB", 1, 14)));
		p1.setBounds(50, 50, 1000, 150);
		p1.setVisible(true);
		add(p1);
		
		lblcodigo = new JLabel("Código de Producto :");
		lblcodigo.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblcodigo.setBounds(90, 70, 150, 25);
		p1.add(lblcodigo);
		
		txtcodigo = new JTextField();
		txtcodigo.setFont(new Font("Consolas", Font.BOLD, 16));
		txtcodigo.setHorizontalAlignment(JTextField.CENTER);
		txtcodigo.setBounds(200, 70, 130, 25);
		p1.add(txtcodigo);
		
		lbltipoVenta = new JLabel("Tipo de Venta :");
		lbltipoVenta.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lbltipoVenta.setBounds(420, 70, 80, 25);
		p1.add(lbltipoVenta);
		
		cbtipoVenta = new JComboBox<String>();
		cbtipoVenta.setFont(new Font("Agency FB", Font.PLAIN, 18));
		cbtipoVenta.addItem("Unitaria");
		cbtipoVenta.addItem("Mayoreo");
		cbtipoVenta.setBounds(510, 70, 100, 25);
		p1.add(cbtipoVenta);
		
		lblcantidad = new JLabel("Cantidad :");
		lblcantidad.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblcantidad.setBounds(710, 70, 50, 25);
		p1.add(lblcantidad);
		
		txtcantidad = new JTextField();
		txtcantidad.setFont(new Font("Consolas", Font.BOLD, 16));
		txtcantidad.setHorizontalAlignment(JTextField.CENTER);
		txtcantidad.setBounds(770, 70, 100, 25);
		p1.add(txtcantidad);
		
		p2.setLayout(null);
		p2.setBorder(BorderFactory.createLineBorder(new Color(80, 80, 255), 1));
		p2.setBounds(1070, 58, 304, 140);
		p2.setVisible(true);
		add(p2);
		
		btnnuevo = new JButton("NUEVO");
		btnnuevo.setFont(new Font("Agency FB", 0, 15));
		btnnuevo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnnuevo.setBounds(42, 25, 100, 30);
		p2.add(btnnuevo);
		
		btnagregar = new JButton("AGREGAR");
		btnagregar.setFont(new Font("Agency FB", 0, 15));
		btnagregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnagregar.setBounds(162, 25, 100, 30);
		btnagregar.setEnabled(false);
		p2.add(btnagregar);
		
		btneliminar = new JButton("ELIMINAR");
		btneliminar.setFont(new Font("Agency FB", 0, 15));
		btneliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btneliminar.setBounds(42, 85, 100, 30);
		btneliminar.setEnabled(false);
		p2.add(btneliminar);
		
		btnvender = new JButton("COBRAR");
		btnvender.setFont(new Font("Agency FB", 0, 15));
		btnvender.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnvender.setBounds(162, 85, 100, 30);
		btnvender.setEnabled(false);
		p2.add(btnvender);
		
		p3.setLayout(null);
		p3.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(80, 80, 255), 1), "Datos Registrados", TitledBorder.CENTER, TitledBorder.TOP, new Font("Agency FB", 1, 14)));
		p3.setBounds(50, 210, 1800, 690);
		p3.setVisible(true);
		add(p3);
		
		jtregistro = new JTable();
		jtregistro.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[]
			{
				"Código de Producto", "Categoria", "Descripción", "Cantidad", "Precio Unitario", "Total"
			})
			{
				boolean[] editable = new boolean[]
				{
					false, false, false, false, false, false
				};
				public boolean isCellEditable(int row, int column)
				{
					return editable [column];
				}
			});
		JScrollPane js = new JScrollPane(jtregistro);
		js.setBounds(50, 50, 1700, 490);
		p3.add(js);
		
		lblsubT = new JLabel("SubTotal =  $");
		lblsubT.setFont(new Font("Agency FB", Font.BOLD, 18));
		lblsubT.setBounds(1470, 560, 250, 20);
		p3.add(lblsubT);
		
		lbliva = new JLabel("I.V.A. =  $");
		lbliva.setFont(new Font("Agency FB", Font.BOLD, 18));
		lbliva.setBounds(1492, 595, 250, 20);
		p3.add(lbliva);
		
		lbltotal = new JLabel("Total =  $");
		lbltotal.setFont(new Font("Agency FB", Font.BOLD, 18));
		lbltotal.setBounds(1493, 630, 250, 20);
		p3.add(lbltotal);
	}
}
