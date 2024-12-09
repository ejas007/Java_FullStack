package OOPS.Constructor;

class Studen{
    String name;
    int age;
    float marks;

    Studen(){
        System.out.println("Default Constructor");
    }
    Studen(String name){
        this.name=name;
        System.out.println("Name Constructor.");
    }
    Studen(String name,int age){
        this(name);
        this.age = age;
        System.out.println("Name and Age Constructor");
    }
    Studen(String name,int age,float marks){
        this(name, age);
        this.marks = marks;
        System.out.println("Name, Age and Marks Constructor");
    }
}
public class Chaining {
    public static void main(String[] args) {
        // Studen s1 = new Studen();
        // Studen s2 = new Studen("Rahul");
        // Studen s3 = new Studen("Rahul", 20);
        // Studen s4 = new Studen("Rahul", 20, 85.5f);
    }
}
