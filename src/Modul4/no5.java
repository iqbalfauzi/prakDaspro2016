/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;
import java.io.*;
import javax.swing.JOptionPane;
public class no5 {
    public static void main(String[] args) {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String pilih="";
        try{
            System.out.println("========================");
            System.out.println("Hitung Harga Rumah dan bangunan");
            System.out.print("Pilih tipe rumah\n1.Rumah tipe A\n2.Rumah tipe B\n>>>  ");
            pilih=bf.readLine();
            int pil=Integer.parseInt(pilih);
            String tanah="",bangunan="";
            int tnh=0,bangun=0;
            
            if(pil==1){
                System.out.println("Rumah Tipe A");
                System.out.print("Luas Tanah = ");
                tanah=bf.readLine();
                System.out.print("Luas Bangunan = ");
                bangunan=bf.readLine();
                tnh=Integer.parseInt(tanah);
                bangun=Integer.parseInt(bangunan);
                
                int harga_tanah=tnh*40000;
                int harga_bangunan=bangun*150000;
                int harga_tot=harga_tanah+harga_bangunan;
                System.out.println("Harga Tanah = "+harga_tanah);
                System.out.println("Harga Bangunan = "+harga_bangunan);
                System.out.println("Harga Total = "+harga_tot);
                System.out.println("=======================");
                System.out.println("Keuntungan Penjual");
                System.out.println("Keuntungan 10% = "+(harga_tot*10/100));
            }else if(pil==2){
                System.out.println("Rumah Tipe B");
                System.out.print("Luas Tanah = ");
                tanah=bf.readLine();
                System.out.print("Luas Bangunan = ");
                bangunan=bf.readLine();
                tnh=Integer.parseInt(tanah);
                bangun=Integer.parseInt(bangunan);
                
                int harga_tanah=tnh*50000;
                int harga_bangunan=bangun*200000;
                int harga_tot=harga_tanah+harga_bangunan;
                System.out.println("\nHarga Tanah = "+harga_tanah);
                System.out.println("Harga Bangunan = "+harga_bangunan);
                System.out.println("Harga Total = "+harga_tot);
                System.out.println("=======================");
                System.out.println("Keuntungan Penjual");
                System.out.println("Keuntungan 10% = "+(harga_tot*10/100));
            }else{
                JOptionPane.showMessageDialog(null,"pilihan tidak ada");
                System.out.println("Pilihan Tidak ada");
            }
            
        }catch(IOException e){
            System.out.println("Error "+e);
        }
    }
}
