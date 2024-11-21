package Strings;

public class Practice02 {
    public static void main(String[] args) {
        String s1 = "Rama";
        String s2 = "rama";

        if(s1 == s2){ // Checks the references of the variable
            System.out.println("References are same.");
        }
        else{
            System.out.println("References are not same.");
        }

        if (s1.equals(s2)) {
            System.out.println("Content is same.");
        }
        else{
            System.out.println("Content is not same.");
        }
    }
}