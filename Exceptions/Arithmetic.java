package Exceptions;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println("Entering the main method");
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        b = sc.nextInt();
        try {
            c = a / b;
            System.out.println("Result is = " + c);
        } catch (Exception e) {
            System.out.println("Problem in Division");
        }

        sc.close();
        System.out.println("Exiting the main method");
    }

}
