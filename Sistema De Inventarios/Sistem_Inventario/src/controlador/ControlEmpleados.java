package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

import javax.swing.JOptionPane;

import modelo.Bloq_Mayus;
import modelo.sql.ConsultaEmpleadosSQL;
import modelo.entidades.ModeloEmpleados;
import vista.Panel_Empleados;

public final class ControlEmpleados implements ActionListener {

    private final Panel_Empleados pEmpleados;
    private final ModeloEmpleados modEmpleados;
    private final ConsultaEmpleadosSQL modConsulta;
    private int seleccion;
    
    DefaultTableModel modeloTabla;

    public ControlEmpleados(Panel_Empleados pEmpleados, ModeloEmpleados modEmpleados, ConsultaEmpleadosSQL modConsulta) {
        this.pEmpleados = pEmpleados;
        this.modEmpleados = modEmpleados;
        this.modConsulta = modConsulta;
        this.pEmpleados.btnnuevo.addActionListener(this);
        this.pEmpleados.btnregistrar.addActionListener(this);
        this.pEmpleados.btnmodificar.addActionListener(this);
        this.pEmpleados.btneliminar.addActionListener(this);

        this.pEmpleados.txtid.setDocument(new Bloq_Mayus());      //txtid, txtnom, txtapellidoP, txtapellidoM, txtnumT, txtdireccion, txta, txtcontra
        this.pEmpleados.txtnom.setDocument(new Bloq_Mayus());
        this.pEmpleados.txtapellidoP.setDocument(new Bloq_Mayus());
        this.pEmpleados.txtapellidoM.setDocument(new Bloq_Mayus());
        this.pEmpleados.txtnumT.setDocument(new Bloq_Mayus());
        this.pEmpleados.txtdireccion.setDocument(new Bloq_Mayus());
        this.pEmpleados.txta.setDocument(new Bloq_Mayus());
        this.pEmpleados.txtcontra.setDocument(new Bloq_Mayus());
        
        modeloTabla = (DefaultTableModel)pEmpleados.jtregistro.getModel();
        pEmpleados.jtregistro.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                Eventos(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
            
        });
        llenarTabla();
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == pEmpleados.btnnuevo) {
            //limpiar();
            pEmpleados.txtnom.requestFocus();
            pEmpleados.btnnuevo.setEnabled(false);
            pEmpleados.btnregistrar.setEnabled(true);
            pEmpleados.btnmodificar.setEnabled(false);
            //pClientes.btnaceptar.setEnabled(false);
            pEmpleados.btneliminar.setEnabled(false);
        }
        if (evt.getSource() == pEmpleados.btnregistrar) {

        }
        if (evt.getSource() == pEmpleados.btnmodificar) {

        }
        if (evt.getSource() == pEmpleados.btneliminar) {

        }
    }
    
    public void Eventos(MouseEvent evt)
    {
        seleccion = pEmpleados.jtregistro.getSelectedRow();
        pEmpleados.btnnuevo.setEnabled(false);
        pEmpleados.btnmodificar.setEnabled(true);
        pEmpleados.btneliminar.setEnabled(true);
        pEmpleados.btnregistrar.setEnabled(true);
        
        pEmpleados.txtid.setText(String.valueOf(pEmpleados.jtregistro.getValueAt(seleccion, 0)));
        pEmpleados.txtnom.setText(String.valueOf(pEmpleados.jtregistro.getValueAt(seleccion, 1)));
        pEmpleados.txtapellidoP.setText(String.valueOf(pEmpleados.jtregistro.getValueAt(seleccion, 2)));
        pEmpleados.txtapellidoM.setText(String.valueOf(pEmpleados.jtregistro.getValueAt(seleccion, 3)));
        pEmpleados.txtnumT.setText(String.valueOf(pEmpleados.jtregistro.getValueAt(seleccion, 4)));
        pEmpleados.txtdireccion.setText(String.valueOf(pEmpleados.jtregistro.getValueAt(seleccion, 7)));
    }
    
    public void llenarTabla()
    {
        modeloTabla.setNumRows(0);
        List<ModeloEmpleados>lista = modConsulta.lista();
        for (int i = 0; i < lista.size(); i++) {
            modeloTabla.addRow(new Object[]{
                lista.get(i).getCodigo(),
                lista.get(i).getNombre(),
                lista.get(i).getApellido_Paterno(),
                lista.get(i).getApellido_Materno(),
                lista.get(i).getTelefono(),
                lista.get(i).getSexo(),
                lista.get(i).getNacionalidad(),
                lista.get(i).getDireccion()
            });
        }
    }
}
