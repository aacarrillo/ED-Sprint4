/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JFileChooser;

/**
 *
 * @author Alejandroo
 */
public class JFrameVistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFrameVistaPrincipal
     */
    public JFrameVistaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBuscar = new javax.swing.JPanel();
        jLabelNombreTenista = new javax.swing.JLabel();
        jTextFieldBuscarTenista = new javax.swing.JTextField();
        jPanelDatosTenista = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelEdad = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        jLabelPuntuacion = new javax.swing.JLabel();
        jTextFieldPuntuacion = new javax.swing.JTextField();
        jLabel4Palmares = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanelPalmares = new javax.swing.JPanel();
        jLabelTorneos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonAnadir = new javax.swing.JButton();
        jMenuBarPrin = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemInicializar = new javax.swing.JMenuItem();
        jMenuItemCargarTenista = new javax.swing.JMenuItem();
        jMenuItemGuardarTenista = new javax.swing.JMenuItem();
        jMenuItemCargarTorneos = new javax.swing.JMenuItem();
        jMenuItemGuardarTorneos = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuAnadir = new javax.swing.JMenu();
        jMenuItemAnadirTenista = new javax.swing.JMenuItem();
        jMenuItemAnadirTorneo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GesTenis");

        jPanelBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jLabelNombreTenista.setText("Nombre del tenista");

        javax.swing.GroupLayout jPanelBuscarLayout = new javax.swing.GroupLayout(jPanelBuscar);
        jPanelBuscar.setLayout(jPanelBuscarLayout);
        jPanelBuscarLayout.setHorizontalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNombreTenista)
                .addGap(27, 27, 27)
                .addComponent(jTextFieldBuscarTenista))
        );
        jPanelBuscarLayout.setVerticalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNombreTenista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBuscarTenista, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanelDatosTenista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Tenista", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jLabelNombre.setText("Nombre:");

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jLabelEdad.setText("Edad:");

        jLabelPuntuacion.setText("Puntuación ATP:");

        jLabel4Palmares.setText("Palmarés:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelDatosTenistaLayout = new javax.swing.GroupLayout(jPanelDatosTenista);
        jPanelDatosTenista.setLayout(jPanelDatosTenistaLayout);
        jPanelDatosTenistaLayout.setHorizontalGroup(
            jPanelDatosTenistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosTenistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosTenistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4Palmares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEdad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelPuntuacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDatosTenistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldEdad)
                    .addComponent(jTextFieldPuntuacion)
                    .addComponent(jComboBox1, 0, 380, Short.MAX_VALUE)))
        );
        jPanelDatosTenistaLayout.setVerticalGroup(
            jPanelDatosTenistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosTenistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosTenistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosTenistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosTenistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldPuntuacion, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabelPuntuacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosTenistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4Palmares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPalmares.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Añadir Palmarés", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jLabelTorneos.setText("Torneos");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonAnadir.setText("Añadir");
        jButtonAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPalmaresLayout = new javax.swing.GroupLayout(jPanelPalmares);
        jPanelPalmares.setLayout(jPanelPalmaresLayout);
        jPanelPalmaresLayout.setHorizontalGroup(
            jPanelPalmaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPalmaresLayout.createSequentialGroup()
                .addComponent(jLabelTorneos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButtonAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 68, Short.MAX_VALUE))
        );
        jPanelPalmaresLayout.setVerticalGroup(
            jPanelPalmaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPalmaresLayout.createSequentialGroup()
                .addGroup(jPanelPalmaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPalmaresLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPalmaresLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelTorneos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelPalmaresLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButtonAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuArchivo.setText("Archivo");

        jMenuItemInicializar.setText("Inicializar");
        jMenuArchivo.add(jMenuItemInicializar);

        jMenuItemCargarTenista.setText("Cargar Tenistas");
        jMenuItemCargarTenista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCargarTenistaActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemCargarTenista);

        jMenuItemGuardarTenista.setText("Guardar Tenistas");
        jMenuArchivo.add(jMenuItemGuardarTenista);

        jMenuItemCargarTorneos.setText("Cargar Torneos");
        jMenuArchivo.add(jMenuItemCargarTorneos);

        jMenuItemGuardarTorneos.setText("Guardar Torneos");
        jMenuArchivo.add(jMenuItemGuardarTorneos);

        jMenuItemSalir.setText("Salir");
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBarPrin.add(jMenuArchivo);

        jMenuAnadir.setText("Añadir");
        jMenuAnadir.setAlignmentX(1.4F);

        jMenuItemAnadirTenista.setText("Tenista");
        jMenuItemAnadirTenista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemAnadirTenistaMouseClicked(evt);
            }
        });
        jMenuItemAnadirTenista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAnadirTenistaActionPerformed(evt);
            }
        });
        jMenuAnadir.add(jMenuItemAnadirTenista);

        jMenuItemAnadirTorneo.setText("Torneo");
        jMenuItemAnadirTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAnadirTorneoActionPerformed(evt);
            }
        });
        jMenuAnadir.add(jMenuItemAnadirTorneo);

        jMenuBarPrin.add(jMenuAnadir);

        setJMenuBar(jMenuBarPrin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDatosTenista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPalmares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDatosTenista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPalmares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAnadirActionPerformed

    private void jMenuItemAnadirTenistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAnadirTenistaActionPerformed
        JDTenista vista = new JDTenista(this, rootPaneCheckingEnabled);
        vista.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItemAnadirTenistaActionPerformed

    private void jMenuItemAnadirTenistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemAnadirTenistaMouseClicked

     
       
    }//GEN-LAST:event_jMenuItemAnadirTenistaMouseClicked

    private void jMenuItemAnadirTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAnadirTorneoActionPerformed

        JDTorneo vista = new JDTorneo(this,rootPaneCheckingEnabled);
        vista.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemAnadirTorneoActionPerformed

    private void jMenuItemCargarTenistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCargarTenistaActionPerformed
        CargarTenistas ct = new CargarTenistas(this, true);
        ct.setVisible(true);
    }//GEN-LAST:event_jMenuItemCargarTenistaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameVistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameVistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameVistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameVistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameVistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnadir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel4Palmares;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombreTenista;
    private javax.swing.JLabel jLabelPuntuacion;
    private javax.swing.JLabel jLabelTorneos;
    private javax.swing.JMenu jMenuAnadir;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBarPrin;
    private javax.swing.JMenuItem jMenuItemAnadirTenista;
    private javax.swing.JMenuItem jMenuItemAnadirTorneo;
    private javax.swing.JMenuItem jMenuItemCargarTenista;
    private javax.swing.JMenuItem jMenuItemCargarTorneos;
    private javax.swing.JMenuItem jMenuItemGuardarTenista;
    private javax.swing.JMenuItem jMenuItemGuardarTorneos;
    private javax.swing.JMenuItem jMenuItemInicializar;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JPanel jPanelDatosTenista;
    private javax.swing.JPanel jPanelPalmares;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldBuscarTenista;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPuntuacion;
    // End of variables declaration//GEN-END:variables
}
