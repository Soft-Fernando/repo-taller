
package ventanas;


import clases.Medico;
import dbController.CtrlMedicoSala;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ventanas.panelesmedicos.Panel2;
import ventanas.panelesmedicos.Panel3;
import ventanas.panelesmedicos.Panel4;

/**
 * La clase `MedicoSala` representa el panel base en el que visualizan los 
 * datos de los pacientes
 */

public class MedicoSala extends javax.swing.JFrame {
    
    
    private static EntradaMedicoSala frameDeBase;
    private CtrlMedicoSala ctrlMedSal = null;
    private String dni;
    private String numeroSala;
    private Medico med;
    private Object[] datos;
    /**
     * Creates new form MedicoSala
     * @param frameDeBase
     */ 
    public MedicoSala(EntradaMedicoSala frameDeBase) {
        initComponents();
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src\\main\\java\\images\\icon.png");
        setIconImage(miIcono);
        MedicoSala.frameDeBase=frameDeBase;
        dni = frameDeBase.dniV;
        med=frameDeBase.getMed();
        numeroSala = frameDeBase.numeroV;
        ctrlMedSal = new CtrlMedicoSala(dni,numeroSala);
        datos=frameDeBase.datosPacienteMedicoBox;
        setTitle("Paciente "+ ctrlMedSal.nombreCompleto(dni));
        this.setLocationRelativeTo(null);
        showPanel(new Panel2(ctrlMedSal.getDni(),this.med));
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //if(ctrlMedSal.isRegistroPendiente(dni,med.getNumMatricula())){
                    ctrlMedSal.guardarDatosPacienteMedicoBox(datos);
                    frameDeBase.actualizarTablaPacientesEnSala();
                //}else{
                   // JOptionPane.showMessageDialog(null, "No se guardo nada en el registro del paciente");
                //}
                dispose();
            }
        });       
    }
    
    /**
     * Este método muestra un panel y le da estilos específicos.
     * 
     * @param p El panel de tipo JPanel que se va a mostrar y estilizar. 
     *          Se ajusta el tamaño del panel a 550x650 y su ubicación en (0,0).
     *          Luego, se elimina todo el contenido del panel 'content' y se agrega el nuevo panel al centro.
     *          Finalmente, se revalida y repinta el panel 'content'.
     */
    private void showPanel(JPanel p){
        p.setSize(1000,650);
        p.setLocation(0,0);
        content.removeAll();
        content.add(p,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
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
        Boton3 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        altaPaciente = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton3.setBackground(new java.awt.Color(0, 0, 204));
        Boton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Boton3.setForeground(new java.awt.Color(255, 255, 255));
        Boton3.setText("Carga registro");
        Boton3.setBorder(null);
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        jPanel2.add(Boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 200, 70));

        Boton2.setBackground(new java.awt.Color(0, 0, 204));
        Boton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Boton2.setForeground(new java.awt.Color(255, 255, 255));
        Boton2.setText("Historia Clínica");
        Boton2.setBorder(null);
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        jPanel2.add(Boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 70));

        Boton4.setBackground(new java.awt.Color(0, 0, 204));
        Boton4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Boton4.setForeground(new java.awt.Color(255, 255, 255));
        Boton4.setText("Carga estudio");
        Boton4.setBorder(null);
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        jPanel2.add(Boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 70));

        altaPaciente.setBackground(new java.awt.Color(0, 0, 204));
        altaPaciente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        altaPaciente.setForeground(new java.awt.Color(255, 255, 255));
        altaPaciente.setText("Alta Paciente");
        altaPaciente.setBorder(null);
        altaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaPacienteActionPerformed(evt);
            }
        });
        jPanel2.add(altaPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 200, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 650));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1000, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        showPanel(new Panel2(ctrlMedSal.getDni(),this.med));
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        showPanel(new Panel3(ctrlMedSal.getDni(),this.med));
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        showPanel(new Panel4(ctrlMedSal.getDni(),this.med));
    }//GEN-LAST:event_Boton4ActionPerformed

    /**
     * Este método se encarga de dar de alta a un paciente después de una consulta.
     *
     * @param evt Evento de acción que desencadena este método.
     *
     * El método realiza las siguientes operaciones:
     * 1. Verifica si hay un registro pendiente para el paciente y el médico actuales.
     * 2. Si hay un registro pendiente, finaliza la carga del registro y elimina al paciente del box médico.
     * 3. Desocupa el box y actualiza las tablas de pacientes en la sala y de boxes.
     * 4. Cierra la ventana actual.
     * 5. Si no hay un registro pendiente, muestra un mensaje de error informando que no se ha guardado nada en el registro del paciente.
     */
    private void altaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaPacienteActionPerformed
        if (ctrlMedSal.isRegistroPendiente(dni, med.getNumMatricula())){
            
            ctrlMedSal.finalizarCargaRegistro(ctrlMedSal.seleccionarRegistroNoFinalizado(dni,med.getNumMatricula()));
            frameDeBase.ctrlDB.eliminarPacienteEnBox(dni);
            
            frameDeBase.ctrlDB.desocuparBox(numeroSala);
            frameDeBase.actualizarTablaPacientesEnSala();
            frameDeBase.actualizarTablaBoxes();
            
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "No se guardo nada en el registro del paciente: Debe generar un registro");
        }
    }//GEN-LAST:event_altaPacienteActionPerformed
    /**
     * Método principal que inicia la ventana Swing.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en
     * este caso).
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                new MedicoSala(frameDeBase).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton altaPaciente;
    private javax.swing.JPanel content;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
