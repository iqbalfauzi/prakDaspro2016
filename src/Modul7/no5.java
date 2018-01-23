/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

public class no5 {

    public static void main(String[] args) {
        String names[] = {"joko", "Bhekti", "Hendi", "Prasekti"};
        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals("Bhekti")) {
                System.out.println(names[i]);
                continue;
            }
        }
        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals("Bhekti")) {
                System.out.println("====================");
                System.out.println(names[i]);
                System.out.println("====================");
                break;
            }
        }
        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals("Bhekti")) {
                System.out.println(names[i]);
                continue;
            }
        }
    }
}
