/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8;

import javax.swing.*;

public class no2 {

    public static void main(String[] args) {
//        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int terendah = data.length;
//        int tertinggi = 0;
//        int a, indexMax = 0, indexMin = 0, rata2 = 0, total = 0;
//        for (a = 0; a < data.length; a++) {
//            System.out.println("indeks ke   " + a + "  adalah   " + data[a]);
//        }
//        for (a = 0; a < data.length; a++) {
//            if (data[a] < terendah) {
//                terendah = data[a];
//                indexMin = a;
//            } else if (data[a] > tertinggi) {
//                tertinggi = data[a];
//                indexMax = a;
//            }
//            total = total + data[a];
//        }
//
//        rata2 = total / data.length;
//        System.out.println();
//        System.out.println("Nilai tertinggi " + tertinggi + " pada indeks " + indexMax);
//        System.out.println("Nilai terendah " + terendah + " pada indeks " + indexMin);
//        System.out.println("Nilai rata-rata  " + rata2);

//dengan cara lain bisa menggunakan ini
//        int data[] = new int[4];
//        int nmax = 0, nmin = 1000, jum = 0, rata = 0, pos = 0, poss = 0;
//        for (int a = 0; a < data.length; a++) {
//            data[a] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Elemen Index Ke " + a));
//            System.out.println("Index Ke " + a + " Adalah " + data[a]);
//            if (nmax < data[a]) {
//                nmax = data[a];
//                pos = a;
//            }
//            if (nmin > data[a]) {
//                nmin = data[a];
//                poss = a;
//            }
//            rata = (jum += data[a]) / data.length;
//        }
//        System.out.println("\n============================================");
//        System.out.println("Nilai Maksimal\t= " + nmax + " Index Ke " + pos);
//        System.out.println("Nilai Minimal\t= " + nmin + " Index Ke " + poss);
//        System.out.println("Rata-rata\t= " + rata);
//
//        String question = JOptionPane.showInputDialog("Apakah anda ingin mengubah element data array?\nJika Ya, masukkan y");
//        if (question.equalsIgnoreCase("y")) {
//            String x = JOptionPane.showInputDialog("Masukkan index element yang akan diganti(0-9)");
//            int cari = Integer.parseInt(x);
//            String y = JOptionPane.showInputDialog("Masukkan element pengganti");
//            int ganti = Integer.parseInt(y);
//            System.out.println("===================");
//            data[cari] = ganti;
//            for (int i = 0; i < data.length; i++) {
//                System.out.println("Index ke-" + i + " adalah " + data[i]);
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Kode yang anda masukkan tidak ada");
//        }

        //Luthfi
        int data[] = new int[10];
        for (int a = 0; a < data.length; a++) {
            data[a] = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Elemen Index Ke " + a));
        }
        System.out.println("\n========= Data Awal =========\n");
        for (int a = 0; a < data.length; a++) {
            System.out.println("data[" + a + "]=" + data[a]);
        }
        int cari = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Index Yang Akan Diubah "));
        boolean ketemu = false;
        int hasil = 0;

        for (int a = 0; a < data.length; a++) {
            if (a == cari) {
                ketemu = true;
                hasil = a;
                break;
            }
        }
        if (ketemu == true) {
            System.out.println("\n========= Data Setelah Diubah =========\n");
            for (int i = 0; i < data.length; i++) {
                if (i == hasil) {
                    int input = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Data Baru "));
                    data[i] = input;
                }
                System.out.println("data[" + i + "]=" + data[i]);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ketemu");
        }
    }
}

