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

public final class Panel_Registro_Ventas extends JPanel
{
	private final JPanel p1 = new JPanel(), p2 = new JPanel();
	private JLabel lblbuscar;
	public JTextField txtbuscar;
	public JButton btnbuscar, btnmostrar, btneliminar;
	public JTable jtregistro;
	
	public Panel_Registro_Ventas()
	{
		init();
	}
	
	public void init()
	{
		setLayout(null);
		setBackground(new Color(255, 255, 255));
		
		p1.setLayout(null);
		p1.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(80, 80, 255), 1), "Consultar - Ventas por Fecha de Registro", TitledBorder.CENTER, TitledBorder.TOP, new Font("Agency FB", 1, 14)));
		p1.setBounds(50, 50, 1800, 150);
		p1.setVisible(true);
		add(p1);
		
		lblbuscar = new JLabel("Ingrese Fecha de Ventas a Buscar :");
		lblbuscar.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblbuscar.setBounds(100, 65, 190, 25);
		p1.add(lblbuscar);
		
		txtbuscar = new JTextField();
		txtbuscar.setFont(new Font("Consolas", Font.BOLD, 16));
		txtbuscar.setHorizontalAlignment(JTextField.CENTER);
		txtbuscar.setBounds(300, 65, 130, 25);
		p1.add(txtbuscar);
		
		btnbuscar = new JButton("CONSULTAR");
		btnbuscar.setFont(new Font("Agency FB", 0, 16));
		btnbuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnbuscar.setBounds(450, 63, 110, 30);
		p1.add(btnbuscar);
		
		btnmostrar = new JButton("MOSTRAR TODAS LAS VENTAS");
		btnmostrar.setFont(new Font("Agency FB", 0, 16));
		btnmostrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnmostrar.setBounds(750, 63, 230, 30);
		p1.add(btnmostrar);
		
		btneliminar = new JButton("ELIMINAR");
		btneliminar.setFont(new Font("Agency FB", 0, 16));
		btneliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btneliminar.setBounds(1080, 63, 110, 30);
		p1.add(btneliminar);
		
		p2.setLayout(null);
		p2.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(80, 80, 255), 1), "Ventas Registradas", TitledBorder.CENTER, TitledBorder.TOP, new Font("Agency FB", 1, 14)));
		p2.setBounds(50, 220, 1800, 680);
		p2.setVisible(true);
		add(p2);
		
		jtregistro = new JTable();
		jtregistro.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[]
			{
				"Codigo de Producto", "Categoria", "Descripcion", "Cantidad", "Precio Unitario", "Total", "Fecha de Registro"
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
		js.setBounds(50, 50, 1700, 600);
		p2.add(js);
	}
}
