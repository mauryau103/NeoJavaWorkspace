import java.util.*;
public class Febonnacci {
    void feb(int count){
        int num1=1;
        int num2=1;
        int num3;
        System.out.print(num1+" "+num2);

        for(int i=2;i<count;i++){
            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Febonnacci f= new Febonnacci();
        f.feb(count);
        sc.close();
        
    }
}
