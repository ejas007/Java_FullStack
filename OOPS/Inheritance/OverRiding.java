package OOPS.Inheritance;

class Animal {
    void eat() {
        System.out.println("Eating...");
    }

    void sleep() {
        System.out.println("Sleeping...");
    }

    void breathe() {
        System.out.println("Breathing...");
    }

}

class Tiger extends Animal {
    
     void eat() {
        System.out.println("Tiger is eating");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer is eating");
    }
}

class Monkey extends Animal {
    @Override
    void eat() {
        System.out.println("Monkey is eating");
    }
    void jump() {
        System.out.println("Monkey is jumping");
        }
}

public class OverRiding {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        String animalType = "Tiger";
        System.out.println(animalType.compareToIgnoreCase(animalType));
        Tiger t = new Tiger();
        Deer d = new Deer();
        Monkey m = new Monkey();
        t.eat();
        t.breathe();
        t.sleep();
        System.out.println();
        d.eat();
        d.breathe();
        d.sleep();
        System.out.println();
        m.eat();
        m.breathe();
        m.sleep();
        // (animal).jump(); This will not compile
    }
}