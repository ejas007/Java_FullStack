package Control_sattements;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of B : ");
        int b = sc.nextInt();

        int res;
        System.out.println("Give the Operator : ");
        // char ch = sc.next().charAt(0);
        int c = 5;
        switch (c) {
            case '+':
                res = a + b;
                System.out.println(res);
                break;
            case '-':
                res = a - b;
                System.out.println(res);

                break;
            case '*':
                res = a * b;
                System.out.println(res);

                break;
            case '/':
                res = a / b;
                System.out.println(res);

                break;
            default:
                System.out.println("The Statement coming to default.");
                break;
        }

        sc.close();
    }
}
