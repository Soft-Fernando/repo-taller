/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas.panelesEstadisticas;

import Utilidades.FormatosValidos;
import dbController.CtrlEstadistica;
import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joaqu
 */
public class PanelPacienteEdadFecha extends javax.swing.JPanel {
    
    DefaultTableModel modelo= new DefaultTableModel();
    ArrayList<Object[]>listaMedicos=new ArrayList<>();
    CtrlEstadistica ctrlEst = new CtrlEstadistica();
    String nombre;
    String apellido;
    String matricula;
    String desdeT;
    String hastaT;
    String edadBase;
    String edadLimite;
    /**
     * Creates new form PanelPacienteEdadFecha
     */

    public PanelPacienteEdadFecha() {
        initComponents();
//        actualizarMedicos();
    }
    
//        private void actualizarMedicos(){
//        modelo.setRowCount(0);
//        tablaPacientes = new javax.swing.JTable();
//        tablaPacientes.setModel(modelo);
//        listaMedicos=ctrlEst.getTablaMedicos();
//        tablaPacientes = new JTable(modelo);
//        jScrollPane1.setViewportView(tablaPacientes);
//        for (Object[] vector : listaMedicos) {
//            modelo.addRow(vector);
//            tablaPacientes.setModel(modelo);
//        }
//    }
        
    public void showPanelInPanel(JPanel p){
        p.setSize(500,60);
        p.setLocation(0,0);
        contentContent.removeAll();
        contentContent.add(p,BorderLayout.CENTER);
        contentContent.revalidate();
        contentContent.repaint();
    }
    
    public boolean esFechaValida(String fecha) {
        try {
            LocalDate localDate = LocalDate.parse(fecha, FormatosValidos.FORMATO_FECHA);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public boolean esFechaEnRango(String fechaStr) {
        try {
            LocalDate fecha = LocalDate.parse(fechaStr, FormatosValidos.FORMATO_FECHA);

            LocalDate hoy = LocalDate.now();
            LocalDate fechaMinima = LocalDate.of(2000, 1, 1);

            return !fecha.isAfter(hoy) && !fecha.isBefore(fechaMinima);
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    
    public boolean esNumeroNaturalEntre0y130(String texto) {
        return texto.matches("^([0-9]{1,2}|1[01][0-9]|130)$");
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        hasta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        contentContent = new javax.swing.JPanel();
        desde = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botonCargaMedicoFecha = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        eBase = new javax.swing.JTextField();
        eLimite = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(204, 204, 255));

        hasta.setText("dd-mm-aaaa");
        hasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hastaActionPerformed(evt);
            }
        });

        jLabel4.setText("Rango de fechas");

        jLabel1.setText("Desde:");

        contentContent.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentContentLayout = new javax.swing.GroupLayout(contentContent);
        contentContent.setLayout(contentContentLayout);
        contentContentLayout.setHorizontalGroup(
            contentContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentContentLayout.setVerticalGroup(
            contentContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        desde.setText("dd-mm-aaaa");
        desde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desdeActionPerformed(evt);
            }
        });

        jLabel2.setText("Hasta:");

        botonCargaMedicoFecha.setBackground(new java.awt.Color(0, 0, 153));
        botonCargaMedicoFecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonCargaMedicoFecha.setForeground(new java.awt.Color(255, 255, 255));
        botonCargaMedicoFecha.setText("Buscar");
        botonCargaMedicoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargaMedicoFechaActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pacientes se atendieron en un rango de fechas y por rango etario");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(120, 120, 120))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel6.setText(" Edad base:");

        jLabel7.setText("Edad límite:");

        eBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBaseActionPerformed(evt);
            }
        });

        eLimite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eLimiteActionPerformed(evt);
            }
        });

        jLabel8.setText("Rango Etario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(26, 26, 26)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(botonCargaMedicoFecha)
                            .addComponent(jLabel8))))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desde)
                    .addComponent(hasta)
                    .addComponent(eBase)
                    .addComponent(eLimite))
                .addGap(163, 163, 163))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(eLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(botonCargaMedicoFecha)
                .addGap(18, 18, 18)
                .addComponent(contentContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eLimiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eLimiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eLimiteActionPerformed

    private void eBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eBaseActionPerformed

    private void botonCargaMedicoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargaMedicoFechaActionPerformed

        String desdeT = desde.getText().trim();
        String hastaT = hasta.getText().trim();
        String edadBase = eBase.getText().trim();
        String edadLimite = eLimite.getText().trim();
        if (desdeT.isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Error! El campo 'desde' está vacío");
        } else if (!esFechaValida(desdeT)) {
            JOptionPane.showMessageDialog(null, "¡Error! La fecha en el campo 'desde' no es válida");
        } else if (!esFechaEnRango(desdeT)) {
            JOptionPane.showMessageDialog(null, "¡Error! La fecha en el campo 'desde' no está en el rango permitido");
        }
        if (hastaT.isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Error! El campo 'hasta' está vacío");
        } else if (!esFechaValida(hastaT)) {
            JOptionPane.showMessageDialog(null, "¡Error! La fecha en el campo 'hasta' no es válida");
        } else if (!esFechaEnRango(hastaT)) {
            JOptionPane.showMessageDialog(null, "¡Error! La fecha en el campo 'hasta' no está en el rango permitido");
        }
        if (edadBase.isEmpty() || !esNumeroNaturalEntre0y130(edadBase)) {
            JOptionPane.showMessageDialog(null, "¡Error! El campo 'edad base' está vacío o no es un número natural entre 0 y 130");
        }
        if (edadLimite.isEmpty() || !esNumeroNaturalEntre0y130(edadLimite)) {
            JOptionPane.showMessageDialog(null, "¡Error! El campo 'edad límite' está vacío o no es un número natural entre 0 y 130");
        }
        if (!edadBase.isEmpty() && !edadLimite.isEmpty() && esNumeroNaturalEntre0y130(edadBase) && esNumeroNaturalEntre0y130(edadLimite)) {
            int edadBaseInt = Integer.parseInt(edadBase);
            int edadLimiteInt = Integer.parseInt(edadLimite);
            if (edadBaseInt > edadLimiteInt) {
                JOptionPane.showMessageDialog(null, "¡Error! La 'edad base' es mayor que la 'edad límite'");
            }
        }
        if (!desdeT.isEmpty() && !hastaT.isEmpty() && esFechaValida(desdeT) && esFechaValida(hastaT) && esFechaEnRango(desdeT) && esFechaEnRango(hastaT) && !edadBase.isEmpty() && esNumeroNaturalEntre0y130(edadBase) && !edadLimite.isEmpty() && esNumeroNaturalEntre0y130(edadLimite)) {
            LocalDate desdeFecha = LocalDate.parse(desdeT, FormatosValidos.FORMATO_FECHA);
            LocalDate hastaFecha = LocalDate.parse(hastaT, FormatosValidos.FORMATO_FECHA);
            if (desdeFecha.isAfter(hastaFecha)) {
                JOptionPane.showMessageDialog(null, "¡Error! La fecha 'desde' es posterior a la fecha 'hasta'");
            } else {
                showPanelInPanel(new DescripcionMedicoConsultas(desdeT,hastaT,edadBase,edadLimite));
            }
        }
    }//GEN-LAST:event_botonCargaMedicoFechaActionPerformed

    private void desdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desdeActionPerformed

    private void hastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hastaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargaMedicoFecha;
    private javax.swing.JPanel contentContent;
    private javax.swing.JTextField desde;
    private javax.swing.JTextField eBase;
    private javax.swing.JTextField eLimite;
    private javax.swing.JTextField hasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}