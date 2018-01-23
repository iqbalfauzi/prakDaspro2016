/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2;

/**
 *
 * @author Undetected
 */
public class no5 {
    public static void main(String[] args) {
        int gaji_kotor=1000;
        int konversi=9600;
        int potongan=(gaji_kotor*konversi)*10/100;
        int gaji_bersih=(gaji_kotor*konversi)-potongan;
        
        System.out.println("Gaji kotor = "+(gaji_kotor*konversi));
        System.out.println("Potongan = "+potongan);
        System.out.println("Gaji Bersih = "+gaji_bersih);
    }
}
