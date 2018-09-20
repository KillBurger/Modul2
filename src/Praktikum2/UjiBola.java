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
public class UjiBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bola bola = new Bola();
        bola.setR(40);
        System.out.println("Luas Bola");
        System.out.println();

        System.out.println("Jari-jari Bola adalah   : " + bola.getR());
        bola.getD();
        System.out.println("Diameter Bola adalah    : " + bola.getD());

        bola.getLP();
        System.out.println("Luas Permukaan Bola adalah:" + bola.getLP());

        bola.getV();
        System.out.println("Volume Bola adalah      : " + bola.getV());
    }

}
