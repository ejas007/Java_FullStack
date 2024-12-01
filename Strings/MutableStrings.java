package Strings;

public class MutableStrings {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb =  sb.append(", World");
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("Java ");
        sb2.append("Program");
        System.out.println(sb2);
    }
}
