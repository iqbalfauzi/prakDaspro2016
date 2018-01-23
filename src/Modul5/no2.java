/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

import javax.swing.JOptionPane;

/**
 *
 * @author Undetected
 */
public class no2 {
        public static void main(String[] args) {
        String nilai = JOptionPane.showInputDialog("Masukkan nilai");
        int konv=Integer.parseInt(nilai);
        if(konv>90){
            System.out.println("Nilai A\nAnda Luar Biasa");
        }else if((konv>80)&&(konv<=90)){
            System.out.println("Nilai B\nOke Juga");
        }else if((konv>60)&&(konv<=80)){
            System.out.println("Nilai C\nHarus Banyak belajar");
        }else if(konv<60){
            System.out.println("Nilai D\nKemana Aja Nih??");
        }
    }
}
