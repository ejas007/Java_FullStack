package OOPS.Interfaces.Loose_Coupling;

public class UPI implements Payments {

    @Override
    public void makePayment(double amt) {
        // TODO Auto-generated method stub
        System.out.println("Payment of Rs."+amt+" made using UPI");
    }
    
}
