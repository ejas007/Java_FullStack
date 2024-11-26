package OOPS.Inheritance;

class Plane{
    void takeOff(){
        System.out.println("Taking off");
    }
    void land(){
        System.out.println("Landing");
        }
    void fly(){
        System.out.println("Flying");
    }   
    
}

class Cargo extends Plane{
    void loadCargo(){
        System.out.println("Loading cargo");
        }
}

class Passenger extends Plane{
    void loadPassengers(){
        System.out.println("Loading passengers");
        }
}
public class PlaneApp2 {
    public static void main(String[] args) {
        Cargo cargo = new Cargo();
        cargo.takeOff();
        cargo.land();
        cargo.fly();
        cargo.loadCargo();
        System.out.println();
        Passenger passenger = new Passenger();
        passenger.takeOff();
        passenger.land();
        passenger.fly();
        passenger.loadPassengers();
    }
}
