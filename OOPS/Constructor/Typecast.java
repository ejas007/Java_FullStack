package OOPS.Constructor;

class Employee1{
    double id;
    double number;

    Employee1(double a,double b){
        id=a;
        number=b;
        System.out.println("Inside double constructor");
    }
    // Employee1(int a,double b){
    //     id=a;
    //     number=b;
    //     System.out.println("Inside int constructor");
    // }
}
public class Typecast {
    public static void main(String[] args) {
        Employee1 e1=new Employee1(10,20);
        System.out.println(e1.id);
    }
}
