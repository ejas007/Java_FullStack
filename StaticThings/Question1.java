package StaticThings;

public class Question1 {
    // WAJP to count the total number of objects created for specific class 

    int a,b;
    static int count;
    
    Question1(){
        count++;
    }

    public static void main(String[] args) {
        Question1 q1 = new Question1();
        Question1 q2 = new Question1();
        Question1 q3 = new Question1();

        System.out.println("Total number of objects are "+Question1.count);
        // Commit
    }
}
