package Modul9;
import javax.swing.*;
public class no2a {

    public static void main(String[] args) {
        int data[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.print("\n");
        }
        int e = 0, d = 0;
        while (e < data.length) {

            while (d < data[0].length) {
                System.out.print(data[e][d] + "|");
                d++;
            }
            e++;
        }
        System.out.println();
        int f = 0, g = 0;;
        do {
            do {
                System.out.print(data[f][g] + "|");
                g++;
            } while (g < data[0].length);
            System.out.println();
        } while (g < data[0].length);
        System.out.println();
        // for 
        for (int h = 0; h < data.length; h++) {
            for (int i = 0; i < data[0].length; i++) {
                System.out.print(data[h][i] + "||");

            }
            System.out.println();
        }

        String cari;
        cari = JOptionPane.showInputDialog("masukkan element");
        int a = Integer.parseInt(cari);
        for (int k = 0; k < data.length; k++) {
            for (int l = 0; l < data[0].length; l++) {
                if (data[k][l] == a) {
                    System.out.println(a + " terdapat pada baris-" + k + " pada kolom " + l);
                }
            }
        }
        String input;
        input = JOptionPane.showInputDialog("masukkan element yang akan diganti");
        int b = Integer.parseInt(input);
        for (int k = 0; k < data.length; k++) {
            for (int l = 0; l < data[0].length; l++) {
            }
        }
    }
}
