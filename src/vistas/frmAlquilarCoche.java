/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vistas;

import Controlador.ConVehiculo;
import java.util.Calendar;
import java.util.GregorianCalendar;
import modelo.SqlVehiculos;
import modelo.vehiculos;

/**
 *
 * @author Frank
 */
public class frmAlquilarCoche extends javax.swing.JFrame {

    /** Creates new form frmAlquilarCoche */
    public frmAlquilarCoche() {
        initComponents();
         Calendar c2 = new GregorianCalendar();
        fechaReserva.setCalendar(c2);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnReseervar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVehicle = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbConductores = new javax.swing.JTable();
        fechaReserva = new com.toedter.calendar.JDateChooser();
        txtlicencia = new javax.swing.JTextField();
        txtlicenpersona = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbTrips = new javax.swing.JTable();
        txtidVehicle = new javax.swing.JTextField();
        txtidDrivers = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reservar coche");
        setBackground(new java.awt.Color(255, 0, 102));

        btnReseervar.setText("Reservar");
        btnReseervar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReseervarActionPerformed(evt);
            }
        });

        tbVehicle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Marca", "Modelo", "Matricula", "Tipo de Licencia"
            }
        ));
        tbVehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVehicleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbVehicle);

        tbConductores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Tipo de Carnet"
            }
        ));
        tbConductores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbConductoresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbConductores);

        fechaReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechaReservaMouseClicked(evt);
            }
        });

        txtlicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlicenciaActionPerformed(evt);
            }
        });

        txtlicenpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlicenpersonaActionPerformed(evt);
            }
        });

        tbTrips.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coche", "Conductor", "Fecha", "Viajes realizados por C"
            }
        ));
        jScrollPane4.setViewportView(tbTrips);

        txtidVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidVehicleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(txtidVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txtidDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(fechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(txtlicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(txtlicenpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(btnReseervar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fechaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtlicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlicenpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtidVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtidDrivers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnReseervar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fechaReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechaReservaMouseClicked
        
    }//GEN-LAST:event_fechaReservaMouseClicked

    private void txtlicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlicenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlicenciaActionPerformed

    private void tbVehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVehicleMouseClicked
        
        int selec = tbVehicle.rowAtPoint(evt.getPoint());
         int id = Integer.parseInt((String) tbVehicle.getValueAt(selec, 0).toString());
           String Licence = (String) tbVehicle.getValueAt(selec, 4);
           txtlicencia.setText(Licence);
           txtidVehicle.setText("" + id);
    }//GEN-LAST:event_tbVehicleMouseClicked

    private void txtlicenpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlicenpersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlicenpersonaActionPerformed

    private void tbConductoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbConductoresMouseClicked
        int selec = tbConductores.rowAtPoint(evt.getPoint());
         int id = Integer.parseInt((String) tbConductores.getValueAt(selec, 0).toString());
           String LicenceC = (String) tbConductores.getValueAt(selec, 3);
           txtlicenpersona.setText(LicenceC);
           txtidDrivers.setText("" + id);
    }//GEN-LAST:event_tbConductoresMouseClicked

    private void txtidVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidVehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidVehicleActionPerformed

    private void btnReseervarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReseervarActionPerformed
       
    }//GEN-LAST:event_btnReseervarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
            
      
            new frmAlquilarCoche().setVisible(true);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnReseervar;
    public com.toedter.calendar.JDateChooser fechaReserva;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable tbConductores;
    public javax.swing.JTable tbTrips;
    public javax.swing.JTable tbVehicle;
    public javax.swing.JTextField txtidDrivers;
    public javax.swing.JTextField txtidVehicle;
    public javax.swing.JTextField txtlicencia;
    public javax.swing.JTextField txtlicenpersona;
    // End of variables declaration//GEN-END:variables

}
