package Modul11;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
public class no1a extends JFrame{
    Button cb1=new Button("Pilih A");
    Button cb2=new Button("Pilih B");
    no1a(){
        setTitle("Program GUI Pertama");
        setLocation(200, 100);
        setSize(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void objek(){
     getContentPane().setLayout(new FlowLayout());
     getContentPane().setBackground(Color.GREEN);
     cb1.setBackground(Color.MAGENTA);
     getContentPane().add(cb1);
     getContentPane().add(cb2);
        setVisible(true);
    }
    public static void main(String[] args) {
        no1a n=new no1a();
        n.objek();
    }
}
