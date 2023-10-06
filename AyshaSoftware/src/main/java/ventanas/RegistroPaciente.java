/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import clases.Administrativo;
import java.awt.Image;
import java.awt.Toolkit;
import java.time.Instant;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import java.util.Date;
import dbController.Conexion;
import clases.Paciente;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.WindowConstants;

public class RegistroPaciente extends javax.swing.JFrame {

    /**
     * Creates new form RegistroPaciente
     */
    Paciente pac = new Paciente();

    public RegistroPaciente() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src\\main\\java\\images\\icon.png");
        setIconImage(miIcono);
        SetImageLabel.setImageLabel(LabelIconito, "src\\main\\java\\images\\icon.png");
        SetImageLabel.setImageLabel(LabelFoto, "src\\main\\java\\images\\regFunc.png");

        setTitle("Registro de pacientes");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    Conexion cn = new Conexion();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextCorreo = new javax.swing.JTextField();
        TextEstadoCivil = new javax.swing.JTextField();
        TextDNI = new javax.swing.JTextField();
        TextFijo = new javax.swing.JTextField();
        TextCelular = new javax.swing.JTextField();
        botonRegistro1 = new javax.swing.JButton();
        TextNombre = new javax.swing.JTextField();
        LabelIconito = new javax.swing.JLabel();
        LabelFoto = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextDomicilio = new javax.swing.JTextField();
        TextPersonaContacto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TextApellido = new javax.swing.JTextField();
        textFechaNac = new com.toedter.calendar.JDateChooser();
        botonLista = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Persona de contacto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 150, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 160, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("DNI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 30, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Telefono fijo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Telefono celular");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 120, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Estado civil");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 90, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Nombre");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 60, -1));

        TextCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(TextCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 150, -1));

        TextEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEstadoCivilActionPerformed(evt);
            }
        });
        jPanel1.add(TextEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 150, -1));

        TextDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDNIActionPerformed(evt);
            }
        });
        jPanel1.add(TextDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 150, -1));

        TextFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFijoActionPerformed(evt);
            }
        });
        jPanel1.add(TextFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 150, -1));

        TextCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCelularActionPerformed(evt);
            }
        });
        jPanel1.add(TextCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 150, -1));

        botonRegistro1.setBackground(new java.awt.Color(0, 0, 153));
        botonRegistro1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonRegistro1.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistro1.setText("REGISTRAR PACIENTE");
        botonRegistro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistro1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 200, 30));

        TextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombreActionPerformed(evt);
            }
        });
        jPanel1.add(TextNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 150, -1));

        LabelIconito.setText("jLabel8");
        jPanel1.add(LabelIconito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 60));

        LabelFoto.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        LabelFoto.setForeground(new java.awt.Color(0, 0, 153));
        LabelFoto.setText("Label2");
        jPanel1.add(LabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 150, 120));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Domicilio");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 70, -1));

        TextDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDomicilioActionPerformed(evt);
            }
        });
        jPanel1.add(TextDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 150, -1));

        TextPersonaContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPersonaContactoActionPerformed(evt);
            }
        });
        jPanel1.add(TextPersonaContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 150, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Correo");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 50, -1));

        TextApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(TextApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 150, -1));
        jPanel1.add(textFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 150, -1));

        botonLista.setBackground(new java.awt.Color(0, 0, 153));
        botonLista.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonLista.setForeground(new java.awt.Color(255, 255, 255));
        botonLista.setText("MANDAR A LISTA");
        botonLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListaActionPerformed(evt);
            }
        });
        jPanel1.add(botonLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 150, 30));

        botonBuscar.setBackground(new java.awt.Color(0, 0, 153));
        botonBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFijoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TextFijoActionPerformed


    private void botonRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistro1ActionPerformed

        String nombre = TextNombre.getText().trim();
        String apellido = TextApellido.getText().trim();
        String domicilio = TextDomicilio.getText().trim();
        Date fechaNacimiento = textFechaNac.getDate();
        String telFijo = TextFijo.getText().trim();
        String personaContacto = TextPersonaContacto.getText().trim();
        String dni = TextDNI.getText().trim();
        String telCelular = TextCelular.getText().trim();
        String correo = TextCorreo.getText().trim();
        String estadoCivil = TextEstadoCivil.getText().trim();

  
        //Instant instant = fechaNacimiento.toInstant();
        //LocalDate fecNac = instant.atZone(ZoneId.systemDefault()).toLocalDate();

        String fechaFormateada = dateFormat.format(fechaNacimiento);
         

        pac.setNombre(nombre);
        pac.setApellido(apellido);
        pac.setDomicilio(domicilio);
        pac.setFecNacimiento(fechaFormateada);
        pac.setDni(dni);
        pac.setCorreoElectronico(correo);
        pac.setEstadoCivil(estadoCivil);
        pac.setTelCelular(telCelular);
        pac.setTelFijo(telFijo);
        pac.setPersonaContacto(personaContacto);

        String mail = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(mail);
        Matcher matcher = pattern.matcher(correo);

        if (fechaFormateada != null && !nombre.isEmpty() && !apellido.isEmpty() && !domicilio.isEmpty() && !dni.isEmpty() && !telFijo.isEmpty() && !telCelular.isEmpty() && !correo.isEmpty() && !personaContacto.isEmpty() && !estadoCivil.isEmpty()) {

            if (matcher.matches()) {

                Connection conex = null;
                try {
                    conex = Conexion.conectar();
                    //
                    //
                    String query = "SELECT * FROM Pacientes WHERE DNI = ?";
                    // String input = "INSERT INTO Usuarios VALUES(?,?,?);";

                    // ResultSet rs = .executeQuery();
                    PreparedStatement psq = conex.prepareStatement(query);
                    psq.setString(1, dni);

                    ResultSet rs = psq.executeQuery();

                    if (!rs.next()) {

                        String insert = "INSERT INTO Pacientes(Nombre, Apellido, FechaNacimiento, Domicilio, DNI, TelFijo, telCel, EstadoCivil, Mail, personaContacto) VALUES(?,?,?,?,?,?,?,?,?,?);";
                        PreparedStatement psi = conex.prepareStatement(insert);
                        //conex.prepareStatement(input);

                        // SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                        //String fechaFormateada = dateFormat.format(fechaNacimiento);
                        psi.setString(1, pac.getNombre());
                        psi.setString(2, pac.getApellido());
                        psi.setString(3, pac.getFecNacimiento());
                        psi.setString(4, pac.getDomicilio());
                        psi.setString(5, pac.getDni());
                        psi.setString(6, pac.getTelFijo());
                        psi.setString(7, pac.getTelCelular());
                        psi.setString(8, pac.getEstadoCivil());
                        psi.setString(9, pac.getCorreoElectronico());
                        psi.setString(10, pac.getPersonaContacto());

                        psi.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Paciente registrado con éxito.");
                        TextNombre.setText("");
                        TextApellido.setText("");
                        textFechaNac.setDate(null);
                        TextDomicilio.setText("");
                        TextDNI.setText("");
                        TextFijo.setText("");
                        TextCelular.setText("");
                        TextEstadoCivil.setText("");
                        TextCorreo.setText("");
                        TextPersonaContacto.setText("");

                    } else {
                        JOptionPane.showMessageDialog(null, "DNI ya registrado");
                        //TO DO: Método que traiga los datos del paciente y los lleve a la esperaTriage
                        //
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
                JOptionPane.showMessageDialog(null, "Correo electrónico no válido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");

        }

    }//GEN-LAST:event_botonRegistro1ActionPerformed

    private void TextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombreActionPerformed

    }//GEN-LAST:event_TextNombreActionPerformed

    private void TextDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDomicilioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TextDomicilioActionPerformed

    private void TextPersonaContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPersonaContactoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TextPersonaContactoActionPerformed

    private void TextDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDNIActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TextDNIActionPerformed

    private void TextCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCelularActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TextCelularActionPerformed

    private void TextCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCorreoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TextCorreoActionPerformed

    private void TextEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEstadoCivilActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TextEstadoCivilActionPerformed

    private void TextApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextApellidoActionPerformed

    private void botonListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonListaActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        Connection conex = null;
        try {
            conex = cn.conectar();
            //
            //
            String query = "SELECT * FROM Pacientes WHERE DNI = ?";
            // String input = "INSERT INTO Usuarios VALUES(?,?,?);";

            // ResultSet rs = .executeQuery();
            PreparedStatement psq = conex.prepareStatement(query);
            psq.setString(1, TextDNI.getText());
            ResultSet rs = psq.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Paciente registrado");
                String fechaFormateada = rs.getString("FechaNacimiento");
                Date fecha = dateFormat.parse(fechaFormateada);
                TextNombre.setText(rs.getString("Nombre"));
                TextApellido.setText(rs.getString("Apellido"));
                textFechaNac.setDate(fecha);
                TextDomicilio.setText(rs.getString("Domicilio"));
                TextFijo.setText(rs.getString("TelFijo"));
                TextCelular.setText(rs.getString("telCel"));
                TextEstadoCivil.setText(rs.getString("EstadoCivil"));
                TextCorreo.setText(rs.getString("Mail"));
                TextPersonaContacto.setText(rs.getString("personaContacto"));
            } else {
                JOptionPane.showMessageDialog(null, "Paciente no registrado, complete sus datos.");
            }
        } catch (SQLException e) {
            System.out.println("EXCEP SQL" + e);
            JOptionPane.showMessageDialog(null, "¡Error! Contacte al administrador");
        } catch (ParseException ex) {
            Logger.getLogger(RegistroPaciente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conex != null) {
                    conex.close();
                }
            } catch (SQLException excSql) {
                System.err.println("ERROR SQL" + excSql);
            }
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPaciente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFoto;
    private javax.swing.JLabel LabelIconito;
    private javax.swing.JTextField TextApellido;
    private javax.swing.JTextField TextCelular;
    private javax.swing.JTextField TextCorreo;
    private javax.swing.JTextField TextDNI;
    private javax.swing.JTextField TextDomicilio;
    private javax.swing.JTextField TextEstadoCivil;
    private javax.swing.JTextField TextFijo;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextPersonaContacto;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonLista;
    private javax.swing.JButton botonRegistro1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser textFechaNac;
    // End of variables declaration//GEN-END:variables

}
