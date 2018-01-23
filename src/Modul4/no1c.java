/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;
import java.io.*;
public class no1c {
    public static void main(String[] args) {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String a="",b="",c="";
        try{
            System.out.print("A = ");
            a=bf.readLine();
            System.out.print("B = ");
            b=bf.readLine();
            System.out.print("C = ");
            c=bf.readLine();
            int aa=Integer.parseInt(a);
            int bb=Integer.parseInt(b);
            int cc=Integer.parseInt(c);
            int penjumlahan=aa+bb+cc;
            System.out.println("Penjumalahan = "+penjumlahan);
        }catch(IOException e){
            System.out.println("Error "+e);
        }
    }
}
