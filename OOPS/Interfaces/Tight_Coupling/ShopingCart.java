package OOPS.Interfaces.Tight_Coupling;

public class ShopingCart {
    CreditCard c;
    UPI u;

    public ShopingCart(){
        c = new CreditCard();
        u = new UPI();
    }

    void checkOutCreditCard(double amt){
        c.makePayment(amt);
    }
    void checkOutUPI(double amt){
        u.makePayment(amt);
    }
}
