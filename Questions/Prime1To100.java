package Questions;

import java.util.Scanner;

public class Prime1To100 {
    static boolean isPrime(int n){
        if (n==0 || n==1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            // If n is divisible by i then n is not a prime number
            if(n%i == 0){
                return false;
            }
        }
        return true;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int num = 100;  
        for (int i = 0; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i+" , ");
            }
        }
        sc.close();
    }

}
