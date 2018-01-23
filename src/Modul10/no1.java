package Modul10;
import java.io.*;
public class no1 {
    //no1
//    public void segiempat(int panjang, int lebar) {
//        double luas, keliling;
//        luas = panjang * lebar;
//        System.out.println("---------------------");
//        System.out.println("Panjang = " + panjang);
//        System.out.println("Lebar = " + lebar);
//        System.out.println("Luas = " + luas);
//    }
//
//    public static void main(String[] args) {
//        no1 se = new no1();
//        se.segiempat(10, 5);
//    }
    
    
    //no2
    public static String readString(){
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String string="";
        try{
            string=bf.readLine();
        }catch(IOException e){
            System.out.println(e);
        }
        return string;
    }
    public static int readInt(){
        return Integer.parseInt(readString());
    }
    public static double readDouble(){
        return Double.parseDouble(readString());
    }
    
}
