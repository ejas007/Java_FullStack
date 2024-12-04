package OOPS.Constructor;

public class Overloading {
    String name;
    Overloading(){
        this.name = "Tejassvi";
    }
    void display() {
        System.out.println(this.name);
    }
    public static void main(String[] args) {
        Overloading a = new Overloading();
        a.display();
    }
}
