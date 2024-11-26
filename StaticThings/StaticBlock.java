package StaticThings;

public class StaticBlock {
    int a,b;
    static int x,y;

    StaticBlock(){
        System.out.println("Constructor Executed");
    }

    static{
        System.out.println("Static bock executed");
    }

    {
        System.out.println("Non static block executed");
    }

    public static void main(String[] args) {
        // StaticBlock a = new StaticBlock();
        
    }
}
