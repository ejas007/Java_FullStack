package Control_sattements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        int balance = 500000;
        int amount;
        System.out.println("Insert the Card : ");
        boolean card = sc.nextBoolean();

        if (card) {
            System.out.println("Enter PIN : ");
            int checkPin = sc.nextInt();
            if (checkPin == pin) {
                boolean isTrue = true;
                    while (isTrue) {
                        
                    
                System.out.println("Choose the Options : ");
                System.out.println("1. Deposited\n" +
                        "2. Withdrawl\n" +
                        "3. Balance Checking\n" +
                        "4. Exit");

                int options = sc.nextInt();
                switch (options) {
                    case 1:
                        System.out.println("Enter the Amount you need to deposit : ");
                        amount = sc.nextInt();
                        balance = balance + amount;
                        System.out.println("Current Balance is : " + balance);
                        break;

                    case 2:
                        System.out.println("Enter the Amount to withdraw : ");
                        amount = sc.nextInt();
                        balance = balance - amount;
                        System.out.println("Current Balance is : " + balance);
                        break;

                    case 3:
                        System.out.println("Current Balance is : " + balance);
                        break;
                    case 4:
                        System.out.println("Thank you");
                        isTrue = false;
                        break;

                    default:
                        System.out.println("Invalid Options.");
                        break;
                }
            }
            } else {
                System.out.println("Invalid PIN.");
            }
        
        } else {
            System.out.println("Insert the card correctly.");
        }

        sc.close();
    }
}