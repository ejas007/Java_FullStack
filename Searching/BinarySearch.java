package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,3,8,23,55,67,80,99};
        int key = 8;
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int mid = (first + last)/2;

            if (arr[mid] == key) {
                System.out.println("Key is found in the index "+mid);
            }
            
            if (arr[mid] > key) {
                last = mid - 1;
            }
            else{
                first = mid + 1;
            }
        }
    }
}
