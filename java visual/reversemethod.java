import java.util.Scanner;
public class reversemethod {
    int reverseNum(int num){
        int rev=0;
        while(num!=0){
            int remainder=num%10;
            rev= rev * 10 + remainder;
            num=num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        reversemethod r=new reversemethod();
        System.out.println(r.reverseNum(num));
        sc.close();
    }
}