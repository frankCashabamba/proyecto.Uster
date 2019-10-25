/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.SqlAlCoches;
import modelo.SqlVehiculos;
import modelo.alquiler;
import modelo.vehiculos;
import vistas.frmAlquilarCoche;

/**
 *
 * @author Frank
 */
public class ControAlquilarAlquilar implements ActionListener
{
    private frmAlquilarCoche frma;
    DefaultTableModel modelo = new DefaultTableModel();
    private vehiculos ve;
    private SqlVehiculos modC; 
    private SqlAlCoches alq;
    private alquiler al;
    
    
   public ControAlquilarAlquilar(alquiler al,SqlAlCoches alq, frmAlquilarCoche frma)
    {
    this.frma=frma;
    this.al= al;
    this.alq=alq;    
    this.frma.btnReseervar.addActionListener(this);
    
    }
    
    
     public void iniciar() {
        frma.setTitle("Selecciones una fecha");
        frma.setLocationRelativeTo(null);
       frma.txtlicencia.setVisible(false);
     frma.txtlicenpersona.setVisible(false);
     
     }
     
     
     
     public void setTableVisible(JTable table, boolean isVisible) {
frma.tbTrips.setVisible(isVisible);
frma.tbTrips.getTableHeader().setVisible(isVisible);
}
     
     @Override
    public void actionPerformed(ActionEvent e) 
    {
                 if (e.getSource() == frma.btnReseervar)
        {
           al.setLiceniacocche(frma.txtlicencia.getText());
           al.setLicenciaPerosna(frma.txtlicenpersona.getText());           
           al.setIdcoche(Integer.parseInt(frma.txtidVehicle.getText()));
           al.setIdconductor(Integer.parseInt(frma.txtidDrivers.getText()));
           int año = frma.fechaReserva.getCalendar().get(Calendar.YEAR);
           int mes = frma.fechaReserva.getCalendar().get(Calendar.DAY_OF_MONTH);
           int dia = frma.fechaReserva.getCalendar().get(Calendar.MARCH);
           String fechainsert= año+"-"+mes+"-"+dia;
           
           al.setFechaReserva(fechainsert);
                      
                     try {
                         if(alq.registrarRerva(al))
                         {
                             JOptionPane.showMessageDialog(null, "Reserva Realizada");
                             modelo.fireTableDataChanged();
                             
                             
                         } else {
                             JOptionPane.showMessageDialog(null, "Debe selecionar conductor con el mismo tipo de carnet");
                             
                         }        } catch (SQLException ex) {
                         Logger.getLogger(ControAlquilarAlquilar.class.getName()).log(Level.SEVERE, null, ex);
                     }
        }
    }
     

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

