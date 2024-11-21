package Assignment_2;

public class Calculator {
    String brand = "Casio";
    int price = 900;

    int add(int a, int b){
        int c = a+b;
        System.out.println("Addition is : "+c);
        return c;
    }

    int sub(int a, int b){
        int c = a-b;
        System.out.println("Substraction is : "+c);
        return c;
    }

    int mul(int a, int b){
        int c = a*b;
        System.out.println("Multiplication is : "+c);
        return c;
    }
        public static void main(String[] args) {
            Calculator c = new Calculator();
            // task 1 => (a+b)*c
            // task 2 => (a+b)-c

            int z = c.add(10, 20);

            c.sub(z, 30);
            c.mul(z,40);

            // task 3 => ((a * b) + c) - d
            int m = c.mul(10, 20);
            int ad = c.add(m, 30);

            int result = c.sub(ad, 100);

            System.out.println("The final output is : "+result);

        }
}
