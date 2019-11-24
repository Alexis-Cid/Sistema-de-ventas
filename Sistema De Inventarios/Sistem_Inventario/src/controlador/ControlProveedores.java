package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Bloq_Mayus;
import modelo.sql.ConsultaProveedoresSQL;
import modelo.entidades.ModeloProveedores;
import vista.Panel_Proveedor;

public class ControlProveedores implements ActionListener {

    private final Panel_Proveedor pProveedor;
    private final ModeloProveedores modProveedores;
    private final ConsultaProveedoresSQL modConsulta;
    private int seleccion;

    public ControlProveedores(Panel_Proveedor pProveedor, ModeloProveedores modProveedores, ConsultaProveedoresSQL modConsulta) {
        this.pProveedor = pProveedor;
        this.modProveedores = modProveedores;
        this.modConsulta = modConsulta;
        this.pProveedor.btnnuevo.addActionListener(this);
        this.pProveedor.btnregistrar.addActionListener(this);
        this.pProveedor.btnmodificar.addActionListener(this);
        this.pProveedor.btneliminar.addActionListener(this);

        this.pProveedor.txtid.setDocument(new Bloq_Mayus());
        this.pProveedor.txtnom.setDocument(new Bloq_Mayus());
        this.pProveedor.txtapellidoP.setDocument(new Bloq_Mayus());
        this.pProveedor.txtapellidoM.setDocument(new Bloq_Mayus());
        this.pProveedor.txtcomercial.setDocument(new Bloq_Mayus());
        this.pProveedor.txtnumT.setDocument(new Bloq_Mayus());
        this.pProveedor.txtdireccion.setDocument(new Bloq_Mayus());
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == pProveedor.btnnuevo) {

        }
        if (evt.getSource() == pProveedor.btnregistrar) {
            try {
                if (pProveedor.txtid.getText().equals("") || pProveedor.txtnom.getText().equals("") || pProveedor.txtapellidoP.getText().equals("") || pProveedor.txtapellidoM.getText().equals("")
                        || pProveedor.txtcomercial.getText().equals("") || pProveedor.txtnumT.getText().equals("") || pProveedor.txtdireccion.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Verifique que no quede un campo vacio ", "ERROR", 0);
                } else {
                    modProveedores.setCodigo(pProveedor.txtid.getText());
                    modProveedores.setNombre(pProveedor.txtnom.getText());
                    modProveedores.setApellido_Paterno(pProveedor.txtapellidoP.getText());
                    modProveedores.setApellido_Materno(pProveedor.txtapellidoM.getText());
                    modProveedores.setEmpresa(pProveedor.txtcomercial.getText());
                    modProveedores.setTelefono(pProveedor.txtnumT.getText());
                    modProveedores.setDireccion(pProveedor.txtdireccion.getText());

                    if (modConsulta.registrar(modProveedores)) {
                        JOptionPane.showMessageDialog(null, "PROVEEDOR REGISTRADO", "EXITOSO", 1);
                        //limpiar();
                        //llenarTabla();
                        JOptionPane.showMessageDialog(null, "Lista actualizada");
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR PROVEEDOR", "ERROR", 1);
                        //limpiar();
                    }
                    pProveedor.txtnom.requestFocus();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verifique que no quede un campo vacio , " + e, "ERROR", 0);
            }
        }

        if (evt.getSource() == pProveedor.btnmodificar) {

        }
        if (evt.getSource() == pProveedor.btneliminar) {

        }
    }
}
