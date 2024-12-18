package OOPS.Interfaces;


public class Demo1 implements ConnectJava{

    @Override
    public void getConnection() {
        System.out.println("Getting Connection");
    }

    @Override
    public void getResultSet() {
        System.out.println("Getting the Results");
    }

    @Override
    public void createStatements() {
        System.out.println("Write the queries.");
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.getConnection();
        d.getResultSet();
        d.createStatements();
    }
}
