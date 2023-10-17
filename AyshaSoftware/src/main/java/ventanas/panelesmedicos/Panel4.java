/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas.panelesmedicos;

import clases.Estudio;
import dbController.CtrlMedicoSala;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joaqu
 */
public class Panel4 extends javax.swing.JPanel {
    
    DefaultTableModel modelo= new DefaultTableModel();
    ArrayList<Object[]>listaEstudios=new ArrayList<>();
    
    private String fechaDB;
    private String tipoDB;
    private String horaDB;
    private CtrlMedicoSala ctrlMedSal;
    private String dni;
    private String numero;
    
    private String selectedOption;
    

    /**
     * Creates new form Panel1
     */
    public Panel4(String dni) {
        initComponents();
        
        ctrlMedSal=new CtrlMedicoSala(dni);
        this.dni=dni;
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.addColumn("Tipo");
        
        actualizarEstudios();
    }
    
    private void actualizarEstudios(){
        modelo.setRowCount(0);
        tablaEstudios = new javax.swing.JTable();
        tablaEstudios.setModel(modelo);
        listaEstudios=ctrlMedSal.getTablaEstudios(fechaDB, horaDB,tipoDB);
        tablaEstudios = new JTable(modelo);
        jScrollPane1.setViewportView(tablaEstudios);

        for (Object[] vector : listaEstudios) {

            fechaDB  = vector[0].toString();
            horaDB = vector[1].toString();
            tipoDB = vector[2].toString();

            modelo.addRow(vector);
            tablaEstudios.setModel(modelo);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultadoEstudio = new javax.swing.JTextArea();
        botonCarga = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(460, 510));

        jPanel2.setPreferredSize(new java.awt.Dimension(460, 510));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaEstudios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Hora", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tablaEstudios);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 270, 470, 250));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Resultado del estudio :");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Estudios");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Carga de Estudio");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        resultadoEstudio.setColumns(20);
        resultadoEstudio.setRows(5);
        jScrollPane3.setViewportView(resultadoEstudio);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 310, 60));

        botonCarga.setText("Agregar");
        botonCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargaActionPerformed(evt);
            }
        });
        jPanel3.add(botonCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 150, -1));

        jLabel4.setText("Tipo de Estudio:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pruebas de alergia", "Pruebas cutáneas", "Pruebas de parche", "Pruebas de provocación", "Evaluación preoperatoria", "Monitorización intraoperatoria", "Control del dolor postoperatorio", "Electrocardiograma (ECG)", "Ecocardiograma", "Cateterismo cardíaco", "Angiografía coronaria", "Biopsia de piel", "Dermatoscopia", "Pruebas de parche", "Pruebas de función tiroidea", "Prueba de tolerancia a la glucosa", "Pruebas de función suprarrenal", "Endoscopia digestiva alta", "Colonoscopia", "Prueba de aliento para Helicobacter pylori", "Hemograma completo", "Coagulograma", "Biopsia de médula ósea", "Electroencefalograma (EEG)", "Resonancia magnética cerebral", "Punción lumbar", "Biopsia de tumores", "Marcadores tumorales en sangre", "Tomografía por emisión de positrones (PET)", "Cistoscopia", "Urografía excretora", "Biopsia de próstata." }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargaActionPerformed
        String texto = resultadoEstudio.getText();
        // Verifica si el JTextArea está vacío o solo tiene espacios en blanco
        if (texto.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Error! El campo de texto está vacío");
        } else {
            selectedOption = (String) jComboBox1.getSelectedItem();
            ctrlMedSal.cargarEstudio(new Estudio(this.dni,selectedOption,texto));
            actualizarEstudios();
            resultadoEstudio.setText("");
        }
    }//GEN-LAST:event_botonCargaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCarga;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea resultadoEstudio;
    private javax.swing.JTable tablaEstudios;
    // End of variables declaration//GEN-END:variables
}
