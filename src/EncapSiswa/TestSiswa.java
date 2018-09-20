/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncapSiswa;

/**
 *
 * @author WINDOWS 10
 */
public class TestSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Muhammad Yusuf Ragil Syah An Naas");
        siswa.setAbsen(23);
        siswa.setAddress("Jl. Danau Towuti 2");

        System.out.println("Nama    :" + siswa.getName());
        System.out.println("Absen   : " + siswa.getAbsen());
        System.out.println("Alamat  : " + siswa.getAddress());
    }

}
