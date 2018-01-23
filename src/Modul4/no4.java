/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

import javax.swing.JOptionPane;
public class no4 {
        public static void main(String[] args) {
        String belanja=JOptionPane.showInputDialog("Masukkan Jumlah Belanja");
        int a=Integer.parseInt(belanja);
        int total_bayar=0;
        if(a>200000){
            total_bayar=a-(a*10/100);
            System.out.println("Total Bayar = "+total_bayar);
            JOptionPane.showMessageDialog(null, "Total bayar adalah "+total_bayar);
        }else{
            System.out.println("Total Bayar = "+a);
            JOptionPane.showMessageDialog(null, "Total bayar adalah "+a);
        }
    }
}
