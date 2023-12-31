package ventanas.panelesEstadisticas;

import dbController.CtrlEstadistica;

/**
 * La clase DescripcionMedico es un panel de Swing que extiende de javax.swing.JPanel.
 * Proporciona una descripción del médico.
 */
public class DescripcionMedico extends javax.swing.JPanel {
    
    CtrlEstadistica ctrlEst = new CtrlEstadistica();

    /**
     * Crea una nueva instancia de 'DescripcionMedico', inicializa sus componentes y establece los datos variables.
     * 
     * @param desdeT La fecha de inicio en formato de texto.
     * @param hastaT La fecha de fin en formato de texto.
     * @param vectorMayorMedico Un array de enteros donde el primer elemento es la matrícula del médico y el segundo elemento es el número total de pacientes.
     */
    public DescripcionMedico(String desdeT, String hastaT, int []vectorMayorMedico) {
        initComponents();
        String nombreCompleto = ctrlEst.obtenerNombreCompletoMedico(vectorMayorMedico[0]);
        setDatosVariables(desdeT,hastaT,nombreCompleto,vectorMayorMedico[0],vectorMayorMedico[1]);
    }
    /**
     * Este método se utiliza para establecer los datos variables en las etiquetas del panel.
     * Los datos incluyen el rango de fechas, el nombre del médico, la matrícula y el total de pacientes atendidos.
     *
     * @param desde La fecha de inicio del rango.
     * @param hasta La fecha de fin del rango.
     * @param nombre El nombre del médico.
     * @param matricula La matrícula del médico.
     * @param total El total de pacientes atendidos por el médico.
     */
    private void setDatosVariables(String desde,String hasta,String nombre,int matricula,int total){
        
        if(desde.equals(hasta)){labelPresentacion.setText("Durante el día "+desde+" el médico que más pacientes atendió fue:");
        }else{labelPresentacion.setText("Entre las fechas "+desde+" y "+hasta+" el médico que más pacientes atendió fue:");
        }        
        labelNombreCompleto.setText(nombre+":");        
        labelMatricula.setText("con matrícula N°"+String.valueOf(matricula)+",atendiendo a un total de: "+total+" pacientes");
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelbase = new javax.swing.JPanel();
        labelPresentacion = new javax.swing.JLabel();
        labelNombreCompleto = new javax.swing.JLabel();
        labelMatricula = new javax.swing.JLabel();

        panelbase.setBackground(new java.awt.Color(255, 255, 255));

        labelPresentacion.setText("Entre las fechas {fechaInicial} y {fechaFinal} el médico que más pacientes atendió fue:");

        labelNombreCompleto.setText("{nombreMedico}, {apellidoMedico} ");

        labelMatricula.setText("con matrícula N°{matriculaMedico},atendiendo a un total de:");

        javax.swing.GroupLayout panelbaseLayout = new javax.swing.GroupLayout(panelbase);
        panelbase.setLayout(panelbaseLayout);
        panelbaseLayout.setHorizontalGroup(
            panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbaseLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMatricula)
                    .addComponent(labelNombreCompleto)
                    .addComponent(labelPresentacion))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        panelbaseLayout.setVerticalGroup(
            panelbaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbaseLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(labelPresentacion)
                .addGap(18, 18, 18)
                .addComponent(labelNombreCompleto)
                .addGap(18, 18, 18)
                .addComponent(labelMatricula)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelMatricula;
    private javax.swing.JLabel labelNombreCompleto;
    private javax.swing.JLabel labelPresentacion;
    private javax.swing.JPanel panelbase;
    // End of variables declaration//GEN-END:variables
}
