package Sorting;

public class SelectionSort {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }

    static void code(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {45,2,12,1,99,0};
        System.out.println("Before Selection sort");
        printArray(arr);
        code(arr);
        System.out.println();
        System.out.println("After Selection Sort");
        printArray(arr);

        int a = 'b';
        System.out.println(a);
        System.out.println("Hello");
    }
}
