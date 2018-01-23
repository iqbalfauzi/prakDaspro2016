/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8;

import javax.swing.*;

public class no1 {

    public static void main(String[] args) {
        //no1
//        int data[]={1,2,3,4,5,6};
//        System.out.println("Isi data anda adalah : ");
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i]+" ");
//        }System.out.println();

        //no2
//        double contoh []=new double[10];
//        for (int i = 0; i < 10; i++) {
//            contoh[i]=100.0*Math.random();
//        }
//        double ratarata=0.0;
//        for (int i = 0; i < 10; i++) {
//            ratarata+=contoh[i];
//            ratarata/=30;
//            System.out.println("Mean 10 bilangan random : "+ratarata);
//        }
        
        //no3
        int data[]=new int[5];
        for (int i = 0; i < data.length; i++) {
            String input=JOptionPane.showInputDialog("Masukkan Element indeks ke-"+i);
            data[i]=Integer.parseInt(input);
            System.out.println("indeks ke-"+i+" adalah "+data[i]);
        }
    }
}
