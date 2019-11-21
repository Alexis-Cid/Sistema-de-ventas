package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import controlador.ControlClientes;
import modelo.ConsultaClientesSQL;
import modelo.ModeloClientes;

/**
 * 
 * 
 *
 */

public final class Panel_Clientes extends JPanel
{
    private JPanel p1, p2, p3;
    private JLabel lblnom, lblapellidoP, lblapellidoM, lblnumT, lbldireccion, lblRFC;
    public JTextField txtnom, txtapellidoP, txtapellidoM, txtnumT, txtdireccion, txtRFC;
    public JButton btnnuevo, btnregistrar, btnmodificar, btnaceptar, btneliminar;
    public JTable jtregistro;
    public DefaultTableModel tReg;
        
    public Panel_Clientes()
    {
        init();
        tReg = (DefaultTableModel)jtregistro.getModel();
        ModeloClientes mod = new ModeloClientes();
        ConsultaClientesSQL modC = new ConsultaClientesSQL();
        ControlClientes ctrl = new ControlClientes(this, mod, modC);
    }
	
    public void init()
    {
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        lblnom = new JLabel("Nombre (s) :");
        txtnom = new JTextField();
        lblapellidoP = new JLabel("Apellido Paterno :");
        txtapellidoP = new JTextField();
        lblapellidoM = new JLabel("Apellido Materno :");
        txtapellidoM = new JTextField();
        lblnumT = new JLabel("Num. Telefonico :");
        txtnumT = new JTextField();
        lbldireccion = new JLabel("Direccion :");
        txtdireccion = new JTextField();
        lblRFC = new JLabel("R.F.C. :");
        txtRFC = new JTextField();
        btnregistrar = new JButton("REGISTRAR");
        btnnuevo = new JButton("NUEVO");
        btnmodificar = new JButton("MODIFICAR");
        btnaceptar = new JButton("ACEPTAR");
        btneliminar = new JButton("ELIMINAR");

        setLayout(null);
        setBackground(new Color(255, 255, 255));

        p1.setLayout(null);
        p1.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(80, 80, 255), 1), "Agregar / Modificar - Cliente", TitledBorder.CENTER, TitledBorder.TOP, new Font("Agency FB", 1, 14)));
        p1.setBounds(50, 50, 1400, 210);
        p1.setVisible(true);
        add(p1);

        lblnom.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblnom.setBounds(100, 50, 70, 20);
        p1.add(lblnom);

        txtnom.setFont(new Font("Consolas", Font.PLAIN, 16));
        txtnom.setHorizontalAlignment(JTextField.CENTER);
        txtnom.setBounds(200, 48, 130, 25);
        p1.add(txtnom);

        lblapellidoP.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblapellidoP.setBounds(100, 160, 90, 20);
        p1.add(lblapellidoP);

        txtapellidoP.setFont(new Font("Consolas", Font.PLAIN, 16));
        txtapellidoP.setHorizontalAlignment(JTextField.CENTER);
        txtapellidoP.setBounds(200, 158, 130, 25);
        p1.add(txtapellidoP);

        lblapellidoM.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblapellidoM.setBounds(510, 50, 95, 20);
        p1.add(lblapellidoM);

        txtapellidoM.setFont(new Font("Consolas", Font.PLAIN, 16));
        txtapellidoM.setHorizontalAlignment(JTextField.CENTER);
        txtapellidoM.setBounds(610, 48, 130, 25);
        p1.add(txtapellidoM);

        lblnumT.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblnumT.setBounds(510, 150, 95, 20);
        p1.add(lblnumT);

        txtnumT.setFont(new Font("Consolas", Font.PLAIN, 16));
        txtnumT.setHorizontalAlignment(JTextField.CENTER);
        txtnumT.setBounds(610, 148, 130, 25);
        p1.add(txtnumT);
		
        lbldireccion.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lbldireccion.setBounds(970, 50, 53, 20);
        p1.add(lbldireccion);

        txtdireccion.setFont(new Font("Consolas", Font.PLAIN, 12));
        txtdireccion.setHorizontalAlignment(JTextField.CENTER);
        txtdireccion.setBounds(1043, 48, 170, 25);
        p1.add(txtdireccion);

        lblRFC.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblRFC.setBounds(990, 150, 35, 20);
        p1.add(lblRFC);
        
        txtRFC.setFont(new Font("Consolas", Font.PLAIN, 12));
        txtRFC.setHorizontalAlignment(JTextField.CENTER);
        txtRFC.setBounds(1043, 148, 170, 25);
        p1.add(txtRFC);

        p2.setLayout(null);
        p2.setBorder(BorderFactory.createLineBorder(new Color(80, 80, 255), 1));
        p2.setBounds(1470, 58, 380, 200);
        p2.setVisible(true);
        add(p2);

        btnnuevo.setFont(new Font("Agency FB", 0, 15));
        btnnuevo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnnuevo.setBounds(70, 40, 100, 30);
        btnnuevo.setEnabled(false);
        p2.add(btnnuevo);

        btnregistrar.setFont(new Font("Agency FB", 0, 15));
        btnregistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnregistrar.setBounds(210, 40, 100, 30);
        p2.add(btnregistrar);

	btnmodificar.setFont(new Font("Agency FB", 0, 15));
	btnmodificar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	btnmodificar.setBounds(70, 85, 100, 30);
	btnmodificar.setEnabled(false);
	p2.add(btnmodificar);
        
        btnaceptar.setFont(new Font("Agency FB", 0, 15));
	btnaceptar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	btnaceptar.setBounds(210, 85, 100, 30);
	btnaceptar.setEnabled(false);
	btnaceptar.setEnabled(false);
        p2.add(btnaceptar);

	btneliminar.setFont(new Font("Agency FB", 0, 15));
	btneliminar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	btneliminar.setBounds(210, 130, 100, 30);
	btneliminar.setEnabled(false);
	p2.add(btneliminar);

	p3.setLayout(null);
	p3.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(80, 80, 255), 1), "Registro - Cliente", TitledBorder.CENTER, TitledBorder.TOP, new Font("Agency FB", 1, 14)));
	p3.setBounds(50, 270, 1800, 630);
	p3.setVisible(true);
	add(p3);

	jtregistro = new JTable();
	jtregistro.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[]
            {
		"Nombre(s)", "Apellido Paterno", "Apellido Materno", "Numero de Telefono", "Direccion", "R.F.C."
            })
            {
		boolean[] editable = new boolean[]
                {
                    false, false, false, false, false, false
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
