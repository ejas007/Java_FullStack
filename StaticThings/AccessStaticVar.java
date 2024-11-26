package StaticThings;

public class AccessStaticVar {
    int a, b;
    static int x, y;

    static {

        x = 10;
        y = 20;
    }

    {
        a = 50;
        b = 40;
    }

    static void staicDisp() {
        System.out.println(x);
        System.out.println(y);
    }

    void nonStaticDisp() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        AccessStaticVar a = new AccessStaticVar();
        a.nonStaticDisp();
        AccessStaticVar.staicDisp();
    }
}
