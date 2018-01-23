package Modul7;

public class no1 {

    public static void main(String[] args) {
        //no1
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println(i);
                break;
            }
        }
        //no2
        searchLabel:
        for (int i = 0; i < 6; i++) {
            if (i == 5) {
                System.out.println(i);
                break searchLabel;
            }
        }
    }
}
