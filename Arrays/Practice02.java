package Arrays;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Give the Input for the Array : ");
        // Initialization Of the Array
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Printing of the Array 
        System.out.println("Printing the Array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
