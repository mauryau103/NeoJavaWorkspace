import java.util.*;
public class Pallindrome {

    void checkp(int num){
        int reverse=0;
        int rem;
        int temp=num;
        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        if(temp==reverse){
            System.out.println("The given Number is pallindrome");
        }
        else{
            System.out.println("The given number is not a pallindrome");
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the number to check pallindrome");
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        Pallindrome pl = new Pallindrome();
        pl.checkp(num);
        sc.close();
    }
        
    
}
