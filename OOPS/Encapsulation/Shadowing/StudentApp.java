package OOPS.Encapsulation.Shadowing;

public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData("Tejasvi", 23, 6.0f);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.height);
    }
}