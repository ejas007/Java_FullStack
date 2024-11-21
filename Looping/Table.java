package Looping;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a value :");
        int n = sc.nextInt();
        sc.close();

        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
        
    }
}
