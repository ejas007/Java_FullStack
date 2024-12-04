package OOPS.FinalKeyword;

class Plane{
    final void land(){
        System.out.println("Plane is landing @200km/hr");
    }
}
class Passenger extends Plane{

    // void land(){
    //     System.out.println("Passenger plane is landing @300km/hr");
    //     } Shows error because land() is final method in Plane class
}
public class Practice1 {
    
}
