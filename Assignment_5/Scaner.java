package Assignment_5;
import java.util.Scanner;
public class Scaner {
    // Take 2 integer input perform swapping, addition, substraction and convert int to char

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swaaped Values : "+a+" & "+b);
    }
    public static int addition(int a,int b){
        return (a+b);
    }
    public static int substraction(int a,int b){
        return (a-b);
    }
    public static char integerToCharacter(int a){
        char b = (char) a;

        return b;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give Value of a : ");
        int a = sc.nextInt();
        System.out.println("Give Value of b : ");
        int b = sc.nextInt();
        swap(a,b);
        System.out.println(addition(a,b));
        System.out.println(substraction(a, b));
        System.out.println(integerToCharacter(a));
        sc.close();

    }
}
