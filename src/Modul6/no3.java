/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6;
import javax.swing.*;
public class no3 {
    public static void main(String[] args) {
       String input=JOptionPane.showInputDialog("Masukkan angka : ");
       int inputan=Integer.parseInt(input);
       System.out.println("Angka yang anda masukkan adalah : "+inputan);
       if(inputan%2==0){
           System.out.println("Angka "+inputan+" adalah angka genap");
       }else{
           System.out.println("Angka "+inputan+" adalah angka ganjil");
       }
    }
}
