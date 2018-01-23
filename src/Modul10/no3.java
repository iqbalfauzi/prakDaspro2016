package Modul10;

public class no3 {
    public static void main(String[] args) {
        int bil=3;
        int b[]={1,2,3};
//        String b[]={"a","b","c"};
        try{
            System.out.println(bil/0);
            System.out.println(b[3]);
        }catch(ArithmeticException a){
            System.out.println("Error Aritmatic");
            System.out.println(a.getMessage());
        }catch(ArrayIndexOutOfBoundsException n){
            System.out.println("Error karena melebihi kapasitas Array");
            System.out.println(n.getMessage());
        }catch(Exception e){
            System.out.println("Ada Error");
            System.out.println(e.getMessage());
        }
    }
}
