package Assignment_4;

public class Swapping {
    static void Swap(int n, int m) {
        System.out.println("Before Swapping values are : " + n + " and " + m);
        int temp = n;
        n = m;
        m = temp;
        System.out.println("Swapped Values are : " + n + " and " + m);
    }

    public static void main(String[] args) {
        Swap(100, 200);
    }
}
