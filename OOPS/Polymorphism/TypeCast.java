package OOPS.Polymorphism;

class Plane1{
    void land(){
        System.out.println("Plane is landing");
    }
}
class Fighter1 extends Plane1{
    @Override
    void land(){
        System.out.println("Fighter Plane is landing");
    }
    void launchMissle(){
        System.out.println("Fighter Plane is launching a missile");
    }
}
public class TypeCast {
    public static void main(String[] args) {
        Fighter1 f = new Fighter1();
        Plane1 p =  f; // Upcasting (Implicitly)
        p.land(); // Output: Plane is landing
        // p.launchMissle(); Error Compile time
        ((Fighter1)p).launchMissle(); // Output: Fighter Plane is launching a missile (Explicitly)
    }
}
