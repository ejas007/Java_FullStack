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
        System.out.println(str3.replaceAll("[^0-9]","")); // removes all non-digit characters

        String str4 = "Welcome to Banglore";
        System.out.println(str4.contains("to")); // checks if the string contains "to" or not

        String str5 = "";
        System.out.println(str5.isEmpty()); // checks if the string is empty or not
    }
}