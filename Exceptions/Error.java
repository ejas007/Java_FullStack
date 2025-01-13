package Exceptions;

class Demo {
    void fun1() {

        System.out.println("Inside fun1");
        fun1();
    }
}

public class Error {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.fun1();
    }
}
