/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_estructuradatos1;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author mateo
 */
public class Jugador {

    Toolkit t;
    Image img;
    int posicion;
    boolean win, carcel;
    VentanaJuego ventana;
    String nombre;
    String color;
    String dir;

    public Jugador(String dir, String nombre, int posInicial, VentanaJuego ventana) {
        this.dir = dir;
        setColor(dir);
        t = Toolkit.getDefaultToolkit();
        img = t.getImage(dir);
        this.nombre = nombre;
        this.posicion = posInicial;
        win = false;
        carcel = false;
        this.ventana = ventana;
    }

    public boolean isCarcel() {
        return carcel;
    }

    public void setCarcel(boolean carcel) {
        this.carcel = carcel;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Image getImg() {
        return img;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getDir() {
        return dir;
    }

    public void aumentarPosicion(int i, Jugador pasivo, Jugador pasivo2) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < i; j++) {
                    try {
                        // hacemos que el hilo duerma
                        Thread.sleep(700);
                        Jugador.this.posicion++;

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                if (win) {
                    ventana.addGanador(Jugador.this);
                    JOptionPane.showMessageDialog(null, "El jugador " + getNombre() + " ha ganado!");
                    setPosicion(30);
                } else {
                    ventana.Comparar(Jugador.this, pasivo, pasivo2);
                }
                ventana.mostrarJugActivo();
                ventana.getBtnTirar().setEnabled(true);
                ventana.ValidaFinJuego();
            }

        };
        Thread hilo = new Thread(runnable);
        hilo.start();
    }

    private void setColor(String dir) {
        if (dir.equals("src\\data_img\\ficha_verde.png")) {
            this.color = "Verde";
        } else if (dir.equals("src\\data_img\\ficha_amarilla.png")) {
            this.color = "Amarillo";
        } else {
            this.color = "Rojo";
        }
    }

}
