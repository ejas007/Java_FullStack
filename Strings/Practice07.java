package Strings;

public class Practice07 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("Sachin");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" is a great Batsman.");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
