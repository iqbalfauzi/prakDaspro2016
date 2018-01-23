/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10;

/**
 *
 * @author Undetected
 */
public class readno1 {
    public static void main(String[] args) {
        System.out.print("data1 = ");
        no1 no1=new no1();
        int data1=no1.readInt();
        System.out.print("data2 = ");
        int data2=no1.readInt();
        
        int data3=data1+data2;
        System.out.println("data1 + data2 = "+data3);
        
        
        System.out.print("Masukkan diameter : ");
        String pertama=no1.readString();
    }
}
