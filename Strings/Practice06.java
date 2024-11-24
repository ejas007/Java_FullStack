package Strings;

public class Practice06 {
    public static void main(String[] args) {
        String s1 = new String("Pentagon");
        s1.concat("Space");
        System.out.println(s1);
        String s2 = new String("Space");
        s1.concat(s2);
        System.out.println(s1);

        StringBuffer sb = new StringBuffer("Pentagon");
        sb.append(" Space");
        System.out.println(sb);


    }
}
