import java.util.*;
public class AreaCalc {
    public static void main(String[] args) {
        double radius,areac;
        int length,breadth,arear;
        Scanner sc = new Scanner(System.in);
        System.out.println("----CIRCLE----");
        System.out.println("Enter the radius of circle");
        radius=sc.nextDouble();
        areac=3.14*radius*radius;
        System.out.println("Area of Circle is : "+areac);

        System.out.println("----RECTANGLE----");
        System.out.println("Enter length and breadth of rectangle");
        length=sc.nextInt();
        breadth=sc.nextInt();
        arear=length*breadth;
        System.out.println("Area of Circle is:"+arear);
        sc.close();


    }
}
