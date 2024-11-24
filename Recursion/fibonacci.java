package Recursion;

public class fibonacci {

    static int fibbo(int num){
        
        if (num <= 1) {
            return num;
        }
        

        return fibbo(num - 1) + fibbo(num - 2);

       
    }
    public static void main(String[] args) {
        System.out.println(fibbo(10));
    }
}
