package Arrays;

public class Max_Min {
    public static void main(String[] args) {
        int arr[] = {45,3,1,56,2,78};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Minimum value of Array is :"+min);
        System.out.println("Maximum value of Array is :"+max);
    }
}
