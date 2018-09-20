/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus3;

/**
 *
 * @author WINDOWS 10
 */
public class UjiBus3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bus3 Bus = new Bus3(5);
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
    }

}
