package OOPS.Inheritance.HasARelation;

public class Department {
    String dName;
    Employee e;

    public Department(String dName, Employee e){
        this.dName = dName;
        this.e = e;
    }

    public String getDname(){
        return dName;
    }
    public Employee getEmp(){
        return e;
    }

    // public String toString(){
    //     return dName+" "+e;
    // }
}
