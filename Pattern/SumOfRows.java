package Pattern;

public class SumOfRows {
    public static void main(String[] args) {
        int n = 5;
        int k = 1;

        for(int i = 1;i<=n;i++){
            int sum = 0;
            for(int j = 1;j <= i;j++){
                System.out.print(k+" ");
                sum = sum + k;
                k++;
            }
            k = sum;
            System.out.println();
        }
    }
}