package Looping;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a value :");
        int n = sc.nextInt();
        sc.close();
        long fact = 1l;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }

        System.out.println("Factorial of "+n+" is :"+fact);
        
    }
}