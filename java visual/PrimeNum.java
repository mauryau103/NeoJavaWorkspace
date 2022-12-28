import java.util.Scanner;
public class PrimeNum {
    void prime(int num1){
        int temp=0;
        for(int i=2;i<=num1-1;i++){
            if(num1%2==0){
                temp=temp+1;
            }
        }
        if(temp>0){
            System.out.println("Given number is not a prime number");
        }
        else{
            System.out.println("Given number is a prime number");
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num2=sc.nextInt();
        PrimeNum pnum = new PrimeNum();
        pnum.prime(num2);
        sc.close();
         
    }
}
