/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class no1 extends JFrame {

    JTextArea nama = new JTextArea(10, 10);
    JButton bt = new JButton("Copy");
    JTextArea txname = new JTextArea(10, 10);

    no1() {
        super("Coba Event");
        setLocation(200, 300);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void tampilan() {
        getContentPane().add(nama);
        nama.append("Nama Kamu Siapa?");
        getContentPane().add(bt);
        getContentPane().add(txname);
        txname.setBackground(Color.LIGHT_GRAY);
        getContentPane().setLayout(new FlowLayout());
        setVisible(true);
    }
    void aksi(){
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                txname.append(nama.getSelectedText());
            }
        });
    }
    public static void main(String[] args) {
        no1 n=new no1();
        n.tampilan();
        n.aksi();
    }
}