/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

import javax.swing.JOptionPane;

public class no4a {

    public static void main(String[] args) {

        //Nomor 1
        String angka = JOptionPane.showInputDialog("Masukkan angka :");
        int n = Integer.parseInt(angka);
        for (int i = 1; i <=n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("*");
            }
            for (int m = 1; m <=i-1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        

        //nomor 2
//        String angka = JOptionPane.showInputDialog("Masukkan angka :");
//        int n = Integer.parseInt(angka);
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = n; k >=i; k--) {
//                System.out.print("*");
//            }
//            for (int m = n-1; m >=i; m--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
