import java.util.*;;
public class Addition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2,result;
        System.out.println("Enter your first number  :");
        num1=sc.nextInt();
        System.out.println("Enter your second number :");
        num2=sc.nextInt();
        result=num1+num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+result);
        sc.close();
    }
}
