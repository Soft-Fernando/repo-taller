
package ventanas.panelesmedicos;


import clases.Registro;
import dbController.CtrlMedicoSala;
import java.time.format.DateTimeFormatter;

/**
 * La clase PanelDescripcionRegistro es un panel de Swing que extiende de javax.swing.JPanel.
 * Proporciona una interfaz para la descripción del registro.
 */
public class PanelDescripcionRegistro extends javax.swing.JPanel {
    CtrlMedicoSala ctrlMedSal;
    /**
     * Constructor para la clase PanelDescripcionRegistro.
     * Inicializa los componentes y establece las variables de datos.
     * @param reg El registro que se va a describir.
     */
    public PanelDescripcionRegistro(Registro reg) {
        initComponents();
        ctrlMedSal = new CtrlMedicoSala();
        setDatosVariables(reg);     
    }
    
    /**
     * Este método establece las variables de datos para el registro.
     * Formatea y muestra la fecha, hora, diagnóstico, lugar y nombre del médico del registro.
     * @param reg El registro cuyos datos se van a establecer.
     */
    private void setDatosVariables(Registro reg){
        
        date.setText(reg.getFecha().format(DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy")));
        hour.setText(reg.getHora().format(DateTimeFormatter.ofPattern("HH':'mm':'ss")));
        diagnosis.setText(reg.getDiagnostico());
        place.setText(String.valueOf(reg.getLugares()));
        nombreMedico.setText(String.valueOf(ctrlMedSal.nombreCompletoMedico(reg.getMedico())));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        place = new javax.swing.JLabel();
        diagnosis = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombreMedico = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Fecha:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel2.setText("Hora:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 14, -1, -1));

        jLabel3.setText("Lugar:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 48, -1, -1));

        jLabel4.setText("Diagnostico:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 134, -1, -1));

        date.setText("{day}/{month}/{year}");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        hour.setText("{hour}:{min}:{year}");
        jPanel1.add(hour, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 14, -1, -1));

        place.setText("{lugar}");
        jPanel1.add(place, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 48, 778, -1));

        diagnosis.setText("{diagnostico}");
        jPanel1.add(diagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 107, 880, 70));

        jLabel5.setText("Medico/a: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 79, -1, -1));

        nombreMedico.setText("{nombreCompletoMedico}");
        jPanel1.add(nombreMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 79, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel diagnosis;
    private javax.swing.JLabel hour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombreMedico;
    private javax.swing.JLabel place;
    // End of variables declaration//GEN-END:variables
}
