package Modul6;

public class no9 {
    public static void main(String[] args) {
        String names[]={"Joko","Bhekti","Hendi","Prasekti"};
        for (int i = 0; i <names.length; i++) {
            if(!names[i].equals("Bhekti")){
                System.out.println(names[i]);
                continue;
            }
        }
        for (int i = 0; i <names.length; i++) {
            if(names[i].equals("Bhekti")){
                System.out.println("\n"+names[i]);
                break;
            }
        }
    }
}
