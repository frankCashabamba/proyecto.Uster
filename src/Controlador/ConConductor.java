/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import vistas.*;

/**
 *
 * @author Frank
 */
public class ConConductor implements ActionListener{
    
    DefaultTableModel modelo = new DefaultTableModel(); 
    private frmConductores frmcon;
    private conductores cond;
    private SqlConductor slqc;
  
        public ConConductor(conductores cond, SqlConductor modC, frmConductores frmc )
        {
        this.cond = cond;
        this.slqc = modC;
        this.frmcon = frmc;
        this.frmcon.btnGuardarC.addActionListener(this);
        this.frmcon.btnEliminar.addActionListener(this);
        this.frmcon.btnLimpiarC.addActionListener(this);
       
        }

    public void iniciar() {
        frmcon.setTitle("Conductores");
        frmcon.setLocationRelativeTo(null);
        frmcon.txtId.setVisible(false);
      listar(frmcon.tbConductores);
        

    }
    
    public void actionPerformed(ActionEvent e)
    {

        if (e.getSource() == frmcon.btnGuardarC)
        {
            cond.setName(frmcon.txtNombre.getText());
            cond.setSurname(frmcon.txtApellidos.getText());
            cond.setLicense(frmcon.txtLicenciaC.getText());            
            
            if(slqc.registrarConductore(cond))
            {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
               limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error Registro no guardado");
                limpiar();
            }
        }
         if (e.getSource() == frmcon.btnModificarC)
        {
             cond.setId(Integer.parseInt(frmcon.txtId.getText()));
            cond.setName(frmcon.txtNombre.getText());
            cond.setSurname(frmcon.txtApellidos.getText());
            cond.setLicense(frmcon.txtLicenciaC.getText());
            
            if(slqc.modificar(cond))
            {
                JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        
        
        }
        
        if (e.getSource() == frmcon.btnEliminar)
        {
            cond.setId(Integer.parseInt(frmcon.txtId.getText()));
            
            if(slqc.eliminar(cond))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
               
        if (e.getSource() == frmcon.btnLimpiarC)
        {
            limpiar();
        } 
    }
    
    
    
     public void listar(JTable tabla)
     {
       
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<conductores> lista = slqc.listar();
        Object[] objeto = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getId();
            objeto[1] = lista.get(i).getName();
            objeto[2] = lista.get(i).getSurname();
            objeto[3] = lista.get(i).getLicense();
            
            
            modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);

    }
    
    
    
    public void limpiar()
    {
        
        frmcon.txtNombre.setText(null);
        frmcon.txtApellidos.setText(null);   
        frmcon.txtLicenciaC.setText(null);
    }
    
}
