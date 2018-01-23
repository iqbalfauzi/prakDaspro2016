/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

public class no1 {
    public static void main(String[] args) {
        int a=10,b=12,c=9,e=2,f=9,n=90;
        int hasil,jumlah=0;
        boolean cek,tes=false;
        String lulus="";
        
        //Proses operator Aritmatika
        System.out.println("Aritmatika\n"+(a+b)+"\n"+(a-b)+"\n"+(a/b)+"\n"+(a*b)+"\n"+(a%e));
        //Proses operator Relasi
        System.out.println("\nRelasi\n"+(b>c)+"\n"+(b>=c)+"\n"+(b<c)+"\n"+(b<=c)+"\n"+(b==c)+"\n"+(b!=c));
        //Proses operator Increment dan Decrement
        System.out.println("\nIncrement dan Decrement\n"+(++a)+"\n"+(--a)+"\n"+(a++)+"\n"+(a--)+"\n"+(a));
        //Proses operator Logika
        System.out.println("\nLogika\n"+((a>b)||(c==f))+"\n"+((a==b)&(b==++f))+"\n"+((b>a)^(f==--a)));
        //Proses operator Kondisi
        System.out.println("\nLogika\n"+((n>=60)?"Lulus":"Ngulang"));
    }
}
