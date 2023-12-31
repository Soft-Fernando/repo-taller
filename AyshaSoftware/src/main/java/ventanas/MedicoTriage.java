package ventanas;

import Utilidades.SetImageLabel;
import dbController.CtrlMedicoTriage;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 * La ventana ´MedicoTriage´ se ocupa para realizarle el triage al paciente,
 * dirigiendolo al paciente a la lista de espera para que pueda ser atendido por
 * un médico de sala.
 */
public class MedicoTriage extends javax.swing.JFrame {

    private int i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13;
    private Color color;
    private String colorParcial;
    Map<String, Color> colores = new HashMap<>();
    CtrlMedicoTriage ctrl = new CtrlMedicoTriage();

    /**
     * Constructor que inicializa los componentes de la ventana
     */
    public MedicoTriage() {

        initComponents();

        ventanaEmergente.setResizable(false);
        FrameModificar.setResizable(false);
        FrameModificar.setLocationRelativeTo(null);
        setLocationRelativeTo(null);
        setResizable(false);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src\\main\\java\\images\\icon.png");
        setIconImage(miIcono);
        SetImageLabel.setImageLabel(LabelIconito, "src\\main\\java\\images\\icon.png");
        setTitle("Triage");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaEmergente = new javax.swing.JDialog();
        PanelEmergente = new javax.swing.JPanel();
        TextoEmergente = new javax.swing.JLabel();
        FrameModificar = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        ComboBoxColores = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoCambio = new javax.swing.JTextArea();
        botonAceptar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        BotonFinalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BotonTriagiar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        LabelIconito = new javax.swing.JLabel();

        ventanaEmergente.setSize(new java.awt.Dimension(295, 217));

        PanelEmergente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoEmergente.setBackground(new java.awt.Color(0, 0, 0));
        TextoEmergente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PanelEmergente.add(TextoEmergente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 280, 20));

        javax.swing.GroupLayout ventanaEmergenteLayout = new javax.swing.GroupLayout(ventanaEmergente.getContentPane());
        ventanaEmergente.getContentPane().setLayout(ventanaEmergenteLayout);
        ventanaEmergenteLayout.setHorizontalGroup(
            ventanaEmergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEmergente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventanaEmergenteLayout.setVerticalGroup(
            ventanaEmergenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelEmergente, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );

        FrameModificar.setSize(new java.awt.Dimension(400, 300));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ComboBoxColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxColoresActionPerformed(evt);
            }
        });
        jPanel2.add(ComboBoxColores, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 90, 30));

        jLabel14.setBackground(new java.awt.Color(0, 0, 153));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Motivo de cambio");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel15.setBackground(new java.awt.Color(0, 0, 153));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("Modificar color");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        TextoCambio.setColumns(20);
        TextoCambio.setRows(5);
        jScrollPane1.setViewportView(TextoCambio);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 200, 100));

        botonAceptar.setBackground(new java.awt.Color(0, 0, 153));
        botonAceptar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        botonAceptar.setText("ACEPTAR");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        jPanel2.add(botonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        javax.swing.GroupLayout FrameModificarLayout = new javax.swing.GroupLayout(FrameModificar.getContentPane());
        FrameModificar.getContentPane().setLayout(FrameModificarLayout);
        FrameModificarLayout.setHorizontalGroup(
            FrameModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FrameModificarLayout.setVerticalGroup(
            FrameModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Moderada", "Grave" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 90, -1));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Anormal" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 90, -1));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox3.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Leve ", "Grave" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 90, -1));

        jComboBox4.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox4.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consciente", "Inconsciente" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 90, -1));

        jComboBox5.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox5.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jComboBox5.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presente", "No presente" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 90, -1));

        jComboBox6.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox6.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jComboBox6.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presentes", "No presentes" }));
        jComboBox6.setToolTipText("");
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 90, -1));

        jComboBox7.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox7.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jComboBox7.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adulto", "Niño o anciano" }));
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 90, -1));

        jComboBox8.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox8.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jComboBox8.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin fiebre", "Moderada", "Alta" }));
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 90, -1));

        jComboBox9.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox9.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jComboBox9.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin vomitos", "Moderados", "Intensos" }));
        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 90, -1));

        jComboBox10.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox10.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jComboBox10.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No duele", "Moderado", "Severo" }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 90, -1));

        jComboBox11.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox11.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jComboBox11.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presente", "No presente" }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 90, -1));

        jComboBox12.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox12.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jComboBox12.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presentes ", "No presentes" }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 90, -1));

        jComboBox13.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox13.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        jComboBox13.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No presente", "Moderado", "Intenso" }));
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 90, -1));

        BotonFinalizar.setBackground(new java.awt.Color(0, 0, 153));
        BotonFinalizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        BotonFinalizar.setText("FINALIZAR");
        BotonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Sangrado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 60, 20));

        jLabel2.setBackground(new java.awt.Color(0, 0, 153));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Respiración");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 70, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 153));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Pulso");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 40, 20));

        jLabel4.setBackground(new java.awt.Color(0, 0, 153));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Estado mental");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 90, 20));

        jLabel5.setBackground(new java.awt.Color(0, 0, 153));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Conciencia");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 70, 20));

        jLabel6.setBackground(new java.awt.Color(0, 0, 153));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Dolor de pecho");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 20));

        jLabel7.setBackground(new java.awt.Color(0, 0, 153));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Lesiones graves");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 240, -1, 20));

        jLabel8.setBackground(new java.awt.Color(0, 0, 153));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Edad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 30, 20));

        jLabel9.setBackground(new java.awt.Color(0, 0, 153));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Fiebre");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 40, 20));

        jLabel10.setBackground(new java.awt.Color(0, 0, 153));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Vómitos");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 50, 20));

        jLabel11.setBackground(new java.awt.Color(0, 0, 153));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Dolor abdominal");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 100, 20));

        jLabel12.setBackground(new java.awt.Color(0, 0, 153));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Signos de shock");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 80, -1, 20));

        jLabel13.setBackground(new java.awt.Color(0, 0, 153));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Lesiones leves");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 90, 20));

        BotonTriagiar.setBackground(new java.awt.Color(0, 0, 153));
        BotonTriagiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonTriagiar.setForeground(new java.awt.Color(255, 255, 255));
        BotonTriagiar.setText("TRIAGIAR");
        BotonTriagiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTriagiarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonTriagiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        BotonModificar.setBackground(new java.awt.Color(0, 0, 153));
        BotonModificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonModificar.setForeground(new java.awt.Color(255, 255, 255));
        BotonModificar.setText("MODIFICAR");
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        LabelIconito.setText("jLabel14");
        jPanel1.add(LabelIconito, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        String selectedOption = (String) jComboBox1.getSelectedItem();
        switch (selectedOption) {
            case "Normal":
                this.i1 = 0;
                break;
            case "Moderada":
                this.i1 = 1;
                break;
            case "Grave":
                this.i1 = 2;
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * Boton que llama a ´finalizarTriage´ del controller, y deja invisible la
     * ventana emergente y su misma ventana.
     *
     * @param evt
     */
    private void BotonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFinalizarActionPerformed
        // TODO add your handling code here:
        if (ventanaEmergente.isVisible()) {

            ctrl.finalizarTriage();
            ventanaEmergente.setVisible(false);
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Debe realizar el triage");
        }

    }//GEN-LAST:event_BotonFinalizarActionPerformed

    /**
     * Según el color determina el tiempo que se mostrará en la ventana
     * emergente.
     *
     * @param color : color del triage.
     */
    private void tiempoDeColor(Color color) {
        if (color == Color.RED) {
            TextoEmergente.setText("ATENCIÓN URGENTE");
        } else if (color == Color.ORANGE) {
            TextoEmergente.setText("Tiempo de espera : 10 - 15 minutos");
        } else if (color == Color.GREEN) {
            TextoEmergente.setText("Tiempo de espera : 2 horas");
        } else if (color == Color.BLUE) {
            TextoEmergente.setText("Tiempo de espera : 4 horas");
        } else {
            TextoEmergente.setText("Tiempo de espera : 60 minutos");
        }
    }
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) jComboBox2.getSelectedItem();
        switch (selectedOption) {
            case "Normal":
                this.i2 = 0;
                break;
            case "Anormal":
                this.i2 = 1;
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) jComboBox3.getSelectedItem();
        switch (selectedOption) {
            case "Normal":
                this.i3 = 0;
                break;
            case "Leve":
                this.i3 = 1;
                break;
            case "Grave":
                this.i3 = 2;
        }

    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) jComboBox4.getSelectedItem();
        switch (selectedOption) {
            case "Consciente":
                this.i4 = 0;
                break;
            case "Inconsciente":
                this.i4 = 3;
        }

    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) jComboBox5.getSelectedItem();
        switch (selectedOption) {
            case "No presente":
                this.i5 = 0;
                break;
            case "Presente":
                this.i5 = 1;
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) jComboBox6.getSelectedItem();
        switch (selectedOption) {
            case "No presentes":
                this.i6 = 0;
                break;
            case "Presentes":
                this.i6 = 2;
        }
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) jComboBox7.getSelectedItem();
        switch (selectedOption) {
            case "Adulto":
                this.i7 = 0;
                break;
            case "Niño o anciano":
                this.i7 = 1;
        }
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) jComboBox8.getSelectedItem();
        switch (selectedOption) {
            case "Sin fiebre":
                this.i8 = 0;
                break;
            case "Moderada":
                this.i8 = 1;
                break;
            case "Alta":
                this.i8 = 2;
        }
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) jComboBox9.getSelectedItem();
        switch (selectedOption) {
            case "Sin vomitos":
                this.i9 = 0;
                break;
            case "Moderados":
                this.i9 = 1;
                break;
            case "Intensos":
                this.i9 = 2;
        }
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) jComboBox10.getSelectedItem();
        switch (selectedOption) {
            case "No duele":
                this.i10 = 0;
                break;
            case "Moderado":
                this.i10 = 1;
                break;
            case "Severo":
                this.i10 = 2;
        }
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) jComboBox11.getSelectedItem();
        switch (selectedOption) {
            case "No presente":
                this.i11 = 0;
                break;
            case "Presente":
                this.i11 = 3;
        }
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) jComboBox12.getSelectedItem();
        switch (selectedOption) {
            case "Presentes":
                this.i12 = 0;
                break;
            case "No presentes":
                this.i12 = 1;
        }
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed
        // TODO add your handling code here:
        String selectedOption = (String) jComboBox13.getSelectedItem();
        switch (selectedOption) {
            case "No presente":
                this.i13 = 0;
                break;
            case "Moderado":
                this.i13 = 1;
                break;
            case "Intenso":
                this.i13 = 2;
        }

    }//GEN-LAST:event_jComboBox13ActionPerformed

    /**
     * Botón que realiza el triage al paciente, mostrando la ventana emergente
     * con el color respectivo.
     *
     * @param evt
     */
    private void BotonTriagiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTriagiarActionPerformed
        mapeoDeColores();
        this.colorParcial = ctrl.triagiarPaciente(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13);
        color = colores.get(colorParcial);
        PanelEmergente.setBackground(color);
        tiempoDeColor(color);
        ventanaEmergente.setVisible(true);
    }//GEN-LAST:event_BotonTriagiarActionPerformed

    /**
     * Mapea los colores, como clave los nombres de los colores y como valores
     * los colores de la clase Color.
     */
    private void mapeoDeColores() {
        colores.put("Rojo", Color.RED);
        colores.put("Verde", Color.GREEN);
        colores.put("Amarillo", Color.YELLOW);
        colores.put("Azul", Color.BLUE);
        colores.put("Naranja", Color.ORANGE);
    }

    /**
     * Botón para modificar el color del triage, haciendo visible una nueva
     * ventana para colocar el nuevo color y el motivo del cambio.
     *
     * @param evt
     */
    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        // TODO add your handling code here:
        if (ventanaEmergente.isVisible()) {
            coloresSeleccionables(color);
            FrameModificar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe realizar el triage");
        }

    }//GEN-LAST:event_BotonModificarActionPerformed

    /**
     * Coloca en el comboBox los colores posibles(dos niveles hacia abajo y dos
     * hacia arriba, si esto es posbible) para el cambio del color del triage.
     *
     * @param color : color del triage.
     */
    private void coloresSeleccionables(Color color) {
        if (color == Color.RED) {
            ComboBoxColores.removeAllItems(); //Vacia el combo box
            ComboBoxColores.addItem("Naranja");
            ComboBoxColores.addItem("Amarillo");
        } else if (color == Color.ORANGE) {
            ComboBoxColores.removeAllItems();
            ComboBoxColores.addItem("Rojo");
            ComboBoxColores.addItem("Amarillo");
            ComboBoxColores.addItem("Verde");
        } else if (color == Color.GREEN) {
            ComboBoxColores.removeAllItems();
            ComboBoxColores.addItem("Naranja");
            ComboBoxColores.addItem("Amarillo");
            ComboBoxColores.addItem("Azul");
        } else if (color == Color.BLUE) {
            ComboBoxColores.removeAllItems();
            ComboBoxColores.addItem("Amarillo");
            ComboBoxColores.addItem("Verde");
        } else {
            ComboBoxColores.removeAllItems();
            ComboBoxColores.addItem("Rojo");
            ComboBoxColores.addItem("Naranja");
            ComboBoxColores.addItem("Verde");
            ComboBoxColores.addItem("Azul");
        }
    }


    private void ComboBoxColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxColoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxColoresActionPerformed

    /**
     * Botón que toma el color definitivo y el motivo de cambio del triage, para
     * luego pasarselo por parámetro a un método del controller llamado
     * ´cambiarTriage()´.
     *
     * @param evt
     */
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed

        mapeoDeColores();
        String colorDefinitivo = ComboBoxColores.getSelectedItem().toString();
        this.color = colores.get(colorDefinitivo);

        if (!TextoCambio.getText().isEmpty()) {
            String motivoCambio = this.TextoCambio.getText();
            ctrl.cambiarTriage(colorDefinitivo, motivoCambio);
            FrameModificar.setVisible(false);
            PanelEmergente.setBackground(color);
            tiempoDeColor(color);
        } else {
            JOptionPane.showMessageDialog(null, "Debe aclarar el motivo de cambio");
        }
    }//GEN-LAST:event_botonAceptarActionPerformed
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
            java.util.logging.Logger.getLogger(MedicoTriage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedicoTriage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedicoTriage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedicoTriage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedicoTriage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonFinalizar;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonTriagiar;
    private javax.swing.JComboBox<String> ComboBoxColores;
    private javax.swing.JFrame FrameModificar;
    private javax.swing.JLabel LabelIconito;
    private javax.swing.JPanel PanelEmergente;
    private javax.swing.JTextArea TextoCambio;
    private javax.swing.JLabel TextoEmergente;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog ventanaEmergente;
    // End of variables declaration//GEN-END:variables

    public int getI1() {
        return i1;
    }

    public int getI2() {
        return i2;
    }

    public int getI3() {
        return i3;
    }

    public int getI4() {
        return i4;
    }

    public int getI5() {
        return i5;
    }

    public int getI6() {
        return i6;
    }

    public int getI7() {
        return i7;
    }

    public int getI8() {
        return i8;
    }

    public int getI9() {
        return i9;
    }

    public int getI10() {
        return i10;
    }

    public int getI11() {
        return i11;
    }

    public int getI12() {
        return i12;
    }

    public int getI13() {
        return i13;
    }

}
