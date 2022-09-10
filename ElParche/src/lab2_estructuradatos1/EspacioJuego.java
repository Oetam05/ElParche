/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_estructuradatos1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author mateo
 */
public class EspacioJuego extends JPanel {

    private VentanaJuego ventana;
    Nodo ptr;
    Jugador jug1;
    Jugador jug2;
    Jugador jug3;

    public EspacioJuego(VentanaJuego ventana, String dir1, String dir2, String dir3) {
        this.ventana = ventana;
        ptr = null;
        generarLista();
        jug1 = new Jugador(dir1, "1", 0, this.ventana);
        jug2 = new Jugador(dir2, "2", 0, this.ventana);
        jug3 = new Jugador(dir3, "3", 0, this.ventana);
        this.setBackground(Color.decode("#fb3640"));
    }

    public Jugador getJug1() {
        return jug1;
    }

    public Jugador getJug2() {
        return jug2;
    }

    public Jugador getJug3() {
        return jug3;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Nodo p = ptr;
        Nodo antp = p;
        do {

            if (p == ptr) {
                g.setColor(Color.decode("#44a339"));
            } else {
                g.setColor(p.getColor());
            }
            g.fillRect(p.getX(), p.getY(), p.getAncho(), p.getAlto());
            if (p.getCasilla() == jug1.getPosicion()) {
                if (antp.link == p) {

                }
                g.drawImage(jug1.getImg(), p.getX() - 12, p.getY(), 64, 64, this);
            }
            if (p.getCasilla() == jug2.getPosicion()) {
                g.drawImage(jug2.getImg(), p.getX() + 28, p.getY(), 64, 64, this);
            }
            if (p.getCasilla() == jug3.getPosicion()) {
                g.drawImage(jug3.getImg(), p.getX() + 68, p.getY(), 64, 64, this);
            }
            antp = p;
            p = p.link;
        } while (p != ptr);

        repaint();
    }

    public void generarLista() { //se crea la lista enlazada circular con las conexiones deseadas entre los nodos
        int casilla = 0;
        for (int i = 0; i <= 5; i++) {

            if (i == 0) {
                for (int j = 0; j <= 4; j++) {

                    if (casilla % 2 == 0) {
                        agregar(40 + 140 * j, 34 + 100 * i, 118, 72, casilla++, Color.decode("#F8F5F1"));
                    } else {
                        agregar(40 + 140 * j, 34 + 100 * i, 118, 72, casilla++, Color.decode("#000000"));
                    }

                }
            } else {

                if (i % 2 == 0) { // Ascendente en pares
                    for (int j = 1; j <= 4; j++) {
                        if (casilla % 2 == 0) {
                            agregar(40 + 140 * j, 34 + 100 * i, 118, 72, casilla++, Color.decode("#F8F5F1"));
                        } else {
                            agregar(40 + 140 * j, 34 + 100 * i, 118, 72, casilla++, Color.decode("#000000"));
                        }
                    }

                } else { // Descendente en impares
                    for (int j = 4; j > 0; j--) {
                        if (casilla % 2 == 0) {
                            agregar(40 + 140 * j, 34 + 100 * i, 118, 72, casilla++, Color.decode("#F8F5F1"));
                        } else {
                            agregar(40 + 140 * j, 34 + 100 * i, 118, 72, casilla++, Color.decode("#000000"));
                        }
                        if (i == 5 && j - 1 == 0) {
                            j = 0;
                            for (int k = 5; k > 0; k--) { //Desde la primera columna y ultima fila aumenta hacia arriba
                                if (k % 2 == 0) {
                                    agregar(40 + 140 * j, 34 + 100 * k, 118, 72, casilla++, Color.decode("#F8F5F1"));
                                } else {
                                    agregar(40 + 140 * j, 34 + 100 * k, 118, 72, casilla++, Color.decode("#000000"));
                                }
                            }
                        }
                    }

                }
            }
        }
    }

    public void agregar(int x, int y, int Ancho, int Alto, int casilla, Color color) {
        Nodo p = ptr;
        Nodo q = new Nodo(x, y, Ancho, Alto, casilla, color);
        if (ptr == null) {
            ptr = q;
            q.link = ptr;
        } else {
            while (p.link != ptr) {
                p = p.link;
            }
            p.link = q;
            q.link = ptr;
        }
    }

}
