package bubblesort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class HashSetSort {
	static void Sorting(List<Integer> arr) {
		int temp = 0;
		for (int i = 1; i < arr.size(); i++) {
			for (int j = 0; j < (arr.size() - i); j++) {
				if (arr.get(j).compareTo(arr.get(j+1) )> 0){
					temp = arr.get(j);
					arr.set(j, arr.get(j + 1));
					arr.set(j + 1, temp);
				}
			}

		}
	}
public static void main(String[] args) {
	HashSet<Integer> arr1 = new HashSet<>();
	List<Integer> arr = new ArrayList<Integer>(arr1);
	System.out.println("1.Enter values\n2.Press for sorting the HashSet.");
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
