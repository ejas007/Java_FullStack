package OOPS.Inheritance.HasARelation;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Tejasvi", 07);
        Department d = new Department("IT", e);

        System.out.println(d.hashCode());
        System.out.println(d.toString());

    }
}
