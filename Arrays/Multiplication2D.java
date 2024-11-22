package Arrays;

public class Multiplication2D {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2},
            {3,4}
        };
        int brr[][] = {
            {5,6},
            {7,8}
        };

        int crr[][] = new int[2][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                for (int k = 0; k < crr.length; k++) {
                    
                    crr[i][j] = crr[i][j] + arr[i][k]*brr[k][j];

                }
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }

    }
}