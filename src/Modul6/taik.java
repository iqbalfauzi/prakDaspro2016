/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6;

/**
 *
 * @author Undetected
 */
public class taik {
    public static void main(String[] args) {
        String kontak[][]={{"Fauzi","0899","Malang"},{"Iqbal","087","Malang"},{"Muhammad","0987","Malang"},{"Muslim","07689","malang"}};
            for (int i = 0; i < kontak.length; i++) {
                System.out.println("Nama : "+kontak[i][0]);
                System.out.println("Nomor : "+kontak[i][1]);
                System.out.println("Alamat : "+kontak[i][2]);
                System.out.println("========================");
        }
    }
}
