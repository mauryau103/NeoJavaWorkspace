import java.util.Scanner;

public class LargestOdArrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];

        System.out.println("enter five int elements:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        int largest = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0){
                if(arr[i]>largest && arr[i]%2!=0){
                    largest=arr[i];
                }
            }
        }
        System.out.println("Largest odd element in array is "+largest);
        sc.close();
    }
}
