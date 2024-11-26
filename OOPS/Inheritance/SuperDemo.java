package OOPS.Inheritance;

class C {
    int i;
}

class B extends C {
    int i;

    void setData(int x, int y) {
        super.i = x;
        i = y;
    }

    void display() {
        System.out.println("Value of i in class A is: " + super.i);
        System.out.println("Value of i in class B is: " + i);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        B b1 = new B();
        b1.setData(10, 20);
        b1.display();
    }

}
