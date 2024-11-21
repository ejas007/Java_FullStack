package Pattern;

public class Armstrong {
    
    public int order(int x){
        int n = 0;
        while (x != 0) {
            n++;
            x = x/10;
        }

        return n;
    }

    public int power(int x){
        return 2;
    }
    public static void main(String[] args) {
        // 153 = 1^3 + 5^3 + 3^3
        // System.out.println(order(153));
    }
}
