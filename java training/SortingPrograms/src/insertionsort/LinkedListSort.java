package insertionsort;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

//PROGRAM FOR LINKED LIST SORTING USING INSERTIONSORT
public class LinkedListSort {
	static  void Sorting(LinkedList<Integer> arr) {
		int n = arr.size();  
        for (int i = 1; i < n; i++) {  
            int key = arr.get(i);  
            int j= i-1;  
            while (j >= 0 && arr.get(j) > key ) {  
//                array [i+1] = array [i];  
            	arr.set(j+1, arr.get(j));
                j -=1;  
            }  
//            array[i+1] = key;
            arr.set(j+1, key);
        }  
    }  
public static void main(String[] args) {
	LinkedList<Integer> arr = new LinkedList<Integer>();
	System.out.println("1.Enter values\n2.Press for sorting the ArrayList.");
	do {
		
		Scanner scanner = new Scanner(System.in);
		int count=scanner.nextInt();
		switch (count) {
		case 1:
			while (scanner.hasNextInt()) {
				int input=scanner.nextInt();
				arr.add(input);
			}
			System.out.println(arr);
			break;
		case 2:
			Sorting(arr);
			System.out.println(arr);
			break;
		default:
			break;
		}
	}
	while(true);
}
}
