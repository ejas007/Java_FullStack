package Assignment_03.Statement_2;

public class Dancer {
    Jacket thrws(){
        Jacket j = new Jacket();
        System.out.println("Throws Jacket");

        return j;
    }
    void dancing(){
        System.out.println("Dancer is Dancing");
        thrws();
    }
}
