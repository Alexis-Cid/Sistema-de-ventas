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
import modelo.ModeloProveedores;

/**
 * 
 
 *
 */

public final class Panel_Proveedor extends javax.swing.JPanel
{
	private JPanel p1, p2, p3;
	private JLabel lblnom, lblapellidoP, lblapellidoM, lblnumT, lblid, lbldireccion, lblcomercial;
	public JTextField txtnom, txtapellidoP, txtapellidoM, txtnumT, txtid, txtdireccion, txtcomercial;
	public JButton btnnuevo, btnregistrar, btnmodificar, btneliminar;
	public JTable jtregistro;
        public DefaultTableModel tReg;
	
	public Panel_Proveedor()
	{
		init();
                tReg = (DefaultTableModel)jtregistro.getModel();
                ModeloProveedores mod = new ModeloProveedores();
	}
	
	public void init()
	{
		setLayout(null);
		setBackground(new Color(255, 255, 255));;
		
                p1 = new JPanel();
		p1.setLayout(null);
		p1.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(80, 80, 255), 1), "Agregar / Modificar - Proveedor", TitledBorder.CENTER, TitledBorder.TOP, new Font("Agency FB", 1, 14)));
		p1.setBounds(50, 50, 1400, 210);
		p1.setVisible(true);
		add(p1);
		
		lblnom = new JLabel("Nombre (s) :");
		lblnom.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblnom.setBounds(100, 50, 70, 20);
		p1.add(lblnom);
		
		txtnom = new JTextField();
		txtnom.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtnom.setHorizontalAlignment(JTextField.CENTER);
		txtnom.setBounds(200, 48, 130, 25);
		p1.add(txtnom);
		
		lblapellidoP = new JLabel("Apellido Paterno :");
		lblapellidoP.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblapellidoP.setBounds(100, 105, 88, 20);
		p1.add(lblapellidoP);
		
		txtapellidoP = new JTextField();
		txtapellidoP.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtapellidoP.setHorizontalAlignment(JTextField.CENTER);
		txtapellidoP.setBounds(200, 103, 130, 25);
		p1.add(txtapellidoP);
		
		lblapellidoM = new JLabel("Apellido Materno :");
		lblapellidoM.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblapellidoM.setBounds(100, 160, 90, 20);
		p1.add(lblapellidoM);
		
		txtapellidoM = new JTextField();
		txtapellidoM.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtapellidoM.setHorizontalAlignment(JTextField.CENTER);
		txtapellidoM.setBounds(200, 158, 130, 25);
		p1.add(txtapellidoM);
		
		lblnumT = new JLabel("Num. Telefonico :");
		lblnumT.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblnumT.setBounds(520, 50, 85, 20);
		p1.add(lblnumT);
		
		txtnumT = new JTextField();
		txtnumT.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtnumT.setHorizontalAlignment(JTextField.CENTER);
		txtnumT.setBounds(610, 48, 130, 25);
		p1.add(txtnumT);
		
		lblid = new JLabel("ID Proveedor :");
		lblid.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblid.setBounds(520, 140, 75, 20);
		p1.add(lblid);
		
		txtid = new JTextField();
		txtid.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtid.setHorizontalAlignment(JTextField.CENTER);
		txtid.setBounds(610, 138, 130, 25);
		p1.add(txtid);
		
		lbldireccion = new JLabel("Direccion :");
		lbldireccion.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lbldireccion.setBounds(970, 50, 53, 20);
		p1.add(lbldireccion);
		
		txtdireccion = new JTextField();
		txtdireccion.setFont(new Font("Consolas", Font.PLAIN, 12));
		txtdireccion.setHorizontalAlignment(JTextField.CENTER);
		txtdireccion.setBounds(1043, 48, 170, 25);
		p1.add(txtdireccion);
		
		lblcomercial = new JLabel("Empresa Comercial :");
		lblcomercial.setFont(new Font("Agency FB", Font.PLAIN, 18));
		lblcomercial.setBounds(930, 140, 108, 20);
		p1.add(lblcomercial);
		
		txtcomercial = new JTextField();
		txtcomercial.setFont(new Font("Consolas", Font.PLAIN, 16));
		txtcomercial.setHorizontalAlignment(JTextField.CENTER);
		txtcomercial.setBounds(1043, 138, 170, 25);
		p1.add(txtcomercial);
		
                p2 = new JPanel();
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
		
                p3 = new JPanel();
		p3.setLayout(null);
		p3.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(80, 80, 255), 1), "Registro - Proveedor", TitledBorder.CENTER, TitledBorder.TOP, new Font("Agency FB", 1, 14)));
		p3.setBounds(50, 270, 1800, 630);
		p3.setVisible(true);
		add(p3);

		jtregistro = new JTable();
		jtregistro.setModel(new DefaultTableModel(
			new Object[][] {},
			new String[]
			{
				"ID Proveedor", "Nombre(s)", "Apellido Paterno", "Apellido Materno",
				"Empresa Comercial", "Numero de Telefono", "Direccion"
			})
			{
				boolean[] editable = new boolean[]
				{
					false, false, false, false, false, false, false
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
