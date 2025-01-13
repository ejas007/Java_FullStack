package Exceptions;

public class GetMessage {
    public static void main(String[] args) {

        try {
            int a, b, c;
            a = 10;
            b = 0;
            c = a / b;
            System.out.println("Result is = " + c);
        } catch (Exception e) {
            System.out.println("Problem in Division");
            System.out.println(e.getMessage());
        }

    }
}
