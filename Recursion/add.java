package Recursion;

public class add {

    static int adding(int n){

        if(n == 0){
            return 0;
        }
        return n + adding(n-1);
    }
    public static void main(String[] args) {
        System.out.println(adding(100));
    }
}
