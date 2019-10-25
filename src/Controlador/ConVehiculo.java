/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
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
public class ConVehiculo implements ActionListener{
    DefaultTableModel modelo = new DefaultTableModel();

    private vehiculos ve;
    private SqlVehiculos modC;   
    private frmVehicle frmv;

    public ConVehiculo(vehiculos cve, SqlVehiculos modC, frmVehicle frmv ) {
       
        this.ve = cve;
        this.modC = modC;
        this.frmv = frmv;
        this.frmv.btnGuardar.addActionListener(this);
        this.frmv.btnModificar.addActionListener(this);
        this.frmv.btnEliminar.addActionListener(this);
        this.frmv.btnLimpiar.addActionListener(this);
        
        
    }

   public void iniciar() {
        frmv.setTitle("Vehiculos");
        frmv.setLocationRelativeTo(null);
       frmv.txtId.setVisible(false);
       listar(frmv.tbVehicle);
          }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        if (e.getSource() == frmv.btnGuardar)
        {
            ve.setBrand(frmv.txtMarca.getText());
            ve.setModel(frmv.txtModel.getText());
            ve.setPlate(frmv.txtMatricula.getText());
            ve.setLicenseRequired(frmv.txtLicencia.getText());
            
            if(modC.registrar(ve))
            {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                modelo.fireTableDataChanged();
              
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "La matricula ya esta Registrada");
                limpiar();
            }
        }
        
        if (e.getSource() == frmv.btnModificar)
        {
             ve.setId(Integer.parseInt(frmv.txtId.getText()));
            ve.setBrand(frmv.txtMarca.getText());
            ve.setModel(frmv.txtModel.getText());
            ve.setPlate(frmv.txtMatricula.getText());
            ve.setLicenseRequired(frmv.txtLicencia.getText());
        if(modC.modificar(ve))
            {
               JOptionPane.showMessageDialog(null, "Registro Modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar");
                limpiar();
            }
        
        
        }
        
        if (e.getSource() == frmv.btnEliminar)
        {
            ve.setId(Integer.parseInt(frmv.txtId.getText()));
            
            if(modC.eliminar(ve))
            {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
            }
        }
               
        if (e.getSource() == frmv.btnLimpiar)
        {
            limpiar();
        }

    }
    
    
    public void listar(JTable tabla)
    {
       
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<vehiculos> lista = modC.listar();
        Object[] objeto = new Object[5];
        for (int i = 0; i < lista.size(); i++)
        {
            objeto[0] = lista.get(i).getId();
            objeto[1] = lista.get(i).getBrand();
            objeto[2] = lista.get(i).getModel();
            objeto[3] = lista.get(i).getPlate();
            objeto[4] = lista.get(i).getLicenseRequired();
            
            modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);

    }
     
    public void limpiar()
    {
        frmv.txtId.setText(null);
        frmv.txtMarca.setText(null);
        frmv.txtMatricula.setText(null);
        frmv.txtModel.setText(null);
        frmv.txtLicencia.setText(null);
    }
    
    
}
