package OOPS.Inheritance;

class Human{
    String name = "Dinga";
    int age;

    void m(){
        System.out.println("Hello");
    }
}
class Student extends Human{
    String name = "Gulluu";
    void m1(String name){
        this.name = name;
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class Super {
    public static void main(String[] args) {
        Student s = new Student();
        s.m1("Tejasvi");
    }
}