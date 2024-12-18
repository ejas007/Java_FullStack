package OOPS.Interfaces.Tight_Coupling;



public class User {
    public static void main(String[] args) {
        ShopingCart cart = new ShopingCart();
        cart.checkOutCreditCard(10000);
        cart.checkOutUPI(100);
    }
}
