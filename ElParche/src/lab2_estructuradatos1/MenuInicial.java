/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_estructuradatos1;

import javax.swing.JButton;

/**
 *
 * @author mateo
 */
public class MenuInicial extends javax.swing.JFrame {

    private String dir1, dir2, dir3;
    public MenuInicial() {
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

        SeleccionColor = new javax.swing.JDialog(this, true);
        jLabel2 = new javax.swing.JLabel();
        jugador = new javax.swing.JLabel();
        btnVerde = new javax.swing.JButton();
        btnRojo = new javax.swing.JButton();
        btnAmarillo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        SeleccionColor.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        SeleccionColor.setTitle("Selección de colores");
        SeleccionColor.setLocation(new java.awt.Point(500, 250));
        SeleccionColor.setMinimumSize(new java.awt.Dimension(400, 300));
        SeleccionColor.setResizable(false);
        SeleccionColor.getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 19)); // NOI18N
        jLabel2.setText("Seleccione su color, jugador:");
        SeleccionColor.getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 40, 300, 30);

        jugador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jugador.setText("1");
        jugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SeleccionColor.getContentPane().add(jugador);
        jugador.setBounds(300, 40, 53, 30);

        btnVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data_img/ficha_verde.png"))); // NOI18N
        btnVerde.setBorder(null);
        btnVerde.setContentAreaFilled(false);
        btnVerde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerde.setFocusable(false);
        btnVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerdeActionPerformed(evt);
            }
        });
        SeleccionColor.getContentPane().add(btnVerde);
        btnVerde.setBounds(110, 110, 50, 70);

        btnRojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data_img/ficha_roja.png"))); // NOI18N
        btnRojo.setBorder(null);
        btnRojo.setContentAreaFilled(false);
        btnRojo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRojo.setFocusable(false);
        btnRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRojoActionPerformed(evt);
            }
        });
        SeleccionColor.getContentPane().add(btnRojo);
        btnRojo.setBounds(160, 110, 50, 70);

        btnAmarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data_img/ficha_amarilla.png"))); // NOI18N
        btnAmarillo.setBorder(null);
        btnAmarillo.setContentAreaFilled(false);
        btnAmarillo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAmarillo.setFocusable(false);
        btnAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmarilloActionPerformed(evt);
            }
        });
        SeleccionColor.getContentPane().add(btnAmarillo);
        btnAmarillo.setBounds(210, 110, 50, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data_img/fondoAmar.png"))); // NOI18N
        SeleccionColor.getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 400, 300);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("El Parche");
        setMinimumSize(new java.awt.Dimension(1000, 563));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data_img/btnJugar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 260, 210, 80);

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data_img/FondoInicio.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 563);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String SetColor(String Color) {
        String dir = "";
        if (Color.equals("Verde")) {
            return dir = "src\\data_img\\ficha_verde.png";

        } else if (Color.equals("Amarillo")) {
            return dir = "src\\data_img\\ficha_amarilla.png";
        } else {
            return dir = "src\\data_img\\ficha_roja.png";
        }

    }
    
    private void Seleccionar(JButton color, int jugador, String Color) {
        switch (jugador) {
            case 1:
                dir1 = SetColor(Color);
                break;
            case 2:
                dir2 = SetColor(Color);
                break;
            case 3:
                dir3 = SetColor(Color);
                break;
        }
        jugador++;
        this.jugador.setText(String.valueOf(jugador));
        color.setEnabled(false);
    }
    
    
    private void btnVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerdeActionPerformed

        Seleccionar(btnVerde, Integer.parseInt(this.jugador.getText()), "Verde");
        int jugador = Integer.parseInt(this.jugador.getText());
        if (jugador == 4) {
            this.dispose();
            VentanaJuego a = new VentanaJuego(dir1, dir2, dir3);
            a.setVisible(true);
        }
    }//GEN-LAST:event_btnVerdeActionPerformed

    private void btnRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRojoActionPerformed
        Seleccionar(btnRojo, Integer.parseInt(this.jugador.getText()), "Rojo");
        int jugador = Integer.parseInt(this.jugador.getText());
        if (jugador == 4) {
            this.dispose();
            VentanaJuego a = new VentanaJuego(dir1, dir2, dir3);
            a.setVisible(true);
        }
    }//GEN-LAST:event_btnRojoActionPerformed

    private void btnAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmarilloActionPerformed
        Seleccionar(btnAmarillo, Integer.parseInt(this.jugador.getText()), "Amarillo");
        int jugador = Integer.parseInt(this.jugador.getText());
        if (jugador == 4) {
            this.dispose();
            VentanaJuego a = new VentanaJuego(dir1, dir2, dir3);
            a.setVisible(true);
        }
    }//GEN-LAST:event_btnAmarilloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SeleccionColor.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog SeleccionColor;
    private javax.swing.JButton btnAmarillo;
    private javax.swing.JButton btnRojo;
    private javax.swing.JButton btnVerde;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jugador;
    // End of variables declaration//GEN-END:variables
}
