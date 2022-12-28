import java.util.*;
public class SwitchExample {
    void switchgrade(int marks){

        switch(marks/10){
            case 10:
            case 9:
            case 8:
            case 7:
            System.out.println("Distinction");
            break;
            case 6:
            System.out.println("First Class");
            break;
            case 5:
            System.out.println("Second class");
            break;
            case 4:
            System.out.println("Pass");
            break;
            case 3:
            System.out.println("Fail");
            break;
        }

    }
    public static void main(String[] args) {
        System.out.print("Enter Your Percentage to check Grade:");
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();
        SwitchExample con = new SwitchExample();
        con.switchgrade(marks);
        sc.close();
    }
}
