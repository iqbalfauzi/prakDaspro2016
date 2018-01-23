package Modul5;
import java.io.*;
public class no5 {
     public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a = "", b = "", c = "",d="";
        double pensil = 0, pulpen = 0, buku = 0,total_bayar_disc=0,total_bayar=0;
        int jumlahItem = 0;
        int book = 0;
        System.out.println("Data Barang Dagangan");
        System.out.println("====================");
        System.out.println("1. Pensil 2B = @Rp.12.0000");
        System.out.println("2. Pulpen = @Rp.15.0000");
        System.out.println("3. Buku Tulis = @Rp.25.0000");
        System.out.println("Silahkan Pesan\n");

        try {
            System.out.print("Beli Pensil 2B ? Y atau N  ");
            a = bf.readLine();
            if (a.equalsIgnoreCase("Y")) {
                System.out.print("Jumlahnya = ");
//                a = bf.readLine();
                d = bf.readLine();
                pensil = Double.parseDouble(d) * 12000;
                jumlahItem++;
            } else {
                System.out.println("Tidak Beli Pensil");
            }
            //puplen
            System.out.print("Beli Pulpen ? Y atau N  ");
            a = bf.readLine();
            if (a.equalsIgnoreCase("Y")) {
                System.out.print("Jumlahnya = ");
                b = bf.readLine();
                pulpen = Double.parseDouble(b) * 15000;
                jumlahItem++;
            } else {
                System.out.println("Tidak Beli Pulpen");
            }
            //Buku Tulis
            System.out.print("Beli Buku Tulis? Y atau N  ");
            a = bf.readLine();
            if (a.equalsIgnoreCase("Y")) {
                System.out.print("Jumlahnya = ");
                c = bf.readLine();
                book = Integer.parseInt(c);
                buku = Double.parseDouble(c) * 25000;
                jumlahItem++;
            } else {
                System.out.println("Tidak Beli Buku Tulis");
            }

            System.out.println("Beli Pensil: " + d + " Buah, Harga = " + pensil);
            System.out.println("Beli Pulpen: " + b + " Buah, Harga = " + pulpen);
            System.out.println("Beli Buku: " + c + " Buah, Buku = " + buku);
            double total_harga = pensil + pulpen + buku;
            System.out.println("Total Harga = " + total_harga);

            //discount jumlah item brang
            if (book >= 36) {
                System.out.println("\n=================================================");
                System.out.println("Selamat anda mendapatkan Discount 2% pembelian Buku");
                double discBuku = buku - (buku * 0.02);
                System.out.println("Beli Buku: " + c + " Buah, Harga= " + buku + ",Harga Setelah Discount = " + discBuku);
                double total_harga_discBuku = pensil + pulpen + discBuku;
                if (total_harga_discBuku > 1000000) {
                    System.out.println("\n=================================================");
                    System.out.println("Selamat anda mendapatkan Discount 1% pembelian diatas 1000000");
                    total_bayar_disc = total_harga_discBuku - (total_harga_discBuku * 1 / 100);
                } else {
                    System.out.println("Tidak dapat discount 1%");
                }
                System.out.println("Total bayar adalah " + total_bayar_disc);
            } else {
                if (total_harga > 1000000) {
                    System.out.println("\n=================================================");
                    System.out.println("Selamat anda mendapatkan Discount 1% pembelian diatas 1000000");
                     total_bayar = total_harga - (total_harga * 1 / 100);
                } else {
                    System.out.println("Tidak dapat discount 1%");
                }
                System.out.println("Total bayar adalah " + total_bayar);
            }
            //diskon total harga

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
