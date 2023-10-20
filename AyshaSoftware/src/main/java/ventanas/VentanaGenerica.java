/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Fernando
 */
public class VentanaGenerica extends javax.swing.JFrame {

    /**
     * Creates new form VentanaGenerica
     */
    public VentanaGenerica() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src\\main\\java\\images\\icon.png");
        setIconImage(miIcono);
        SetImageLabel.setImageLabel(jLabel6,"src\\main\\java\\images\\12.png");
        SetImageLabel.setImageLabel(jLabel7,"src\\main\\java\\images\\13.png");
        SetImageLabel.setImageLabel(jLabel8,"src\\main\\java\\images\\14.png");
        SetImageLabel.setImageLabel(jLabel9,"src\\main\\java\\images\\15.png");
        SetImageLabel.setImageLabel(jLabel10,"src\\main\\java\\images\\16.png");
        SetImageLabel.setImageLabel(jLabel11,"src\\main\\java\\images\\17.png");
        setTitle("Ventana Genérica");
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
        jLabel6 = new javax.swing.JLabel();
        botonTriage = new javax.swing.JButton();
        botonAdmision = new javax.swing.JButton();
        botonRrhh = new javax.swing.JButton();
        botonGestion = new javax.swing.JButton();
        botonInformatica = new javax.swing.JButton();
        botonSala = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("jLabel1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 200, 200));

        botonTriage.setText("jButton1");
        jPanel1.add(botonTriage, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        botonAdmision.setText("jButton1");
        jPanel1.add(botonAdmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, -1, -1));

        botonRrhh.setText("jButton1");
        jPanel1.add(botonRrhh, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        botonGestion.setText("jButton1");
        jPanel1.add(botonGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        botonInformatica.setText("jButton1");
        jPanel1.add(botonInformatica, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, -1, -1));

        botonSala.setText("jButton1");
        jPanel1.add(botonSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel7.setText("jLabel1");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 200, 200));

        jLabel8.setText("jLabel1");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 200, 200));

        jLabel9.setText("jLabel1");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 200, 200));

        jLabel10.setText("jLabel1");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 200, 200));

        jLabel11.setText("jLabel1");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 200, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGenerica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdmision;
    private javax.swing.JButton botonGestion;
    private javax.swing.JButton botonInformatica;
    private javax.swing.JButton botonRrhh;
    private javax.swing.JButton botonSala;
    private javax.swing.JButton botonTriage;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}