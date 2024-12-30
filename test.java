public class test {
    test(){
        System.out.println("Hello");
    }
void m1(byte b){
    System.out.println("Byte");
}
void m1(int b){
    System.out.println("Int");
}
void m1(short b){
    System.out.println("Short");
}

    public static void main(String[] args) {
        test t = new test();
        t.m1(10);
    }
}