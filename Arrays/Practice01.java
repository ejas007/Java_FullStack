package Arrays;

public class Practice01 {
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }

    static void printArray(char arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public static void main(String[] args) {
        // Initialization of Array
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        printArray(arr);

        System.out.println();
        int brr[] = {1,2,3};
        printArray(brr);

        System.out.println();
        char crr[] = new char[] {'a','b','c'};
        printArray(crr);
    }
}
