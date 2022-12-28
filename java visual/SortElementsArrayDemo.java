import java.util.*;
public class SortElementsArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];

        System.out.println("Enter five int Elements:");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array before sorting");
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
         int temp = arr[0];
         for(int i=0;i<arr.length;i++){

            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
         }//end for

         System.out.println("\nArray after Sorting");
         for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
         }

        sc.close();
    }
}
