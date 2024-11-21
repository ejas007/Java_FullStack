package MethodOverload;

public class Airtel {

    public String name;
    public int num;

    void recharge(long cardNo, String exp, int cvv) {
        System.out.println("Recharge is successfull by using Card.");

    }

    void recharge(String userName, String pass) {
        System.out.println("Recharge successfull using NetBanking");
    }

    void recharge(long mobNumber, int pin) {
        System.out.println("Recharge is successfull using UPI.");
    }
}
