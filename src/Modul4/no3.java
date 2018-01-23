/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;
import javax.swing.*;
public class no3 {
    public static void main(String[] args) {
        String menu=JOptionPane.showInputDialog("Pilih menu masakan berikut ini \n1.Sate\n2.Soto\n3.Tahu Campur\n4.Rendang");
        int a=Integer.parseInt(menu);
        switch(a){
            case 1:JOptionPane.showMessageDialog(null, "Anda Memilih soto");
            break;
            case 2:JOptionPane.showMessageDialog(null, "Anda Memilih sate");
            break;
            case 3:JOptionPane.showMessageDialog(null, "Anda Memilih Tahu Campur");
            break;
            case 4:JOptionPane.showMessageDialog(null, "Anda Memilih Rendang");
            break;
            default:JOptionPane.showMessageDialog(null, "Pilihan Tidak ada");
            break;
        }
    }
}
