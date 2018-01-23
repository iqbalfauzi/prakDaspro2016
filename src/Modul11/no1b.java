package Modul11;

import java.awt.Checkbox;
import java.awt.Color;
import javax.swing.JFrame;

public class no1b extends JFrame{
    Checkbox cb1=new Checkbox("Pilih A");
    Checkbox cb2=new Checkbox("Pilih B");
    Checkbox cb3=new Checkbox("Pilih C");
    no1b(){
        setTitle("Program GUI");
        setLocation(200, 100);
        setSize(400,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek(){
        getContentPane().setLayout(null);
        getContentPane().setBackground(Color.GREEN);
        getContentPane().add(cb1);
        getContentPane().add(cb2);
        getContentPane().add(cb3);
        cb1.setBounds(30,90,150,20);
        cb2.setBounds(30,120,150,20);
        cb3.setBounds(30,150,150,20);
        setVisible(true);
    }
    public static void main(String[] args) {
        no1b n=new no1b();
        n.objek();
    }
}
