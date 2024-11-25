package StaticThings;

public class AccessStaticVar2 {
    int a, b;
    static int x, y;

    static {

        x = 10;
        y = 20;
    }

    {
        x = 50;
        y = 40;
    }

    static void staicDisp() {
        System.out.println(x);
        System.out.println(y);
    }

    void nonStaticDisp() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        AccessStaticVar2 a = new AccessStaticVar2();
        a.nonStaticDisp();
        a.staicDisp();
    }
}
