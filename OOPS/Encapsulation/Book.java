package OOPS.Encapsulation;

public class Book {
    private int pages;

   public void seData(int x){

    if (x>0) {
        pages = x;
    }

   }

   public int getData(){

    return pages;
   }
}
