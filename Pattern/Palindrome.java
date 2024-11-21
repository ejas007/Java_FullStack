package Pattern;

import java.util.Scanner;

public class Palindrome {
    public static void palindrome(int n) {
        int temp = n;
        int rem = 0, rev = 0;
        while (n > 0) {
            rem = n % 10; // last number of n
            rev = rev * 10 + rem; // here is the reverses
            n = n / 10;
        }
        System.out.println(rev);
        if (rev == temp) {
            System.out.println("Number is Palindrome.");
        } else {
            System.out.println("Number is not a Palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        palindrome(134);
        sc.close();
    }
}