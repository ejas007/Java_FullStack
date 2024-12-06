package OOPS.Inheritance;
class Grand{
    String name;
    int age;
    void display(){
        System.out.println("Grandparent name is "+name+" and age is "+age);
        
    }
}
class Chil extends Grand{

}
public class Practice1 {
    public static void main(String[] args) {
        Chil child = new Chil();
        child.name = "Tejasvi";
        System.out.println(child.name);
    }    
}
