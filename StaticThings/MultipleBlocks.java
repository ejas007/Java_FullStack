package StaticThings;

public class MultipleBlocks {
    static{
        System.out.println("Inside 1st static block");
    }

    static{
        System.out.println("Inside 2nd static block");

    }

    static{
        System.out.println("Inside 3rd static block");
    }

    {
        System.out.println("Inside 1st non static block");
    }

    {
        System.out.println("Inside 2nd non static block");
    }

    public static void main(String[] args) {
        // MultipleBlocks m = new MultipleBlocks();
        // MultipleBlocks m1 = new MultipleBlocks();
    }
}