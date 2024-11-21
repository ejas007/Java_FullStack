package Looping;

public class Practice01 {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++ ){
            System.out.print(i+" ");
        }
        System.out.println();
        int i = 0;
        while(i <= 5){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        int j = 0;
        do{
            System.out.print(j+" ");
            j++;
        }while(j<=5);
    }
}