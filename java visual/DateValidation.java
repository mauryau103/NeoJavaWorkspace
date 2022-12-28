// . Program to validate date,month and year using switch case
import java.util.*;
public class DateValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dd,mm,yyyy;
        int no_of_days=0;
        System.out.println("Enter date(dd)");
        dd=sc.nextInt();
        System.out.println("Enter month(mm)");
        mm=sc.nextInt();
        System.out.println("Enter Year(yyyy)");
        yyyy=sc.nextInt();

        switch(mm){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
            no_of_days=31;
            break;

            case 4:case 6:case 9:case 11:
            no_of_days=30;
            break;

            case 2:
                if(yyyy%4==0){
                    no_of_days=29;
                    System.out.println("This is Leap Year");
                }
                else{
                    no_of_days=28;
                }
                break;
            default:
                System.out.println("You have entered invalid month");
        }//end of switch
        if(dd<=no_of_days){
            System.out.println("Given date is valid");
        }
        else{
            System.out.println("Given date is invalid");
        }
        sc.close();


            
    }
}
