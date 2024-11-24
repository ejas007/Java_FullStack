package OOPS.Constructor;

public class Tree {
    String fruits;
    int price;

    Tree(String fruits,int price){
        this.fruits = fruits;
        this.price = price;
    }

    Tree(){
        fruits = null;
        price = 0;
    }

    public static void main(String[] args) {
        Tree t1 = new Tree("Apple", 100);
        System.out.println(t1.fruits);
    }
}
