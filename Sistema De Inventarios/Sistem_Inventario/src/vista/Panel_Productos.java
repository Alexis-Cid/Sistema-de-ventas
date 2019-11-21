package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 * 
¿
 */

public final class Panel_Productos extends javax.swing.JPanel
{
	private final JPanel p1 = new JPanel(), p2 = new JPanel(), p3 = new JPanel();
	private JLabel lblcodigo, lbldescripcion, lblstock, lblprecioCos, lblprecioUni, lblprecioMay,
	lblproveedor, lblcategoria;
	public JTextField txtcodigo, txtdescripcion, txtprecioCos, txtprecioUni, txtprecioMay, txtstock,
	txtproveedor, txtcategoria;
	public JButton btnnuevo, btnregistrar, btnmodificar, btneliminar;
	public JTable jtregistro;
	
	public Panel_Productos()
	{
		init();
	}

	public void init()
	{
		setLayout(null);
		setBackground(new Color(255, 255, 255));;
		
		p1.setLayout(null);
		p1.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(80, 80, 255), 1), "Agregar / Modificar - Productos", TitledBorder.CENTER, TitledBorder.TOP, new Font("Agency FB", 1, 14)));
		p1.setBounds(50, 50, 1400, 210);
		p1.setVisible(true);
		add(p1);
		
		lblcodigo = new JLabel("Codigo del Producto :");
		lblcodigo.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblcodigo.setBounds(100, 50, 130, 20);
		p1.add(lblcodigo);
		
		txtcodigo = new JTextField();
		txtcodigo.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtcodigo.setHorizontalAlignment(JTextField.CENTER);
		txtcodigo.setBounds(220, 48, 130, 25);
		p1.add(txtcodigo);
		
		lbldescripcion = new JLabel("Descripcion :");
		lbldescripcion.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lbldescripcion.setBounds(100, 105, 70, 20);
		p1.add(lbldescripcion);
		
		txtdescripcion = new JTextField();
		txtdescripcion.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtdescripcion.setHorizontalAlignment(JTextField.CENTER);
		txtdescripcion.setBounds(220, 103, 130, 25);
		p1.add(txtdescripcion);
		
		lblstock = new JLabel("Nuevo Stock :");
		lblstock.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblstock.setBounds(100, 160, 75, 20);
		p1.add(lblstock);
		
		txtstock = new JTextField();
		txtstock.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtstock.setHorizontalAlignment(JTextField.CENTER);
		txtstock.setBounds(220, 158, 130, 25);
		p1.add(txtstock);
		
		lblprecioCos = new JLabel("Precio Costo :");
		lblprecioCos.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblprecioCos.setBounds(530, 50, 73, 20);
		p1.add(lblprecioCos);
		
		txtprecioCos = new JTextField();
		txtprecioCos.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtprecioCos.setHorizontalAlignment(JTextField.CENTER);
		txtprecioCos.setBounds(633, 48, 100, 25);
		p1.add(txtprecioCos);
		
		lblprecioUni = new JLabel("Precio Venta Uni. :");
		lblprecioUni.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblprecioUni.setBounds(530, 105, 95, 20);
		p1.add(lblprecioUni);
		
		txtprecioUni = new JTextField();
		txtprecioUni.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtprecioUni.setHorizontalAlignment(JTextField.CENTER);
		txtprecioUni.setBounds(633, 103, 100, 25);
		p1.add(txtprecioUni);
		
		lblprecioMay = new JLabel("Precio Venta May. :");
		lblprecioMay.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblprecioMay.setBounds(530, 160, 98, 20);
		p1.add(lblprecioMay);
		
		txtprecioMay = new JTextField();
		txtprecioMay.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtprecioMay.setHorizontalAlignment(JTextField.CENTER);
		txtprecioMay.setBounds(633, 158, 100, 25);
		p1.add(txtprecioMay);
		
		lblproveedor = new JLabel("Proveedor :");
		lblproveedor.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblproveedor.setBounds(920, 50, 60, 20);
		p1.add(lblproveedor);
		
		txtproveedor = new JTextField();
		txtproveedor.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtproveedor.setHorizontalAlignment(JTextField.CENTER);
		txtproveedor.setBounds(993, 48, 130, 25);
		p1.add(txtproveedor);
		
		lblcategoria = new JLabel("Categoria :");
		lblcategoria.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblcategoria.setBounds(920, 150, 55, 25);
		p1.add(lblcategoria);
		
		txtcategoria = new JTextField();
		txtcategoria.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtcategoria.setHorizontalAlignment(JTextField.CENTER);
		txtcategoria.setBounds(993, 148, 130, 25);
		p1.add(txtcategoria);
		
		p2.setLayout(null);
		p2.setBorder(BorderFactory.createLineBorder(new Color(80, 80, 255), 1));
		p2.setBounds(1470, 58, 380, 200);
		p2.setVisible(true);
		add(p2);
		
		btnnuevo = new JButton("NUEVO");
		btnnuevo.setFont(new Font("Agency FB", 0, 15));
		btnnuevo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnnuevo.setBounds(70, 50, 100, 30);
                btnnuevo.setEnabled(false);
		p2.add(btnnuevo);
		
		btnregistrar = new JButton("REGISTRAR");
		btnregistrar.setFont(new Font("Agency FB", 0, 15));
		btnregistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnregistrar.setBounds(210, 50, 100, 30);
		p2.add(btnregistrar);
		
		btnmodificar = new JButton("MODIFICAR");
		btnmodificar.setFont(new Font("Agency FB", 0, 15));
		btnmodificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnmodificar.setBounds(70, 120, 100, 30);
		btnmodificar.setEnabled(false);
		p2.add(btnmodificar);
		
		btneliminar = new JButton("ELIMINAR");
		btneliminar.setFont(new Font("Agency FB", 0, 15));
		btneliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btneliminar.setBounds(210, 120, 100, 30);
		btneliminar.setEnabled(false);
		p2.add(btneliminar);
		
		p3.setLayout(null);
		p3.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(80, 80, 255), 1), "Registro - Empleado", TitledBorder.CENTER, TitledBorder.TOP, new Font("Agency FB", 1, 14)));
		p3.setBounds(50, 270, 1800, 630);
		p3.setVisible(true);
		add(p3);
		
		jtregistro = new JTable();
		jtregistro.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[]
			{
				"Codigo del Producto", "Descripcion", "Stock", "Precio de Costo", "Precio de Venta Unitaria",
				"Precio de Venta Mayoreo", "Proveedor", "Categoria", "Fecha de Registro"
			})
			{
				boolean[] editable = new boolean[]
				{
					false, false, false, false, false, false, false, false, false
				};
                                @Override
				public boolean isCellEditable(int row, int column)
				{
					return editable [column];
				}
			});
		JScrollPane js = new JScrollPane(jtregistro);
		js.setBounds(50, 50, 1700, 540);
		p3.add(js);
	}
}
