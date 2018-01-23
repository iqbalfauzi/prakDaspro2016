/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;
import javax.swing.*;
public class no2 {
    public static void main(String[] args) {
        String angka=JOptionPane.showInputDialog("Masukkan angka : ");
        int n=Integer.parseInt(angka);
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }System.out.println();
        }
    }
}
