package ventanas;

import clases.Medico;
import dbController.CtrlConsulta;
import dbController.CtrlEntradaMedicoSala;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;


public class EntradaMedicoSala extends javax.swing.JFrame {

    
    String dniUser = Login.user;

    ArrayList<Object[]> listaPacientes = new ArrayList<>();
    ArrayList<Object[]> listaBoxes = new ArrayList<>();
    DefaultTableModel modelo;
    DefaultTableModel modelo2;
    CtrlEntradaMedicoSala ctrlDB = new CtrlEntradaMedicoSala();
    CtrlConsulta ctrlConsulta = new CtrlConsulta();
    String nomDB;
    String dniDB;
    String numeroDB;
    String disponibleDB;
    public static String dniV = null;
    public String disponibleV = null;
    public static String numeroV = null;
    private Medico med;

    public EntradaMedicoSala() {
        
        initComponents();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src\\main\\java\\images\\icon.png");
        setIconImage(miIcono);
        setResizable(false);
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("DNI");
        modelo.addColumn("Color");

        actualizarTablaPacientesEnEspera();

        modelo2 = new DefaultTableModel();
        modelo2.addColumn("Numero");
        modelo2.addColumn("Disponibilidad");

        actualizarTablaBoxes();

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                cambiarDisponibilidad(numeroV);
                dispose();
            }
        });
    }

    private void actualizarTablaPacientesEnEspera() {
        modelo.setRowCount(0);
        tablaPacientes = new javax.swing.JTable();
        tablaPacientes.setModel(modelo);
        listaPacientes = ctrlDB.getTablaTriages(dniDB, nomDB);

        tablaPacientes = new JTable(modelo);
        jScrollPane1.setViewportView(tablaPacientes);

        for (Object[] vector : listaPacientes) {

            dniDB = vector[1].toString();
            nomDB = vector[0].toString();

            modelo.addRow(vector);
            tablaPacientes.setModel(modelo);
        }
    }

    public void actualizarTablaBoxes() {
        modelo2.setRowCount(0);
        tablaBoxes = new javax.swing.JTable();
        tablaBoxes.setModel(modelo2);
        listaBoxes = ctrlDB.getTablaBoxes(numeroDB, disponibleDB);

        tablaBoxes = new JTable(modelo2);
        jScrollPane2.setViewportView(tablaBoxes);

        for (Object[] vector : listaBoxes) {
            numeroDB = vector[1].toString();
            disponibleDB = vector[0].toString();
            modelo2.addRow(vector);
            tablaBoxes.setModel(modelo2);
        }
    }

    public void cambiarDisponibilidad(String numeroV) {
        ctrlDB.alternarDisponibilidad(numeroV);
        actualizarTablaBoxes();
    }

    private void eliminarFilaTriage(String dniV) {
        ctrlDB.eliminarPaciente(dniV);
        actualizarTablaPacientesEnEspera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        SeleccionPaciente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBoxes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Elección Pacientes");
        setMaximumSize(new java.awt.Dimension(410, 470));
        setMinimumSize(new java.awt.Dimension(410, 470));
        setSize(410,470);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(410, 470));
        jPanel1.setMinimumSize(new java.awt.Dimension(410, 470));
        jPanel1.setPreferredSize(new java.awt.Dimension(410, 470));

        SeleccionPaciente.setText("Asignar box");
        SeleccionPaciente.setBorder(null);
        SeleccionPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionPacienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Pacientes");

        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "DNI", "Color"
            }
        ));
        tablaPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaPacientes);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Boxes");

        tablaBoxes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Numero", "Disponibilidad"
            }
        ));
        tablaBoxes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBoxesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaBoxes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(SeleccionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(SeleccionPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionPacienteActionPerformed
        int numFila = tablaPacientes.getSelectedRow();
        int numFila2 = tablaBoxes.getSelectedRow();
        if (numFila != -1 && numFila2 != -1) {
            EntradaMedicoSala.dniV = (String) tablaPacientes.getValueAt(numFila, 1);
            
            this.disponibleV = (String) tablaBoxes.getValueAt(numFila2, 1);
            
            EntradaMedicoSala.numeroV = (String) tablaBoxes.getValueAt(numFila2, 0);
            if (disponibleV.equals("Disponible")) {
                cambiarDisponibilidad(numeroV);
                eliminarFilaTriage(EntradaMedicoSala.dniV);
                MedicoSala m = new MedicoSala(this);
                m.setVisible(true);
                med = ctrlDB.recuperarMedico(dniUser);
                ctrlConsulta.terceraCarga(med.getApellido(), med.getNumMatricula(), dniV);
                
                EntradaMedicoSala.dniV = null;
            }
        }  
    }//GEN-LAST:event_SeleccionPacienteActionPerformed

    private void tablaPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPacientesMouseClicked

    }//GEN-LAST:event_tablaPacientesMouseClicked

    private void tablaBoxesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBoxesMouseClicked

    }//GEN-LAST:event_tablaBoxesMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EntradaMedicoSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaMedicoSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaMedicoSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaMedicoSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EntradaMedicoSala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SeleccionPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tablaBoxes;
    private javax.swing.JTable tablaPacientes;
    // End of variables declaration//GEN-END:variables

}
