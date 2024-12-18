package OOPS.Interfaces.Loose_Coupling;

public class CreditCard implements Payments{
    public void makePayment(double amt){
        System.out.println("Payment of Rs."+amt+" made using Credit Card");
    }
}
