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

@SuppressWarnings("serial")
public class Panel_Facturar extends JPanel
{
	private JPanel p1 = new JPanel(), p2 = new JPanel(), p3 = new JPanel();
	private JLabel lblRFC, lblnom, lblapellidoP, lblapellidoM, lblid, lblnombrereceptor;
	public JTextField txtRFC, txtnom, txtapellidoP, txtapelidoM, txtid, txtnombrereceptor;
	public JButton btnnuevo, btnconsultar, btnfacturar;
	public JTable jtregistro;
	
	public Panel_Facturar()
	{
		init();
	}
	
	public void init()
	{
		setLayout(null);
		setBackground(new Color(255, 255, 255));
		
		p1.setLayout(null);
		p1.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(80, 80, 255), 1), "Factura - Ingresar datos", TitledBorder.CENTER, TitledBorder.TOP, new Font("Agency FB", 1, 14)));
		p1.setBounds(60, 50, 920, 140);
		p1.setVisible(true);
		add(p1);
		
		lblRFC = new JLabel("Ingrese RFC :");
		lblRFC.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblRFC.setBounds(80, 60, 100, 20);
		p1.add(lblRFC);
		
		txtRFC = new JTextField();
		txtRFC.setFont(new Font("Consolas", Font.BOLD, 14));
		txtRFC.setHorizontalAlignment(JTextField.CENTER);
		txtRFC.setBounds(185, 60, 100, 25);
		p1.add(txtRFC);
		
		lblnombrereceptor = new JLabel("Nombre Del Receptor :");
		lblnombrereceptor.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblnombrereceptor.setBounds(340, 60, 80, 20);
		p1.add(lblnombrereceptor);
		
		txtnombrereceptor = new JTextField();
		txtnombrereceptor.setFont(new Font("Consolas", Font.BOLD, 14));
		txtnombrereceptor.setHorizontalAlignment(JTextField.CENTER);
		txtnombrereceptor.setBounds(185, 60, 100, 25);
		p1.add(txtnombrereceptor);
		
		lblnombrereceptor = new JLabel("Nombre Del Cliente :");
		lblnombrereceptor.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblnombrereceptor.setBounds(340, 60, 80, 20);
		p1.add(lblnombrereceptor);
		
		txtnombrereceptor = new JTextField();
		txtnombrereceptor.setFont(new Font("Consolas", Font.BOLD, 14));
		txtnombrereceptor.setHorizontalAlignment(JTextField.CENTER);
		txtnombrereceptor.setBounds(185, 60, 100, 25);
		p1.add(txtnombrereceptor);
		
		p2.setLayout(null);
		p2.setBorder(BorderFactory.createLineBorder(new Color(80, 80, 255), 1));
		p2.setBounds(1000, 58, 304, 130);
		p2.setVisible(true);
		add(p2);
		
		btnnuevo = new JButton("NUEVO");
		btnnuevo.setFont(new Font("Agency FB", 0, 15));
		btnnuevo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnnuevo.setBounds(42, 25, 100, 30);
		p2.add(btnnuevo);
		
//		btnagregar = new JButton("AGREGAR");
//		btnagregar.setFont(new Font("Agency FB", 0, 15));
//		btnagregar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnagregar.setBounds(162, 25, 100, 30);
//		btnagregar.setEnabled(false);
//		p2.add(btnagregar);
//		
//		btneliminar = new JButton("ELIMINAR");
//		btneliminar.setFont(new Font("Agency FB", 0, 15));
//		btneliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btneliminar.setBounds(42, 75, 100, 30);
//		btneliminar.setEnabled(false);
//		p2.add(btneliminar);
//		
//		btnvender = new JButton("VENDER");
//		btnvender.setFont(new Font("Agency FB", 0, 15));
//		btnvender.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//		btnvender.setBounds(162, 75, 100, 30);
//		btnvender.setEnabled(false);
//		p2.add(btnvender);
		
		p3.setLayout(null);
		p3.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(80, 80, 255), 1), "Registro de Datos", TitledBorder.CENTER, TitledBorder.TOP, new Font("Agency FB", 1, 14)));
		p3.setBounds(60, 200, 1244, 460);
		p3.setVisible(true);
		add(p3);
		
		jtregistro = new JTable();
		jtregistro.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[]
			{
				"Código de Artículo", "Categoria", "Descripción", "Cantidad", "Precio Unitario", "Total"
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
		js.setBounds(20, 35, 1200, 290);
		p3.add(js);
	}
}
