package OOPS.Interfaces.Loose_Coupling;

public class User {
    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        ShoppingCart sp = new ShoppingCart(c);

        sp.checkOut(70000);

        UPI u = new UPI();
        ShoppingCart sp1 = new ShoppingCart(u);
        sp1.checkOut(700);
    }
}
