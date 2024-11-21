package Questions;

public class EvenOrOdd100 {
    static void evenOrOdd(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is Even Number.");
            } else {
                System.out.println(i + " is Odd Number.");
            }
        }
    }

    public static void main(String[] args) {
        evenOrOdd(10);

    }
}
