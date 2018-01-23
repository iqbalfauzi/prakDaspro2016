/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

import javax.swing.*;

public class no1b {

    public static void main(String[] args) {
        String pilihan = JOptionPane.showInputDialog("Pilih Hp kesukaan kamu\n1. Asus\n2.Samsung");
        switch (pilihan) {
            case "1":
                System.out.println("Pilihan kamu Asus");
                break;
            case "2":
                System.out.println("Pilihan kamu Samsung");
                break;
            default:
                System.out.println("Masukkan pilihan dengan benar");
                break;
        }
        System.exit(0);
    }
}
