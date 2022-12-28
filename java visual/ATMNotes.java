import java.util.*;
public class ATMNotes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount;
        int notes;
        System.out.println("Enter your Amount: ");
        amount=sc.nextInt();

        if(amount%100!=0){
            System.out.println("Enter valid Amount");
        }
        else{
            if(amount>=1000){
                notes=amount/1000;
                amount=amount%1000;
                System.out.println("Notes of 1000 :"+notes);
            }
            if(amount>=500){
                notes=amount/500;
                amount=amount%500;
                System.out.println("Notes of 500 :"+notes);
            }
            if(amount>=100){
                notes=amount/100;
                amount=amount%100;
                System.out.println("Notes of 100 :"+notes);
            }
        }
        sc.close();
    }
}