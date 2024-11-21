package Strings;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        System.out.println("Enter the String : ");
        s1 = sc.next();
        System.out.println("Enter the value : ");
        s2 = sc.next();
        int res;
        res = s1.compareTo(s2);
        if(res == 0){
            System.out.println("Strings are Equal.");
        }
        else if (res > 0) {
            System.out.println("String s1 is greater than s2");
        }
        else{
            System.out.println("String s1 is smaller than s2");
        }
        sc.close();
    }
}
