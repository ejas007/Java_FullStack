package OOPS.Constructor;
class Employee{
    String ename;
    int id;
    Employee(String ename,int id){
        this.ename=ename;
        this.id=id;
    }
    Employee(Employee emp){
        this(emp.ename, emp.id);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        Employee e = new Employee("Rahul", 123);
        Employee e1 = new Employee(e);
        System.out.println(e1.ename+" "+e1.id);
    }
}