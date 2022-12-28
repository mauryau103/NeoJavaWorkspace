import java.util.*;
public class ArithmaticSwitch {
    public static void main(String[] args) {
        int choice,a=0,b=0;
        int add,sub,multi;
        double div;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Division\n5.Exit");
            System.out.println("Enter Your choice");
            choice=sc.nextInt();
            System.out.println("Enter value of a :");
            a=sc.nextInt();
            System.out.println("Enter value of b :");
            b=sc.nextInt();
            switch(choice){
                    case 1:
                        System.out.println("------ADDITION------");
                        add=a+b;
                        System.out.println("Addition of given number is : "+add);
                        break;
                    case 2:
                        System.out.println("-----Subtraction-----");
                        sub=a-b;
                        System.out.println("Subtraction of given number is : "+sub);
                        break;
                    case 3:
                        System.out.println("----Multiplication----");
                        multi=a*b;
                        System.out.println("Multiplication of given number is : "+multi);
                        break;
                    case 4:
                        System.out.println("----Division-----");
                        div=a/b;
                        System.out.println("Division of given number is : "+div);
                        break;
                    case 5:
                    System.exit(0);
                        System.out.println("thank you");
                        
                        break;
                    default:
                        System.out.println("U have entered a wrong choice");
                        break;
            }
            
        } while (choice!=5);
        sc.close();
    }
}
