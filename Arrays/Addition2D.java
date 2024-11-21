package Arrays;

public class Addition2D {
    public static void main(String[] args) {
        int arr[][] = {
            {2,4},
            {6,8}
        };

        int brr[][] = {
            {1,3},
            {5,7}
        };

        int crr[][] = new int[2][2];
        for (int i = 0; i < crr.length; i++) {
            for (int j = 0; j < crr.length; j++) {
                crr[i][j] = arr[i][j] + brr[i][j];
            }
        }

        for (int i = 0; i < crr.length; i++) {
            for (int j = 0; j < crr.length; j++) {
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
