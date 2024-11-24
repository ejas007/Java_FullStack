package OOPS.Constructor;

public class Student {
    String name;
    int age;
    float height;

    Student(String n,int a,float h){

        name = n;
        age = a;
        height = h;

    }

    Student(){
        name = null;
        age = 0;
        height = 0.0f;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Tejasvi", 22, 6.0f);
        System.out.println(s1.name);
        Student s2 = new Student();
        System.out.println(s2.name);
    }
}
