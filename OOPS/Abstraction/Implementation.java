// package OOPS.Abstraction;
// import java.util.Scanner;
// abstract class Shape{
//     float area;
//    abstract void input();
//    abstract void calculateArea();
//     void display(){
//         System.out.println("Area of shape is: "+area);
//     }
// }
// class Square extends Shape{
//     float side;
//     void input(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the side of square");
//         side = sc.nextFloat();
        
//         }
//         void calculateArea(){
//             area = side * side;
//             }
//             // void display(){
//             //     System.out.println("Area of square is "+area);
//             // }
//         }

// class Circle extends Shape{
//     float radius;
//     void input(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the radius of circle");
//         radius = sc.nextFloat();
        
//         }
//         void calculateArea(){
//             area = 3.14f * radius * radius;
//             }
//             // void display(){
//             //     System.out.println("Area of circle is "+area);
//             // }
//         }

//         class Rectangle extends Shape{
//             float length, breadth;
//             void input(){
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("Enter the length of rectangle");
//                 length = sc.nextFloat();
//                 System.out.println("Enter the breadth of rectangle");
//                 breadth = sc.nextFloat();
//             }
//             void calculateArea(){
//                 area = length * breadth;
//                 }
//                 // void display(){
//                 //     System.out.println("Area of rectangle is "+area);

//                 // }
//         }

//         class Geometry{
//             void allowShape(Shape ref){
//                 ref.input();
//                 ref.calculateArea();
//                 ref.display();
//             }
//         }
// public class Implementation {
//     public static void main(String[] args) {
//         Square s = new Square();
//         Circle c = new Circle();
//         Rectangle r = new Rectangle();
//         Geometry g = new Geometry();
//         g.allowShape(s);
//         g.allowShape(c);
//         g.allowShape(r);

//     }
// }
