import java.util.*;
public class MultipleOfFiveArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];

        System.out.println("Enter five int elements");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Number multiples of five are:");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%5==0){
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
