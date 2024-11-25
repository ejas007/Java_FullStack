package StaticThings;

public class StaticMethod {
    int a,b;
    static int x,y;

    StaticMethod(){
        System.out.println("Constructor Executed");
    }

    static{
        System.out.println("Static bock executed");
    }

    {
        System.out.println("Non static block executed");
    }

    void nonStaticDisp(){
        System.out.println("Non static disp Executed");
    }

    static void statiDisp(){
        System.out.println("Static disp executed");
    }

    public static void main(String[] args) {
        StaticMethod s1 = new StaticMethod();
        StaticMethod.statiDisp();
        s1.nonStaticDisp();
    }
}
