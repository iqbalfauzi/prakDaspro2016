package Modul6;
import javax.swing.*;
public class no7 {
    public static void main(String[] args) {
    String angka=JOptionPane.showInputDialog("Masukkan angka :");
    int n=Integer.parseInt(angka);
        
          //bintang 1
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //bintang 2
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");
//            }
//            for (int j = n; j >=i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = n; k >=i; k--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //bintang 3
        for (int i = 1; i <=n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print("*");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print(" ");
            }
            for (int j = n; j >=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
