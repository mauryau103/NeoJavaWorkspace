import java.util.Scanner;

public class GreaterElementArrayDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];

        System.out.println("Enter five elements:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();

        }
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest element in a array is "+largest);
         sc.close();
         
    }
}
