package com.ventanas;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFrame;

/**
 *
 * @author dainer
 */
public class VentanaOpciones extends javax.swing.JDialog {

    private VentanaJuego frame; 
    private String jugador1, jugador2;
    private int vecesGano1, vecesGano2, vecesEmpate;
    
    /**
     * Creates new form VentanaOpciones
     */
    public VentanaOpciones(java.awt.Frame parent, boolean modal, String jugador1, String jugador2, int vecesGano1, int vecesGano2, int vecesEmpate) {
        super(parent, modal);
        
        this.frame = (VentanaJuego)parent;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.vecesGano1 = vecesGano1;
        this.vecesGano2 = vecesGano2;
        this.vecesEmpate = vecesEmpate;
        
        initComponents();
        
        this.setLocationRelativeTo(null);
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
        lblCerrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnReiniciar = new javax.swing.JButton();
        btnResultados = new javax.swing.JButton();
        btnGitHub = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCerrar.setFont(new java.awt.Font("Harrington", 0, 55)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(255, 0, 0));
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("•");
        lblCerrar.setToolTipText("");
        lblCerrar.setFocusable(false);
        lblCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCerrar.setMaximumSize(new java.awt.Dimension(22, 35));
        lblCerrar.setMinimumSize(new java.awt.Dimension(22, 35));
        lblCerrar.setPreferredSize(new java.awt.Dimension(22, 35));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCerrarMousePressed(evt);
            }
        });
        jPanel1.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new java.awt.GridLayout(2, 2));

        btnReiniciar.setBackground(new java.awt.Color(51, 51, 51));
        btnReiniciar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnReiniciar.setContentAreaFilled(false);
        btnReiniciar.setFocusPainted(false);
        btnReiniciar.setFocusable(false);
        btnReiniciar.setMaximumSize(new java.awt.Dimension(72, 70));
        btnReiniciar.setMinimumSize(new java.awt.Dimension(72, 70));
        btnReiniciar.setPreferredSize(new java.awt.Dimension(72, 70));
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        jPanel2.add(btnReiniciar);

        btnResultados.setBackground(new java.awt.Color(51, 51, 51));
        btnResultados.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnResultados.setForeground(new java.awt.Color(255, 255, 255));
        btnResultados.setText("Tabla de resultados");
        btnResultados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnResultados.setContentAreaFilled(false);
        btnResultados.setFocusPainted(false);
        btnResultados.setFocusable(false);
        btnResultados.setMaximumSize(new java.awt.Dimension(72, 70));
        btnResultados.setMinimumSize(new java.awt.Dimension(72, 70));
        btnResultados.setPreferredSize(new java.awt.Dimension(72, 70));
        btnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadosActionPerformed(evt);
            }
        });
        jPanel2.add(btnResultados);

        btnGitHub.setBackground(new java.awt.Color(51, 51, 51));
        btnGitHub.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGitHub.setForeground(new java.awt.Color(255, 255, 255));
        btnGitHub.setText("Resopitorio GitHub");
        btnGitHub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnGitHub.setContentAreaFilled(false);
        btnGitHub.setFocusPainted(false);
        btnGitHub.setFocusable(false);
        btnGitHub.setMaximumSize(new java.awt.Dimension(72, 70));
        btnGitHub.setMinimumSize(new java.awt.Dimension(72, 70));
        btnGitHub.setPreferredSize(new java.awt.Dimension(72, 70));
        btnGitHub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGitHubActionPerformed(evt);
            }
        });
        jPanel2.add(btnGitHub);

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnSalir.setContentAreaFilled(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setFocusable(false);
        btnSalir.setMaximumSize(new java.awt.Dimension(72, 70));
        btnSalir.setMinimumSize(new java.awt.Dimension(72, 70));
        btnSalir.setPreferredSize(new java.awt.Dimension(72, 70));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMousePressed
        this.dispose();
    }//GEN-LAST:event_lblCerrarMousePressed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        frame.reiniciarPuntos();
        frame.reiniciarJuego();
        
        this.dispose();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadosActionPerformed
        VentanaMostrarResultados vmr = new VentanaMostrarResultados(frame, true, this.jugador1, this.jugador2, this.vecesGano1, this.vecesGano2, this.vecesEmpate);
        vmr.setVisible(true);
    }//GEN-LAST:event_btnResultadosActionPerformed

    private void btnGitHubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGitHubActionPerformed
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/dainercortes/tic-tac-toe"));
            } catch (IOException ex) {
                //Logger.getLogger(VentanaJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(VentanaJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGitHubActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        FiveCodMover.FiveCodMoverJDialog.MousePressed(evt);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        FiveCodMover.FiveCodMoverJDialog.MouseDraggedJDialog(evt, this);
    }//GEN-LAST:event_formMouseDragged

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
            java.util.logging.Logger.getLogger(VentanaOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaOpciones dialog = new VentanaOpciones(new javax.swing.JFrame(), true, null, null, 0, 0, 0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGitHub;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnResultados;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCerrar;
    // End of variables declaration//GEN-END:variables

}
