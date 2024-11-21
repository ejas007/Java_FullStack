package Looping;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a value to check its prime or not : ");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 2;i <= n/2;i++){
            if(n%i == 0){
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Its a Prime Number.");
        }
        else{
            System.out.println("Its not a Prime Number.");
        }
        sc.close();
        // System.out.println(count);
    }
}
