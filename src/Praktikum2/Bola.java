/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author WINDOWS 10
 */
public class Bola {
    private double r, D, LP, V;

    public double getR() {
        r = 40;
        return r;
    }

    public double getD() {
        D =  r + r;
        return D;
    }

    public double getLP() {
        LP = 4*3.14*r*r;
        return LP;
    }

    public double getV() {
        V = (4*3.14*r*r*r)/3;
        return V;
    }

    public void setR(double r) {
        this.r = r;
    }
    
}
