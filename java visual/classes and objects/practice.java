import java.util.*;

class Shape{

    double area(float radius){
        System.out.println(radius);
        return 3.142*radius*radius;
    }

}

public class practice {


    public static void main(String[] args) {
        Shape shape=new Shape();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Radius");
        double r= sc.nextFloat();
        float rr=(float)r; //typcasting done : typcasting is done from higher to lower but if we convert float value into int then our decimal value will not print.
        double areacircle=shape.area(rr);
        System.out.println("Area of Circle is"+areacircle);

    }
}
