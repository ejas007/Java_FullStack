package Strings;

public class Question01 {
    public static void main(String[] args) {
        String name = "TeJaSvI";
        // char arr[] = new char[7];
        for (int i = 0; i < name.length(); i++) {
            
            if(name.charAt(i) >= 65 && name.charAt(i) <=90){
                System.out.print((char)(name.charAt(i)+32));
            }
            else{
                System.out.print((char)(name.charAt(i)-32));
            }
        }
    }
}