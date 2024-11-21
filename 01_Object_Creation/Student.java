package Object_Creation;
/**
 * Student
 */
public class Student {
    int age = 22;
    String name = "Gulluu";
    
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);

        Student s2 = new Student();
        System.out.println(s2);
    }
}