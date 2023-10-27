
package ventanas.panelesEstadisticas;

import Utilidades.FormatosValidos;
import Utilidades.ManejoFecha;
import dbController.CtrlEstadistica;
import java.awt.BorderLayout;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * La clase PanelMedicoMasAtendio es un panel de Swing que extiende de javax.swing.JPanel.
 * Proporciona una interfaz para visualizar el médico que ha atendido a más pacientes.
 */
public class PanelMedicoMasAtendio extends javax.swing.JPanel {
    
    CtrlEstadistica ctrlEst = new CtrlEstadistica();
    String desdeT;
    String hastaT;
    
    /**
     * Constructor para la clase PanelMedicoMasAtendio.
     * Inicializa los componentes.
     */
    public PanelMedicoMasAtendio() {
        initComponents();
    }
    
    /**
     * Este método muestra un panel dado en el panel de contenido.
     * @param p El panel que se va a mostrar.
     */
    public void showPanelInPanel(JPanel p){
        p.setSize(610,246);
        p.setLocation(0,0);
        contentContent.removeAll();
        contentContent.add(p,BorderLayout.CENTER);
        contentContent.revalidate();
        contentContent.repaint();
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
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hasta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        desde = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonCargaMedicoFecha = new javax.swing.JButton();
        contentContent = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Médico que más personas atendió en el rango dado");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(162, 162, 162))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
        );

        hasta.setText("dd-mm-aaaa");

        jLabel4.setText("Rango de fechas");

        jLabel2.setText("Desde:");

        desde.setText("dd-mm-aaaa");
        desde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desdeActionPerformed(evt);
            }
        });

        jLabel3.setText("Hasta:");

        botonCargaMedicoFecha.setText("Ingresar");
        botonCargaMedicoFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargaMedicoFechaActionPerformed(evt);
            }
        });

        contentContent.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentContentLayout = new javax.swing.GroupLayout(contentContent);
        contentContent.setLayout(contentContentLayout);
        contentContentLayout.setHorizontalGroup(
            contentContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentContentLayout.setVerticalGroup(
            contentContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(205, 205, 205))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(botonCargaMedicoFecha)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(contentContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonCargaMedicoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void desdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desdeActionPerformed
    
    /**
     * Este método se ejecuta cuando se hace clic en el botón de carga del médico por fecha.
     * Verifica si las fechas ingresadas son válidas y están en el rango permitido, y luego muestra un panel con la descripción del médico que más atendió entre esas fechas.
     * Si las fechas no son válidas o no están en el rango permitido, muestra un mensaje de error.
     * @param evt El evento de acción que ocurrió (en este caso, hacer clic en el botón).
     */
    private void botonCargaMedicoFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargaMedicoFechaActionPerformed
                desdeT = desde.getText().trim();
                hastaT = hasta.getText().trim();
                if (desdeT.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "¡Error! El campo 'desde' está vacío");
                } else if (!ManejoFecha.esFechaValida(desdeT)) {
                    JOptionPane.showMessageDialog(null, "¡Error! La fecha en el campo 'desde' no es válida");
                } else if (!ManejoFecha.esFechaEnRango(desdeT)) {
                    JOptionPane.showMessageDialog(null, "¡Error! La fecha en el campo 'desde' no está en el rango permitido");
                }

                if (hastaT.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "¡Error! El campo 'hasta' está vacío");
                } else if (!ManejoFecha.esFechaValida(hastaT)) {
                    JOptionPane.showMessageDialog(null, "¡Error! La fecha en el campo 'hasta' no es válida");
                } else if (!ManejoFecha.esFechaEnRango(hastaT)) {
                    JOptionPane.showMessageDialog(null, "¡Error! La fecha en el campo 'hasta' no está en el rango permitido");
                }

                if (!desdeT.isEmpty() && !hastaT.isEmpty() && ManejoFecha.esFechaValida(desdeT) && ManejoFecha.esFechaValida(hastaT) && ManejoFecha.esFechaEnRango(desdeT) && ManejoFecha.esFechaEnRango(hastaT)) {
                    LocalDate desdeFecha = LocalDate.parse(desdeT, FormatosValidos.FORMATO_FECHA);
                    LocalDate hastaFecha = LocalDate.parse(hastaT, FormatosValidos.FORMATO_FECHA);
                    if (desdeFecha.isAfter(hastaFecha)) {
                        JOptionPane.showMessageDialog(null, "¡Error! La fecha 'desde' es posterior a la fecha 'hasta'");
                    }else{
                        int [] matricula = ctrlEst.medicoQueMasAtendioEntre(desdeT,hastaT);
                        if(matricula[1]!=0){
                            showPanelInPanel(new DescripcionMedico(desdeT,hastaT,matricula));
                        }else{JOptionPane.showMessageDialog(null, " Entre las fechas dadas no se atendio ningún paciente");}
                    }
                    
                }

    }//GEN-LAST:event_botonCargaMedicoFechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCargaMedicoFecha;
    private javax.swing.JPanel contentContent;
    private javax.swing.JTextField desde;
    private javax.swing.JTextField hasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
