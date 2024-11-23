package OOPS.Encapsulation;

public class Student {
    private double perc;

    public void setData(double p){
        if (p>=35.0 && p<=100.00) {
            perc = p;
        }
        else{
            System.out.println("You are not Eligible.");
        }
    }

    public double getData(){
        return perc;
    }
}