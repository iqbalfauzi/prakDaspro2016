/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;
import javax.swing.*;
public class no1b {
    public static void main(String[] args) {
        int nilai=1;
        String input=JOptionPane.showInputDialog("Input data");
        int data=Integer.parseInt(input);
        if(data==0||data==1){
            nilai=1;
        }else{
            for (int i = 1; i <=data; i++) {
                nilai*=i;
            }
        }System.out.println("Nilai dari "+data+"! adalah "+nilai);
        System.exit(0);
    }
}
