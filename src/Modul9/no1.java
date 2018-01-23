/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9;

public class no1 {
    public static void main(String[] args) {
        //no1
        int tabel[][]={{1,2,3,4},{5,6,7,8}};
        System.out.println("Jumlah baris : "+tabel.length);
        System.out.println("Jumlah baris : "+tabel[0].length);
        System.out.println();
        for (int i = 0; i < tabel.length; i++) {
            for (int j = 0; j < tabel[0].length; j++) {
                System.out.print(tabel[i][j]+" ");
            }System.out.println();
        }
        
        //no2
        System.out.println("\n=====================");
        int data[][]={{1,2,3,4},{5,6,7,8}};
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j]+" ");
            }System.out.print("\n");
        }
        
    }
    
}
