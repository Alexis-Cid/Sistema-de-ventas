package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import controlador.ControlEmpleados;
import modelo.sql.ConsultaEmpleadosSQL;
import modelo.entidades.ModeloEmpleados;

/**
 *
 *
 *
 */
public final class Panel_Empleados extends JPanel {

    private JPanel p1, p2, p3;
    private JLabel lblid, lblnom, lblapellidoP, lblapellidoM, lblnumT, lblsexo, lblnacionalidad, lbldireccion, lblfechaN, lblcontra;
    public JTextField txtid, txtnom, txtapellidoP, txtapellidoM, txtnumT, txtdireccion, txta, txtcontra;
    public JComboBox<String> cbnacionalidad, cbsexo, cbdia, cbmes;
    public JButton btnnuevo, btnregistrar, btnmodificar, btneliminar;
    public JTable jtregistro;

    public Panel_Empleados() {
        init();
        ModeloEmpleados modEmpleados = new ModeloEmpleados();
        ConsultaEmpleadosSQL consulta = new ConsultaEmpleadosSQL();
        ControlEmpleados cEmp = new ControlEmpleados(this, modEmpleados, consulta);
    }

    public void init() {
        setLayout(null);
        setBackground(new Color(255, 255, 255));

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(80, 80, 255), 1), "Agregar / Modificar - Empleado", TitledBorder.CENTER, TitledBorder.TOP, new Font("Agency FB", 1, 14)));
        p1.setBounds(50, 50, 1400, 210);
        p1.setVisible(true);
        add(p1);

        lblid = new JLabel("ID Empleado :");
        lblid.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblid.setBounds(100, 40, 70, 20);
        p1.add(lblid);

        txtid = new JTextField();
        txtid.setFont(new Font("Consolas", Font.PLAIN, 16));
        txtid.setHorizontalAlignment(JTextField.CENTER);
        txtid.setBounds(200, 38, 130, 25);
        p1.add(txtid);

        lblnom = new JLabel("Nombre (s) :");
        lblnom.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblnom.setBounds(100, 80, 70, 20);
        p1.add(lblnom);

        txtnom = new JTextField();
        txtnom.setFont(new Font("Consolas", Font.PLAIN, 16));
        txtnom.setHorizontalAlignment(JTextField.CENTER);
        txtnom.setBounds(200, 78, 130, 25);
        p1.add(txtnom);

        lblapellidoP = new JLabel("Apellido Paterno :");
        lblapellidoP.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblapellidoP.setBounds(100, 120, 88, 20);
        p1.add(lblapellidoP);

        txtapellidoP = new JTextField();
        txtapellidoP.setFont(new Font("Consolas", Font.PLAIN, 16));
        txtapellidoP.setHorizontalAlignment(JTextField.CENTER);
        txtapellidoP.setBounds(200, 118, 130, 25);
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
        lblnumT.setBounds(490, 50, 85, 20);
        p1.add(lblnumT);

        txtnumT = new JTextField();
        txtnumT.setFont(new Font("Consolas", Font.PLAIN, 16));
        txtnumT.setHorizontalAlignment(JTextField.CENTER);
        txtnumT.setBounds(580, 48, 135, 25);
        p1.add(txtnumT);

        lblsexo = new JLabel("Sexo :");
        lblsexo.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblsexo.setBounds(520, 105, 35, 20);
        p1.add(lblsexo);

        cbsexo = new JComboBox<>();
        cbsexo.setFont(new Font("Agency FB", Font.PLAIN, 18));
        cbsexo.addItem("seleccione");
        cbsexo.addItem("FEMENINO");
        cbsexo.addItem("MASCULINO");
        cbsexo.setBounds(570, 103, 145, 25);
        p1.add(cbsexo);

        lblnacionalidad = new JLabel("Estado :");
        lblnacionalidad.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblnacionalidad.setBounds(490, 160, 68, 20);
        p1.add(lblnacionalidad);

        cbnacionalidad = new JComboBox<>();
        cbnacionalidad.setFont(new Font("Agency FB", Font.PLAIN, 18));
        cbnacionalidad.addItem("seleccione");
        cbnacionalidad.addItem("Aguascalientes");
        cbnacionalidad.addItem("Baja California");
        cbnacionalidad.addItem("Baja California Sur");
        cbnacionalidad.addItem("Campeche");
        cbnacionalidad.addItem("Chiapas");
        cbnacionalidad.addItem("Chihuahua");
        cbnacionalidad.addItem("Coahuila");
        cbnacionalidad.addItem("Colima");
        cbnacionalidad.addItem("D.F.");
        cbnacionalidad.addItem("Durango");
        cbnacionalidad.addItem("Estado de Mexico");
        cbnacionalidad.addItem("Guanajuato");
        cbnacionalidad.addItem("Guerrero");
        cbnacionalidad.addItem("Hidalgo");
        cbnacionalidad.addItem("Jalisco");
        cbnacionalidad.addItem("Michoacan");
        cbnacionalidad.addItem("Morelos");
        cbnacionalidad.addItem("Nayarit");
        cbnacionalidad.addItem("Nuevo Leon");
        cbnacionalidad.addItem("Oaxaca");
        cbnacionalidad.addItem("Puebla");
        cbnacionalidad.addItem("Queretaro");
        cbnacionalidad.addItem("Quintana Roo");
        cbnacionalidad.addItem("San Luis Potosi");
        cbnacionalidad.addItem("Sinaloa");
        cbnacionalidad.addItem("Sonora");
        cbnacionalidad.addItem("Tabasco");
        cbnacionalidad.addItem("Tamaulipas");
        cbnacionalidad.addItem("Tlaxcala");
        cbnacionalidad.addItem("Veracruz");
        cbnacionalidad.addItem("Yucatan");
        cbnacionalidad.addItem("Zacatecas");
        cbnacionalidad.setBounds(570, 158, 145, 25);
        p1.add(cbnacionalidad);

        lbldireccion = new JLabel("Direccion :");
        lbldireccion.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lbldireccion.setBounds(900, 50, 53, 20);
        p1.add(lbldireccion);

        txtdireccion = new JTextField();
        txtdireccion.setFont(new Font("Consolas", Font.PLAIN, 12));
        txtdireccion.setHorizontalAlignment(JTextField.CENTER);
        txtdireccion.setBounds(970, 48, 170, 25);
        p1.add(txtdireccion);

        lblcontra = new JLabel("Contraseña :");
        lblcontra.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblcontra.setBounds(900, 90, 65, 20);
        p1.add(lblcontra);

        txtcontra = new JTextField();
        txtcontra.setFont(new Font("Consolas", Font.BOLD, 16));
        txtcontra.setHorizontalAlignment(JTextField.CENTER);
        txtcontra.setBounds(970, 88, 170, 25);
        p1.add(txtcontra);

        lblfechaN = new JLabel("Fecha de Nacimiento");
        lblfechaN.setFont(new Font("Agency FB", Font.PLAIN, 18));
        lblfechaN.setBounds(963, 130, 105, 20);
        p1.add(lblfechaN);

        cbdia = new JComboBox<>();
        cbdia.setFont(new Font("Agency FB", Font.PLAIN, 18));
        cbdia.addItem("dia");
        cbdia.addItem("01");
        cbdia.addItem("02");
        cbdia.addItem("03");
        cbdia.addItem("04");
        cbdia.addItem("05");
        cbdia.addItem("06");
        cbdia.addItem("07");
        cbdia.addItem("08");
        cbdia.addItem("09");
        cbdia.addItem("10");
        cbdia.addItem("11");
        cbdia.addItem("12");
        cbdia.addItem("13");
        cbdia.addItem("14");
        cbdia.addItem("15");
        cbdia.addItem("16");
        cbdia.addItem("17");
        cbdia.addItem("18");
        cbdia.addItem("19");
        cbdia.addItem("20");
        cbdia.addItem("21");
        cbdia.addItem("22");
        cbdia.addItem("23");
        cbdia.addItem("24");
        cbdia.addItem("25");
        cbdia.addItem("26");
        cbdia.addItem("27");
        cbdia.addItem("28");
        cbdia.addItem("29");
        cbdia.addItem("30");
        cbdia.addItem("31");
        cbdia.setBounds(900, 155, 45, 25);
        p1.add(cbdia);

        cbmes = new JComboBox<>();
        cbmes.setFont(new Font("Agency FB", Font.PLAIN, 18));
        cbmes.addItem("mes");
        cbmes.addItem("Enero");
        cbmes.addItem("Febrero");
        cbmes.addItem("Marzo");
        cbmes.addItem("Abril");
        cbmes.addItem("Mayo");
        cbmes.addItem("Junio");
        cbmes.addItem("Julio");
        cbmes.addItem("Agosto");
        cbmes.addItem("Septiembre");
        cbmes.addItem("Octubre");
        cbmes.addItem("Noviembre");
        cbmes.addItem("Diciembre");
        cbmes.setBounds(965, 155, 100, 25);
        p1.add(cbmes);

        txta = new JTextField();
        txta.setFont(new Font("Consolas", Font.PLAIN, 16));
        txta.setHorizontalAlignment(JTextField.CENTER);
        txta.setBounds(1085, 155, 55, 25);
        p1.add(txta);

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
        p3.setBorder(BorderFactory.createTitledBorder(new LineBorder(new Color(80, 80, 255), 1), "Registro - Empleado", TitledBorder.CENTER, TitledBorder.TOP, new Font("Agency FB", 1, 14)));
        p3.setBounds(50, 270, 1800, 630);
        p3.setVisible(true);
        add(p3);

        jtregistro = new JTable();
        jtregistro.setFont(new Font("Agency FB", 0, 25));
        jtregistro.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID Empleado", "Nombre(s)", "Apellido Paterno", "Apellido Materno", "Numero de Telefono", "Sexo", "Nacionalidad", "Direccion", "Fecha de Nacimiento"
                }) {
            boolean[] editable = new boolean[]{
                false, false, false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int row, int column) {
                return editable[column];
            }
        });
        JScrollPane js = new JScrollPane(jtregistro);
        js.setBounds(50, 50, 1700, 540);
        p3.add(js);
    }
}
