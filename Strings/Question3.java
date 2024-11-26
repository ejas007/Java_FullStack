package Strings;

public class Question3 {
    public static void main(String[] args) {
        // WAJP to Reverse the sequence and character
        
        String name = "Hello World";

        String strarr[] = name.split(" ");
        String res = "";
        for (int i = 0; i < strarr.length; i++) {
            String word = strarr[i];
            for (int j = word.length()-1; j >= 0; j--) {
                res = res + word.charAt(j);
            }

            res = res+" ";

        }

        System.out.println(res);
    }
}
