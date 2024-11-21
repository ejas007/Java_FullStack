package Control_sattements;

import java.util.Scanner;

public class Assignment_1 {
    // WAJP to check if the ticket is free or not in karnataka for the gender.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please check the Gender : ");
        String gender = sc.next();

        if((gender.equals("Female")) || (gender.equals("female"))){
            System.out.println("Ask her the state she is from : ");
            String state = sc.next();
            if (state.equals("Karnataka") || (state.equals("karnataka"))) {
                System.out.println("Check The ID : ");
                
                boolean ID = sc.nextBoolean();
                if(ID == true){
                    System.out.println("Congratulations you are eligible for the free ticket.");
                }
            }
        }
        else{
            System.out.println("Pay the amount for the ticket.");
        }

        sc.close();
    }
}
