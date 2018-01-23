/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;
import java.io.*;
public class no4 {
    public static void main(String[] args) {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int komisi=0;
        try{
            System.out.println("Program Pendapatan Salesman");
            System.out.println("===========================");
            System.out.print("Pendapatan hari ini = ");
            String pen=bf.readLine();
            int pendapatan=Integer.parseInt(pen);
            if(pendapatan<=2000000){
                System.out.println("uang jasa = 100000");
                komisi=pendapatan*10/100;
                System.out.println("uang komisi = "+komisi);
                System.out.println("Total Pendapatan = "+(00000+komisi));
            }else if((pendapatan>2000000)&&(pendapatan<=5000000)){
                System.out.println("uang jasa = 200000");
                komisi=pendapatan*15/100;
                System.out.println("uang komisi = "+komisi);
                System.out.println("Total Pendapatan = "+(200000+komisi));
                
            }else if(pendapatan>5000000){
                System.out.println("uang jasa = 300000");
                komisi=pendapatan*20/100;
                System.out.println("uang komisi = "+komisi);
                System.out.println("Total Pendapatan = "+(300000+komisi));
            }
        }catch(IOException e){
            System.out.println("Error "+e);
        }
    }
}
