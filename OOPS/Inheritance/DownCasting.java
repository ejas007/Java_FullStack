package OOPS.Inheritance;

class Food{
    void m(){
        System.out.println("Food class method");
    }
}
class Dosa extends Food{
    void m1(){
        System.out.println("Inside Dosa Class");
    }
}
class Biryani extends Food{
    void m2(){
        System.out.println("Inside Biryani Class");
        }
}
class MasalaDosa extends Dosa{
    void m3(){
        System.out.println("Inside Masala Dosa Class");
    }
}
class ChickenBiryani extends Biryani{
    void m4(){
        System.out.println("Inside Chicken Biryani Class");
    }
}
public class DownCasting {
    public static void main(String[] args) {
        Food f = new Dosa();
        f.m();
        ((Dosa)f).m1();
        Food b = new Biryani();
        b.m();
        ((Biryani)b).m2();
        Food f1 = new MasalaDosa();
        Food f2 = new ChickenBiryani();
    }
}
