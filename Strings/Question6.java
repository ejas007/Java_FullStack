package Strings;

public class Question6 {
    // Remove Duplicates ffrom String
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        StringBuilder sb = new StringBuilder();
        boolean [] seen = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (seen[ch] == false) {
                sb.append(ch);
                seen[ch] = true;
            }
        }
        System.out.println(sb);
    }
}
