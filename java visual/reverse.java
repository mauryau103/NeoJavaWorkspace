import java.util.Scanner;

public class reverse {
    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        while(num!=0){
            int remainder=num%10;
            rev= rev * 10 + remainder;
            num=num/10;
        }
        System.out.println(rev);
        sc.close();
    }
}
