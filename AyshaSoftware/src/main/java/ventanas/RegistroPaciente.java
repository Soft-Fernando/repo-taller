package ventanas;

import Utilidades.FormatosValidos;
import Utilidades.SetImageLabel;
import clases.Paciente;
import dbController.CtrlConsulta;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.util.Date;
import dbController.CtrlRegistroPaciente;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.WindowConstants;

/**
 * La ventana ´RegistroPaciente´ registra a los pacientes que son atendidos en
 * Admisión, relacionandose con el controlador ´CtrlRegistroPaciente´.
 */
public class RegistroPaciente extends javax.swing.JFrame {

    /**
     * Constructor que inicializa los componentes de la ventana
     */
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
        botonRegistro1.setVisible(false);
        botonLista.setVisible(false);
    }
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

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
        jScrollPane1 = new javax.swing.JScrollPane();
        textMotivoConsulta = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();

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
        jLabel7.setText("Motivo de la consulta");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 180, -1));

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
        jPanel1.add(botonRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 190, 30));

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
        jPanel1.add(botonLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 160, 30));

        botonBuscar.setBackground(new java.awt.Color(0, 0, 153));
        botonBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 130, 30));

        textMotivoConsulta.setColumns(20);
        textMotivoConsulta.setRows(5);
        jScrollPane1.setViewportView(textMotivoConsulta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 200, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Estado civil");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 90, -1));

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

    Paciente pac;

    /**
     * Registra el paciente, pasando por una validación de los datos cargados,
     * luego llama al método del controller ´registrarPacientes()´, pasandole
     * por parámetro un objeto Paciente, objetos que ya han sido instanciados
     * con sus respectivos valores.
     *
     * @param evt
     */
    private void botonRegistro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistro1ActionPerformed
        String fechaFormateada = null;
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

        if (fechaNacimiento != null) {
            fechaFormateada = dateFormat.format(fechaNacimiento);
            pac = new Paciente(nombre, apellido, fechaFormateada, domicilio, dni, telFijo, telCelular, correo, personaContacto, estadoCivil);

        }

        String patronMail = "^[A-Za-z0-9+_.-]+@(.+)$";
        String patronDNI = "^[0-9]{7,10}$";

        Pattern patternMail = Pattern.compile(patronMail);
        Matcher matcherMail = patternMail.matcher(correo);

        Pattern patternDNI = Pattern.compile(patronDNI);
        Matcher matcherDNI = patternDNI.matcher(dni);

        if (fechaFormateada != null && !nombre.isEmpty() && !apellido.isEmpty() && !domicilio.isEmpty() && !dni.isEmpty() && !telFijo.isEmpty() && !telCelular.isEmpty() && !correo.isEmpty() && !personaContacto.isEmpty() && !estadoCivil.isEmpty()) {

            if (matcherMail.matches()) {

                if (matcherDNI.matches()) {

                    CtrlRegistroPaciente.registrarPacientes(pac);
                    botonLista.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "DNI no válido");
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

    private LocalDate fecha = null;
    private LocalTime hora = null;
    public static String motivoConsulta;
    CtrlConsulta ctrlConsulta = new CtrlConsulta();

    /**
     * Botón que completa la primer parte de la Consulta y vacía los campos.
     *
     * @param evt
     */
    private void botonListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListaActionPerformed

        motivoConsulta = textMotivoConsulta.getText().trim();

        if (!motivoConsulta.isEmpty()) {

            fecha = LocalDate.now();
            hora = LocalTime.now();

            String fechaString = fecha.format(FormatosValidos.FORMATO_FECHA);
            String horaString = hora.format(FormatosValidos.FORMATO_HORA);
            ctrlConsulta.primeraCarga(TextApellido.getText().trim(), TextDNI.getText().trim(), fechaString, horaString, motivoConsulta);
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
            textMotivoConsulta.setText("");
            botonRegistro1.setVisible(false);
            botonLista.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "Debe registrar el motivo de la consulta");
        }


    }//GEN-LAST:event_botonListaActionPerformed

    /**
     * Botón que valida el DNI y llama al metodo del controller
     * ´buscarPaciente´.
     *
     * @param evt
     */
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        String dni = TextDNI.getText();

        String patronDNI = "^[0-9]{7,10}$";

        Pattern patternDNI = Pattern.compile(patronDNI);
        Matcher matcherDNI = patternDNI.matcher(dni);

        if (matcherDNI.matches()) {
            CtrlRegistroPaciente.buscarPaciente(dni, botonRegistro1, botonLista, TextNombre, TextApellido, TextDomicilio, TextFijo, TextCelular, TextEstadoCivil, TextCorreo, TextPersonaContacto, textFechaNac);

        } else {
            JOptionPane.showMessageDialog(null, "El DNI no es válido");
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    /**
     * Método principal que inicia la ventana Swing.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en
     * este caso).
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser textFechaNac;
    private javax.swing.JTextArea textMotivoConsulta;
    // End of variables declaration//GEN-END:variables

}
