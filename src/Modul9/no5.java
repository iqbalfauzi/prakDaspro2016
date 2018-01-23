/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9;

/**
 *
 * @author Undetected
 */
public class no5 {

    public static void main(String[] args) {
        String mahasiswa[] = {"joni", "toni", "bekti", "rudi"};
        String matakuliah[] = {"daspro", "Rpl", "jarkom", "pcd"};
        int[][] nilai = {{70, 80, 50, 90}, {90, 40, 60, 40}, {50, 90, 40, 40}, {60, 80, 80, 40}};
        System.out.println("Data Penilaian Mahasiswa Teknik Informatika");
        System.out.println("======================================================");
        System.out.println("Nama\t|\tMatakuliah\t\t     | Huruf |");
        System.out.println("    \t----------------------------------------------");
        System.out.println("    \t Daspro | RPL | Jarkom | PCB | Rata2 | Huruf |");
        System.out.println("    \t----------------------------------------------");

        for (int a = 0; a < nilai.length; a++) {
            for (int b = 0; b < nilai[0].length; b++) {
                System.out.print(nilai[a][b] + "|");
            }
            System.out.print("\n");
        }

//        int c = 0;
//        if (c <= 55) {
//            System.out.println("Nilai C");
//        } else if (c <= 65) {
//            System.out.println("Nilai C+");
//        } else if (c <= 75) {
//            System.out.println("Nilai B");
//        } else if (c >= 85) {
//            System.out.println("Nilai B+");
//        }
//        System.out.println(nilai[0][c]);
    }
}
