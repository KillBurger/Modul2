/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author WINDOWS 10
 */
public class Bus {

    public int penumpang;
    public int maxpenumpang;
    private double average;
    private double jmlhBerat, jmlhPenumpang;

    public Bus(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    //method Mutator
    public void addpenumpang(int penumpang) {
        int temp;
        temp = this.penumpang = penumpang;
        if (temp > maxpenumpang) {
            System.out.println("penumpang melebihi kuota!!!");
        } else {
            this.penumpang = temp;
        }
    }

    public void getpenumpang(int password) {
        if (password == 27) {
            System.out.println("Password benar");
        } else {
            System.out.println("Password salah");
        }
    }

    public void cetakpenumpang() {
        System.out.println("penumpang Bus sekarang = " + penumpang);
        System.out.println("Maksimum penumpang seharusnya = " + maxpenumpang);
    }

    public int getPenumpang() {
        return penumpang;
    }

    public void setPenumpang(int penumpang) {
        this.penumpang = penumpang;
    }

    public int getMaxpenumpang() {
        return maxpenumpang;
    }

    public void setMaxpenumpang(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
    }

    public double getAverage() {
        average = jmlhBerat / jmlhPenumpang;
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getJmlhBerat() {
        return jmlhBerat;
    }

    public void setJmlhBerat(double jmlhBerat) {
        this.jmlhBerat = jmlhBerat;
    }

    public double getJmlhPenumpang() {
        return jmlhPenumpang;
    }

    public void setJmlhPenumpang(double jmlhPenumpang) {
        this.jmlhPenumpang = jmlhPenumpang;
    }

}

