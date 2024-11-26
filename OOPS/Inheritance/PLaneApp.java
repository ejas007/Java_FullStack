package OOPS.Inheritance;

class CargoPlane{
    void takeOff(){
        System.out.println("Cargo Plane is taking off");
    }
    void land(){
        System.out.println("Cargo Plane is landing");
    }
    void fly(){
        System.out.println("Cargo Plane is flying");
    }
    void carryCargo(){
        System.out.println("Cargo Plane is carrying cargo");
    }
}
class PassengerPlane{
    void takeOff(){
        System.out.println("Passenger Plane is taking off");
    }
    void land(){
        System.out.println("Passenger Plane is landing");
    }
    void fly(){
        System.out.println("Passenger Plane is flying");
    }
    void carryPassenger(){
        System.out.println("Passenger Plane is carrying Passenger");
    }
}
public class PLaneApp {
    
    public static void main(String[] args) {
        CargoPlane p1 = new CargoPlane();
    PassengerPlane p2 = new PassengerPlane();
    p1.takeOff();
    p1.land();
    p1.fly();
    p1.carryCargo();
    p2.takeOff();
    p2.land();
    p2.fly();
    p2.carryPassenger();
    }
}
