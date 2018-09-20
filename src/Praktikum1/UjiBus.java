/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Password!!!: ");
        int password = scan.nextInt();
        Bus Bus = new Bus(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(27);
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang(1);
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
        
        Bus.setJmlhBerat(17);
        Bus.setJmlhPenumpang(20);
        Bus.getAverage();
        System.out.println("rata-rata berat penumpang : "+Bus.getAverage());
    }
    
}
