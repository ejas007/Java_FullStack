package Exceptions;

import java.util.Scanner;

class ALessThanBException extends Exception {
    public String getMessage() {
        return "The value of a should be greater than b";
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        System.out.println("Enterring the main method");
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter the value of a : ");
        a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        b = sc.nextInt();

        try {
            if (a > b) {
                c = a - b;
                System.out.println("The value of c is : " + c);
            } else {
                // throw new ALessThanBException();

            }
        }
        // catch (ALessThanBException e) {
        // System.out.println(e.getMessage());
        // }
        finally {
            System.out.println("Exiting the main method");
        }

    }
}
