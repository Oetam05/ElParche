/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_estructuradatos1;

import java.awt.Color;

/**
 *
 * @author mateo
 */
class Nodo {
    
    int x;
    int y;
    int Ancho;
    int Alto;
    Nodo link;
    int casilla;
    Color color;

    public Nodo(int x, int y, int Ancho, int Alto, int casilla, Color color) {
        this.Ancho = Ancho;
        this.Alto = Alto;
        this.x = x;
        this.y = y;
        this.casilla = casilla;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAncho() {
        return Ancho;
    }

    public int getAlto() {
        return Alto;
    }

    public Color getColor() {
        return color;
    }

    public int getCasilla() {
        return casilla;
    }
    
    
    
    
}
