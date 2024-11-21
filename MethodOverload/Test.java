package MethodOverload;

public class Test {
    public static void main(String[] args) {
         Airtel a = new Airtel();
         a.recharge(9001378256l, 124);
         System.out.println(a.name);
         System.out.println(a.num);
         System.out.println(a);
    }
}