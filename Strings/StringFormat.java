package Strings;

public class StringFormat {
    public static void main(String[] args) {
        String str1 = String.format("%5f", 2.4); // 2.40000
        System.out.println(str1);
        String str2 = String.format("%5.2f", 2.4); // 2.40
        System.out.println(str2);
    }    
}                