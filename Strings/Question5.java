package Strings;

public class Question5 {
    // To get vovels and consonants
    public static void main(String[] args) {
        String str = "Hell@o, Wor#ld";
        int vcount = 0;
        int ccount = 0;
        int special = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
                vcount++;
            }
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                ccount++;
            }
            else{
                special++;
            }
        }

        System.out.println("Vowels are "+vcount);
        System.out.println("Consonants are "+ccount);
        System.out.println("Special characters are "+special);
    }
}
