package Strings;

public class Question4 {
    //  Remove special characters and numbers from a string.
    public static void main(String[] args) {
        String str = "Made$in$India";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='A' && str.charAt(i)<='Z') {
                System.out.print(str.charAt(i));
            }
            else if (str.charAt(i)>='a' && str.charAt(i)<='z') {
                System.out.print(str.charAt(i));
            }
        
        }
    }
        
}
