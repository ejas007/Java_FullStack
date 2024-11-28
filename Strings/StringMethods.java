package Strings;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "   Hello World   ";
        System.out.println(str1);
        System.out.println(str1.trim()); // removes leading and trailing spaces

        String str2 = "Java Programming";
        System.out.println(str2);
        System.out.println(str2.replace('a', 'o')); // replaces 'a' with 'o' in the string 

        String str3 = "H2e3l4l5o";
        System.out.println(str3.replaceAll("[^0-9]",""));
    }
}