package Strings;

public class Practice03 {
    public static void main(String[] args) {
        String s1 = "Rama";
        String s2 = "Rama";
        String s3 = new String("Rama");
        String s4 = new String("Rama");

        if(s1 == s2){
            System.out.println("s1 and s2 are pointing the same object.");
        }
        else{
            System.out.println("s1 and s2 are not pointing the same object.");
        }

        if(s3 == s4){
            System.out.println("s3 and s4 are pointing the same object.");
        }
        else{
            System.out.println("s3 and s4 are not pointing the same object.");
        }
    }
}