package OOPS.Abstraction;

abstract class Plane{
    abstract void takeOff();
    abstract void fly();
    abstract void land();
}

class Cargo extends Plane{
    @Override
    void takeOff(){
        System.out.println("Cargo plane taking off");
        }
        @Override
        void fly(){
            System.out.println("Cargo plane flying");
            }
            @Override
            void land(){
                System.out.println("Cargo plane landing");
                }

}

class Passenger extends Plane{
    @Override
    void takeOff(){
        System.out.println("Passenger plane taking off");
        }
        @Override
        void fly(){
            System.out.println("Passenger plane flying");
            }
            @Override
            void land(){
                System.out.println("Passenger plane landing");
                }
    
}


class Fighter extends Plane{
    @Override
    void takeOff(){
        System.out.println("Fighter plane taking off");
        }
        @Override
        void fly(){
            System.out.println("Fighter plane flying");
            }
            @Override
            void land(){
                System.out.println("Fighter plane landing");
                }
}
class Airport{
    void allowPlane(Plane ref){
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}
class AbstractClass{
    public static void main(String[] args) {
        Cargo cargo = new Cargo();
        Passenger passenger = new Passenger();
        Fighter fighter = new Fighter();
        Airport airport = new Airport();
        airport.allowPlane(cargo);// Typecast Implicitly
        System.out.println();
        airport.allowPlane(passenger);
        System.out.println();
        airport.allowPlane(fighter);
    }
}

