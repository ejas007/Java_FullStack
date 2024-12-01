package OOPS.Inheritance;

class Parent {
    public void display() {
        System.out.println("Inside Parent Class");
    }
}

class Child1 extends Parent {
    public void display() {
        System.out.println("Inside Child1 Class");
    }
}

class Child2 extends Parent {
    public void display() {
        System.out.println("Inside Child2 Class");
    }
}

public class ParentReference {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        Parent ref;
        ref = p;
        ref.display(); // Output: Inside Parent Class

        ref = c1;
        ref.display(); // Output: Inside Child1 Class

        ref = c2;
        ref.display(); // Output: Inside Child2 Class


    }
}
