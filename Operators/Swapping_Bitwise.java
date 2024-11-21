package Operators;

public class Swapping_Bitwise {
    public static void main(String[] args) {
        int a = 5,b = 8;
        System.out.println("Swapping of Two Numbers : "+a+" , "+b);

        // using XOR
        a = a ^ b; 
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping the Numbers : "+a+" , "+b);
    }
}
