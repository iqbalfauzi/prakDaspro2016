package Modul5;
import javax.swing.*;
public class no1a {
    public static void main(String[] args) {
        String input=JOptionPane.showInputDialog("Nilai Anda?");
        int nilai=Integer.parseInt(input);String grade="";
        if(nilai>85){
            grade="A";
        }else if(nilai>75){
            grade="B";
        }else{
            grade="E";
        }
        System.out.println("Nilai anda : "+nilai);
        System.out.println("Grade Anda : "+grade);
        System.exit(0);
    }
}
