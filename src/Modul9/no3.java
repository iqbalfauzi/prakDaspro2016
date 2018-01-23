/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul9;

/**
 *
 * @author Undetected
 */
public class no3 {

    public static void main(String[] args) {
        String data[][] = {{"abdul", "09876", "malang"}, {"iqbal", "09876", "malang"}, {"fauzi", "0987", "malang"}};
        System.out.println("==========================================");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.format("| %s |\t", data[i][j]);
            }
            System.out.println("");
        }
        System.out.println("==========================================");

        //bisa dengan cara lain
        String data2[][] = {{"Abdul ", "\t08564666899   ", "\tkediri   "},
        {"Kusno", "\t085646668992", "\ttrenggalek"}, {"Poniran", "\t085646668999", "\tBojonegoro"}};
        System.out.println("Nama \t" + " Telepon \t" + "Alamat ");
        int a = 0;
        while (a < data.length) {
            System.out.print(data2[a][0]);
            System.out.print(data2[a][1]);
            System.out.println(data2[a][2]);
            a++;
        }
    }
}
