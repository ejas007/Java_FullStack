package OOPS.Polymorphism;

class Plane{
    void land(){
        System.out.println("Plane is landing");
    }
}
class Cargo extends Plane{
    void land(){
        System.out.println("Cargo plane is landing");
    }
}
class Fighter extends Plane{
    void land(){
        System.out.println("Fighter plane is landing");
        }
}
class Passenger extends Plane{
    void land(){
        System.out.println("Passenger plane is landing");
        }
}

// class Airport{
//     void allowPlane(Cargo ref){
//         ref.land();
    
//     }
//     void allowPlane(Fighter ref){
//         ref.land();
//     }
//     void allowPlane(Passenger ref){
//         ref.land();
//         }


// }

class Airport{
    void allowPlane(Plane ref){
        ref.land();
        }
}
public class RuntimePoly {
    public static void main(String[] args) {
        Cargo c = new Cargo();
        Fighter f = new Fighter();
        Passenger p = new Passenger();
        Airport a = new Airport();
        a.allowPlane(c);
        a.allowPlane(f);
        a.allowPlane(p);

    }
}
