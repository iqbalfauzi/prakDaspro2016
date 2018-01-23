package Modul10;
public class no1c {
    //fungsi
    public double luas_lingkaran(int diameter) {
        int jari=diameter/2;
        double luas=Math.PI*Math.pow(jari, 2);
        return luas;
    }
    //prosedure
    public void hitungLuas(int jari){
        double luas=Math.PI*Math.pow(jari, 2);
        System.out.println(luas);
    }
    public static void main(String[] args) {
        no1c no=new no1c();
        no.hitungLuas(10);
        System.out.println(no.luas_lingkaran(20));
        System.exit(0);
    }
    
}
