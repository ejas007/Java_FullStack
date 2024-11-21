package Scaner;

import java.util.Scanner;

public class Assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer Value");
        int a = sc.nextInt();
        System.out.println("Enter String Value ");
        sc.nextLine();

        String str = sc.nextLine();  
        System.out.println(a);
        System.out.println(str);
        sc.close();

    }
}