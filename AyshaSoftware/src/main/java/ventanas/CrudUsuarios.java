/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import static ventanas.Login.user;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando
 */
public class CrudUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form CrudUsuarios
     */
    
    DefaultTableModel modelo = new DefaultTableModel();
   // ArrayList<Usuarios> usuario = new ArrayList<>();
    
    public CrudUsuarios() {
        initComponents();
        setTitle("Gestión de Usuarios");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    String user = "";
    String pass = "";
    String a = "Medico";
    Conexion cn = new Conexion();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonEliminar = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        textUser = new javax.swing.JTextField();
        textContrasenia = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cBoxSector = new javax.swing.JComboBox<>();
        cBoxNivelAcceso = new javax.swing.JComboBox<>();
        cBoxRol = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
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

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 640, 250));

        botonEliminar.setText("Eliminar");
        bg.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, -1, -1));

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        bg.add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        botonEditar.setText("Editar");
        bg.add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        botonBuscar.setText("Buscar");
        bg.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));
        bg.add(textUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 210, 30));
        bg.add(textContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 210, 30));
        bg.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 580, 210, 30));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        bg.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, 210, 30));

        jLabel1.setText("Apellido");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 50, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Usuario");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 50, 30));

        jLabel3.setText("Contraseña");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 70, 30));

        jLabel4.setText("Nivel acceso");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 70, 30));

        jLabel5.setText("Rol");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 30, 30));

        jLabel6.setText("Sector");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 40, 30));

        jLabel7.setText("Nombre");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 50, 30));

        cBoxSector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RRHH", "Admision", "Compras", "Gestion", "Auditoria", "RegistrosMedicos", "Informatica", "Otro" }));
        bg.add(cBoxSector, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 210, 30));

        cBoxNivelAcceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AdminInformatico", "Medico", "Funcionario" }));
        cBoxNivelAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxNivelAccesoActionPerformed(evt);
            }
        });
        bg.add(cBoxNivelAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 210, 30));

        cBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        bg.add(cBoxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void cBoxNivelAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxNivelAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxNivelAccesoActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
        user = textUser.getText().trim();
        pass = textContrasenia.getText().trim();

        if (!user.isEmpty() && !pass.isEmpty()) {
            Connection conex = null;
            try {
                conex = cn.conectar();
                //String input = "INSERT INTO Usuarios VALUES(?,?);";
                //
                String query = "SELECT * FROM Usuarios WHERE Usuario = ?";
                // String input = "INSERT INTO Usuarios VALUES(?,?,?);";

                // ResultSet rs = .executeQuery();
                PreparedStatement psq = conex.prepareStatement(query);
                psq.setString(1, user);

                ResultSet rs = psq.executeQuery();

                if (!rs.next()) {

                    String insert = "INSERT INTO Usuarios VALUES(?,?,?);";
                    PreparedStatement psi = conex.prepareStatement(insert);
                    //conex.prepareStatement(input);
                    psi.setString(1, user);
                    psi.setString(2, pass);
                    psi.setString(3, a);//método
                    psi.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Usuario registrado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Nombre de usuario no disponible");
                }

                //JOptionPane.showMessageDialog(null, "Usuario registrado con éxito"); 
            } catch (SQLException e) {
                System.out.println("EXCEP SQL" + e);
                JOptionPane.showMessageDialog(null, "¡Error! Contacte al administrador");
            } finally {
                try {
                    if (conex != null) {
                        conex.close();
                    }
                } catch (SQLException excSql) {
                    System.err.println("ERROR SQL" + excSql);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JComboBox<String> cBoxNivelAcceso;
    private javax.swing.JComboBox<String> cBoxRol;
    private javax.swing.JComboBox<String> cBoxSector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField textContrasenia;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
