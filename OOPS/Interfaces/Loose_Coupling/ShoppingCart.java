package OOPS.Interfaces.Loose_Coupling;

public class ShoppingCart {
    Payments p;

    public ShoppingCart(Payments p){
        this.p = p;
    }

    void checkOut(double amt){
        p.makePayment(amt);
    }
}