/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8;

import javax.swing.*;
import java.util.*;

public class no3 {

    public static void main(String[] args) {
//        //a
//        String input = JOptionPane.showInputDialog("Masukkan jumlah element yang diinginkan");
//        int panjang = Integer.parseInt(input);
//        int data[] = new int[panjang];
//        //b
//
//        for (int a = 0; a < data.length; a++) {
//            String inputan = JOptionPane.showInputDialog("Masukkan element pada index ke " + a);
//            data[a] = Integer.parseInt(inputan);
//            System.out.println("Index ke " + a + " = " + data[a]);
//        }
//        //c
//        int max = data[0];
//        int min = data[0];
//        int posmax = 0;
//        int posmin = 0;
//        for (int i = 1; i < data.length; i++) {
//            if (data[i] > max) {
//                max = data[i];
//                posmax = i;
//            }
//            if (data[i] < min) {
//                min = data[i];
//                posmin = i;
//            }
//        }
//        System.out.println("Nilai Maksimum = " + max + " terletak pada indeks ke " + posmax);
//        System.out.println("Nilai Minimum = " + min + " terletak pada indeks ke " + posmin);
//        //d
//        int jumlah = 0;
//        for (int i = 0; i < data.length; i++) {
//            jumlah = jumlah + data[i];
//        }
//        int rata2 = jumlah / panjang;
//        System.out.println("Jumlah data pada array = " + jumlah);
//        System.out.println("Nilai rata-rata = " + rata2);
//        //e

        //Luthfi
        int jum = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Elemen "));
        int data[] = new int[jum];
        int nmax = 0, nmin = 1000, jums = 0, rata = 0, pos = 0, poss = 0, jumlah = 0, hasil, das, jumm = 0;
        boolean as = true;
        System.out.println("Jumlah Elemen = " + jum);
        for (int a = 0; a < data.length; a++) {
            data[a] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Elemen Index Ke " + a));
            System.out.println(data[a]);
            jumm = (jums += data[a]) / 2;
            rata = ((jums += data[a]) / 2) / data.length;
            if (nmax < data[a]) {
                nmax = data[a];
                pos = a;
            }
            if (nmin > data[a]) {
                nmin = data[a];
                poss = a;
            }

            if (a % 2 == 0) {
                continue;
            } else {
                jumlah += data[a];
            }
        }

        System.out.println("\nNilai Maksimal = " + nmax + " Index Ke " + pos);
        System.out.println("Nilai Minimal = " + nmin + " Index Ke " + poss);
        System.out.println("Jumlah Nilai = " + jums);
        System.out.println("Nilai Rata-Rata = " + rata);
        System.out.println("Jumlah Nilai Index Ganjil = " + jumlah);

        System.out.println("\n======== Data Setelah Diurutkan ========");
        for (int j = 1; j < data.length; j++) {
            for (int d = 0; d < data.length - j; d++) {
                if (data[d] > data[d + 1]) {
                    das = d;
                    d = d + 1;
                    d = das;
                    hasil = data[d];
                    data[d] = data[d + 1];
                    data[d + 1] = hasil;
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
