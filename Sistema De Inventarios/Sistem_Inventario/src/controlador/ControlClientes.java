package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Bloq_Mayus;
import modelo.sql.ConsultaClientesSQL;
import modelo.entidades.ModeloClientes;
import vista.Panel_Clientes;

public final class ControlClientes implements ActionListener
{
    private final Panel_Clientes pClientes;
    private final ModeloClientes modClientes;
    private final ConsultaClientesSQL modConsulta;
    private int seleccion;

    public ControlClientes(Panel_Clientes pClientes, ModeloClientes modClientes, ConsultaClientesSQL modConsulta)
    {
        this.pClientes = pClientes;
        this.modClientes = modClientes;
        this.modConsulta = modConsulta;
        this.pClientes.btnnuevo.addActionListener(this);
        this.pClientes.btnregistrar.addActionListener(this);
        this.pClientes.btnmodificar.addActionListener(this);
        this.pClientes.btnaceptar.addActionListener(this);
        this.pClientes.btneliminar.addActionListener(this);

        this.pClientes.txtnom.setDocument(new Bloq_Mayus());
        this.pClientes.txtapellidoP.setDocument(new Bloq_Mayus());
        this.pClientes.txtapellidoM.setDocument(new Bloq_Mayus());
        this.pClientes.txtdireccion.setDocument(new Bloq_Mayus());
        this.pClientes.txtRFC.setDocument(new Bloq_Mayus());

        Eventos();
        llenarTabla();
    }

    @Override
    public void actionPerformed(ActionEvent evt)
    {
        if (evt.getSource() == pClientes.btnnuevo)
        {
            limpiar();
            pClientes.txtnom.requestFocus();
            pClientes.btnnuevo.setEnabled(false);
            pClientes.btnregistrar.setEnabled(true);
            pClientes.btnmodificar.setEnabled(false);
            pClientes.btnaceptar.setEnabled(false);
            pClientes.btneliminar.setEnabled(false);
        }
        if (evt.getSource() == pClientes.btnregistrar)
        {
            try {
                if (pClientes.txtnom.getText().equals("") || pClientes.txtapellidoP.getText().equals("") || pClientes.txtapellidoM.getText().equals("")
                 ||  pClientes.txtdireccion.getText().equals("") || pClientes.txtRFC.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Verifique que no quede un campo vacio ", "ERROR", 0);
                }
                else
                {
                    modClientes.setNom(pClientes.txtnom.getText());
                    modClientes.setApP(pClientes.txtapellidoP.getText());
                    modClientes.setApM(pClientes.txtapellidoM.getText());
                    modClientes.setNumT(pClientes.txtnumT.getText());
                    modClientes.setDireccion(pClientes.txtdireccion.getText());
                    modClientes.setRfc(pClientes.txtRFC.getText());

                    //BOTON MODIFICAR
                    if (modConsulta.registrar(modClientes))
                    {
                        JOptionPane.showMessageDialog(null, "CLIENTE REGISTRADO", "EXITOSO", 1);
                        limpiar();
                        llenarTabla();
                        JOptionPane.showMessageDialog(null, "Lista actualizada");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR CLIENTE", "ERROR", 1);
                        limpiar();
                    }
                    pClientes.txtnom.requestFocus();
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "Verifique que no quede un campo vacio , " + e, "ERROR", 0);
            }
        }
        if (evt.getSource() == pClientes.btnmodificar)
        {   
            modClientes.setNom(pClientes.txtnom.getText());
            modClientes.setApP(pClientes.txtapellidoP.getText());
            modClientes.setApM(pClientes.txtapellidoM.getText());
            modClientes.setNumT(pClientes.txtnumT.getText());
            modClientes.setDireccion(pClientes.txtdireccion.getText());
            modClientes.setRfc(pClientes.txtRFC.getText());
            
            if(modConsulta.actualizar(modClientes))
            {
                JOptionPane.showMessageDialog(null, "Cliente modificado correctamente!", "", 1);
                limpiar();
                llenarTabla();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Error al modificar", "Error", 1);
                limpiar();
            }
        }
        if (evt.getSource() == pClientes.btnaceptar) {

        }
        //BOTON ELIMINAR 
        if (evt.getSource() == pClientes.btneliminar)
        {
            int filInicio = pClientes.jtregistro.getSelectedRow();
            int numfilas = pClientes.jtregistro.getSelectedRowCount();
            ArrayList<String> listaRFC = new ArrayList<>();
            String RFC;
            if(filInicio >= 0)
            {
                for(int i = 0; i<numfilas; i++)
                {
                    RFC = String.valueOf(pClientes.jtregistro.getValueAt(i + filInicio, 5));
                    listaRFC.add(i, RFC);
                }

                for(int j = 0; j<numfilas; j++)
                {
                    int rpta = JOptionPane.showConfirmDialog(null, "Desea eliminar registro con RFC : " + listaRFC.get(j) + " ? ");
                    if(rpta==0)
                    {
                        modClientes.setRfc(listaRFC.get(j));
                        if (modConsulta.eliminar(modClientes))
                        {
                            JOptionPane.showMessageDialog(null, "El registro fue eliminado correctamente");
                            limpiar();
                            llenarTabla();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Error al eliminar registro");
                            limpiar();
                        }
                    }
                }
            }else
            {
                JOptionPane.showMessageDialog(null, "Selecione Al Menos Un Registro Para Eliminar.");
            }
        }
    }

    public void Eventos()
    {
        pClientes.jtregistro.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent evt)
            {
                seleccion = pClientes.jtregistro.getSelectedRow();
                pClientes.btnnuevo.setEnabled(true);
                pClientes.btnregistrar.setEnabled(false);
                pClientes.btnmodificar.setEnabled(true);
                pClientes.btnaceptar.setEnabled(false);
                pClientes.btneliminar.setEnabled(true);

                pClientes.txtnom.setText(String.valueOf(pClientes.jtregistro.getValueAt(seleccion, 0)));
                pClientes.txtapellidoP.setText(String.valueOf(pClientes.jtregistro.getValueAt(seleccion, 1)));
                pClientes.txtapellidoM.setText(String.valueOf(pClientes.jtregistro.getValueAt(seleccion, 2)));
                pClientes.txtnumT.setText(String.valueOf(pClientes.jtregistro.getValueAt(seleccion, 3)));
                pClientes.txtdireccion.setText(String.valueOf(pClientes.jtregistro.getValueAt(seleccion, 4)));
                pClientes.txtRFC.setText(String.valueOf(pClientes.jtregistro.getValueAt(seleccion, 5)));
            }
        });
    }

    public void limpiar()
    {
        pClientes.txtnom.setText("");
        pClientes.txtapellidoP.setText("");
        pClientes.txtapellidoM.setText("");
        pClientes.txtnumT.setText("");
        pClientes.txtdireccion.setText("");
        pClientes.txtRFC.setText("");
    }
    
    public void llenarTabla()
    {
        pClientes.tReg.setNumRows(0);
        List<ModeloClientes> list = modConsulta.listaClientes();
        for (int i = 0; i < list.size(); i++)
        {
            pClientes.tReg.addRow(new Object[]
            {
                list.get(i).getNom(),
                list.get(i).getApP(),
                list.get(i).getApM(),
                list.get(i).getNumT(),
                list.get(i).getDireccion(),
                list.get(i).getRfc(),
            });
        }
        JOptionPane.showMessageDialog(null, "Lista actualizada");
    }
}
