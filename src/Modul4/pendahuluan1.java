/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;
import java.io.*;
public class pendahuluan1 {
    public static void main(String[] args) {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String name="";
        try{
            System.out.print("Silahkan masukkan data = ");
            name=bf.readLine();
            System.out.println("Data yang dimasukkan adalah "+name);
        }catch(IOException e){
            System.out.println("Error "+e);
        }
    }
}
