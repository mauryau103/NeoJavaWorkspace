import java.util.*;
public class Condition {

    void grade(int marks){
        if(marks>=70){
            System.out.println("Distinction");
        }
        else if(marks>60 & marks <69){
            System.out.println("First Class");
        }
        else if(marks>50 & marks<59){
            System.out.println("Second Class");
        }
        else if(marks>35 & marks<49){
            System.out.println("Pass");
        }
        else if(marks<35){
            System.out.println("Fail");
        }
        else{
            System.out.println("Enter proper percentage");
        }
    }

    public static void main(String args[]){

        System.out.print("Enter Your Percentage to check Grade:");
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();
        Condition con = new Condition();
        con.grade(marks);
        sc.close();
    }
}
