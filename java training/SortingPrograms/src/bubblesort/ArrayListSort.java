package bubblesort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//PROGRAM FOR ARRAY LIST SORTING USING BUBBLESORT
public class ArrayListSort {
	 static void bubbleSort(ArrayList<Integer> list) {  
	        int n = list.size();  
	        int temp = 0;  
	        for (int i = 1; i < n; i++) {
				for (int j = 0; j < (n - i); j++) {
					if (list.get(j).compareTo(list.get(j + 1)) > 0) {
						temp = list.get(j);
						list.set(j, list.get(j + 1));
						list.set(j + 1, temp);
					}
				}

			}
	         }  
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist  
	//Traversing list through Iterator  
//	Iterator itr=list.iterator();  
//	while(itr.hasNext()){  
//	System.out.println(itr.next());  
//	} 
	System.out.println("1.Enter values\n2.Press for sorting the ArrayList.");
	do {
		
		Scanner scanner = new Scanner(System.in);
		int count=scanner.nextInt();
		switch (count) {
		case 1:
			while (scanner.hasNextInt()) {
				int input=scanner.nextInt();
				list.add(input);
			}
			System.out.println(list);
			break;
		case 2:
			bubbleSort(list);
			System.out.println(list);
			break;
		default:
			break;
		}
	}
	while(true);
	
}
}

