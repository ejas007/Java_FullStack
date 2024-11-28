package Strings;

public class Question7 {
    public static void main(String[] args) {
        // Extarct the number from the string without using inbuilt methods
        
        String str = "H2e3l4l5o";
        str = str.toUpperCase();
        String numStr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch > 'A' && ch < 'Z') {
                continue;
            }
            else{
                numStr += ch;
            }
        }
        System.out.println(numStr);   

    }

}
