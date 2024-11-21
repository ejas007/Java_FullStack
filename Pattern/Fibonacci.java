package Pattern;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        sc.close();
        int n1 = 0,n2 = 1,n3 = 0;
        for(int i = 1;;i++){
            if(n1 < 0){
                System.out.println(n1);
                System.out.println(i);
                break;
            }
            // System.out.print(n1+" , ");

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}