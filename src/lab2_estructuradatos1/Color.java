/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_estructuradatos1;

import java.awt.Button;
import javax.swing.JButton;

/**
 *
 * @author Tuf H310plus-sd250
 */
public class Color extends javax.swing.JFrame {

    private String dir1, dir2, dir3;

    public Color() {
        initComponents();
        this.setLocation(500, 250);

    }

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerde = new javax.swing.JButton();
        btnRojo = new javax.swing.JButton();
        btnAmarillo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jugador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(null);

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
        getContentPane().add(btnVerde);
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
        getContentPane().add(btnRojo);
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
        getContentPane().add(btnAmarillo);
        btnAmarillo.setBounds(210, 110, 50, 70);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Seleccione su color, jugador:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 40, 270, 30);

        jugador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jugador.setText("1");
        jugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jugador);
        jugador.setBounds(300, 40, 53, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmarillo;
    private javax.swing.JButton btnRojo;
    private javax.swing.JButton btnVerde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jugador;
    // End of variables declaration//GEN-END:variables
}
