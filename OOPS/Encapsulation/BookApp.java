package OOPS.Encapsulation;

public class BookApp {
    public static void main(String[] args) {
        Book b1 = new Book();
        // b1.pages = 100; it shows error because it is private and can be accessed only the the methods that are public in nature
        b1.seData(100);
        // b1.seData(-90); it will not enter as it is smaller than 0

        int m = b1.getData();
        System.out.println("Values of pages is : "+m);

    }
}
