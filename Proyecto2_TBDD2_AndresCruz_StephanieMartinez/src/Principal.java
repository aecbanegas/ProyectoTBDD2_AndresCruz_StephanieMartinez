
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andrescruz
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        nombreBD.add("Prueba 1");
        nombreBD.add("Prueba 2");
        nombreBD.add("Prueba 3 ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public void setLista(DefaultListModel modelo, JList lista) {

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_configuracion = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombreInstanciaOrigen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_nombreBDOrigen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_puertoOrigen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_nombreUsuarioOrigen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_passwordOrigen = new javax.swing.JTextField();
        jb_probarOrigen = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jb_probarDestino = new javax.swing.JButton();
        tf_passwordDestino = new javax.swing.JTextField();
        tf_nombreUsuarioDestino = new javax.swing.JTextField();
        tf_puertoDestino = new javax.swing.JTextField();
        tf_nombreBDDestino = new javax.swing.JTextField();
        tf_nombreInstanciaDestino = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jb_guardar = new javax.swing.JButton();
        jb_regresarConfiguracion = new javax.swing.JButton();
        jd_replicar = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_sinReplicar = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_replicando = new javax.swing.JList<>();
        jb_replicar = new javax.swing.JButton();
        jb_noReplicar = new javax.swing.JButton();
        jb_guardarReplicar = new javax.swing.JButton();
        jb_cancelarReplicar = new javax.swing.JButton();
        jlabel_actualizaciones = new javax.swing.JLabel();
        jb_regresar = new javax.swing.JButton();
        jlabel_cambios = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jb_configuracion = new javax.swing.JButton();
        jb_replicarTablas = new javax.swing.JButton();

        jd_configuracion.setTitle("Configuración de Bases de Datos");

        jLabel3.setText("Nombre Instancia");

        jLabel4.setText("Nombre Base de Datos");

        jLabel5.setText("Puerto");

        jLabel6.setText("Nombre usuario");

        jLabel7.setText("Password");

        jb_probarOrigen.setText("Probar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_passwordOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreUsuarioOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_puertoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreBDOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreInstanciaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_probarOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombreInstanciaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nombreBDOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_puertoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_nombreUsuarioOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_passwordOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jb_probarOrigen)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Base de Datos Origen", jPanel1);

        jLabel8.setText("Nombre Instancia");

        jLabel9.setText("Nombre Base de Datos");

        jLabel10.setText("Puerto");

        jLabel11.setText("Nombre usuario");

        jLabel12.setText("Password");

        jb_probarDestino.setText("Probar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_passwordDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreUsuarioDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_puertoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreBDDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreInstanciaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_probarDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nombreInstanciaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_nombreBDDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_puertoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_nombreUsuarioDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_passwordDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jb_probarDestino)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Base de datos Destino", jPanel2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Configuración de Bases de Datos");

        jb_guardar.setText("Guardar");

        jb_regresarConfiguracion.setText("Regresar");
        jb_regresarConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_regresarConfiguracionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_configuracionLayout = new javax.swing.GroupLayout(jd_configuracion.getContentPane());
        jd_configuracion.getContentPane().setLayout(jd_configuracionLayout);
        jd_configuracionLayout.setHorizontalGroup(
            jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_configuracionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(63, 63, 63))
            .addGroup(jd_configuracionLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_regresarConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jd_configuracionLayout.setVerticalGroup(
            jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_configuracionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_configuracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardar)
                    .addComponent(jb_regresarConfiguracion))
                .addGap(23, 23, 23))
        );

        jd_replicar.setTitle("Replicar Tablas");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Tablas BD Origen");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel14.setText("Sin Replicar");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel15.setText("Replicando");

        jl_sinReplicar.setModel(new DefaultListModel());
        jl_sinReplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_sinReplicarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_sinReplicar);

        jl_replicando.setModel(new DefaultListModel());
        jl_replicando.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_replicandoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jl_replicando);

        jb_replicar.setText(">>");
        jb_replicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_replicarMouseClicked(evt);
            }
        });

        jb_noReplicar.setText("<<");
        jb_noReplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_noReplicarMouseClicked(evt);
            }
        });

        jb_guardarReplicar.setText("Guardar");

        jb_cancelarReplicar.setText("Cancelar");

        jlabel_actualizaciones.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        jb_regresar.setText("Regresar");
        jb_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_regresarMouseClicked(evt);
            }
        });

        jlabel_cambios.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

        javax.swing.GroupLayout jd_replicarLayout = new javax.swing.GroupLayout(jd_replicar.getContentPane());
        jd_replicar.getContentPane().setLayout(jd_replicarLayout);
        jd_replicarLayout.setHorizontalGroup(
            jd_replicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_replicarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jb_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jd_replicarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_replicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_replicar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_noReplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_replicarLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(63, 63, 63))
            .addGroup(jd_replicarLayout.createSequentialGroup()
                .addGroup(jd_replicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_replicarLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel13))
                    .addGroup(jd_replicarLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jb_guardarReplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jb_cancelarReplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(jd_replicarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlabel_actualizaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_replicarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel_cambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jd_replicarLayout.setVerticalGroup(
            jd_replicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_replicarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGroup(jd_replicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_replicarLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jb_replicar)
                        .addGap(28, 28, 28)
                        .addComponent(jb_noReplicar))
                    .addGroup(jd_replicarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jd_replicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_replicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jd_replicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardarReplicar)
                    .addComponent(jb_cancelarReplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jlabel_actualizaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlabel_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_regresar)
                .addGap(19, 19, 19))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setText("Menú");

        jb_configuracion.setText("Configuración de base de datos");
        jb_configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_configuracionMouseClicked(evt);
            }
        });

        jb_replicarTablas.setText("Replicar tablas");
        jb_replicarTablas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_replicarTablasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jb_configuracion)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_replicarTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jb_configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jb_replicarTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_configuracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_configuracionMouseClicked
        jd_configuracion.pack();
        jd_configuracion.setModal(true);
        jd_configuracion.setLocationRelativeTo(this);
        jd_configuracion.setVisible(true);
    }//GEN-LAST:event_jb_configuracionMouseClicked

    private void jb_replicarTablasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_replicarTablasMouseClicked
        DefaultListModel modelo = (DefaultListModel) jl_sinReplicar.getModel();
        for (int i = 0; i < nombreBD.size(); i++) {
            modelo.addElement(nombreBD.get(i));
        }
        jl_sinReplicar.setModel(modelo);
        jd_replicar.pack();
        jd_replicar.setModal(true);
        jd_replicar.setLocationRelativeTo(this);
        jd_replicar.setVisible(true);
    }//GEN-LAST:event_jb_replicarTablasMouseClicked

    private void jb_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_regresarMouseClicked
        jd_replicar.setVisible(false);
    }//GEN-LAST:event_jb_regresarMouseClicked

    private void jb_regresarConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_regresarConfiguracionMouseClicked
        jd_configuracion.setVisible(false);
    }//GEN-LAST:event_jb_regresarConfiguracionMouseClicked

    private void jl_sinReplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_sinReplicarMouseClicked
        if (jl_sinReplicar.getSelectedIndex() >= 0) {
            posicionSR = jl_sinReplicar.getSelectedIndex();
        }
    }//GEN-LAST:event_jl_sinReplicarMouseClicked

    private void jb_replicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_replicarMouseClicked
        if (jl_sinReplicar.getSelectedIndex() >= 0) {
            DefaultListModel modelo = (DefaultListModel) jl_replicando.getModel();
            modelo.addElement(nombreBD.get(posicionSR));
            jl_replicando.setModel(modelo);
            nombreBDReplicando.add(nombreBD.get(posicionSR));
            nombreBD.remove(posicionSR);
            
            DefaultListModel modeloSinReplicar = (DefaultListModel) jl_sinReplicar.getModel();
            modeloSinReplicar.removeAllElements();
            jl_sinReplicar.setModel(modeloSinReplicar);
            for (int i = 0; i < nombreBD.size(); i++) {
                modeloSinReplicar.addElement(nombreBD.get(i));
            }
            jl_sinReplicar.setModel(modeloSinReplicar);
        } else {
            JOptionPane.showMessageDialog(null, "No hay tabla seleccionada");
        }
    }//GEN-LAST:event_jb_replicarMouseClicked

    private void jl_replicandoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_replicandoMouseClicked
        if (jl_replicando.getSelectedIndex() >= 0) {
            posicionR = jl_replicando.getSelectedIndex();
        }
    }//GEN-LAST:event_jl_replicandoMouseClicked

    private void jb_noReplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_noReplicarMouseClicked
        if (jl_replicando.getSelectedIndex() >= 0) {
            DefaultListModel modelo = (DefaultListModel) jl_sinReplicar.getModel();
            modelo.addElement(nombreBDReplicando.get(posicionR));
            jl_sinReplicar.setModel(modelo);
            nombreBD.add(nombreBDReplicando.get(posicionR));
            nombreBDReplicando.remove(posicionR);
            DefaultListModel modeloReplicando = (DefaultListModel) jl_replicando.getModel();
            modeloReplicando.removeAllElements();
            jl_replicando.setModel(modeloReplicando);
            for (int i = 0; i < nombreBDReplicando.size(); i++) {
                modeloReplicando.addElement(nombreBDReplicando.get(i));
            }
            jl_replicando.setModel(modeloReplicando);
        } else {
            JOptionPane.showMessageDialog(null, "No hay tabla seleccionada");
        }
    }//GEN-LAST:event_jb_noReplicarMouseClicked

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_cancelarReplicar;
    private javax.swing.JButton jb_configuracion;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_guardarReplicar;
    private javax.swing.JButton jb_noReplicar;
    private javax.swing.JButton jb_probarDestino;
    private javax.swing.JButton jb_probarOrigen;
    private javax.swing.JButton jb_regresar;
    private javax.swing.JButton jb_regresarConfiguracion;
    private javax.swing.JButton jb_replicar;
    private javax.swing.JButton jb_replicarTablas;
    private javax.swing.JDialog jd_configuracion;
    private javax.swing.JDialog jd_replicar;
    private javax.swing.JList<String> jl_replicando;
    private javax.swing.JList<String> jl_sinReplicar;
    private javax.swing.JLabel jlabel_actualizaciones;
    private javax.swing.JLabel jlabel_cambios;
    private javax.swing.JTextField tf_nombreBDDestino;
    private javax.swing.JTextField tf_nombreBDOrigen;
    private javax.swing.JTextField tf_nombreInstanciaDestino;
    private javax.swing.JTextField tf_nombreInstanciaOrigen;
    private javax.swing.JTextField tf_nombreUsuarioDestino;
    private javax.swing.JTextField tf_nombreUsuarioOrigen;
    private javax.swing.JTextField tf_passwordDestino;
    private javax.swing.JTextField tf_passwordOrigen;
    private javax.swing.JTextField tf_puertoDestino;
    private javax.swing.JTextField tf_puertoOrigen;
    // End of variables declaration//GEN-END:variables
ArrayList<String> nombreBD = new ArrayList();
    ArrayList<String> nombreBDReplicando = new ArrayList();
    int posicionSR, posicionR;
}
