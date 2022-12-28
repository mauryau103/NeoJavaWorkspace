import java.util.Scanner;
// lang package is by default imported
class Shape{

    double area(float radius){
        System.out.println(radius);
        return 3.142*radius*radius;
    }
    double area(double length,double breadth){
        return  length*breadth;
    }
    double area(double side){
        System.out.println(side);
        return side*side;
    }
    //double area(double side1, double side2, double side3){
     //   Math.sqrt();
   // }
}





public class OverloadingDemo {
   public static void main(String[] args) {
    Shape shape=new Shape();
    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter radius");
    float r=scanner.nextFloat();  
    double areacircle=shape.area(r);
    System.out.println("Area if circle is "+areacircle);
    /* 1. number of parameters shuld be diff or 2. if same then data type should be dift */
   
    System.out.println("Enter length and breadth of rectangle");
    double length=scanner.nextDouble();
    double breadth=scanner.nextDouble();
    double arearect=shape.area(length,breadth);
    System.out.println("Area if rectangle is "+arearect);

    System.out.println("Enter side of square");
    double s=scanner.nextDouble();  
    double areasqr=shape.area(s);
    System.out.println("Area if square is "+areasqr);
    scanner.close();
   } 
}