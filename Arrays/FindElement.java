package Arrays;

public class FindElement {
    static void find(int arr[], int key) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Key is inside the array at the index " + i);
                break;
            }
        }
        if (i == arr.length) {
            System.out.println("Key not found");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 45, 3, 1, 56, 2, 78 };
        int key = 6;
        find(arr, key);
    }
}
