/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6;

/**
 *
 * @author Undetected
 */
public class no2 {

    public static void main(String[] args) {
        //noA
//        int pertama = 1, kedua = 1, result;
//        for (int i = 1; i <= 3; i++) {
//            pertama = pertama * 4;
//        }
//        for (int a = 1; a <= 2; a++) {
//            kedua = kedua * 5;
//        }
//        result = pertama + kedua;
//        System.out.println("4^3 + 5^2\n= "+pertama+" + "+kedua+"\n= "+result);

        //noB
//        int pertama = 1;
//        int kedua = 1;
//        for (int i = 1; i <= 5; i++) {
//            pertama *= i;
//        }
//        for (int j = 1; j <= 4; j++) {
//            kedua *= j;
//        }
//        System.out.println("5!+4!\n= " + pertama + "+" + kedua + "\n= " + (pertama + kedua));
        
        //noC
        int a=1,b=1,c=1, result;
        for (int i = 1; i <=2; i++) {
            a=a*4;
        }
        for (int i = 1; i <=1; i++) {
            b=b*5;
        }
        for (int i = 1; i <=2; i++) {
            c=c*4;
        }
        System.out.println("Hasil dari perhitungan adalah = "+((a+b)/5)+c);
    }
}
